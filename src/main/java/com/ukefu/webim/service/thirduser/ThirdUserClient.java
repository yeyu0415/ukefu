package com.ukefu.webim.service.thirduser;

import com.alibaba.fastjson.JSONObject;
import com.ukefu.webim.util.FastJsonUtils;
import com.ukefu.webim.util.HttpClientUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

/**
 * @title:
 * @Author: yeyu
 * @Date: 2019/1/29 16:11
 * @Version 1.0
 */
@Service
public class ThirdUserClient {

    private final Logger logger= LoggerFactory.getLogger(getClass());


    public User findUserByUserId(String userId){
        String result=null;
        try {
            String url = UserClientURL.FIND_USER_BY_USER_ID.value();
            Map<String, Object> mapParameters =new HashMap<String, Object>();
            mapParameters.put("userid", userId);
            result= HttpClientUtil.doPost(url,mapParameters);
            JSONObject object= JSONObject.parseObject(result);
            if(checkStatus(object)){
                if(object.get("data") == null){
                    return null;
                }
                User user = FastJsonUtils.json2obj(object.get("data").toString(), User.class);
                return user;
            }
        } catch (Exception e) {
            logger.error("调用用户信息异常",e);
        }
        return null;
    }

    /**
     * 请求返回验证状态是否成功
     * @param map
     * @return
     */
    private boolean checkStatus(Map<String, Object> map){
        if (map.get("status") == null){
            return false;
        }
        return "1".equals(map.get("status").toString());
    }

    public static void main(String[] args) {
        ThirdUserClient thirdUserClient=new ThirdUserClient();
       User u= thirdUserClient.findUserByUserId("0005e15b794c4f0b8733da3bea2ec601");
        System.out.println(u.getNiceName());
    }
}

package com.ukefu.webim.util;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.serializer.JSONLibDataFormatSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * （用一句话描述类的主要功能）
 *  FastJson工具类
 * @author LIAO
 * @date 2018年12月19日
 **/

public class FastJsonUtils {
    private final static Logger logger = LoggerFactory.getLogger(FastJsonUtils.class);
    private static SerializeConfig config;

    static {
        config = new SerializeConfig();
        config.put(java.util.Date.class, new JSONLibDataFormatSerializer()); // 使用和json-lib兼容的日期输出格式
        config.put(java.sql.Date.class, new JSONLibDataFormatSerializer()); // 使用和json-lib兼容的日期输出格式
    }

    private static final SerializerFeature[] features = {
            SerializerFeature.DisableCircularReferenceDetect,//打开循环引用检测，JSONField(serialize = false)不循环
            SerializerFeature.WriteDateUseDateFormat,//默认使用系统默认 格式日期格式化
            SerializerFeature.WriteMapNullValue, //输出空置字段
            SerializerFeature.WriteNullListAsEmpty,//list字段如果为null，输出为[]，而不是null
            SerializerFeature.WriteNullNumberAsZero,// 数值字段如果为null，输出为0，而不是null
            SerializerFeature.WriteNullBooleanAsFalse,//Boolean字段如果为null，输出为false，而不是null
            SerializerFeature.WriteNullStringAsEmpty//字符类型字段如果为null，输出为""，而不是null
    };

    /**
     * 返回Json字符串里面包含的一个对象
     *
     * @param jsonStr  :{"city":"china","map1":[{"age":"28","name":"yys"}]}
     * @param list_str :map1
     * @param clazz    :Map.class,或者其他对象
     * @param <T>      :Map
     * @return :List<Map>
     */
    public static final <T> List<T> json2childList(String jsonStr, String list_str,
                                                   Class<T> clazz) {
        JSONObject jsonobj = JSON.parseObject(jsonStr);
        if (jsonobj == null) {
            return null;
        }
        Object obj = jsonobj.get(list_str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof JSONArray) {
            JSONArray jsonarr = (JSONArray) obj;
            List<T> list = new ArrayList<T>();
            for (int i = 0; i < jsonarr.size(); i++) {
                list.add(jsonarr.getObject(i, clazz));
            }
            return list;
        }
        return null;
    }

    /**
     * 返回Json字符串里面包含的一个对象
     *
     * @param jsonStr :{"department":{"id":"1","name":"生产部"},"password":"admin","username":"admin"}
     * @param obj_str :department
     * @param clazz   :Map.class,或者其他对象
     * @param <T>     :Map
     * @return
     */
    public static final <T> T json2childObj(String jsonStr, String obj_str,
                                            Class<T> clazz) {
        JSONObject jsonobj = JSON.parseObject(jsonStr);
        if (jsonobj == null) {
            return null;
        }

        Object obj = jsonobj.get(obj_str);
        if (obj == null) {
            return null;
        }

        if (obj instanceof JSONObject) {
            return jsonobj.getObject(obj_str, clazz);
        } else {
            logger.info(obj.getClass() + "");
        }

        return null;
    }

    /**
     * json 转换成对象
     *
     * @param jsonStr
     * @param clazz
     * @param <T>
     * @return
     */
    public static final <T> T json2obj(String jsonStr, Class<T> clazz) {
        T t = null;
        try {
            t = JSON.parseObject(jsonStr, clazz);
        } catch (Exception e) {
            logger.error("json字符串转换失败！" + jsonStr, e);
        }
        return t;
    }

    /**
     * 对象转换成json字符串(带有格式化输出)
     *
     * @param object       要转换的对象
     * @param prettyFormat 是否格式化json字符串,输出带有换行和缩进的字符串
     * @return 返回一个json 字符串数组
     */
    public static final String obj2json(Object object, boolean prettyFormat) {
        return JSON.toJSONString(object, prettyFormat);
    }

    /**
     * 对象转换成json字符串
     *
     * @param object 要转换的对象
     * @return 返回一个json 字符串数组
     */
    public static final String obj2jsonByFeatures(Object object) {
        return JSON.toJSONString(object,config,features);
    }
    /**
     * 对象转换成json字符串
     *
     * @param object 要转换的对象
     * @return 返回一个json 字符串数组
     */
    public static final String obj2json(Object object) {
        return JSON.toJSONString(object,config);
    }

    /**
     * json 字符串转换成原始的Object对象
     *
     * @param jsonStr
     * @return
     */
    public static final Object json2obj(String jsonStr) {
        return JSON.parse(jsonStr);
    }

    /**
     * json字符串转换成list
     *
     * @param jsonStr    Json字符串
     * @param clazz      要转换的class
     * @param <T>返回的泛型类型
     * @return 返回的<T>泛型类型
     */
    public static <T> List<T> json2List(String jsonStr, Class<T> clazz) {
        List<T> list = new ArrayList<T>();
        try {
            list = JSON.parseArray(jsonStr, clazz);
        } catch (Exception e) {
            logger.error("json字符串转List失败！" + jsonStr, e);
        }
        return list;
    }

    /**
     * json字符串转换成Map
     *
     * @param jsonStr Json字符串
     * @return Map
     */
    public static Map<String, Object> json2Map(String jsonStr) {
        try {
            return JSON.parseObject(jsonStr, Map.class);
        } catch (Exception e) {
            logger.error("json字符串转换失败！" + jsonStr, e);
        }
        return null;
    }

    /**
     * json 转换成list<map>
     *
     * @param jsonString
     * @return
     */
    public static List<Map<String, Object>> json2ListkeyMap(String jsonString) {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        try {
            list = JSON.parseObject(jsonString,
                    new TypeReference<List<Map<String, Object>>>() {
                    });
        } catch (Exception e) {
            logger.error("json字符串转map失败", e);
        }
        return list;
    }

    public static JSONObject toJsonObject(Object javaBean)
    {
        return JSONObject.parseObject(JSONObject.toJSON(javaBean).toString());
    }

}
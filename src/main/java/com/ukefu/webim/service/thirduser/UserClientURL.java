package com.ukefu.webim.service.thirduser;

/**
 * （用一句话描述类的主要功能）
 *  用户系统接口Http地址
 * @author LIAO
 * @date 2018年12月22日
 **/
public enum UserClientURL {


    GET_LEVEL("/personal/saleorg/getlevel?", "根据用户UUID获取分销 一级、二级、店长 的用户", "GET"),
    FIND_USER_BY_USER_ID("/api/v1/user/findUserByUserid", "根据用户ID查询单个用户数据", "POST"),
    GET_UPUSER_INFO("/personal/saleorg/getupuserinfo?", "根据用户ID查询上级用户信息", "GET"),
    FIND_USER_LIST_BY_USER_ID("/api/v1/user/findUserListByUserId", "根据多个用户ID获取多个用户", "POST"),
    UPDATE_LEVEL("/api/v1/user/updateLevel", "用户升级", "POST"),
    ADD_ACCOUNT_PAY_LIST("/api/v1/accountPlayList/addAccountPayList", "根据用户ID向用户系统模块增加流水", "POST"),
    FIND_USER_BY_GROUP("/api/v1/user/findUserByGroup", "查询分销用户列表所需聚合统计数据", "POST"),
    ADD_RED_PACK("/api/v1/redPack/addRedPack", "添加红包记录", "post"),
    EMAIL_REGISTERED("/api/v1/user/emailRegistered", "邮箱密码注册接口", "POST"),
    PHONE_REGISTERED("/api/v1/user/phoneRegistered", "手机号密码注册接口", "POST"),
    CHECK_EMAIL("/api/v1/user/checkEmail", "校验邮箱是否已注册（PC端使用）", "POST"),
    CHECK_PHONE("/api/v1/user/checkPhone", "校验手机号是否已注册（PC端使用）", "POST"),
    CHECK_USERNAME("/api/v1/user/checkUsername", "校验用户名是否已注册（PC端使用）", "POST"),
    GET_USER("/api/v1/user/getUser", "用户信息查询", "POST"),
    GET_CMUSER("/api/v1/integralList/findIntegralList", "查询用户c米情况", "POST"),
    LOGIN("/api/v1/user/login", "手机号(邮箱)密码登录", "POST"),
    UPDATE_USER("/api/v1/user/updateUser", "修改用户", "POST"),
    ADD_INTEGRAL_LIST("/api/v1/integralList/addIntegralList", "添加C米明细", "POST"),
    CHECK_CODE("/checkCode", "效验验证码", "POST"),
    SEND_EMAIL("/sendEmail", "发送邮箱验证码", "POST"),
    SEND_SMS_CODE("/sendSMSCode", "发送短信验证码", "POST"),
    IS_SIGNED("/personal/signlog/isSigned", "查询是否签到", "POST"),
    INTERESTS("/sys/agreement", "查询注册协议会员权益等文本内容", "POST");




    private String value;

    private String desc;

    private String type;

    UserClientURL(String value, String desc, String type){
        this.value = value;
        this.desc = desc;
        this.type = type;
    }

    public String value(){
        return  this.url() + this.value;
    }

    public String desc(){
        return this.desc;
    }

    public String type(){
        return  this.type;
    }

    public String url(){
        return  "http://user.meibbc.com";
    }

}

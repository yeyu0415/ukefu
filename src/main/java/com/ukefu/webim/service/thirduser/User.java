package com.ukefu.webim.service.thirduser;

import io.swagger.annotations.ApiModel;

import java.io.Serializable;
import java.util.Date;

@ApiModel( description = "用户")
public class User implements Serializable {

    private static final long serialVersionUID = 1964725081050250347L;



    private String userid;          //用户id
    private String phone;
    private String passWord;
    private String icon;
    private String niceName;
    private String sex;
    private Integer age;
    private String constellation;
    private String company;
    private String school;
    private String seat;
    private Float actAalance;
    private String role;    //1、粉丝(普通用户),2、VIP会员(贵宾),3、云店创客(铂金)，4、部长(店长)
    private Integer freeappointnum;         //免费预约次数
    private Float frozonaalance;            //冻结金额
    private String temporary;
    private Date registertime;
    private Integer integral;
    private String payPassword;
    private Float frozonaalance1;
    private String signature;
    private String rytoken;
    private String registrationId;
    private String height;
    private String weight;
    private String supporttype;         // 客服id
    private String online;
    private String qqid;
    private String wxid;
    private String useronline;
    private Float lng;
    private Float lat;
    private String registerSource;    // 注册来源：1安卓，2ios，3公益活动，4抽奖活动
    private String internationaltype;
    private String email;
    private Date createtime;
    private String isvalid;
    private String registerlanip;
    private String registerwanip;
    private String userToken;
    private String inviteCode;
    private String member;
    private String mallrole;

    //刷新token
    private String refreshToken;


    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord == null ? null : passWord.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getNiceName() {
        return niceName;
    }

    public void setNiceName(String niceName) {
        this.niceName = niceName == null ? null : niceName.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation == null ? null : constellation.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat == null ? null : seat.trim();
    }

    public Float getActAalance() {
        return actAalance;
    }

    public void setActAalance(Float actAalance) {
        this.actAalance = actAalance;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public Integer getFreeappointnum() {
        return freeappointnum;
    }

    public void setFreeappointnum(Integer freeappointnum) {
        this.freeappointnum = freeappointnum;
    }

    public Float getFrozonaalance() {
        return frozonaalance;
    }

    public void setFrozonaalance(Float frozonaalance) {
        this.frozonaalance = frozonaalance;
    }

    public String getTemporary() {
        return temporary;
    }

    public void setTemporary(String temporary) {
        this.temporary = temporary == null ? null : temporary.trim();
    }

    public Date getRegistertime() {
        return registertime;
    }

    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public String getPayPassword() {
        return payPassword;
    }

    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword == null ? null : payPassword.trim();
    }

    public Float getFrozonaalance1() {
        return frozonaalance1;
    }

    public void setFrozonaalance1(Float frozonaalance1) {
        this.frozonaalance1 = frozonaalance1;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    public String getRytoken() {
        return rytoken;
    }

    public void setRytoken(String rytoken) {
        this.rytoken = rytoken == null ? null : rytoken.trim();
    }

    public String getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId == null ? null : registrationId.trim();
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height == null ? null : height.trim();
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight == null ? null : weight.trim();
    }

    public String getSupporttype() {
        return supporttype;
    }

    public void setSupporttype(String supporttype) {
        this.supporttype = supporttype == null ? null : supporttype.trim();
    }

    public String getOnline() {
        return online;
    }

    public void setOnline(String online) {
        this.online = online == null ? null : online.trim();
    }

    public String getQqid() {
        return qqid;
    }

    public void setQqid(String qqid) {
        this.qqid = qqid == null ? null : qqid.trim();
    }

    public String getWxid() {
        return wxid;
    }

    public void setWxid(String wxid) {
        this.wxid = wxid == null ? null : wxid.trim();
    }

    public String getUseronline() {
        return useronline;
    }

    public void setUseronline(String useronline) {
        this.useronline = useronline == null ? null : useronline.trim();
    }

    public Float getLng() {
        return lng;
    }

    public void setLng(Float lng) {
        this.lng = lng;
    }

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

    public String getRegisterSource() {
        return registerSource;
    }

    public void setRegisterSource(String registerSource) {
        this.registerSource = registerSource == null ? null : registerSource.trim();
    }

    public String getInternationaltype() {
        return internationaltype;
    }

    public void setInternationaltype(String internationaltype) {
        this.internationaltype = internationaltype == null ? null : internationaltype.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime == null ? null : createtime;
    }

    public String getIsvalid() {
        return isvalid;
    }

    public void setIsvalid(String isvalid) {
        this.isvalid = isvalid == null ? null : isvalid.trim();
    }

    public String getRegisterlanip() {
        return registerlanip;
    }

    public void setRegisterlanip(String registerlanip) {
        this.registerlanip = registerlanip == null ? null : registerlanip.trim();
    }

    public String getRegisterwanip() {
        return registerwanip;
    }

    public void setRegisterwanip(String registerwanip) {
        this.registerwanip = registerwanip == null ? null : registerwanip.trim();
    }

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken == null ? null : userToken.trim();
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode == null ? null : inviteCode.trim();
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }

    public String getMallrole() {
        return mallrole;
    }

    public void setMallrole(String mallrole) {
        this.mallrole = mallrole;
    }
}
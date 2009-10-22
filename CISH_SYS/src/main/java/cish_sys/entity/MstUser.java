package cish_sys.entity;

import org.seasar.dao.annotation.tiger.Bean;
import org.seasar.dao.annotation.tiger.Column;

/**
 * ユーザマスタ Entity.
 *
 * @author CIS furukawa
 */
@Bean(table="MST_USER")
public class MstUser {

    private String delFlag;
    private Long id;
    private String kanjiName;
    private String hiraganaName;
    private String loginId;
    private String loginPassword;
    private String companyMail;
    private String mobileMail;
    private String privateMail;
    private String otherMail;
    private String userLevel;
    private String office;
    private String postName1;
    private String postName2;
    private String positionName;
    private String positionCode;
    private String postTelNo;
    private String postTelNo2;
    private String extension;
    private String postFax;
    private String homeTelNo;
    private String homeFax;
    private String mobile;
    private String mobileId;
    private String belongGroup;

    @Column("DEL_FLAG")
    public String getDelFlag() {
	return delFlag;
    }

    public void setDelFlag(String delFlag) {
	this.delFlag = delFlag;
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    @Column("KANJI_NAME")
    public String getKanjiName() {
	return kanjiName;
    }

    public void setKanjiName(String kanjiName) {
	this.kanjiName = kanjiName;
    }

    @Column("HIRAGANA_NAME")
    public String getHiraganaName() {
	return hiraganaName;
    }

    public void setHiraganaName(String hiraganaName) {
	this.hiraganaName = hiraganaName;
    }

    @Column("LOGIN_ID")
    public String getLoginId() {
	return loginId;
    }

    public void setLoginId(String loginId) {
	this.loginId = loginId;
    }

    @Column("LOGIN_PASSWORD")
    public String getLoginPassword() {
	return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
	this.loginPassword = loginPassword;
    }

    @Column("COMPANY_MAIL")
    public String getCompanyMail() {
	return companyMail;
    }

    public void setCompanyMail(String companyMail) {
	this.companyMail = companyMail;
    }

    @Column("MOBILE_MAIL")
    public String getMobileMail() {
	return mobileMail;
    }

    public void setMobileMail(String mobileMail) {
	this.mobileMail = mobileMail;
    }

    @Column("PRIVATE_MAIL")
    public String getPrivateMail() {
	return privateMail;
    }

    public void setPrivateMail(String privateMail) {
	this.privateMail = privateMail;
    }

    @Column("OTHER_MAIL")
    public String getOtherMail() {
	return otherMail;
    }

    public void setOtherMail(String otherMail) {
	this.otherMail = otherMail;
    }

    @Column("USER_LEVEL")
    public String getUserLevel() {
	return userLevel;
    }

    public void setUserLevel(String userLevel) {
	this.userLevel = userLevel;
    }

    public String getOffice() {
	return office;
    }

    public void setOffice(String office) {
	this.office = office;
    }

    @Column("POST_NAME1")
    public String getPostName1() {
	return postName1;
    }

    public void setPostName1(String postName1) {
	this.postName1 = postName1;
    }

    @Column("POST_NAME2")
    public String getPostName2() {
	return postName2;
    }

    public void setPostName2(String postName2) {
	this.postName2 = postName2;
    }

    @Column("POSITION_NAME")
    public String getPositionName() {
	return positionName;
    }

    public void setPositionName(String positionName) {
	this.positionName = positionName;
    }

    @Column("POSITION_CODE")
    public String getPositionCode() {
	return positionCode;
    }

    public void setPositionCode(String positionCode) {
	this.positionCode = positionCode;
    }

    @Column("POST_TEL_NO")
    public String getPostTelNo() {
	return postTelNo;
    }

    public void setPostTelNo(String postTelNo) {
	this.postTelNo = postTelNo;
    }

    @Column("POST_TEL_NO2")
    public String getPostTelNo2() {
	return postTelNo2;
    }

    public void setPostTelNo2(String postTelNo2) {
	this.postTelNo2 = postTelNo2;
    }

    public String getExtension() {
	return extension;
    }

    public void setExtension(String extension) {
	this.extension = extension;
    }

    @Column("POST_FAX")
    public String getPostFax() {
	return postFax;
    }

    public void setPostFax(String postFax) {
	this.postFax = postFax;
    }

    @Column("HOME_TEL_NO")
    public String getHomeTelNo() {
	return homeTelNo;
    }

    public void setHomeTelNo(String homeTelNo) {
	this.homeTelNo = homeTelNo;
    }

    @Column("HOME_FAX")
    public String getHomeFax() {
	return homeFax;
    }

    public void setHomeFax(String homeFax) {
	this.homeFax = homeFax;
    }

    public String getMobile() {
	return mobile;
    }

    public void setMobile(String mobile) {
	this.mobile = mobile;
    }

    @Column("MOBILE_ID")
    public String getMobileId() {
	return mobileId;
    }

    public void setMobileId(String mobileId) {
	this.mobileId = mobileId;
    }

    @Column("BELONG_GROUP")
    public String getBelongGroup() {
	return belongGroup;
    }

    public void setBelongGroup(String belongGroup) {
	this.belongGroup = belongGroup;
    }

}

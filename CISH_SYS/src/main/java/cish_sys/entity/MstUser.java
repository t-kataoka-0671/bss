package cish_sys.entity;

import org.seasar.dao.annotation.tiger.Bean;
import org.seasar.dao.annotation.tiger.Id;
import org.seasar.dao.annotation.tiger.IdType;


@Bean(table="MST_USER")
public class MstUser {

	private String delFlag;

//    @Id(IdType.IDENTITY)
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

	public MstUser() {
	}

	public String getDelFlag() {
		return this.delFlag;
	}

	public void setDelFlag(String delflag) {
		this.delFlag = delflag;
	}
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public String getKanjiName() {
		return this.kanjiName;
	}

	public void setKanjiName(String kanjiname) {
		this.kanjiName = kanjiname;
	}
	public String getHiraganaName() {
		return this.hiraganaName;
	}

	public void setHiraganaName(String hiragananame) {
		this.hiraganaName = hiragananame;
	}
	public String getLoginId() {
		return this.loginId;
	}

	public void setLoginId(String loginid) {
		this.loginId = loginid;
	}
	public String getLoginPassword() {
		return this.loginPassword;
	}

	public void setLoginPassword(String loginpassword) {
		this.loginPassword = loginpassword;
	}
	public String getCompanyMail() {
		return this.companyMail;
	}

	public void setCompanyMail(String companymail) {
		this.companyMail = companymail;
	}
	public String getMobileMail() {
		return this.mobileMail;
	}

	public void setMobileMail(String mobilemail) {
		this.mobileMail = mobilemail;
	}
	public String getPrivateMail() {
		return this.privateMail;
	}

	public void setPrivateMail(String privatemail) {
		this.privateMail = privatemail;
	}
	public String getOtherMail() {
		return this.otherMail;
	}

	public void setOtherMail(String othermail) {
		this.otherMail = othermail;
	}
	public String getUserLevel() {
		return this.userLevel;
	}

	public void setUserLevel(String userlevel) {
		this.userLevel = userlevel;
	}
	public String getOffice() {
		return this.office;
	}

	public void setOffice(String office) {
		this.office = office;
	}
	public String getPostName1() {
		return this.postName1;
	}

	public void setPostName1(String postname1) {
		this.postName1 = postname1;
	}
	public String getPostName2() {
		return this.postName2;
	}

	public void setPostName2(String postname2) {
		this.postName2 = postname2;
	}
	public String getPositionName() {
		return this.positionName;
	}

	public void setPositionName(String positionname) {
		this.positionName = positionname;
	}
	public String getPositionCode() {
		return this.positionCode;
	}

	public void setPositionCode(String positioncode) {
		this.positionCode = positioncode;
	}
	public String getPostTelNo() {
		return this.postTelNo;
	}

	public void setPostTelNo(String posttelno) {
		this.postTelNo = posttelno;
	}
	public String getPostTelNo2() {
		return this.postTelNo2;
	}

	public void setPostTelNo2(String posttelno2) {
		this.postTelNo2 = posttelno2;
	}
	public String getExtension() {
		return this.extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}
	public String getPostFax() {
		return this.postFax;
	}

	public void setPostFax(String postfax) {
		this.postFax = postfax;
	}
	public String getHomeTelNo() {
		return this.homeTelNo;
	}

	public void setHomeTelNo(String hometelno) {
		this.homeTelNo = hometelno;
	}
	public String getHomeFax() {
		return this.homeFax;
	}

	public void setHomeFax(String homefax) {
		this.homeFax = homefax;
	}
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMobileId() {
		return this.mobileId;
	}

	public void setMobileId(String mobileid) {
		this.mobileId = mobileid;
	}
	public String getBelongGroup() {
		return this.belongGroup;
	}

	public void setBelongGroup(String belonggroup) {
		this.belongGroup = belonggroup;
	}
}
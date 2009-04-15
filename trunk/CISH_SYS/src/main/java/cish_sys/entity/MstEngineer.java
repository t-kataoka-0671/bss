package cish_sys.entity;

import org.seasar.dao.annotation.tiger.Bean;
import org.seasar.dao.annotation.tiger.Id;
import org.seasar.dao.annotation.tiger.IdType;
import java.util.Date;


@Bean(table="MST_ENGINEER")
public class MstEngineer {

//    @Id(IdType.IDENTITY)
	private String engineerNo;

	private String kanjiName;

	private String kanaName;

	private String sex;

	private Date birth;

	private String zipCode;

	private String address;

	private String telNo;

	private String mobile;

	private String pcMail;

	private String mobileMail;

	private String nearStation;

	private String route;

	private String belongCompanyCode;

	private String belongPost;

	private String passedCompanyCode;

	private String insUser;

	private Date insDate;

	private String updUser;

	private Date updDate;

 //   @Id(IdType.IDENTITY)
	private String stateFlag;

	public MstEngineer() {
	}

	public String getEngineerNo() {
		return this.engineerNo;
	}

	public void setEngineerNo(String engineerno) {
		this.engineerNo = engineerno;
	}
	public String getKanjiName() {
		return this.kanjiName;
	}

	public void setKanjiName(String kanjiname) {
		this.kanjiName = kanjiname;
	}
	public String getKanaName() {
		return this.kanaName;
	}

	public void setKanaName(String kananame) {
		this.kanaName = kananame;
	}
	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirth() {
		return this.birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public String getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(String zipcode) {
		this.zipCode = zipcode;
	}
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelNo() {
		return this.telNo;
	}

	public void setTelNo(String telno) {
		this.telNo = telno;
	}
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPcMail() {
		return this.pcMail;
	}

	public void setPcMail(String pcmail) {
		this.pcMail = pcmail;
	}
	public String getMobileMail() {
		return this.mobileMail;
	}

	public void setMobileMail(String mobilemail) {
		this.mobileMail = mobilemail;
	}
	public String getNearStation() {
		return this.nearStation;
	}

	public void setNearStation(String nearstation) {
		this.nearStation = nearstation;
	}
	public String getRoute() {
		return this.route;
	}

	public void setRoute(String route) {
		this.route = route;
	}
	public String getBelongCompanyCode() {
		return this.belongCompanyCode;
	}

	public void setBelongCompanyCode(String belongcompanycode) {
		this.belongCompanyCode = belongcompanycode;
	}
	public String getBelongPost() {
		return this.belongPost;
	}

	public void setBelongPost(String belongpost) {
		this.belongPost = belongpost;
	}
	public String getPassedCompanyCode() {
		return this.passedCompanyCode;
	}

	public void setPassedCompanyCode(String passedcompanycode) {
		this.passedCompanyCode = passedcompanycode;
	}
	public String getInsUser() {
		return this.insUser;
	}

	public void setInsUser(String insuser) {
		this.insUser = insuser;
	}
	public Date getInsDate() {
		return this.insDate;
	}

	public void setInsDate(Date insdate) {
		this.insDate = insdate;
	}
	public String getUpdUser() {
		return this.updUser;
	}

	public void setUpdUser(String upduser) {
		this.updUser = upduser;
	}
	public Date getUpdDate() {
		return this.updDate;
	}

	public void setUpdDate(Date upddate) {
		this.updDate = upddate;
	}
	public String getStateFlag() {
		return this.stateFlag;
	}

	public void setStateFlag(String stateflag) {
		this.stateFlag = stateflag;
	}
}
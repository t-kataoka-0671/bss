package cish_sys.entity;

import org.seasar.dao.annotation.tiger.Bean;
import org.seasar.dao.annotation.tiger.Id;
import org.seasar.dao.annotation.tiger.IdType;
import java.util.Date;


@Bean(table="MST_QUALIFICATION")
public class MstQualification {

//    @Id(IdType.IDENTITY)
	private String quaDiv;

//    @Id(IdType.IDENTITY)
	private String quaCode;

	private String quaName;

	private String insUser;

	private Date insDate;

	private String updUser;

	private Date updDate;

	private String delFlag;

	public MstQualification() {
	}

	public String getQuaDiv() {
		return this.quaDiv;
	}

	public void setQuaDiv(String quadiv) {
		this.quaDiv = quadiv;
	}
	public String getQuaCode() {
		return this.quaCode;
	}

	public void setQuaCode(String quacode) {
		this.quaCode = quacode;
	}
	public String getQuaName() {
		return this.quaName;
	}

	public void setQuaName(String quaname) {
		this.quaName = quaname;
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
	public String getDelFlag() {
		return this.delFlag;
	}

	public void setDelFlag(String delflag) {
		this.delFlag = delflag;
	}
}
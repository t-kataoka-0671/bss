package cish_sys.entity;

import org.seasar.dao.annotation.tiger.Bean;
import org.seasar.dao.annotation.tiger.Id;
import org.seasar.dao.annotation.tiger.IdType;
import java.util.Date;


@Bean(table="MST_COMPANY")
public class MstCompany {

//    @Id(IdType.IDENTITY)
	private String companyCode;

	private String companyName;

	private String companyDiv;

	private String companyRank;

	private String insUser;

	private Date insDate;

	private String updUser;

	private Date updDate;

	private String stateFlag;

	public MstCompany() {
	}

	public String getCompanyCode() {
		return this.companyCode;
	}

	public void setCompanyCode(String companycode) {
		this.companyCode = companycode;
	}
	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyname) {
		this.companyName = companyname;
	}
	public String getCompanyDiv() {
		return this.companyDiv;
	}

	public void setCompanyDiv(String companydiv) {
		this.companyDiv = companydiv;
	}
	public String getCompanyRank() {
		return this.companyRank;
	}

	public void setCompanyRank(String companyrank) {
		this.companyRank = companyrank;
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
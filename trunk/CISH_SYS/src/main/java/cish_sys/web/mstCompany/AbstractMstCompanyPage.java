package cish_sys.web.mstCompany;

import java.util.Date;

import cish_sys.dao.MstCompanyDao;
import cish_sys.web.AbstractCrudPage;

public abstract class AbstractMstCompanyPage extends AbstractCrudPage {

	private MstCompanyDao mstCompanyDao;
	
	private MstCompanyDxo mstCompanyDxo;
	
	private String companyCode;

	private String companyName;

	private String companyDiv;

	private String rank;

	private String insUser;

	private Date insDate;

	private String updUser;

	private Date updDate;

	private String stateFlag;

	public AbstractMstCompanyPage() {
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
	public String getRank() {
		return this.rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
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

	public MstCompanyDao getMstCompanyDao() {
		return this.mstCompanyDao;
	}

	public void setMstCompanyDao(MstCompanyDao mstCompanyDao) {
		this.mstCompanyDao = mstCompanyDao;
	}

	public MstCompanyDxo getMstCompanyDxo() {
		return this.mstCompanyDxo;
	}

	public void setMstCompanyDxo(MstCompanyDxo mstCompanyDxo) {
		this.mstCompanyDxo = mstCompanyDxo;
	}
}
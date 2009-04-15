package cish_sys.web.mstQualification;

import java.util.Date;

import cish_sys.dao.MstQualificationDao;
import cish_sys.web.AbstractCrudPage;

public abstract class AbstractMstQualificationPage extends AbstractCrudPage {

	private MstQualificationDao mstQualificationDao;
	
	private MstQualificationDxo mstQualificationDxo;
	
	private String quaDiv;

	private String quaCode;

	private String quaName;

	private String insUser;

	private Date insDate;

	private String updUser;

	private Date updDate;

	private String delFlag;

	public AbstractMstQualificationPage() {
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

	public MstQualificationDao getMstQualificationDao() {
		return this.mstQualificationDao;
	}

	public void setMstQualificationDao(MstQualificationDao mstQualificationDao) {
		this.mstQualificationDao = mstQualificationDao;
	}

	public MstQualificationDxo getMstQualificationDxo() {
		return this.mstQualificationDxo;
	}

	public void setMstQualificationDxo(MstQualificationDxo mstQualificationDxo) {
		this.mstQualificationDxo = mstQualificationDxo;
	}
}
package cish_sys.web.mstCode;

import java.util.Date;

import cish_sys.dao.MstCodeDao;
import cish_sys.web.AbstractCrudPage;

public abstract class AbstractMstCodePage extends AbstractCrudPage {

	private MstCodeDao mstCodeDao;
	
	private MstCodeDxo mstCodeDxo;
	
	private String codeDiv;

	private String code;

	private String codeName;

	private String insUser;

	private Date insDate;

	private String updUser;

	private Date updDate;

	private String delFlag;

	public AbstractMstCodePage() {
	}

	public String getCodeDiv() {
		return this.codeDiv;
	}

	public void setCodeDiv(String codediv) {
		this.codeDiv = codediv;
	}
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	public String getCodeName() {
		return this.codeName;
	}

	public void setCodeName(String codename) {
		this.codeName = codename;
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

	public MstCodeDao getMstCodeDao() {
		return this.mstCodeDao;
	}

	public void setMstCodeDao(MstCodeDao mstCodeDao) {
		this.mstCodeDao = mstCodeDao;
	}

	public MstCodeDxo getMstCodeDxo() {
		return this.mstCodeDxo;
	}

	public void setMstCodeDxo(MstCodeDxo mstCodeDxo) {
		this.mstCodeDxo = mstCodeDxo;
	}
}
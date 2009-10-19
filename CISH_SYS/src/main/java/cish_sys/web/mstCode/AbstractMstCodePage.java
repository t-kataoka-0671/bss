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

	public void setCodeDiv(String codeDiv) {
		this.codeDiv = codeDiv;
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

	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}

	public String getInsUser() {
		return this.insUser;
	}

	public void setInsUser(String insUser) {
		this.insUser = insUser;
	}

	public Date getInsDate() {
		return this.insDate;
	}

	public void setInsDate(Date insDate) {
		this.insDate = insDate;
	}

	public String getUpdUser() {
		return this.updUser;
	}

	public void setUpdUser(String updUser) {
		this.updUser = updUser;
	}

	public Date getUpdDate() {
		return this.updDate;
	}

	public void setUpdDate(Date updDate) {
		this.updDate = updDate;
	}

	public String getDelFlag() {
		return this.delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
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
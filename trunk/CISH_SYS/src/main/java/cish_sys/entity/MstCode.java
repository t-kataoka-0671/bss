package cish_sys.entity;

import java.util.Date;

import org.seasar.dao.annotation.tiger.Bean;
import org.seasar.dao.annotation.tiger.Column;

@Bean(table="MST_CODE")
public class MstCode {

	private String codeDiv;
	private String code;
	private String codeName;
	private String insUser;
	private Date insDate;
	private String updUser;
	private Date updDate;
	private String delFlag;

	@Column("CODE_DIV")
	public String getCodeDiv() {
		return codeDiv;
	}

	public void setCodeDiv(String codeDiv) {
		this.codeDiv = codeDiv;
	}

	@Column("CODE")
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column("CODE_NAME")
	public String getCodeName() {
		return codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}

	@Column("INS_USER")
	public String getInsUser() {
		return insUser;
	}

	public void setInsUser(String insUser) {
		this.insUser = insUser;
	}

	@Column("INS_DATE")
	public Date getInsDate() {
		return insDate;
	}

	public void setInsDate(Date insDate) {
		this.insDate = insDate;
	}

	@Column("UPD_USER")
	public String getUpdUser() {
		return updUser;
	}

	public void setUpdUser(String updUser) {
		this.updUser = updUser;
	}

	@Column("UPD_DATE")
	public Date getUpdDate() {
		return updDate;
	}

	public void setUpdDate(Date updDate) {
		this.updDate = updDate;
	}

	@Column("DEL_FLAG")
	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}

}

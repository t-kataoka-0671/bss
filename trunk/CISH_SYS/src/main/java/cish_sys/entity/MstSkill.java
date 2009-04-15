package cish_sys.entity;

import org.seasar.dao.annotation.tiger.Bean;
import org.seasar.dao.annotation.tiger.Column;
import org.seasar.dao.annotation.tiger.Id;
import org.seasar.dao.annotation.tiger.IdType;
import java.util.Date;


@Bean(table="MST_SKILL")
public class MstSkill {

//    @Id(IdType.IDENTITY)
	private String skillDiv;

//    @Id(IdType.IDENTITY)
	private String skillCode;

	private String skillName;

	private String insUser;

	private Date insDate;

	private String updUser;

	private Date updDate;

	private String delFlag;

	public MstSkill() {
	}

	@Column("SKILL_DIV")
	public String getSkillDiv() {
		return this.skillDiv;
	}
	public void setSkillDiv(String skilldiv) {
		this.skillDiv = skilldiv;
	}

	@Column("SKILL_CODE")
	public String getSkillCode() {
		return this.skillCode;
	}
	public void setSkillCode(String skillcode) {
		this.skillCode = skillcode;
	}

	@Column("SKILL_NAME")
	public String getSkillName() {
		return this.skillName;
	}
	public void setSkillName(String skillname) {
		this.skillName = skillname;
	}

	@Column("INS_USER")
	public String getInsUser() {
		return this.insUser;
	}
	public void setInsUser(String insuser) {
		this.insUser = insuser;
	}

	@Column("INS_DATE")
	public Date getInsDate() {
		return this.insDate;
	}
	public void setInsDate(Date insdate) {
		this.insDate = insdate;
	}

	@Column("UPD_USER")
	public String getUpdUser() {
		return this.updUser;
	}
	public void setUpdUser(String upduser) {
		this.updUser = upduser;
	}

	@Column("UPD_DATE")
	public Date getUpdDate() {
		return this.updDate;
	}
	public void setUpdDate(Date upddate) {
		this.updDate = upddate;
	}

	@Column("DEL_FLAG")
	public String getDelFlag() {
		return this.delFlag;
	}
	public void setDelFlag(String delflag) {
		this.delFlag = delflag;
	}
}
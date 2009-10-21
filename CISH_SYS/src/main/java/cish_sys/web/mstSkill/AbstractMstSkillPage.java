package cish_sys.web.mstSkill;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cish_sys.dao.MstSkillDao;
import cish_sys.dto.SelectListDto;
import cish_sys.web.AbstractCrudPage;

public abstract class AbstractMstSkillPage extends AbstractCrudPage {

	private MstSkillDao mstSkillDao;

	private MstSkillDxo mstSkillDxo;

	private String skillDiv;

	private String skillCode;

	private String skillName;

	private String insUser;

	private Date insDate;

	private String updUser;

	private Date updDate;

	private String delFlag;

	private List delFlagItems;

	public AbstractMstSkillPage() {
	}

	public String getSkillDiv() {
		return this.skillDiv;
	}

	public void setSkillDiv(String skilldiv) {
		this.skillDiv = skilldiv;
	}
	public String getSkillCode() {
		return this.skillCode;
	}

	public void setSkillCode(String skillcode) {
		this.skillCode = skillcode;
	}
	public String getSkillName() {
		return this.skillName;
	}

	public void setSkillName(String skillname) {
		this.skillName = skillname;
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
		if(this.delFlag==null){
			this.delFlag = "0";
		}
		return this.delFlag;
	}

	public void setDelFlag(String delflag) {
		this.delFlag = delflag;
	}

	public List getDelFlagItems() {
		//if(this.delFlagItems==null){
		//	List PullDownItems = new ArrayList();
		//	SelectListDto dto1 = new SelectListDto();
		//	dto1.setValue(0);
		//	dto1.setLabel("0:使用可");
		//	PullDownItems.add(dto1);
		//	SelectListDto dto2 = new SelectListDto();
		//	dto2.setValue(1);
		//	dto2.setLabel("1:使用不可");
		//	PullDownItems.add(dto2);
		//	this.delFlagItems = PullDownItems;
		//}
		return this.delFlagItems;
	}

	public void setDelFlagItems(List delFlagItems) {
		this.delFlagItems = delFlagItems;
	}

	public MstSkillDao getMstSkillDao() {
		return this.mstSkillDao;
	}

	public void setMstSkillDao(MstSkillDao mstSkillDao) {
		this.mstSkillDao = mstSkillDao;
	}

	public MstSkillDxo getMstSkillDxo() {
		return this.mstSkillDxo;
	}

	public void setMstSkillDxo(MstSkillDxo mstSkillDxo) {
		this.mstSkillDxo = mstSkillDxo;
	}
}
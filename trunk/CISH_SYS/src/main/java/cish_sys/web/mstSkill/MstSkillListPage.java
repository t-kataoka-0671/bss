package cish_sys.web.mstSkill;

import java.util.Date;

import org.seasar.teeda.extension.annotation.convert.DateTimeConverter;
import org.seasar.teeda.extension.annotation.takeover.TakeOver;

import cish_sys.entity.MstSkill;
import cish_sys.web.CrudType;
import cish_sys.paging.MstSkillPagerCondition;

public class MstSkillListPage extends AbstractMstSkillPage {

	private MstSkill[] mstSkillItems;

	private int mstSkillIndex;

	private String textSkillCode;

	private String textSkillDiv;

	private String textSkillName;

	private Integer offset;

	private Integer currentPageIndex;

	private Integer totalPageIndex;

	private Integer totalNumber;

	private int limit = 10;

	public MstSkillListPage() {
	}

	public Class initialize() {
		return null;
	}

	/*
	public Class prerender() {
		mstSkillItems = getMstSkillDao().selectAll();
		return null;
	}
	*/

	public Class prerender() {
		offset = mstSkillIndex;

		MstSkillPagerCondition dto = new MstSkillPagerCondition();
		dto.setLimit(limit);
		dto.setOffset(mstSkillIndex);

		mstSkillItems = getMstSkillDao().findBySkillCodeAndSkillDivAndSkillNamePagerCondition(textSkillCode, textSkillDiv, textSkillName, dto);
		totalNumber = dto.getCount();

		calculatePageIndex();

		return null;
	}

	public void calculatePageIndex() {
		currentPageIndex = offset/limit+1;
		totalPageIndex = totalNumber/limit;
		if (totalNumber%limit > 0) {
			totalPageIndex++;
		}
	}

	public Class doRetrieve() {
		return null;
	}

	public Class doGoFirstPage() {
		offset = 0;
		mstSkillIndex = offset;
		return null;
	}

	public Class doGoPreviousPage() {
		mstSkillIndex = offset;
		if (mstSkillIndex - limit >= 0) {
			mstSkillIndex -= limit;
		}
		return null;
	}

	public Class doGoNextPage() {
		mstSkillIndex = offset;
		prerender();
		if (mstSkillIndex + limit < totalNumber) {
			mstSkillIndex += limit;
		}
		return null;
	}

	public Class doGoLastPage() {
		prerender();
		offset = (totalPageIndex-1)*limit;
		mstSkillIndex = offset;
		return null;
	}

	public boolean isDoGoFirstPageDisabled() {
		return offset == 0;
	}

	public boolean isDoGoPreviousPageDisabled() {
		return isDoGoFirstPageDisabled();
	}

	public boolean isDoGoNextPageDisabled() {
		return currentPageIndex == totalPageIndex;
	}

	public boolean isDoGoLastPageDisabled() {
		return isDoGoNextPageDisabled();
	}

	public boolean isRecData() {
		if(totalNumber==null){
			return false;
		}else{
			return totalNumber != 0;
		}
	}



	public String getMstSkillRowClass() {
		if (getMstSkillIndex() % 2 == 0) {
			return "row_even";
		}
		return "row_odd";
	}


	@TakeOver(properties = "crudType")
	public Class doCreate() {
		setCrudType(CrudType.CREATE);
		return MstSkillEditPage.class;
	}

	@TakeOver(properties = "crudType,skillDiv,skillCode")
	public Class doEdit() {
		setCrudType(CrudType.UPDATE);
		setSkillDiv(mstSkillItems[getMstSkillIndex()].getSkillDiv());
		setSkillCode(mstSkillItems[getMstSkillIndex()].getSkillCode());
		return MstSkillEditPage.class;
	}

	@TakeOver(properties = "crudType,skillDiv,skillCode")
	public Class doDelete() {
		setCrudType(CrudType.DELETE);
		setSkillDiv(mstSkillItems[getMstSkillIndex()].getSkillDiv());
		setSkillCode(mstSkillItems[getMstSkillIndex()].getSkillCode());
		return MstSkillConfirmPage.class;
	}

	@TakeOver(properties = "crudType,skillDiv,skillCode")
	public Class doInquire() {
		setCrudType(CrudType.READ);
		setSkillDiv(mstSkillItems[getMstSkillIndex()].getSkillDiv());
		setSkillCode(mstSkillItems[getMstSkillIndex()].getSkillCode());
		return MstSkillConfirmPage.class;
	}

	@Override
	@DateTimeConverter
	public Date getInsDate() {
		return super.getInsDate();
	}

	@Override
	@DateTimeConverter
	public Date getUpdDate() {
		return super.getUpdDate();
	}

	public MstSkill[] getMstSkillItems() {
		return this.mstSkillItems;
	}
	public void setMstSkillItems(MstSkill[] items) {
		this.mstSkillItems = items;
	}

	public int getMstSkillIndex() {
		return this.mstSkillIndex;
	}
	public void setMstSkillIndex(int mstSkillIndex) {
		this.mstSkillIndex = mstSkillIndex;
	}

	public String getTextSkillCode() {
		return this.textSkillCode;
	}
	public void setTextSkillCode(String textSkillCode) {
		this.textSkillCode = textSkillCode;
	}

	public String getTextSkillDiv() {
		return this.textSkillDiv;
	}
	public void setTextSkillDiv(String textSkillDiv) {
		this.textSkillDiv = textSkillDiv;
	}

	public String getTextSkillName() {
		return this.textSkillName;
	}
	public void setTextSkillName(String textSkillName) {
		this.textSkillName = textSkillName;
	}

	public Integer getOffset() {
		return offset;
	}
	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public Integer getCurrentPageIndex() {
		return currentPageIndex;
	}
	public void setCurrentPageIndex(Integer currentPageIndex) {
		this.currentPageIndex = currentPageIndex;
	}

	public Integer getTotalPageIndex() {
		return totalPageIndex;
	}
	public void setTotalPageIndex(Integer totalPageIndex) {
		this.totalPageIndex = totalPageIndex;
	}

	public Integer getTotalNumber() {
		return totalNumber;
	}
	public void setTotalNumber(Integer totalNumber) {
		this.totalNumber = totalNumber;
	}
}
package cish_sys.web.mstQualification;

import java.util.Date;

import org.seasar.teeda.extension.annotation.convert.DateTimeConverter;
import org.seasar.teeda.extension.annotation.takeover.TakeOver;

import cish_sys.entity.MstQualification;
import cish_sys.web.CrudType;
import cish_sys.paging.MstQualificationPagerCondition;

public class MstQualificationListPage extends AbstractMstQualificationPage {

	private MstQualification[] mstQualificationItems;

	private int mstQualificationIndex;

	private String textQuaDiv;

	private String textQuaCode;

	private String textQuaName;


	private Integer offset;

	private Integer currentPageIndex;

	private Integer totalPageIndex;

	private Integer totalNumber;

	private int limit = 10;

	public MstQualificationListPage() {
	}

	public Class initialize() {
		return null;
	}

	/*
	public Class prerender() {
		mstQualificationItems = getMstQualificationDao().selectAll();
		return null;
	}
	*/

	public Class prerender() {
		offset = mstQualificationIndex;

		MstQualificationPagerCondition dto = new MstQualificationPagerCondition();
		dto.setLimit(limit);
		dto.setOffset(mstQualificationIndex);

		mstQualificationItems = getMstQualificationDao().
			findByQuaDivAndQuaCodeAndQuaNamePagerCondition(
				textQuaDiv, textQuaCode, textQuaName, dto);

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
		mstQualificationIndex = offset;
		return null;
	}

	public Class doGoPreviousPage() {
		mstQualificationIndex = offset;
		if (mstQualificationIndex - limit >= 0) {
			mstQualificationIndex -= limit;
		}
		return null;
	}

	public Class doGoNextPage() {
		mstQualificationIndex = offset;
		prerender();
		if (mstQualificationIndex + limit < totalNumber) {
			mstQualificationIndex += limit;
		}
		return null;
	}

	public Class doGoLastPage() {
		prerender();
		offset = (totalPageIndex-1)*limit;
		mstQualificationIndex = offset;
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





	public String getMstQualificationRowClass() {
		if (getMstQualificationIndex() % 2 == 0) {
			return "row_even";
		}
		return "row_odd";
	}

	@TakeOver(properties = "crudType")
	public Class doCreate() {
		setCrudType(CrudType.CREATE);
		return MstQualificationEditPage.class;
	}

	@TakeOver(properties = "crudType,quaDiv,quaCode")
	public Class doEdit() {
		setCrudType(CrudType.UPDATE);
		setQuaDiv(mstQualificationItems[getMstQualificationIndex()].getQuaDiv());
		setQuaCode(mstQualificationItems[getMstQualificationIndex()].getQuaCode());
		return MstQualificationEditPage.class;
	}

	@TakeOver(properties = "crudType,quaDiv,quaCode")
	public Class doDelete() {
		setCrudType(CrudType.DELETE);
		setQuaDiv(mstQualificationItems[getMstQualificationIndex()].getQuaDiv());
		setQuaCode(mstQualificationItems[getMstQualificationIndex()].getQuaCode());
		return MstQualificationConfirmPage.class;
	}

	@TakeOver(properties = "crudType,quaDiv,quaCode")
	public Class doInquire() {
		setCrudType(CrudType.READ);
		setQuaDiv(mstQualificationItems[getMstQualificationIndex()].getQuaDiv());
		setQuaCode(mstQualificationItems[getMstQualificationIndex()].getQuaCode());
		return MstQualificationConfirmPage.class;
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

	public MstQualification[] getMstQualificationItems() {
		return this.mstQualificationItems;
	}

	public void setMstQualificationItems(MstQualification[] items) {
		this.mstQualificationItems = items;
	}

	public int getMstQualificationIndex() {
		return this.mstQualificationIndex;
	}

	public void setMstQualificationIndex(int mstQualificationIndex) {
		this.mstQualificationIndex = mstQualificationIndex;
	}

	public String getTextQuaDiv() {
		return this.textQuaDiv;
	}

	public void setTextQuaDiv(String textQuaDiv) {
		this.textQuaDiv = textQuaDiv;
	}
	public String getTextQuaCode() {
		return this.textQuaCode;
	}

	public void setTextQuaCode(String textQuaCode) {
		this.textQuaCode = textQuaCode;
	}
	public String getTextQuaName() {
		return this.textQuaName;
	}

	public void setTextQuaName(String textQuaName) {
		this.textQuaName = textQuaName;
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
package cish_sys.web.mstCode;

import java.util.Date;


import org.seasar.teeda.extension.annotation.convert.DateTimeConverter;
import org.seasar.teeda.extension.annotation.takeover.TakeOver;

import cish_sys.entity.MstCode;
import cish_sys.web.CrudType;
import cish_sys.paging.MstCodePagerCondition;

public class MstCodeListPage extends AbstractMstCodePage {

	private MstCode[] mstCodeItems;

	private int mstCodeIndex;

	private String textCodeName;

	private String textCodeDiv;

	private String textCode;

	private Integer offset;

	private Integer currentPageIndex;

	private Integer totalPageIndex;

	private Integer totalNumber;

	private int limit = 10;

	public MstCodeListPage() {
	}

	public Class<?> initialize() {
		return null;
	}

	public Class<?> prerender() {
		offset = mstCodeIndex;

		MstCodePagerCondition dto = new MstCodePagerCondition();
		dto.setLimit(limit);
		dto.setOffset(mstCodeIndex);

		mstCodeItems = getMstCodeDao().
			findByCodeNameAndCodeDivAndCodePagerCondition(
				textCodeName, textCodeDiv, textCode, dto);

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

	public Class<?> doRetrieve() {
		return null;
	}

	public Class<?> doGoFirstPage() {
		offset = 0;
		mstCodeIndex = offset;
		return null;
	}

	public Class<?> doGoPreviousPage() {
		mstCodeIndex = offset;
		if (mstCodeIndex - limit >= 0) {
			mstCodeIndex -= limit;
		}
		return null;
	}

	public Class<?> doGoNextPage() {
		mstCodeIndex = offset;
		prerender();
		if (mstCodeIndex + limit < totalNumber) {
			mstCodeIndex += limit;
		}
		return null;
	}

	public Class<?> doGoLastPage() {
		prerender();
		offset = (totalPageIndex-1)*limit;
		mstCodeIndex = offset;
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

	public String getMstCodeRowClass() {
		if (getMstCodeIndex() % 2 == 0) {
			return "row_even";
		}
		return "row_odd";
	}

	@TakeOver(properties = "crudType")
	public Class<?> doCreate() {
		setCrudType(CrudType.CREATE);
		return MstCodeEditPage.class;
	}

	@TakeOver(properties = "crudType,codeDiv,code")
	public Class doEdit() {
		setCrudType(CrudType.UPDATE);
		setCodeDiv(mstCodeItems[getMstCodeIndex()].getCodeDiv());
		setCode(mstCodeItems[getMstCodeIndex()].getCode());
		return MstCodeEditPage.class;
	}

	@TakeOver(properties = "crudType,codeDiv,code")
	public Class doDelete() {
		setCrudType(CrudType.DELETE);
		setCodeDiv(mstCodeItems[getMstCodeIndex()].getCodeDiv());
		setCode(mstCodeItems[getMstCodeIndex()].getCode());
		return MstCodeConfirmPage.class;
	}

	@TakeOver(properties = "crudType,codeDiv,code")
	public Class doInquire() {
		setCrudType(CrudType.READ);
		setCodeDiv(mstCodeItems[getMstCodeIndex()].getCodeDiv());
		setCode(mstCodeItems[getMstCodeIndex()].getCode());
		return MstCodeConfirmPage.class;
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

	public MstCode[] getMstCodeItems() {
		return this.mstCodeItems;
	}

	public void setMstCodeItems(MstCode[] items) {
		this.mstCodeItems = items;
	}

	public int getMstCodeIndex() {
		return this.mstCodeIndex;
	}

	public void setMstCodeIndex(int mstCodeIndex) {
		this.mstCodeIndex = mstCodeIndex;
	}

	public String getTextCodeName() {
		return this.textCodeName;
	}

	public void setTextCodeName(String textCodeName) {
		this.textCodeName = textCodeName;
	}

	public String getTextCodeDiv() {
		return this.textCodeDiv;
	}

	public void setTextCodeDiv(String textCodeDiv) {
		this.textCodeDiv = textCodeDiv;
	}

	public String getTextCode() {
		return this.textCode;
	}

	public void setTextCode(String textCode) {
		this.textCode = textCode;
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
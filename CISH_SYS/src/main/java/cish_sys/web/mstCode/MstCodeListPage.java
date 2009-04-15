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



	public MstCodeListPage() {
	}

	public Class initialize() {
		return null;
	}

	/*	
	public Class prerender() {
		mstCodeItems = getMstCodeDao().selectAll();
		return null;
	}
	*/

	public Class prerender() {
		mstCodeItems = getMstCodeDao().selectAll();

		return null;
	}
	




	
	public String getMstCodeRowClass() {
		if (getMstCodeIndex() % 2 == 0) {
			return "row_even";
		}
		return "row_odd";
	}

	@TakeOver(properties = "crudType")
	public Class doCreate() {
		setCrudType(CrudType.CREATE);
		return MstCodeEditPage.class;
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

}
package cish_sys.web.mstEngineer;

import java.util.Date;

import org.seasar.teeda.extension.annotation.convert.DateTimeConverter;
import org.seasar.teeda.extension.annotation.takeover.TakeOver;

import cish_sys.entity.MstEngineer;
import cish_sys.web.CrudType;
import cish_sys.paging.MstEngineerPagerCondition;

public class MstEngineerListPage extends AbstractMstEngineerPage {

	private MstEngineer[] mstEngineerItems;

	private int mstEngineerIndex;



	public MstEngineerListPage() {
	}

	public Class initialize() {
		return null;
	}

	/*	
	public Class prerender() {
		mstEngineerItems = getMstEngineerDao().selectAll();
		return null;
	}
	*/

	public Class prerender() {
		mstEngineerItems = getMstEngineerDao().selectAll();

		return null;
	}
	




	
	public String getMstEngineerRowClass() {
		if (getMstEngineerIndex() % 2 == 0) {
			return "row_even";
		}
		return "row_odd";
	}

	@TakeOver(properties = "crudType")
	public Class doCreate() {
		setCrudType(CrudType.CREATE);
		return MstEngineerEditPage.class;
	}

	@Override
	@DateTimeConverter
	public Date getBirth() {
		return super.getBirth();
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

	public MstEngineer[] getMstEngineerItems() {
		return this.mstEngineerItems;
	}

	public void setMstEngineerItems(MstEngineer[] items) {
		this.mstEngineerItems = items;
	}
	
	public int getMstEngineerIndex() {
		return this.mstEngineerIndex;
	}
	
	public void setMstEngineerIndex(int mstEngineerIndex) {
		this.mstEngineerIndex = mstEngineerIndex;
	}

}
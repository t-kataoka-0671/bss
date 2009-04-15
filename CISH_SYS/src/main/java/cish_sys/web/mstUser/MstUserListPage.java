package cish_sys.web.mstUser;


import org.seasar.teeda.extension.annotation.convert.DateTimeConverter;
import org.seasar.teeda.extension.annotation.takeover.TakeOver;

import cish_sys.entity.MstUser;
import cish_sys.web.CrudType;
import cish_sys.paging.MstUserPagerCondition;

public class MstUserListPage extends AbstractMstUserPage {

	private MstUser[] mstUserItems;

	private int mstUserIndex;



	public MstUserListPage() {
	}

	public Class initialize() {
		return null;
	}

	/*	
	public Class prerender() {
		mstUserItems = getMstUserDao().selectAll();
		return null;
	}
	*/

	public Class prerender() {
		mstUserItems = getMstUserDao().selectAll();

		return null;
	}
	




	
	public String getMstUserRowClass() {
		if (getMstUserIndex() % 2 == 0) {
			return "row_even";
		}
		return "row_odd";
	}

	@TakeOver(properties = "crudType")
	public Class doCreate() {
		setCrudType(CrudType.CREATE);
		return MstUserEditPage.class;
	}

	public MstUser[] getMstUserItems() {
		return this.mstUserItems;
	}

	public void setMstUserItems(MstUser[] items) {
		this.mstUserItems = items;
	}
	
	public int getMstUserIndex() {
		return this.mstUserIndex;
	}
	
	public void setMstUserIndex(int mstUserIndex) {
		this.mstUserIndex = mstUserIndex;
	}

}
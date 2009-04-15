package cish_sys.web.mstCompany;

import java.util.Date;

import org.seasar.teeda.extension.annotation.convert.DateTimeConverter;
import org.seasar.teeda.extension.annotation.takeover.TakeOver;

import cish_sys.entity.MstCompany;
import cish_sys.web.CrudType;
import cish_sys.paging.MstCompanyPagerCondition;

public class MstCompanyListPage extends AbstractMstCompanyPage {

	private MstCompany[] mstCompanyItems;

	private int mstCompanyIndex;



	public MstCompanyListPage() {
	}

	public Class initialize() {
		return null;
	}

	/*	
	public Class prerender() {
		mstCompanyItems = getMstCompanyDao().selectAll();
		return null;
	}
	*/

	public Class prerender() {
		mstCompanyItems = getMstCompanyDao().selectAll();

		return null;
	}
	




	
	public String getMstCompanyRowClass() {
		if (getMstCompanyIndex() % 2 == 0) {
			return "row_even";
		}
		return "row_odd";
	}

	@TakeOver(properties = "crudType")
	public Class doCreate() {
		setCrudType(CrudType.CREATE);
		return MstCompanyEditPage.class;
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

	public MstCompany[] getMstCompanyItems() {
		return this.mstCompanyItems;
	}

	public void setMstCompanyItems(MstCompany[] items) {
		this.mstCompanyItems = items;
	}
	
	public int getMstCompanyIndex() {
		return this.mstCompanyIndex;
	}
	
	public void setMstCompanyIndex(int mstCompanyIndex) {
		this.mstCompanyIndex = mstCompanyIndex;
	}

}
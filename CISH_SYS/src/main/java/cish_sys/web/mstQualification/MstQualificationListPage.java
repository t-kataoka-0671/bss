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
		mstQualificationItems = getMstQualificationDao().selectAll();

		return null;
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

}
package cish_sys.web.mstSkill;

import java.util.Date;

import org.seasar.dao.pager.PagerViewHelper;
import org.seasar.teeda.extension.annotation.convert.DateTimeConverter;
import org.seasar.teeda.extension.annotation.takeover.TakeOver;

import cish_sys.entity.MstSkill;
import cish_sys.web.CrudType;
import cish_sys.paging.MstSkillPagerCondition;

public class MstSkillListPage extends AbstractMstSkillPage {

	private MstSkill[] mstSkillItems;

	private int mstSkillIndex;

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
		mstSkillItems = getMstSkillDao().selectAll();

		return null;
	}

	public String getMstSkillTitle(){
		return "マスタメンテナンス【スキルマスタ】";
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

//	///////////////////////S2Pager/////////////////////////////
//	//カレントオフセット
//	private int offset;
//	//ページング用
//	private PagerViewHelper mstSkillPagerViewHelper;
//	//セッションで管理
//	private MstSkillPagerCondition mstSkillPagerCondition;
//
//	public boolean isPrev(){
//		return mstSkillPagerViewHelper.isPrev();
//	}
//	public boolean isNext(){
//		return mstSkillPagerViewHelper.isNext();
//	}
//	public int getPrevOffset(){
//		return mstSkillPagerViewHelper.getPrevOffset();
//	}
//	public void setPrevOffset(int prevOffset){
//		this.offset=prevOffset;
//	}
//	public int getNextOffset(){
//		return mstSkillPagerViewHelper.getNextOffset();
//	}
//	public void setNextOffset(int nextOffset){
//		this.offset=nextOffset;
//	}
//	//DynamicPropertyでボタンのキャプションを変更
//	public String getDoPrevValue() {
//		int limit=this.mstSkillPagerCondition.getLimit();
//		return "前の" + limit + "件へ";
//	}
//	public String getDoNextValue() {
//		int limit=this.mstSkillPagerCondition.getLimit();
//		return "次の" + limit + "件へ";
//	}
//	//総件数を返す
//	public int getCount(){
//		return this.mstSkillPagerCondition.getCount();
//	}
//
//	public String doPrev(){
//		return null;
//	}
//	public String doNext(){
//		return null;
//	}
//	///////////////////////////////////////////////////////////
}
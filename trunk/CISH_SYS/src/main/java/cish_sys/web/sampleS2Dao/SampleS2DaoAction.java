package cish_sys.web.sampleS2Dao;

import cish_sys.dao.MstSkillDao;
import cish_sys.dao.MstUserDao;
import cish_sys.entity.MstSkill;
import cish_sys.entity.MstUser;

/**
 * S2Daoサンプルプログラム Action.
 *
 * @author CIS furukawa
 *
 */
public class SampleS2DaoAction {

    /**
     * S2Daoサンプルプログラム Page.
     */
    private SampleS2DaoPage page;

    private MstUserDao mstUserDao;
    private MstSkillDao mstSkilDao;

    /**
     * マスタユーザDB更新処理
     * @return
     */
    public Class<?> doMstUserDBUpdate() {
	MstUser mstUser = mstUserDao.selectById(Long.parseLong("1"));
	if(mstUser == null){
	    //更新対象が存在しない
	    page.setMessages("更新対象のユーザが存在しません");
	    return null;
	}
	mstUser.setKanjiName("漢字名変更");
	//DB更新
	mstUserDao.update(mstUser);
	return null;
    }

    /**
     * マスタユーザDB登録処理
     * @return
     */
    public Class<?> doMstUserDBInsert() {
	//ユーザマスタEntityに値を設定し登録する
	MstUser mstUser = new MstUser();
	mstUser.setId(Long.parseLong("1"));
	mstUser.setKanjiName("漢字名");
	mstUser.setLoginId("Sample");
	//DB登録
	mstUserDao.insert(mstUser);
	return null;
    }

    /**
     * マスタユーザDB削除処理
     * @return
     */
    public Class<?> doMstUserDBDelete() {
	//ユーザマスタEntityに値を設定し削除する
	MstUser mstUser = new MstUser();
	mstUser.setId(Long.parseLong("1"));
	mstUserDao.delete(mstUser);
	return null;
    }

    /**
     * マスタユーザDB検索処理
     * @return
     */
    public Class<?> doMstUserDBSearch() {
	//ユーザマスタを検索する
	MstUser mstUser = mstUserDao.selectById(Long.parseLong("1"));
	if(mstUser == null){
	    //更新対象が存在しない
	    this.getPage().setMessages("検索対象のユーザが存在しません");
	}else{
	    this.getPage().setMessages(mstUser.toString());
	}
	return null;
    }

    /**
     * 外部SQLによるDB検索処理
     * @return
     */
    public Class<?> doOutSQLDBSearch() {
	int count = mstUserDao.selectCount();
	this.getPage().setMessages("ユーザマスタの登録件数：" + count + "件");
	return null;
    }

    /**
     * トランザクション確認処理
     * @return
     */
    public Class<?> doTransactionConfirm() {

	//ユーザマスタEntityに値を設定し登録する
	MstUser mstUser = new MstUser();
	mstUser.setId(Long.parseLong("1"));
	mstUser.setKanjiName("SampleS2Dao漢字名");
	mstUser.setLoginId("Sample");
	//DB登録
	mstUserDao.insert(mstUser);

	//スキルマスタEnitityに値を設定し登録する
	MstSkill mstSkill = new MstSkill();
	mstSkilDao.insert(mstSkill);

	return null;
    }


    /*------------------------------------------------------------------------------------*/

    /**
     * @return page
     */
    public SampleS2DaoPage getPage() {
	return page;
    }

    /**
     * @param page セットする page
     */
    public void setPage(SampleS2DaoPage page) {
	this.page = page;
    }

    public MstUserDao getMstUserDao() {
        return mstUserDao;
    }

    public void setMstUserDao(MstUserDao mstUserDao) {
        this.mstUserDao = mstUserDao;
    }

    public MstSkillDao getMstSkilDao() {
        return mstSkilDao;
    }

    public void setMstSkilDao(MstSkillDao mstSkilDao) {
        this.mstSkilDao = mstSkilDao;
    }


}

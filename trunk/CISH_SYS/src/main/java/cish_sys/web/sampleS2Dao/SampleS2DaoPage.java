package cish_sys.web.sampleS2Dao;

import cish_sys.dao.MstSkillDao;
import cish_sys.dao.MstUserDao;
import cish_sys.entity.MstSkill;
import cish_sys.entity.MstUser;
import cish_sys.service.SampleS2DaoService;

/**
 * S2Daoサンプルプログラム Page.
 *
 * @author CIS furukawa
 */
public class SampleS2DaoPage {

    private String message;

    private MstUserDao mstUserDao;
    private MstSkillDao mstSkilDao;
    private SampleS2DaoService service;

    /**
     * 初期化処理
     * @return
     */
    public Class<?> initialize() {
	setMessage("");
	return null;
    }

    /**
     * レンダリング処理
     * @return
     */
    public Class<?> prerender() {
	return null;
    }

    /**
     * マスタユーザDB更新処理
     * @return
     */
    public Class<?> doMstUserDBUpdate() {
	MstUser mstUser = mstUserDao.selectById(Long.parseLong("1"));
	if(mstUser == null){
	    //更新対象が存在しない
	    setMessage("更新対象のユーザが存在しません");
	    return null;
	}
	mstUser.setKanjiName("漢字名変更");
	//DB更新
	int result = mstUserDao.update(mstUser);
	setMessage("更新件数：" + result + "件");
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
	mstUser.setKanjiName("中央太郎");
	mstUser.setLoginId("Sample");
	//DB登録
	int result = mstUserDao.insert(mstUser);
	setMessage("登録件数：" + result + "件");
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
	int result = mstUserDao.delete(mstUser);
	setMessage("削除件数：" + result + "件");
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
	    setMessage("検索対象のユーザが存在しません");
	}else{
	    setMessage("ID："+mstUser.getId().toString()+"　　名前：" + mstUser.getKanjiName());
	}
	return null;
    }

    /**
     * 外部SQLによるDB検索処理
     * @return
     */
    public Class<?> doOutSQLDBSearch() {
	int count = mstUserDao.selectCount();
	setMessage("検索結果：" + count + "件");
	return null;
    }

    /**
     * トランザクション確認処理(Pageクラス)
     * @return
     */
    public Class<?> doTransactionConfirmPage() {

	//ユーザマスタEntityに値を設定し登録する
	MstUser mstUser = new MstUser();
	mstUser.setId(Long.parseLong("1"));
	mstUser.setKanjiName("中央太郎");
	mstUser.setLoginId("Sample");
	//DB登録
	mstUserDao.insert(mstUser);

	//スキルマスタEnitityに値を設定し登録する
	MstSkill mstSkill = new MstSkill();
	mstSkilDao.insert(mstSkill);

	return null;
    }

    /**
     * トランザクション確認処理(Serviceクラス)
     * @return
     */
    public Class<?> doTransactionConfirmService() {

	//Serviceクラスを実行
	service.exec();

	return null;
    }

/*-----------------------------------------------------------------------------------*/

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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

    public SampleS2DaoService getService() {
        return service;
    }

    public void setService(SampleS2DaoService service) {
        this.service = service;
    }

}

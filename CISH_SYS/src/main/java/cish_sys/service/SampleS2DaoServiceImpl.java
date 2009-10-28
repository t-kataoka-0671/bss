package cish_sys.service;

import org.seasar.framework.container.annotation.tiger.Binding;

import cish_sys.dao.MstSkillDao;
import cish_sys.dao.MstUserDao;
import cish_sys.entity.MstSkill;
import cish_sys.entity.MstUser;

public class SampleS2DaoServiceImpl implements SampleS2DaoService {

    @Binding
    public MstUserDao mstUserDao = null;
    @Binding
    public MstSkillDao mstSkilDao = null;


    /**
     * DB更新処理.
     *
     * @return 結果
     */
    public boolean exec() {
	// ユーザマスタEntityに値を設定し登録する
	MstUser mstUser = new MstUser();
	mstUser.setId(Long.parseLong("1"));
	mstUser.setKanjiName("中央太郎");
	mstUser.setLoginId("Sample");
	// DB登録
	mstUserDao.insert(mstUser);

	// スキルマスタEnitityに値を設定し登録する
	MstSkill mstSkill = new MstSkill();
	mstSkilDao.insert(mstSkill);
	return true;
    }

//    public MstUserDao getMstUserDao() {
//	return mstUserDao;
//    }
//
//    public void setMstUserDao(MstUserDao mstUserDao) {
//	this.mstUserDao = mstUserDao;
//    }
//
//    public MstSkillDao getMstSkilDao() {
//	return mstSkilDao;
//    }
//
//    public void setMstSkilDao(MstSkillDao mstSkilDao) {
//	this.mstSkilDao = mstSkilDao;
//    }

}

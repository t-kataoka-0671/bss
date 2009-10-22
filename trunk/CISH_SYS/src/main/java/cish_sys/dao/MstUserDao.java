package cish_sys.dao;

import org.seasar.dao.annotation.tiger.Arguments;
import org.seasar.dao.annotation.tiger.S2Dao;

import cish_sys.entity.MstUser;

/**
 * ユーザマスタ Dao.
 *
 * @author CIS furukawa
 */
@S2Dao(bean=MstUser.class)
public interface MstUserDao {

    public MstUser[] selectAll();

    @Arguments("ID")
    public MstUser selectById(Long id);

    public int insert(MstUser mstUser);

    public int update(MstUser mstUser);

    public int delete(MstUser mstUser);

    public int selectCount();
}

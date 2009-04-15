package cish_sys.dao;

import org.seasar.dao.annotation.tiger.Arguments;
import org.seasar.dao.annotation.tiger.S2Dao;

import cish_sys.entity.MstCode;

@S2Dao(bean=MstCode.class)
public interface MstCodeDao {

	public MstCode[] selectAll();

	@Arguments( { "CODE_DIV", "CODE" })
	public MstCode selectById(String codeDiv, String code);

	public int insert(MstCode code);

	public int update(MstCode code);

	public int delete(MstCode code);

}

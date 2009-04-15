package cish_sys.web.mstUser;

import cish_sys.entity.MstUser;

public interface MstUserDxo {

	public MstUser convert(AbstractMstUserPage src);
	
	public void convert(MstUser src, AbstractMstUserPage dest);
}
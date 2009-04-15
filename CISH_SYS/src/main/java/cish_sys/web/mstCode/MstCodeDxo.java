package cish_sys.web.mstCode;

import cish_sys.entity.MstCode;

public interface MstCodeDxo {

	public MstCode convert(AbstractMstCodePage src);
	
	public void convert(MstCode src, AbstractMstCodePage dest);
}
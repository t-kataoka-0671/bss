package cish_sys.web.mstCode;



import java.util.Date;

import org.seasar.teeda.extension.annotation.validator.ByteLength;
import org.seasar.teeda.extension.annotation.validator.Required;
import org.seasar.teeda.core.exception.AppFacesException;

import cish_sys.entity.MstCode;
import cish_sys.web.CrudType;

public class MstCodeEditPage extends AbstractMstCodePage {

	public MstCodeEditPage() {
	}

	public Class initialize() {
		if(getCrudType() == CrudType.UPDATE) {
			MstCode data = getMstCodeDao().selectById(getCodeDiv(), getCode());
			if(data == null) {
				throw new AppFacesException("E0000001");
			}
			getMstCodeDxo().convert(data ,this);
		}
		return null;
	}

	public Class prerender() {
		return null;
	}

	@Override
	@Required
	public void setDelFlag(String delFlag) {
		super.setDelFlag(delFlag);
	}

	@Override
	@Required
	@ByteLength(maximum = 2)
	public void setCodeDiv(String codeDiv) {
		super.setCodeDiv(codeDiv);
	}

	@Override
	@Required
	@ByteLength(maximum = 3)
	public void setCode(String code) {
		super.setCode(code);
	}

	@Override
	@ByteLength(maximum = 50)
	public void setCodeName(String CodeName) {
		super.setCodeName(CodeName);
	}

	@Override
	@ByteLength(maximum = 8)
	public void setInsUser(String insUser) {
		super.setInsUser(insUser);
	}

	@Override
	@ByteLength(maximum = 8)
	public void setUpdUser(String updUser) {
		super.setUpdUser(updUser);
	}

	public boolean isCreate(){
		Date sysDate = new Date();
		if(getCrudType() == CrudType.CREATE) {
			super.setInsDate(sysDate);
			return true;
		}else{
			super.setUpdDate(sysDate);
			return false;
		}
	}

	public String getIsNotCreateStyle() {
		return getCrudType() == CrudType.CREATE ? "display: none;" : null;
	}
}
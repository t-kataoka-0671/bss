package cish_sys.web.mstQualification;

import java.util.Date;

import org.seasar.teeda.extension.annotation.validator.ByteLength;
import org.seasar.teeda.extension.annotation.validator.Required;

import org.seasar.teeda.core.exception.AppFacesException;

import cish_sys.entity.MstQualification;
import cish_sys.web.CrudType;

public class MstQualificationEditPage extends AbstractMstQualificationPage {

	public MstQualificationEditPage() {
	}

	public Class initialize() {
		if(getCrudType() == CrudType.UPDATE) {
			MstQualification data = getMstQualificationDao().selectById(getQuaDiv(), getQuaCode());
			if(data == null) {
				throw new AppFacesException("E0000001");
			}
			getMstQualificationDxo().convert(data ,this);
		}
		return null;
	}

	public Class prerender() {
		return null;
	}

	@Override
	@Required
	@ByteLength(maximum = 2)
	public void setQuaDiv(String quaDiv) {
		super.setQuaDiv(quaDiv);
	}

	@Override
	@Required
	@ByteLength(maximum = 3)
	public void setQuaCode(String quaCode) {
		super.setQuaCode(quaCode);
	}

	@Override
	@ByteLength(maximum = 50)
	public void setQuaName(String quaName) {
		super.setQuaName(quaName);
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

	@Override
	@Required
	@ByteLength(maximum = 1)
	public void setDelFlag(String delflag) {
		super.setDelFlag(delflag);
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
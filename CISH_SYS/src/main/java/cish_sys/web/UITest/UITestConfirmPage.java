package cish_sys.web.UITest;

import java.util.Date;

import org.seasar.teeda.extension.annotation.convert.DateTimeConverter;
import org.seasar.teeda.extension.annotation.takeover.TakeOver;
import org.seasar.teeda.extension.annotation.takeover.TakeOverType;
import org.seasar.teeda.extension.annotation.validator.Required;
import org.seasar.teeda.core.exception.AppFacesException;
import org.seasar.teeda.extension.util.LabelHelper;

import cish_sys.entity.MstSkill;
import cish_sys.web.CrudType;

public class UITestConfirmPage extends AbstractUITestPage {

	private LabelHelper labelHelper;

	public UITestConfirmPage() {
	}

	public Class initialize() {
		return null;
	}

	public Class prerender() {
		return null;
	}

	public void setLabelHelper(LabelHelper labelHelper) {
		this.labelHelper = labelHelper;
	}

	public LabelHelper getLabelHelper() {
		return this.labelHelper;
	}

	public String getDoFinishValue() {
        return labelHelper.getLabelValue(CrudType.toString(getCrudType()));
    }
}
package cish_sys.web.UITest;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import cish_sys.web.UITest.AbstractUITestPage;
import cish_sys.web.mstSkill.MstSkillListPage;

public class UITestEditPage extends AbstractUITestPage {

	private String[] selectOneMenuItems = new String[1];

	private String[] selectManyCheckboxItems = new String[3];

	private List forEachItems;

	public UITestEditPage(){
		StringBuffer sb = new StringBuffer();
		sb.append("inputTextarea ");
		sb.append("inputTextarea ");
		sb.append("inputTextarea ");

		setOutputText("outputText");
		setInputText("inputText");
		setInputHidden("inputHidden");				//画面中は表示されない。
		setInputRadio("2");
		setInputSecret("inputSecret");				//設定できない？
		setInputTextarea(sb.toString());
		setInputFile("inputFile");					//設定できない？
		setPopupCalendar(Date.valueOf("2009-10-22"));
		setSelectOneMenu("2");						//設定できない？
		setSelectOneRadio("2");
		setSelectBooleanCheckbox(true);

		selectOneMenuItems[0] = new String("2");
		selectManyCheckboxItems[0] = new String("1");
		selectManyCheckboxItems[1] = new String("2");
		selectManyCheckboxItems[2] = new String("3");
	}

	public Class initialize() {

		return null;
	}

	public Class prerender() {
		return null;
	}

	public Class goUITestConfirm() {
		setCommandButton("CommandButton(submit)");
		return null;
	}
	public Class doUITestConfirm() {
		setCommandButton("CommandButton(button)");
		return UITestConfirmPage.class;
	}
	public Class jumpUITestConfirm() {
		setCommandButton("CommandButton(image)");
		return null;
	}
}

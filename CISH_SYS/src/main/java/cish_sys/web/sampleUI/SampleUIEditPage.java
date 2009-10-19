package cish_sys.web.sampleUI;

import java.lang.reflect.Array;
import java.sql.Date;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import cish_sys.web.sampleUI.AbstractSampleUIPage;

public class SampleUIEditPage extends AbstractSampleUIPage {

	private List<Map> Items;

	public SampleUIEditPage(){
		StringBuffer sb = new StringBuffer();
		sb.append("inputTextarea ");
		sb.append("inputTextarea ");
		sb.append("inputTextarea ");

		String[] st = new String[3];
		st[0] = "1";
		st[1] = "3";

		Map ItemsMap = new LinkedHashMap();
		ItemsMap.put("1", "One");
		ItemsMap.put("2", "Two");
		ItemsMap.put("3", "Three");
		Items = new ArrayList<Map>();
		Items.add(ItemsMap);
		//setSelectOneRadioItems(Items);
		//setSelectManyCheckboxItems(Items);
		//setSelectOneMenuItems(Items);
		//setSelectManyListItems(Items);
		//setForEach(Items);

		setOutputText("outputText");
		setInputText("inputText");
		setInputSecret("inputSecret");
		setInputHidden("inputHidden");
		setInputTextarea(sb.toString());
		setInputRadio("2");
		setSelectOneRadio("2");
		setSelectBooleanCheckbox(true);
		setSelectManyCheckbox(st);
		setSelectOneMenu("2");						//設定できない？
		setSelectManyList(st);
		setInputFile("inputFile");					//設定できない？
		setPopupCalendar(Date.valueOf("2009-10-22"));
	}

	public Class initialize() {

		return null;
	}

	public Class prerender() {
		return null;
	}

	public Class goSampleUIConfirm() {
		setCommandButton("CommandButton(submit)");
		return null;
	}
	public Class doSampleUIConfirm() {
		setCommandButton("CommandButton(button)");
		return SampleUIConfirmPage.class;
	}
	public Class jumpSampleUIConfirm() {
		setCommandButton("CommandButton(image)");
		return null;
	}
}

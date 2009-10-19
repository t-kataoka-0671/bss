package cish_sys.web.sampleUI;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
//import java.util.Map;
//import java.util.LinkedHashMap;
//import java.lang.reflect.Array;

import cish_sys.web.sampleUI.AbstractSampleUIPage;

public class SampleUIEditPage extends AbstractSampleUIPage {


	public SampleUIEditPage(){
		//テキストフィールド 初期値作成
		StringBuffer sb = new StringBuffer();
		sb.append("inputTextarea ");
		sb.append("inputTextarea ");
		sb.append("inputTextarea ");

		//チェックボックス(複数項目)・選択リスト(複数選択) 初期値作成
		String[] st = new String[3];
		st[0] = "1";
		st[1] = "3";

		//ラジオボタン(動的) 項目設定
		//チェックボックス(複数項目) 項目設定
		List RadioItems = new ArrayList();
		SelectListDto dto1 = new SelectListDto();
		dto1.setValue(1);
		dto1.setLabel("One");
		RadioItems.add(dto1);
		SelectListDto dto2 = new SelectListDto();
		dto2.setValue(2);
		dto2.setLabel("Two");
		RadioItems.add(dto2);
		SelectListDto dto3 = new SelectListDto();
		dto3.setValue(3);
		dto3.setLabel("Three");
		RadioItems.add(dto3);
		SelectListDto dto4 = new SelectListDto();
		dto4.setValue(4);
		dto4.setLabel("Four");
		RadioItems.add(dto4);
		setSelectOneRadioItems(RadioItems);
		setSelectManyCheckboxItems(RadioItems);
		setSelectOneMenuItems(RadioItems);
		setSelectManyListItems(RadioItems);

		//SampleUIForEachItemDto[] item = new SampleUIForEachItemDto[4];
		//item[0].setVal("Value 1");
		//item[1].setVal("Value 2");
		//item[2].setVal("Value 3");
		//item[3].setVal("Value 4");
		//setForEachItems(item);

		//初期値設定
		setOutputText("outputText");
		setInputText("inputText");
		setInputSecret("inputSecret");
		setInputHidden("inputHidden");
		setInputTextarea(sb.toString());
		setInputRadio("2");
		setSelectOneRadio("2");
		setSelectBooleanCheckbox(true);
		setSelectManyCheckbox(st);
		setSelectOneMenu("2");
		setSelectManyList(st);
		setInputFile("inputFile");
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

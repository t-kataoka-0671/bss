package cish_sys.web.sampleUI;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
//import java.util.Map;
//import java.util.LinkedHashMap;
//import java.lang.reflect.Array;

import cish_sys.web.sampleUI.AbstractSampleUIPage;

public class SampleUIEditPage extends AbstractSampleUIPage {

	//private List<Map> Items;

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
		selectListDto dto1 = new selectListDto();
		dto1.setValue(1);
		dto1.setLabel("One");
		RadioItems.add(dto1);
		selectListDto dto2 = new selectListDto();
		dto2.setValue(2);
		dto2.setLabel("Two");
		RadioItems.add(dto2);
		selectListDto dto3 = new selectListDto();
		dto3.setValue(3);
		dto3.setLabel("Three");
		RadioItems.add(dto3);
		selectListDto dto4 = new selectListDto();
		dto4.setValue(4);
		dto4.setLabel("Four");
		RadioItems.add(dto4);
		setSelectOneRadioItems(RadioItems);
		setSelectManyCheckboxItems(RadioItems);
		setSelectOneMenuItems(RadioItems);
		setSelectManyListItems(RadioItems);

		//Map ItemsMap = new LinkedHashMap();
		//ItemsMap.put("1", "One");
		//ItemsMap.put("2", "Two");
		//ItemsMap.put("3", "Three");
		//Items = new ArrayList<Map>();
		//Items.add(ItemsMap);
		//setForEach(Items);

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

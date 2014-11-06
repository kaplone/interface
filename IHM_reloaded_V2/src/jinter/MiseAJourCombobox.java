package jinter;

public class MiseAJourCombobox {
	
	public static void Maj(){
		for (Preset preset : Ihm.presets){
			Ihm.window.getComboBox().addItem(preset.toString());
		}
	}

}

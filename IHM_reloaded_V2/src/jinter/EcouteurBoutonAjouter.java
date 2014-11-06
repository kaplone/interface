package jinter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class EcouteurBoutonAjouter implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		Preset newPreset = new Preset(Integer.valueOf(Config.getTextField().getText()), Integer.valueOf(Config.getTextField_1().getText()), Integer.valueOf(Config.getTextField_2().getText()));
		ParserConfig.presets.add(newPreset);
		try {
			ParserConfig.ajouterPreset(newPreset.toString());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		Config.peuplerListe();

	}

}

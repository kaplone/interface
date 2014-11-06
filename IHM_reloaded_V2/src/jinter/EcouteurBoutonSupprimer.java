package jinter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class EcouteurBoutonSupprimer implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		Preset candidatRemove = (Preset) Config.getModel().elementAt(Config.getList().getSelectedIndex());
		ParserConfig.presets.remove(candidatRemove);
		try {
			ParserConfig.enleverPreset(candidatRemove.toString());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Config.peuplerListe();

	}

}

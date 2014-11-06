package jinter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class EcouteurParDefaut implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		int indexCandidatDefaut = Config.getList().getSelectedIndex();
		Preset candidatDefaut = (Preset) Config.getModel().elementAt(indexCandidatDefaut);
		
		try {
			ParserConfig.enleverPreset(candidatDefaut.toString());
		} catch (IOException e11) {
			e11.printStackTrace();
		}
		
		try {
			ParserConfig.ajouterEnPremier(candidatDefaut.toString());
		} catch (IOException e12) {
			e12.printStackTrace();
		}
		Config.peuplerListe();
		

	}

}

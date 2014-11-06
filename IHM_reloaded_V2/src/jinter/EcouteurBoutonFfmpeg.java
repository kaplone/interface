package jinter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class EcouteurBoutonFfmpeg implements ActionListener {

	FilechooserCheminFfmpeg chooserFfmpeg;

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			chooserFfmpeg = new FilechooserCheminFfmpeg();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}

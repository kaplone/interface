package jinter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class EcouteurBoutonAdb implements ActionListener {
	
	FilechooserCheminAdb chooserAdb;

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			chooserAdb = new FilechooserCheminAdb();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}

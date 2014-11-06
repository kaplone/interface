package jinter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class EcouteurBoutonLocalFolder implements ActionListener {
	
	FilechooserCheminLocal chooserLocal;

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			chooserLocal = new FilechooserCheminLocal();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}

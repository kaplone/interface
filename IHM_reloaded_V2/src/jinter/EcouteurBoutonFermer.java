package jinter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;

public class EcouteurBoutonFermer implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			ParserConfig.parsage();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		EcouteurBoutonConfig.getJconfig().dispose();

	}

}

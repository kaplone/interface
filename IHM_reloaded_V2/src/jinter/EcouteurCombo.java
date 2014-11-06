package jinter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EcouteurCombo implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e)  {
		Ihm.peupler();
	}
}

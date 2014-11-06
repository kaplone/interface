package jinter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class EcouteurBoutonConfig implements ActionListener {
	
	private static JFrame jconfig;

	@Override
	public void actionPerformed(ActionEvent e) {
		jconfig = new Config();
		jconfig.setVisible(true);	

	}
	
	public static JFrame getConfig(){
		return jconfig;
	}

	public static JFrame getJconfig() {
		return jconfig;
	}

	public static void setJconfig(JFrame jconfig) {
		EcouteurBoutonConfig.jconfig = jconfig;
	}

}

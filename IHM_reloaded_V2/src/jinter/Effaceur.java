package jinter;

import java.io.IOException;

import javax.swing.SwingWorker;

public class Effaceur extends SwingWorker {
	
	static Process p = null;
	static Runtime runtime = Runtime.getRuntime();
	static String[] commande_efface;

	public Effaceur(String[] commande_efface2) {
		this.commande_efface = commande_efface2;
	}
	
	public static void enCours() throws IOException{
		p = runtime.exec(commande_efface);
		Ihm.setLabel("Stand by...");
	}

	@Override
	protected Object doInBackground() throws Exception {
		return null;
	}

}

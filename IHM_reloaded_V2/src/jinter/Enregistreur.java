package jinter;

import java.io.IOException;

import javax.swing.SwingWorker;

public class Enregistreur extends SwingWorker {
	
	static Process p = null;
	static Runtime runtime = Runtime.getRuntime();
	static String[] commande_capture;

	public Enregistreur(String[] commande_capture) {
		Enregistreur.commande_capture = commande_capture;
	}
	
	public static void enCours() throws IOException{
		p = runtime.exec(commande_capture);

	}

	@Override
	protected Object doInBackground() throws Exception {
		
		return null;
	}

	public static Process getP() {
		return p;
	}

	public static void setP(Process p) {
		Enregistreur.p = p;
	}

}

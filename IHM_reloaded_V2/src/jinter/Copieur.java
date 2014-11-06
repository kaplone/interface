package jinter;

import java.io.IOException;

import javax.swing.SwingWorker;

public class Copieur extends SwingWorker {
	
	static Process p = null;
	static Runtime runtime = Runtime.getRuntime();
	static String[] commande_copie;

	public Copieur(String[] commande_copie2) {
		this.commande_copie = commande_copie2;
	}
	
	public static void enCours() throws IOException{
		/*
		 * dd if=/home/david/appat/dfg__001_2560x1600@15.mp4 of=appat/test4.txt bs=1 count=4 skip=28  ==> moov ou free
		 * 
		 * 
		 * 
		 */
		Ihm.setLabel("Transfert en cours");
		p = runtime.exec(commande_copie);

	}

	@Override
	protected Object doInBackground() throws Exception {
			return null;
	}

	public static Process getP() {
		return p;
	}

	public static void setP(Process p) {
		Copieur.p = p;
	}

}

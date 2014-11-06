package jinter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.swing.SwingWorker;
import javax.swing.Timer;

public class EcouteurBouton implements ActionListener {
	
	Runtime runtime = Runtime.getRuntime();
	SwingWorker workerCompteur;
	SwingWorker workerEnregistreur = null;
	SwingWorker workerCopieur;
	SwingWorker workerEffaceur;
	SwingWorker workerFfmpeg;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		String nom = Ihm.getNom();
		
		if (workerEnregistreur == null){
			Ihm.setLabel_8("rouge");
			
			System.out.println(nom);

			String bitrate = Ihm.window.textField_2.getText().equals("") ? "" : "--bit-rate";
			String bitrate2 = Ihm.window.textField_2.getText().equals("") ? "" : String.format("%d", Integer.valueOf(Ihm.window.textField_2.getText()) * 1000000);

			String size = "--size";
			String size2 = Ihm.window.textField.getText() + "x" + Ihm.window.textField_1.getText();
			
			String chem= Ihm.getCheminAdb();
			
			String[] commande_capture = {chem, "shell", "screenrecord", "--verbose", bitrate, bitrate2, size, size2,  "/sdcard/" + nom}; 
			
			workerCompteur = new Compteur();
			Compteur.getTi().start();
			
			workerEnregistreur = new Enregistreur(commande_capture);
			try {
				Enregistreur.enCours();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		else {

			Compteur.getTi().stop();
			Ihm.setLabel_8("vert");
			Enregistreur.getP().destroy();
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			

			String[] commande_copie = {Ihm.getCheminAdb(), "pull", "/sdcard/" + nom, Ihm.getChemin() + "/" + nom};
			//String[] commande_efface = {Ihm.getCheminAdb(), "shell", "rm", "/sdcard/" + nom};
			String[] commande_ffmpeg = {Ihm.getCheminFfmpeg(), "-i", Ihm.getChemin() + "/" + nom};
						
			Ihm.window.textField_5.setText(String.format("%03d", Integer.valueOf(Ihm.window.textField_5.getText()) + 1));

			workerCopieur = new Copieur(commande_copie);
			try {
				Copieur.enCours();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

//  		workerEffaceur = new Effaceur(commande_efface);
//			try {
//				Effaceur.enCours();
//			} catch (IOException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}

			Ihm.addList_1(nom);
			
			workerFfmpeg = new Ffmpeg(commande_ffmpeg);
			
			workerEnregistreur = null;
		}
	}
}
//
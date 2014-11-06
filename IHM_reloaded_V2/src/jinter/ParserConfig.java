package jinter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ParserConfig {
	
	static boolean rotation = true;
	static ArrayList<Preset> presets = new ArrayList<Preset>();
	static String chemin;
	static String chemin_adb;
	static String chemin_ffmpeg;
	static String chemin_conf = "bin/jinter/interface.conf";

	public static void parsage () throws IOException{

		BufferedReader fichier = new BufferedReader(new FileReader(chemin_conf));
		String line;
		String line_stripped;
		boolean pres = true;
		String[] parts;
		String[] tailles;

		while ((line = fichier.readLine()) != null) {
			line_stripped = line.replaceAll("\\s","");
			if ( line_stripped.length()!=0 && line_stripped.charAt(0)!= '#' && line_stripped.charAt(0)!= '\n'){
				if (line_stripped.charAt(0)=='[' && line_stripped.charAt(1)=='o'){
					pres = false;
				}
				else if (line_stripped.charAt(0)=='[' && line_stripped.charAt(1)=='p'){
					pres = true;
				}
				else {
					if (pres){
						System.out.println(line_stripped);
						parts = line_stripped.split("@");
						tailles = parts[0].split("x");
						try{
							presets.add(new Preset(Integer.parseInt(tailles[0]), Integer.parseInt(tailles[1]), Integer.parseInt(parts[1])));
						}catch (NumberFormatException n){
							////System.out.println("NumberFormatException ...");
						}
					}
					else {
						if (line_stripped.split("=")[0].equals("dossier_local")){
							chemin = line_stripped.split("=")[1];
						}
						if (line_stripped.split("=")[0].equals("adb")){
							chemin_adb = line_stripped.split("=")[1];
							//System.out.println(chemin_adb);
							
						}
						if (line_stripped.split("=")[0].equals("ffmpeg")){
							chemin_ffmpeg = line_stripped.split("=")[1];
						}
						else if (line_stripped.split("=")[0].equals("orientation")){
							rotation = line_stripped.split("=")[1].equals("oui") ? true : false;
						}
					}
				}

			}	
		}

		fichier.close();
		afficherComboBox();
	}
	
	public static void modifierCheminLocal (String nouveau) throws IOException{
		Scanner fichierLec = new Scanner(new File(chemin_conf));
		
		ArrayList<String> listeDeLignes = new ArrayList<String>();
		while (fichierLec.hasNext()){
			listeDeLignes.add(fichierLec.next());
		}
		fichierLec.close();
		
		FileWriter fichierRec = new FileWriter(new File(chemin_conf), false);
		String line;
		chemin = nouveau;
		
		for (String ligne : listeDeLignes) {
			System.out.print(ligne);
			if (ligne.split("=")[0].equals("dossier_local")){
				////System.out.println("   --> cible");
				 try {
				     fichierRec.write("dossier_local=" + nouveau + "\n");
				 } catch(IOException ie) {
				     ie.printStackTrace();
				 }
			}
			else {
				////System.out.println("   --> passe");
				try {
				     fichierRec.write(ligne + "\n");
				 } catch(IOException ie) {
				     ie.printStackTrace();
				 }
			}

		}
		fichierRec.flush();
		fichierRec.close();
	}

	public static void modifierCheminFfmpeg (String nouveau) throws IOException{
Scanner fichierLec = new Scanner(new File(chemin_conf));
		
		ArrayList<String> listeDeLignes = new ArrayList<String>();
		while (fichierLec.hasNext()){
			listeDeLignes.add(fichierLec.next());
		}
		fichierLec.close();
		
		FileWriter fichierRec = new FileWriter(new File(chemin_conf), false);
		String line;
		chemin_ffmpeg = nouveau;
		
		for (String ligne : listeDeLignes) {
			System.out.print(ligne);
			if (ligne.split("=")[0].equals("ffmpeg")){
				////System.out.println("   --> cible");
				 try {
				     fichierRec.write("ffmpeg=" + nouveau + "\n");
				 } catch(IOException ie) {
				     ie.printStackTrace();
				 }
			}
			else {
				////System.out.println("   --> passe");
				try {
				     fichierRec.write(ligne + "\n");
				 } catch(IOException ie) {
				     ie.printStackTrace();
				 }
			}

		}
		fichierRec.flush();
		fichierRec.close();
	}

	public static void modifierCheminAdb (String nouveau) throws IOException{
Scanner fichierLec = new Scanner(new File(chemin_conf));
		
		ArrayList<String> listeDeLignes = new ArrayList<String>();
		while (fichierLec.hasNext()){
			listeDeLignes.add(fichierLec.next());
		}
		fichierLec.close();
		
		FileWriter fichierRec = new FileWriter(new File(chemin_conf), false);
		String line;
		chemin_adb = nouveau;
		
		for (String ligne : listeDeLignes) {
			System.out.print(ligne + " ");
			if (ligne.split("=")[0].equals("adb")){
				////System.out.println("   --> cible");
				 try {
				     fichierRec.write("adb=" + nouveau + "\n");
				 } catch(IOException ie) {
				     ie.printStackTrace();
				 }
			}
			else {
				////System.out.println("   --> passe");
				try {
				     fichierRec.write(ligne + "\n");
				 } catch(IOException ie) {
				     ie.printStackTrace();
				 }
			}

		}
		fichierRec.flush();
		fichierRec.close();
	}

	
	public static void ajouterPreset (String nouveau) throws IOException{
		Scanner fichierLec = new Scanner(new File(chemin_conf));
				
				ArrayList<String> listeDeLignes = new ArrayList<String>();
				while (fichierLec.hasNext()){
					listeDeLignes.add(fichierLec.next());
				}
				fichierLec.close();
				
				FileWriter fichierRec = new FileWriter(new File(chemin_conf), false);
				String line;
				
				for (String ligne : listeDeLignes) {
					//System.out.print(ligne);
					if (ligne.equals("[options]-------------------------------------------------------")){
						////System.out.println("   --> cible");
						 try {
						     fichierRec.write(nouveau + "\n[options]-------------------------------------------------------\n");
						 } catch(IOException ie) {
						     ie.printStackTrace();
						 }
					}
					else {
						////System.out.println("   --> passe");
						try {
						     fichierRec.write(ligne + "\n");
						 } catch(IOException ie) {
						     ie.printStackTrace();
						 }
					}

				}
				fichierRec.flush();
				fichierRec.close();
			}
	
	public static void enleverPreset (String nouveau) throws IOException{
		Scanner fichierLec = new Scanner(new File(chemin_conf));
				
				ArrayList<String> listeDeLignes = new ArrayList<String>();
				while (fichierLec.hasNext()){
					listeDeLignes.add(fichierLec.next());
				}
				fichierLec.close();
				
				FileWriter fichierRec = new FileWriter(new File(chemin_conf), false);
				String line;
				
				for (String ligne : listeDeLignes) {
					System.out.print(ligne);
					if (ligne.equals(nouveau)){
						////System.out.println("   --> cible");
					}
					else {
						////System.out.println("   --> passe");
						try {
						     fichierRec.write(ligne + "\n");
						 } catch(IOException ie) {
						     ie.printStackTrace();
						 }
					}

				}
				fichierRec.flush();
				fichierRec.close();
			}

	

	public static boolean isRotation() {
		return rotation;
	}


	public static void setRotation(boolean rotation) {
		ParserConfig.rotation = rotation;
	}


	public static ArrayList<Preset> getPresets() {
		return presets;
	}


	public static void setPresets(ArrayList<Preset> presets) {
		ParserConfig.presets = presets;
	}


	public static String getChemin() {
		return chemin;
	}


	public static void setChemin(String chemin) {
		ParserConfig.chemin = chemin;
	}


	public static String getChemin_adb() {
		//System.out.println(chemin_adb);
		return chemin_adb;
	}


	public static void setChemin_adb(String chemin_adb) {
		ParserConfig.chemin_adb = chemin_adb;
	}


	public static String getChemin_ffmpeg() {
		return chemin_ffmpeg;
	}


	public static void setChemin_ffmpeg(String chemin_ffmpeg) {
		ParserConfig.chemin_ffmpeg = chemin_ffmpeg;
	}


	public static void ajouterEnPremier(String nouveau) throws IOException{
		Scanner fichierLec = new Scanner(new File(chemin_conf));
		
		ArrayList<String> listeDeLignes = new ArrayList<String>();
		while (fichierLec.hasNext()){
			listeDeLignes.add(fichierLec.next());
		}
		fichierLec.close();
		
		FileWriter fichierRec = new FileWriter(new File(chemin_conf), false);
		String line;
		
		for (String ligne : listeDeLignes) {
			System.out.print(ligne);
			if (ligne.equals("[presets]-------------------------------------------------------")){
				////System.out.println("   --> cible");
				 try {
				     fichierRec.write("[presets]-------------------------------------------------------\n" + nouveau + "\n");
				 } catch(IOException ie) {
				     ie.printStackTrace();
				 }
			}
			else {
				////System.out.println("   --> passe");
				try {
				     fichierRec.write(ligne + "\n");
				 } catch(IOException ie) {
				     ie.printStackTrace();
				 }
			}

		}
		fichierRec.flush();
		fichierRec.close();
		Config.peuplerListe();
		afficherComboBox();
	}
	
	public static void afficherComboBox(){
		Ihm.getWindow().getModel2().removeAllElements();
		for (Preset p : presets){
			Ihm.getWindow().getModel2().addElement(p.toString());
		}
	}
	

}

package jinter;

import java.awt.EventQueue;

import java.io.IOException;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Ihm {
	
	static Jinterface window = new Jinterface();;

	static boolean rotation;
	static ArrayList<Preset> presets;
	static String chemin;
	static String chemin_adb;
	static String chemin_ffmpeg;

	public static void main(String[] args) throws IOException {
		
		ParserConfig.parsage();window = new Jinterface();
		rotation = ParserConfig.isRotation();
		presets = ParserConfig.getPresets();
		chemin_adb = ParserConfig.getChemin_adb();
		chemin = ParserConfig.getChemin();
		chemin_ffmpeg = ParserConfig.getChemin_ffmpeg();
		
		//System.out.println("1" + chemin_adb);

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ihm ihm = new Ihm();
					window.frame.setVisible(true);	
				} catch (Exception e) {
					e.printStackTrace();
				}
				peupler();
			}
		});	
		
	}

	static void peupler (){
		String champs = (String)window.comboBox.getSelectedItem();
		window.textField.setText(champs.split("x")[0]);
		window.textField_1.setText(champs.split("x")[1].split("@")[0]);
		window.textField_2.setText(champs.split("x")[1].split("@")[1]);
		window.textField_5.setText("001");
	}
	
	static String getNom(){
		return window.textField_3.getText().replaceAll("\\s","-") + "_" + window.textField_4.getText().replaceAll("\\s","-") + "_" + 
			   window.textField_5.getText() + "_" + (String)window.comboBox.getSelectedItem() + ".mp4";
	}
	
	static String getChemin(){
	    return chemin;
	}
	static void setChemin(String s){
		chemin = s;
	}

	static String getCheminAdb(){
	    return chemin_adb;
	}
	static void setCheminAdb(String s){
		chemin_adb = s;
	}

	static String getCheminFfmpeg(){
	    return chemin_ffmpeg;
	}
	static void setCheminFfmpeg(String s){
		chemin_ffmpeg = s;
	}
	
	static void addList_1(String enregistrement){
		window.model.addElement(enregistrement);
	}

	static void setLabel(String s){
		window.lblNewLabel.setText(s);
	}
	
	static void setLabel_8(String couleur){
		window.lblNewLabel_8.setIcon(new ImageIcon(Jinterface.class.getResource("/jinter/" + couleur + ".png")));
	}

	public static Jinterface getWindow() {
		return window;
	}

	public static void setWindow(Jinterface window) {
		Ihm.window = window;
	}

	public static boolean isRotation() {
		return rotation;
	}

	public static void setRotation(boolean rotation) {
		Ihm.rotation = rotation;
	}

	public static ArrayList<Preset> getPresets() {
		return presets;
	}

	public static void setPresets(ArrayList<Preset> presets) {
		Ihm.presets = presets;
	}

	public static String getChemin_adb() {
		return chemin_adb;
	}

	public static void setChemin_adb(String chemin_adb) {
		Ihm.chemin_adb = chemin_adb;
	}

	public static String getChemin_ffmpeg() {
		return chemin_ffmpeg;
	}

	public static void setChemin_ffmpeg(String chemin_ffmpeg) {
		Ihm.chemin_ffmpeg = chemin_ffmpeg;
	}
}
//
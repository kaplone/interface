package jinter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.swing.SwingWorker;

public class Ffmpeg extends SwingWorker {
	
	Process p = null;
	Runtime runtime = Runtime.getRuntime();
	String[] commande_ffmpeg;

	public Ffmpeg(String[] commande_ffmpeg) {
		this.commande_ffmpeg = commande_ffmpeg;
	}

	@Override
	protected Object doInBackground() throws Exception {
		try {
			p = runtime.exec(commande_ffmpeg);
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		try {
			p.waitFor();
		} catch (InterruptedException e2) {
			e2.printStackTrace();
		}
		
		ArrayList<String> sortie = new ArrayList<String>();
		
		BufferedReader reader = 
		         new BufferedReader(new InputStreamReader(p.getInputStream()));
		 
		String line = "";			
		try {
			while ((line = reader.readLine())!= null) {
			sortie.add(line);
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		for (String s : sortie){
			if (s.charAt(4)=='S'){
				System.out.println(s);
			}
		}

		return null;
	}

}

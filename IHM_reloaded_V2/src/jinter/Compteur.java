package jinter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingWorker;
import javax.swing.Timer;

public class Compteur extends SwingWorker {
	
	//ti;
	static Timer  ti = new javax.swing.Timer(1000, new ActionListener(){
		int x = 0;

		@Override
		public void actionPerformed(ActionEvent e){

			Ihm.setLabel(String.format("Enregistrement en cours %03d secondes", x++));
		}
	});

	@Override
	protected Object doInBackground() throws Exception {
		System.out.println("in");
		
		return null;
	}

	public static Timer getTi() {
		return ti;
	}

	public void setTi(Timer ti) {
		this.ti = ti;
	}

}

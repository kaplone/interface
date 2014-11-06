package jinter;



import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class FilechooserCheminLocal extends JFrame {

	private JPanel contentPane;
	
	private JFileChooser choix;
	
	private String cheminChoisi;

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public FilechooserCheminLocal() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		choix = (new JFileChooser());
		choix.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		int retour=choix.showOpenDialog(getParent());
		if(retour==JFileChooser.APPROVE_OPTION){
		   // chemin absolu du fichier choisi
			cheminChoisi = choix.getSelectedFile().getAbsolutePath();
			Config.getTextField_3().setText(cheminChoisi);
			Ihm.setChemin(cheminChoisi);
			ParserConfig.modifierCheminLocal(cheminChoisi);
		}
		choix.setBounds(12, 12, 413, 233);
		contentPane.add(choix);
	}

}

package jinter;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;


public class Config extends JFrame {

	private JPanel contentPane;
	private static JList list;
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_3;
	private static JTextField textField_4;
	private static JTextField textField_5;
	private static DefaultListModel<Preset> model;

	/**
	 * Create the frame.
	 */
	public Config() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 626, 378);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		model = new DefaultListModel<Preset>();
		list = new JList<Preset>(model);
		list.setBounds(12, 12, 221, 119);
		contentPane.add(list);
		
		peuplerListe();
		
		textField = new JTextField();
		textField.setBounds(247, 31, 76, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(333, 31, 76, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(421, 31, 36, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("largeur");
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel.setBounds(251, 12, 70, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("hauteur");
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(339, 12, 70, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("débit");
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(421, 12, 70, 15);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Ajouter");
		btnNewButton.addActionListener(new EcouteurBoutonAjouter());
		btnNewButton.setBounds(471, 28, 117, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Supprimer la sélection");
		btnNewButton_1.addActionListener(new EcouteurBoutonSupprimer());
		btnNewButton_1.setBounds(244, 101, 221, 25);
		contentPane.add(btnNewButton_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(12, 155, 361, 19);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		textField_3.setText(ParserConfig.getChemin());
		
		JButton btnNewButton_2 = new JButton("Dossier local");
		btnNewButton_2.addActionListener(new EcouteurBoutonLocalFolder());
		btnNewButton_2.setBounds(399, 152, 199, 25);
		contentPane.add(btnNewButton_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(12, 198, 361, 19);
		contentPane.add(textField_4);
		textField_4.setText(ParserConfig.getChemin_ffmpeg());
		
		JButton btnCheminFfmpeg = new JButton("Chemin FFMPEG");
		btnCheminFfmpeg.addActionListener(new EcouteurBoutonFfmpeg());
		btnCheminFfmpeg.setBounds(399, 195, 199, 25);
		contentPane.add(btnCheminFfmpeg);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(12, 240, 361, 19);
		contentPane.add(textField_5);
		textField_5.setText(ParserConfig.getChemin_adb());
		
		JButton btnCheminAdb = new JButton("Chemin adb");
		btnCheminAdb.addActionListener(new EcouteurBoutonAdb());
		btnCheminAdb.setBounds(399, 237, 199, 25);
		contentPane.add(btnCheminAdb);
		
		JButton btnNewButton_3 = new JButton("Fermer");
		btnNewButton_3.addActionListener(new EcouteurBoutonFermer());
		btnNewButton_3.setBounds(165, 299, 117, 25);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Par défaut");
		btnNewButton_4.addActionListener(new EcouteurParDefaut());
		btnNewButton_4.setBounds(244, 62, 117, 29);
		contentPane.add(btnNewButton_4);
	}

	static void peuplerListe() {
		model.removeAllElements();
		for (Preset p : ParserConfig.presets){			
			model.addElement(p);
		}
		
	}

	public static JList getList() {
		return list;
	}

	public void setList(JList list) {
		this.list = list;
	}

	public static JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public static JTextField getTextField_1() {
		return textField_1;
	}

	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}

	public static JTextField getTextField_2() {
		return textField_2;
	}

	public void setTextField_2(JTextField textField_2) {
		this.textField_2 = textField_2;
	}

	public static JTextField getTextField_3() {
		return textField_3;
	}

	public void setTextField_3(JTextField textField_3) {
		this.textField_3 = textField_3;
	}

	public static JTextField getTextField_4() {
		return textField_4;
	}

	public void setTextField_4(JTextField textField_4) {
		this.textField_4 = textField_4;
	}

	public static JTextField getTextField_5() {
		return textField_5;
	}

	public void setTextField_5(JTextField textField_5) {
		this.textField_5 = textField_5;
	}

	public static DefaultListModel<Preset> getModel() {
		return model;
	}

	public static void setModel(DefaultListModel<Preset> model) {
		Config.model = model;
	}
}

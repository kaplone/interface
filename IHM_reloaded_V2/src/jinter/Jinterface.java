package jinter;

import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.Rectangle;

import javax.swing.SwingConstants;

import java.awt.Component;

import javax.swing.JCheckBox;



public class Jinterface {

	JFrame frame;
	JTextField textField;
    JTextField textField_1;
	JTextField textField_2;
	JTextField textField_3;
	JTextField textField_4;
	JTextField textField_5;
	JPanel panel;
	static JComboBox<String> comboBox;
	JButton btnRecstopespace;
	
	JLabel lblNewLabel;
	JList<String> list_1 ;
	
	JLabel lblNewLabel_8;
	
	DefaultListModel<String> model;
	DefaultComboBoxModel<String> model2;
	
	JButton btnNewButton;
	
	

	/**
	 * Create the application.
	 */
	public Jinterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		this.frame = new JFrame();
		this.frame.setBounds(100, 100, 1000, 349);
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.getContentPane().setLayout(null);
		
		this.panel = new JPanel();
		this.panel.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), "PRESETS", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panel.setBounds(12, 12, 456, 54);
		this.frame.getContentPane().add(this.panel);
		this.panel.setLayout(null);
		
		model2 = new DefaultComboBoxModel<String>();
		comboBox = new JComboBox<String>(model2);
		comboBox.addActionListener(new EcouteurCombo());
		comboBox.setBounds(10, 20, 432, 24);
		this.panel.add(comboBox);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), "DETAILS", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(12, 78, 457, 116);
		this.frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		this.textField = new JTextField();
		this.textField.setBounds(12, 43, 114, 19);
		panel_4.add(this.textField);
		this.textField.setColumns(10);
		
		JLabel lblX = new JLabel("x");
		lblX.setBounds(136, 45, 70, 15);
		panel_4.add(lblX);
		
		this.textField_1 = new JTextField();
		this.textField_1.setBounds(157, 43, 114, 19);
		panel_4.add(this.textField_1);
		this.textField_1.setColumns(10);
		
		JLabel lblTaille = new JLabel("Taille");
		lblTaille.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblTaille.setBounds(12, 27, 70, 15);
		panel_4.add(lblTaille);
		
		this.textField_2 = new JTextField();
		this.textField_2.setBounds(12, 85, 114, 19);
		panel_4.add(this.textField_2);
		this.textField_2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Débit");
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(12, 70, 70, 15);
		panel_4.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Mb/s");
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(136, 87, 70, 15);
		panel_4.add(lblNewLabel_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Rotation");
		chckbxNewCheckBox.setFont(new Font("Dialog", Font.PLAIN, 12));
		chckbxNewCheckBox.setBounds(290, 83, 128, 23);
		panel_4.add(chckbxNewCheckBox);
		
		ButtonGroup groupeBtn = new ButtonGroup();
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), "ENREGISTREMENT", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setBounds(10, 209, 457, 73);
		this.frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		this.textField_3 = new JTextField();
		this.textField_3.setBounds(12, 42, 114, 19);
		panel_5.add(this.textField_3);
		this.textField_3.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Projet");
		lblNewLabel_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(12, 26, 70, 15);
		panel_5.add(lblNewLabel_3);
		
		JLabel label = new JLabel("_");
		label.setBounds(132, 44, 70, 15);
		panel_5.add(label);
		
		this.textField_4 = new JTextField();
		this.textField_4.setBounds(145, 42, 114, 19);
		panel_5.add(this.textField_4);
		this.textField_4.setColumns(10);
		//textField_4.addKeyListener(new EcouteurTextField());
		
		JLabel lblNewLabel_4 = new JLabel("Plan");
		lblNewLabel_4.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(145, 26, 70, 15);
		panel_5.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("_");
		lblNewLabel_5.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(267, 44, 70, 15);
		panel_5.add(lblNewLabel_5);
		
		this.textField_5 = new JTextField();
		this.textField_5.setBounds(280, 42, 114, 19);
		panel_5.add(this.textField_5);
		this.textField_5.setColumns(10);
		//this.textField_5.addKeyListener(new EcouteurTextField());
		
		JLabel lblNewLabel_6 = new JLabel("Incrément");
		lblNewLabel_6.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(280, 26, 87, 15);
		panel_5.add(lblNewLabel_6);
		
		btnRecstopespace = new JButton("REC/STOP (espace)");
		btnRecstopespace.setMnemonic(KeyEvent.VK_SPACE);
		btnRecstopespace.setBounds(12, 286, 194, 25);
		this.frame.getContentPane().add(btnRecstopespace);
		btnRecstopespace.addActionListener(new EcouteurBouton());
		
		lblNewLabel = new JLabel("Stand by");
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel.setBounds(224, 291, 291, 20);
		this.frame.getContentPane().add(lblNewLabel);
		

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), "TRACE", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(479, 12, 533, 270);
		this.frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		model = new DefaultListModel<String>();
		list_1 = new JList<String>(model);
		list_1.setBounds(12, 32, 267, 165);
		panel_1.add(list_1);
		
		JLabel lblNewLabel_7 = new JLabel("Rapport");
		lblNewLabel_7.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_7.setBounds(12, 189, 498, 98);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel_9.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setForeground(new Color(51, 51, 51));
		lblNewLabel_9.setBounds(new Rectangle(0, 0, 50, 34));
		lblNewLabel_9.setBackground(Color.DARK_GRAY);
		lblNewLabel_9.setIcon(new ImageIcon(Jinterface.class.getResource("/jinter/rect2985_144.png")));
		lblNewLabel_9.setBounds(325, 32, 164, 165);
		panel_1.add(lblNewLabel_9);
		
		lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(Jinterface.class.getResource("/jinter/vert.png")));
		lblNewLabel_8.setBounds(527, 286, 70, 32);
		frame.getContentPane().add(lblNewLabel_8);
		
		btnNewButton = new JButton("Configuration");
		btnNewButton.addActionListener(new EcouteurBoutonConfig());
		btnNewButton.setBounds(829, 286, 157, 25);
		frame.getContentPane().add(btnNewButton);
		
	    }

	public JTextField getTextField() {
		return this.textField;
	}
	
	public String getTextFieldTexte() {
		return this.textField.getText();
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JTextField getTextField_1() {
		return this.textField_1;
	}
	
	public String getTextField_1Texte() {
		return this.textField_1.getText();
	}

	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}

	public JTextField getTextField_2() {
		return this.textField_2;
	}

	public String getTextField_2Texte() {
		return this.textField_2.getText();
	}

	public void setTextField_2(JTextField textField_2) {
		this.textField_2 = textField_2;
	}

	public JTextField getTextField_3() {
		return this.textField_3;
	}

	public String getTextField_3Texte() {
		return this.textField_3.getText();
	}

	public void setTextField_3(JTextField textField_3) {
		this.textField_3 = textField_3;
	}

	public JTextField getTextField_4() {
		return this.textField_4;
	}
	
	public String getTextField_4Texte() {
		return getTextField_4().getText();
	}

	public void setTextField_4(JTextField textField_4) {
		this.textField_4 = textField_4;
	}

	public JTextField getTextField_5() {
		return this.textField_5;
	}
	
	public String getTextField_5Texte() {
		return this.textField_5.getText();
	}

	public void setTextField_5(JTextField textField_5) {
		this.textField_5 = textField_5;
	}

	public JComboBox<String> getComboBox() {
		return comboBox;
	}

	public void setComboBox(JComboBox<String> comboBox) {
		this.comboBox = comboBox;
	}

	public JList<String> getList_1() {
		return list_1;
	}

	public void setList_1(JList<String> list_1) {
		this.list_1 = list_1;
	}

	public DefaultListModel<String> getModel() {
		return model;
	}

	public void setModel(DefaultListModel<String> model) {
		this.model = model;
	}

	public DefaultComboBoxModel<String> getModel2() {
		return this.model2;
	}

	public void setModel2(DefaultComboBoxModel<String> model2) {
		this.model2 = model2;
	}	
}
//
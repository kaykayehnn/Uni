package uni.fmi.bachelors;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainForm extends JFrame {

	private JPanel contentPane;
	private JTextField chicken1Name;
	private JTextField chicken1Dmg;
	private JTextField chicken1Life;
	private JTextField chicken1Mana;
	private JTextField chicken1MDmg;
	private JTextField chicken1Chance;
	private JTextField chicken1Armour;
	private JTextField chicken1As;
	private JTextField chicken2Name;
	private JTextField chicken2Dmg;
	private JTextField chicken2Life;
	private JTextField chicken2Mana;
	private JTextField chicken2MDmg;
	private JTextField chicken2Chance;
	private JTextField chicken2Armour;
	private JTextField chicken2As;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainForm frame = new MainForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 502, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 193, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u041A\u043E\u043A\u043E\u0448\u043A\u0430 1");
		lblNewLabel.setBounds(47, 5, 72, 14);
		panel.add(lblNewLabel);
		
		chicken1Name = new JTextField();
		chicken1Name.setBounds(71, 47, 86, 20);
		panel.add(chicken1Name);
		chicken1Name.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u0418\u043C\u0435");
		lblNewLabel_1.setBounds(10, 50, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Dmg");
		lblNewLabel_1_1.setBounds(10, 73, 46, 14);
		panel.add(lblNewLabel_1_1);
		
		chicken1Dmg = new JTextField();
		chicken1Dmg.setBounds(71, 70, 86, 20);
		panel.add(chicken1Dmg);
		chicken1Dmg.setColumns(10);
		
		JLabel lblNewLabel_1_2 = new JLabel("Life");
		lblNewLabel_1_2.setBounds(10, 101, 46, 14);
		panel.add(lblNewLabel_1_2);
		
		chicken1Life = new JTextField();
		chicken1Life.setBounds(71, 98, 86, 20);
		panel.add(chicken1Life);
		chicken1Life.setColumns(10);
		
		JLabel lblNewLabel_1_3 = new JLabel("Mana");
		lblNewLabel_1_3.setBounds(10, 129, 46, 14);
		panel.add(lblNewLabel_1_3);
		
		chicken1Mana = new JTextField();
		chicken1Mana.setBounds(71, 126, 86, 20);
		panel.add(chicken1Mana);
		chicken1Mana.setColumns(10);
		
		JLabel lblNewLabel_1_4 = new JLabel("Magic Dmg");
		lblNewLabel_1_4.setBounds(10, 157, 62, 14);
		panel.add(lblNewLabel_1_4);
		
		chicken1MDmg = new JTextField();
		chicken1MDmg.setBounds(71, 154, 86, 20);
		panel.add(chicken1MDmg);
		chicken1MDmg.setColumns(10);
		
		JLabel lblNewLabel_1_5 = new JLabel("Chance");
		lblNewLabel_1_5.setBounds(10, 185, 46, 14);
		panel.add(lblNewLabel_1_5);
		
		chicken1Chance = new JTextField();
		chicken1Chance.setBounds(71, 182, 86, 20);
		panel.add(chicken1Chance);
		chicken1Chance.setColumns(10);
		
		JLabel lblNewLabel_1_6 = new JLabel("Armour");
		lblNewLabel_1_6.setBounds(10, 213, 46, 14);
		panel.add(lblNewLabel_1_6);
		
		chicken1Armour = new JTextField();
		chicken1Armour.setBounds(71, 210, 86, 20);
		panel.add(chicken1Armour);
		chicken1Armour.setColumns(10);
		
		JLabel lblNewLabel_1_7 = new JLabel("As");
		lblNewLabel_1_7.setBounds(10, 241, 46, 14);
		panel.add(lblNewLabel_1_7);
		
		chicken1As = new JTextField();
		chicken1As.setBounds(71, 238, 86, 20);
		panel.add(chicken1As);
		chicken1As.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(293, 0, 193, 261);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u041A\u043E\u043A\u043E\u0448\u043A\u0430 2");
		lblNewLabel_2.setBounds(71, 11, 58, 14);
		panel_1.add(lblNewLabel_2);
		
		chicken2Name = new JTextField();
		chicken2Name.setColumns(10);
		chicken2Name.setBounds(71, 47, 86, 20);
		panel_1.add(chicken2Name);
		
		JLabel lblNewLabel_1_8 = new JLabel("\u0418\u043C\u0435");
		lblNewLabel_1_8.setBounds(10, 50, 46, 14);
		panel_1.add(lblNewLabel_1_8);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Dmg");
		lblNewLabel_1_1_1.setBounds(10, 73, 46, 14);
		panel_1.add(lblNewLabel_1_1_1);
		
		chicken2Dmg = new JTextField();
		chicken2Dmg.setColumns(10);
		chicken2Dmg.setBounds(71, 70, 86, 20);
		panel_1.add(chicken2Dmg);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Life");
		lblNewLabel_1_2_1.setBounds(10, 101, 46, 14);
		panel_1.add(lblNewLabel_1_2_1);
		
		chicken2Life = new JTextField();
		chicken2Life.setColumns(10);
		chicken2Life.setBounds(71, 98, 86, 20);
		panel_1.add(chicken2Life);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Mana");
		lblNewLabel_1_3_1.setBounds(10, 129, 46, 14);
		panel_1.add(lblNewLabel_1_3_1);
		
		chicken2Mana = new JTextField();
		chicken2Mana.setColumns(10);
		chicken2Mana.setBounds(71, 126, 86, 20);
		panel_1.add(chicken2Mana);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Magic Dmg");
		lblNewLabel_1_4_1.setBounds(10, 157, 63, 14);
		panel_1.add(lblNewLabel_1_4_1);
		
		chicken2MDmg = new JTextField();
		chicken2MDmg.setColumns(10);
		chicken2MDmg.setBounds(71, 154, 86, 20);
		panel_1.add(chicken2MDmg);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("Chance");
		lblNewLabel_1_5_1.setBounds(10, 185, 46, 14);
		panel_1.add(lblNewLabel_1_5_1);
		
		chicken2Chance = new JTextField();
		chicken2Chance.setColumns(10);
		chicken2Chance.setBounds(71, 182, 86, 20);
		panel_1.add(chicken2Chance);
		
		JLabel lblNewLabel_1_6_1 = new JLabel("Armour");
		lblNewLabel_1_6_1.setBounds(10, 213, 46, 14);
		panel_1.add(lblNewLabel_1_6_1);
		
		chicken2Armour = new JTextField();
		chicken2Armour.setColumns(10);
		chicken2Armour.setBounds(71, 210, 86, 20);
		panel_1.add(chicken2Armour);
		
		JLabel lblNewLabel_1_7_1 = new JLabel("As");
		lblNewLabel_1_7_1.setBounds(10, 241, 46, 14);
		panel_1.add(lblNewLabel_1_7_1);
		
		chicken2As = new JTextField();
		chicken2As.setColumns(10);
		chicken2As.setBounds(71, 238, 86, 20);
		panel_1.add(chicken2As);
		
		JButton fightButton = new JButton("Fight");
		fightButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Chicken c1 = new Chicken();
				
				c1.name = chicken1Name.getText();
				c1.dmg = Integer.parseInt(chicken1Dmg.getText());
				c1.armour = Integer.parseInt(chicken1Armour.getText());
				c1.life = Integer.parseInt(chicken1Life.getText());
				c1.mana = Integer.parseInt(chicken1Mana.getText());
				c1.magicDmg = Integer.parseInt(chicken1MDmg.getText());
				c1.magicChanche = Integer.parseInt(chicken1Chance.getText());
				c1.as = Double.parseDouble(chicken1As.getText());
			
				
				Chicken c2 = new Chicken();
				
				c2.name = chicken2Name.getText();
				c2.dmg = Integer.parseInt(chicken2Dmg.getText());
				c2.armour = Integer.parseInt(chicken2Armour.getText());
				c2.life = Integer.parseInt(chicken2Life.getText());
				c2.mana = Integer.parseInt(chicken2Mana.getText());
				c2.magicDmg = Integer.parseInt(chicken2MDmg.getText());
				c2.magicChanche = Integer.parseInt(chicken2Chance.getText());
				c2.as = Double.parseDouble(chicken2As.getText());
			
				c1.target = c2;
				c2.target = c1;
				
				c1.start();
				c2.start();
			
			}
		});
		fightButton.setBounds(194, 107, 100, 43);
		contentPane.add(fightButton);
	}
}

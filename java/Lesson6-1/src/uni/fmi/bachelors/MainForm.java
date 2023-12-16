package uni.fmi.bachelors;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainForm extends JFrame {

	private JPanel contentPane;
	private JTextField lizzard1Name;
	private JTextField lizzard1HP;
	private JTextField lizzard1AS;
	private JTextField lizzard1BC;
	private JTextField lizzard1RHP;
	private JTextField lizzard1RR;
	private JTextField lizzard1IC;
	private JTextField lizzard2Name;
	private JTextField lizzard2HP;
	private JTextField lizzard2AS;
	private JTextField lizzard2BC;
	private JTextField lizzard2RHP;
	private JTextField lizzard2RR;
	private JTextField lizzard2IC;

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
		setBounds(100, 100, 555, 285);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 246, 246);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u0413\u0443\u0449\u0435\u0440 1");
		lblNewLabel.setBounds(86, 11, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u0418\u043C\u0435");
		lblNewLabel_1.setBounds(10, 46, 46, 14);
		panel.add(lblNewLabel_1);
		
		lizzard1Name = new JTextField();
		lizzard1Name.setBounds(96, 43, 140, 20);
		panel.add(lizzard1Name);
		lizzard1Name.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Hp");
		lblNewLabel_1_1.setBounds(10, 74, 46, 14);
		panel.add(lblNewLabel_1_1);
		
		lizzard1HP = new JTextField();
		lizzard1HP.setColumns(10);
		lizzard1HP.setBounds(96, 71, 140, 20);
		panel.add(lizzard1HP);
		
		JLabel lblNewLabel_1_2 = new JLabel("AS");
		lblNewLabel_1_2.setBounds(10, 102, 46, 14);
		panel.add(lblNewLabel_1_2);
		
		lizzard1AS = new JTextField();
		lizzard1AS.setColumns(10);
		lizzard1AS.setBounds(96, 99, 140, 20);
		panel.add(lizzard1AS);
		
		JLabel lblNewLabel_1_3 = new JLabel("Block Chance");
		lblNewLabel_1_3.setBounds(10, 133, 76, 14);
		panel.add(lblNewLabel_1_3);
		
		lizzard1BC = new JTextField();
		lizzard1BC.setColumns(10);
		lizzard1BC.setBounds(96, 130, 140, 20);
		panel.add(lizzard1BC);
		
		JLabel lblNewLabel_1_4 = new JLabel("Regen HP");
		lblNewLabel_1_4.setBounds(10, 161, 76, 14);
		panel.add(lblNewLabel_1_4);
		
		lizzard1RHP = new JTextField();
		lizzard1RHP.setColumns(10);
		lizzard1RHP.setBounds(96, 158, 140, 20);
		panel.add(lizzard1RHP);
		
		JLabel lblNewLabel_1_5 = new JLabel("Regent rounds");
		lblNewLabel_1_5.setBounds(10, 189, 76, 14);
		panel.add(lblNewLabel_1_5);
		
		lizzard1RR = new JTextField();
		lizzard1RR.setColumns(10);
		lizzard1RR.setBounds(96, 186, 140, 20);
		panel.add(lizzard1RR);
		
		JLabel lblNewLabel_1_6 = new JLabel("Inv. Chance");
		lblNewLabel_1_6.setBounds(10, 217, 76, 14);
		panel.add(lblNewLabel_1_6);
		
		lizzard1IC = new JTextField();
		lizzard1IC.setColumns(10);
		lizzard1IC.setBounds(96, 214, 140, 20);
		panel.add(lizzard1IC);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(293, 0, 246, 246);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u0413\u0443\u0449\u0435\u0440 2");
		lblNewLabel_2.setBounds(86, 11, 46, 14);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_7 = new JLabel("\u0418\u043C\u0435");
		lblNewLabel_1_7.setBounds(10, 46, 46, 14);
		panel_1.add(lblNewLabel_1_7);
		
		lizzard2Name = new JTextField();
		lizzard2Name.setColumns(10);
		lizzard2Name.setBounds(96, 43, 140, 20);
		panel_1.add(lizzard2Name);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Hp");
		lblNewLabel_1_1_1.setBounds(10, 74, 46, 14);
		panel_1.add(lblNewLabel_1_1_1);
		
		lizzard2HP = new JTextField();
		lizzard2HP.setColumns(10);
		lizzard2HP.setBounds(96, 71, 140, 20);
		panel_1.add(lizzard2HP);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("AS");
		lblNewLabel_1_2_1.setBounds(10, 102, 46, 14);
		panel_1.add(lblNewLabel_1_2_1);
		
		lizzard2AS = new JTextField();
		lizzard2AS.setColumns(10);
		lizzard2AS.setBounds(96, 99, 140, 20);
		panel_1.add(lizzard2AS);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Block Chance");
		lblNewLabel_1_3_1.setBounds(10, 133, 76, 14);
		panel_1.add(lblNewLabel_1_3_1);
		
		lizzard2BC = new JTextField();
		lizzard2BC.setColumns(10);
		lizzard2BC.setBounds(96, 130, 140, 20);
		panel_1.add(lizzard2BC);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Regen HP");
		lblNewLabel_1_4_1.setBounds(10, 161, 76, 14);
		panel_1.add(lblNewLabel_1_4_1);
		
		lizzard2RHP = new JTextField();
		lizzard2RHP.setColumns(10);
		lizzard2RHP.setBounds(96, 158, 140, 20);
		panel_1.add(lizzard2RHP);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("Regent rounds");
		lblNewLabel_1_5_1.setBounds(10, 189, 76, 14);
		panel_1.add(lblNewLabel_1_5_1);
		
		lizzard2RR = new JTextField();
		lizzard2RR.setColumns(10);
		lizzard2RR.setBounds(96, 186, 140, 20);
		panel_1.add(lizzard2RR);
		
		JLabel lblNewLabel_1_6_1 = new JLabel("Inv. Chance");
		lblNewLabel_1_6_1.setBounds(10, 217, 76, 14);
		panel_1.add(lblNewLabel_1_6_1);
		
		lizzard2IC = new JTextField();
		lizzard2IC.setColumns(10);
		lizzard2IC.setBounds(96, 214, 140, 20);
		panel_1.add(lizzard2IC);
		
		JButton btnNewButton = new JButton("¡\nŒ\n…");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				Lizzard l1 = new Lizzard();
				
				l1.name = lizzard1Name.getText();
				l1.as = Double.parseDouble(lizzard1AS.getText());
				l1.hp = Integer.parseInt(lizzard1HP.getText());
				l1.invisibleChance = Integer.parseInt(lizzard1IC.getText());
				l1.regenAmount = Integer.parseInt(lizzard1RHP.getText());
				l1.regenRoundsNeeded = Integer.parseInt(lizzard1RR.getText());
				l1.tailBlockChance = Integer.parseInt(lizzard1BC.getText());
			
				Lizzard l2 = new Lizzard();
				
				l2.name = lizzard2Name.getText();
				l2.as = Double.parseDouble(lizzard2AS.getText());
				l2.hp = Integer.parseInt(lizzard2HP.getText());
				l2.invisibleChance = Integer.parseInt(lizzard2IC.getText());
				l2.regenAmount = Integer.parseInt(lizzard2RHP.getText());
				l2.regenRoundsNeeded = Integer.parseInt(lizzard2RR.getText());
				l2.tailBlockChance = Integer.parseInt(lizzard2BC.getText());
			
				l1.target = l2;
				l2.target = l1;
				
				l1.start();
				l2.start();
			}
		});
		btnNewButton.setHorizontalAlignment(SwingConstants.TRAILING);
		btnNewButton.setBounds(245, 24, 48, 180);
		contentPane.add(btnNewButton);
	}
}

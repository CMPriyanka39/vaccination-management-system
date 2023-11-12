package EclipseGui;

import java.awt.BorderLayout;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import LoginForm;
import RegisterationForm;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextPane;
import javax.swing.UIManager;

public class HomePage extends JFrame {
	private Image img=new ImageIcon(HomePage.class.getResource("/WHO11.jpg")).getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
	private Image img1=new ImageIcon(HomePage.class.getResource("/home2.jpeg")).getImage().getScaledInstance(780,500,Image.SCALE_SMOOTH);
	private Image img2=new ImageIcon(HomePage.class.getResource("/home1.jpg")).getImage().getScaledInstance(70,50,Image.SCALE_SMOOTH);


	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 773, 518);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(new Color(240, 248, 255));
		panel.setBounds(75, 134, 258, 221);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_1_1 = new JButton("Precautions");
		btnNewButton_1_1.setBounds(58, 123, 138, 37);
		panel.add(btnNewButton_1_1);
		btnNewButton_1_1.setBackground(new Color(0, 0, 139));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Precautions p=new Precautions();
				p.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1_1.setBorderPainted(false);
		
		JButton btnNewButton_1 = new JButton("Sign In");
		btnNewButton_1.setBounds(65, 75, 115, 37);
		panel.add(btnNewButton_1);
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				RegisterationForm rg=new RegisterationForm();
				rg.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setBackground(new Color(0, 0, 139));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(65, 27, 115, 37);
		panel.add(btnNewButton);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(0, 0, 139));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginForm lg=new LoginForm();
				lg.setVisible(true);
				setVisible(false);
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("----------------------------------------------------------------------------------------");
		lblNewLabel_1.setBounds(75, 51, 369, 14);
		lblNewLabel_1.setForeground(new Color(0, 0, 139));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Welcome to Covid-19 Vaccination Drive ");
		lblNewLabel.setBounds(56, 11, 434, 29);
		lblNewLabel.setForeground(new Color(0, 0, 139));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBackground(new Color(0, 0, 139));
		contentPane.add(lblNewLabel);
		
		JLabel backgrd = new JLabel("");
		backgrd.setBounds(0, 0, 762, 485);
		backgrd.setBackground(new Color(135, 206, 235));
		backgrd.setIcon(new ImageIcon(img1));
		
		contentPane.add(backgrd);
	}
}

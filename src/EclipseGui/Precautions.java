package EclipseGui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Precautions extends JFrame {

	private Image img=new ImageIcon(HomePage.class.getResource("/steps1.jpg")).getImage().getScaledInstance(70,70,Image.SCALE_SMOOTH);
	private Image img1=new ImageIcon(HomePage.class.getResource("/steps2.jpg")).getImage().getScaledInstance(70,70,Image.SCALE_SMOOTH);
	private Image img2=new ImageIcon(HomePage.class.getResource("/steps3.jpg")).getImage().getScaledInstance(70,70,Image.SCALE_SMOOTH);
	private Image img3=new ImageIcon(HomePage.class.getResource("/steps4.jpg")).getImage().getScaledInstance(70,90,Image.SCALE_SMOOTH);
	private Image img4=new ImageIcon(HomePage.class.getResource("/steps5.jpg")).getImage().getScaledInstance(70,90,Image.SCALE_SMOOTH);
	private Image img5=new ImageIcon(HomePage.class.getResource("/steps6.jpg")).getImage().getScaledInstance(70,90,Image.SCALE_SMOOTH);
	private Image img6=new ImageIcon(HomePage.class.getResource("/steps7.jpg")).getImage().getScaledInstance(70,90,Image.SCALE_SMOOTH);
	private Image img7=new ImageIcon(HomePage.class.getResource("/steps8.jpg")).getImage().getScaledInstance(70,90,Image.SCALE_SMOOTH);
	private Image img8=new ImageIcon(HomePage.class.getResource("/back1.png")).getImage().getScaledInstance(900,20000,Image.SCALE_SMOOTH);


	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Precautions frame = new Precautions();
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
	public Precautions() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 182, 193));
		contentPane.setForeground(new Color(0, 139, 139));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Precautions Has to be Taken");
		lblNewLabel.setBounds(272, 36, 275, 24);
		contentPane.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(75, 0, 130));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		
		JLabel lblNewLabel_1 = new JLabel("------------------------------------------------------------------------------------------");
		lblNewLabel_1.setBounds(218, 71, 421, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(61, 152, 70, 77);
		lblNewLabel_2.setIcon(new ImageIcon(img));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Stay at HOME");
		lblNewLabel_3.setForeground(Color.PINK);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_3.setBounds(56, 241, 106, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(246, 152, 75, 77);
		lblNewLabel_4.setIcon(new ImageIcon(img1));
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Wash Your Hands Frequently ");
		lblNewLabel_5.setForeground(Color.PINK);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_5.setBounds(204, 241, 186, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("with soap and clean ");
		lblNewLabel_6.setForeground(Color.PINK);
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_6.setBounds(228, 253, 207, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(467, 152, 80, 77);
		lblNewLabel_7.setIcon(new ImageIcon(img2));
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Potable Water");
		lblNewLabel_8.setForeground(Color.PINK);
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_8.setBounds(246, 270, 127, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("In the Absence of a");
		lblNewLabel_9.setForeground(Color.PINK);
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_9.setBounds(445, 241, 122, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("tissue/handkerchif,Cough ");
		lblNewLabel_10.setForeground(Color.PINK);
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_10.setBounds(442, 253, 170, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("or Sneeze into your elbow");
		lblNewLabel_11.setForeground(Color.PINK);
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_11.setBounds(439, 270, 186, 14);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setBounds(669, 163, 100, 56);
		lblNewLabel_12.setIcon(new ImageIcon(img3));
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Avoid touching your Face");
		lblNewLabel_13.setForeground(Color.PINK);
		lblNewLabel_13.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_13.setBounds(641, 241, 170, 14);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setBounds(61, 357, 70, 84);
		lblNewLabel_14.setIcon(new ImageIcon(img4));
		contentPane.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Clean and Disinfect ");
		lblNewLabel_15.setForeground(Color.PINK);
		lblNewLabel_15.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_15.setBounds(32, 452, 130, 14);
		contentPane.add(lblNewLabel_15);
		
		JLabel lblNewLabel_15_1 = new JLabel("Surfaces Regularly");
		lblNewLabel_15_1.setForeground(Color.PINK);
		lblNewLabel_15_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_15_1.setBounds(32, 471, 130, 14);
		contentPane.add(lblNewLabel_15_1);
		
		JLabel lblNewLabel_16 = new JLabel("");
		lblNewLabel_16.setBounds(270, 357, 70, 84);
		lblNewLabel_16.setIcon(new ImageIcon(img5));
		contentPane.add(lblNewLabel_16);
		
		JLabel lblNewLabel_15_2 = new JLabel("Practice Distancing");
		lblNewLabel_15_2.setForeground(Color.PINK);
		lblNewLabel_15_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_15_2.setBounds(244, 452, 130, 14);
		contentPane.add(lblNewLabel_15_2);
		
		JLabel lblNewLabel_17 = new JLabel("");
		lblNewLabel_17.setBounds(477, 351, 70, 84);
		lblNewLabel_17.setIcon(new ImageIcon(img6));
		contentPane.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("Wear a Mask");
		lblNewLabel_18.setForeground(Color.PINK);
		lblNewLabel_18.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_18.setBounds(486, 452, 81, 14);
		contentPane.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("");
		lblNewLabel_19.setBounds(683, 351, 70, 77);
		lblNewLabel_19.setIcon(new ImageIcon(img7));
		contentPane.add(lblNewLabel_19);
		
		JLabel lblNewLabel_18_1 = new JLabel("Eat Healthy");
		lblNewLabel_18_1.setForeground(Color.PINK);
		lblNewLabel_18_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_18_1.setBounds(683, 452, 81, 14);
		contentPane.add(lblNewLabel_18_1);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				HomePage hp=new HomePage();
				hp.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		btnNewButton.setBounds(365, 512, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_20 = new JLabel("");
		lblNewLabel_20.setBounds(0, 114, 834, 447);
		lblNewLabel_20.setIcon(new ImageIcon(img8));
		contentPane.add(lblNewLabel_20);
	}
}

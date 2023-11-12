package EclipseGui;
import java.awt.EventQueue;
import com.ceras.dao.*;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

//import com.ceras.dao.DashBoard;
import com.ceras.dao.DatabaseLogin;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class LoginForm extends JFrame {
	private Image img=new ImageIcon(LoginForm.class.getResource("/HAB.jpg")).getImage().getScaledInstance(900,500,Image.SCALE_SMOOTH);
	private Image img1=new ImageIcon(LoginForm.class.getResource("/pass.jpg")).getImage().getScaledInstance(30,25,Image.SCALE_SMOOTH);
	private Image img2=new ImageIcon(LoginForm.class.getResource("/user.jpg")).getImage().getScaledInstance(30,25,Image.SCALE_SMOOTH);
	private Image img3=new ImageIcon(LoginForm.class.getResource("/login2.jpg")).getImage().getScaledInstance(30,25,Image.SCALE_SMOOTH);

	private JPanel contentPane;
	private JTextField UsernametextField;
	private JTextField PasstextField;
    private JLabel LabelError;
    
    Connection con;
    PreparedStatement pst;
   // Statement st;
    ResultSet rs;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
     public static String uname;
	/**
	 * Create the frame.
	 */
	public LoginForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(175, 238, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);;
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 490, 461);
		panel.setBackground(new Color(25, 25, 112));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_5_1 = new JLabel("______________________________________");
		lblNewLabel_5_1.setBounds(134, 256, 283, 15);
		lblNewLabel_5_1.setForeground(Color.WHITE);
		panel.add(lblNewLabel_5_1);
		
		 LabelError = new JLabel("UserName or Password is Incorrect");
		 LabelError.setBounds(197, 163, 212, 14);
		 panel.add(LabelError);
		 LabelError.setForeground(Color.RED);
		 
		 JLabel lblNewLabel_3 = new JLabel("new user ? Click here to Register");
		 lblNewLabel_3.setBounds(136, 385, 245, 14);
		 panel.add(lblNewLabel_3);
		 lblNewLabel_3.setForeground(Color.WHITE);
		 lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		 
		 JLabel lblNewLabel = new JLabel("Login Page");
		 lblNewLabel.setBounds(188, 83, 155, 28);
		 panel.add(lblNewLabel);
		 lblNewLabel.setForeground(Color.WHITE);
		 lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
		 
		 JLabel lblNewLabel_6 = new JLabel("");
		 lblNewLabel_6.setBounds(371, 238, 38, 28);
		 panel.add(lblNewLabel_6);
		 lblNewLabel_6.setIcon(new ImageIcon(img1));
		 
		 JLabel lblNewLabel_7 = new JLabel("");
		 lblNewLabel_7.setBounds(371, 188, 46, 39);
		 lblNewLabel_7.setIcon(new ImageIcon(img2));
		 panel.add(lblNewLabel_7);
		 
		 JButton btnNewButton_2 = new JButton("Cancel");
		 btnNewButton_2.setBounds(85, 331, 89, 23);
		 panel.add(btnNewButton_2);
		 
		 JButton btnNewButton_1 = new JButton("Reset");
		 btnNewButton_1.setBounds(188, 331, 89, 23);
		 panel.add(btnNewButton_1);
		 
		 JButton btnNewButton = new JButton("Submit");
		 btnNewButton.setBounds(299, 331, 89, 23);
		 panel.add(btnNewButton);
		 
		 PasstextField = new JTextField();
		 PasstextField.setBounds(136, 243, 225, 20);
		 PasstextField.addFocusListener(new FocusAdapter() {
		 	@Override
		 	public void focusGained(FocusEvent e) {
		 		
		 		if(PasstextField.getText().equals("Enter Password"))
				{
		 			PasstextField.setText("");
				}
				else
				{
					PasstextField.selectAll();
				}
				
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(PasstextField.getText().equals(""))
				{
					PasstextField.setText("Enter Password");
				}
			
		 	
		 	}
		 });
		 panel.add(PasstextField);
		 PasstextField.setCaretColor(new Color(255, 255, 255));
		 PasstextField.setDisabledTextColor(new Color(255, 255, 255));
		 PasstextField.setFont(new Font("Microsoft Himalaya", Font.ITALIC, 18));
		 PasstextField.setForeground(new Color(255, 255, 255));
		 PasstextField.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 128)));
		 PasstextField.setBackground(new Color(25, 25, 112));
		 PasstextField.setColumns(10);
		 
		 JLabel lblNewLabel_5 = new JLabel("______________________________________");
		 lblNewLabel_5.setBounds(136, 213, 354, 14);
		 panel.add(lblNewLabel_5);
		 lblNewLabel_5.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)));
		 lblNewLabel_5.setForeground(Color.WHITE);
		 
		 UsernametextField = new JTextField();
		 UsernametextField.setBounds(136, 200, 225, 20);
		 UsernametextField.addFocusListener(new FocusAdapter() {
		 	@Override
		 	public void focusGained(FocusEvent e) {
		 		
		 		if(UsernametextField.getText().equals("Enter UserName"))
				{
		 			UsernametextField.setText("");
				}
				else
				{
					UsernametextField.selectAll();
				}
				
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(UsernametextField.getText().equals(""))
				{
					UsernametextField.setText("Enter UserName");
				}
			
		 	}
		 });
		 panel.add(UsernametextField);
		 UsernametextField.setFont(new Font("Microsoft Himalaya", Font.ITALIC, 18));
		 UsernametextField.setForeground(new Color(255, 255, 255));
		 UsernametextField.setCaretColor(new Color(255, 255, 255));
		 UsernametextField.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 128)));
		 UsernametextField.setBackground(new Color(25, 25, 112));
		 UsernametextField.setColumns(10);
		 
		 JLabel lblNewLabel_8 = new JLabel("");
		 lblNewLabel_8.setBounds(63, 34, 386, 385);
		 lblNewLabel_8.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		 panel.add(lblNewLabel_8);
		 btnNewButton.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		
	 			 uname=UsernametextField.getText();

		 		if(UsernametextField.getText().trim().isEmpty() && PasstextField.getText().trim().isEmpty()) {
		 			LabelError.setVisible(true);
		 		}
		 		else if(UsernametextField.getText().trim().isEmpty()) {
		 			LabelError.setVisible(true);
		 		}else if(PasstextField.getText().trim().isEmpty()) {
		 			LabelError.setVisible(true);
		 		}
		 		else {
		 			String pword=PasstextField.getText();
		 			try {
		 				con=DatabaseLogin.getConnection();
		 				pst=con.prepareStatement("SELECT * FROM `registeration_info` WHERE Email= ? and Password = ? ");
		 				pst.setString(1,uname);
		 				pst.setString(2, pword);
		 				rs=pst.executeQuery();
		 				
		 				if(rs.next()) {
		 					String s1=rs.getString("Email");
		 					String s2=rs.getString("Password");
		 					 if(s1.equals(uname) && s2.equals(pword)) {
		 						// JOptionPane.showMessageDialog(null,"Username password Matched");
		 						  MainDashboard db=new MainDashboard();
							        db.setVisible(true);
							        setVisible(false);

		 					 }
		 				}else {
		 					 JOptionPane.showMessageDialog(null,"Username password Not Matched");
		 				}
		 			}catch(Exception ex) {
		 				System.out.println(" "+ex);
		 			}
		 		}
		 }
		 });
		 btnNewButton_1.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		UsernametextField.setText(null);
	        	LabelError.setVisible(false);
	        	
	        	PasstextField.setText(null);
	        	LabelError.setVisible(false);
	        	

		 	}
		 	
		 });
		 btnNewButton_2.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		HomePage hp=new HomePage();
		 		hp.setVisible(true);
		 		setVisible(false);
		 	}
		 });
		 lblNewLabel_3.addMouseListener(new MouseAdapter() {
		 	@Override
		 	public void mouseClicked(MouseEvent e) {
		 		
		 		RegisterationForm rf=new RegisterationForm();
		 		rf.setVisible(true);
		 		setVisible(false);
		 	}
		 });
		 LabelError.setVisible(false);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(0, 0, 834, 461);
		lblNewLabel_4.setBackground(new Color(25, 25, 112));
		lblNewLabel_4.setIcon(new ImageIcon(img));
		contentPane.add(lblNewLabel_4);
	}
}

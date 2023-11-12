package EclipseGui;

import java.awt.BorderLayout;

import com.ceras.dao.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.Color;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

//import com.ceras.dao.DashBoard;
import com.toedter.calendar.JCalendar;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JScrollPane;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JDateChooser;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JPasswordField;
import javax.swing.border.LineBorder;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.border.EtchedBorder;

public class RegisterationForm<Regex> extends JFrame {
	
	private Image img=new ImageIcon(HomePage.class.getResource("/icon.jpg")).getImage().getScaledInstance(90,90,Image.SCALE_SMOOTH);
	private Image img1=new ImageIcon(HomePage.class.getResource("/vacine1.png")).getImage().getScaledInstance(300,350,Image.SCALE_SMOOTH);
	private Image img2=new ImageIcon(HomePage.class.getResource("/vacc.jpeg")).getImage().getScaledInstance(400,700,Image.SCALE_SMOOTH);
	private Image img3=new ImageIcon(HomePage.class.getResource("/earth.jpg")).getImage().getScaledInstance(400,900,Image.SCALE_SMOOTH);
	private Image img4=new ImageIcon(HomePage.class.getResource("/short.jpg")).getImage().getScaledInstance(40,90,Image.SCALE_SMOOTH);
	private Image img5=new ImageIcon(HomePage.class.getResource("/phone.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image img6=new ImageIcon(HomePage.class.getResource("/email.jpg")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image img7=new ImageIcon(HomePage.class.getResource("/add.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image img8=new ImageIcon(HomePage.class.getResource("/gender.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image img9=new ImageIcon(HomePage.class.getResource("/cal1.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image img10=new ImageIcon(HomePage.class.getResource("/pass1.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image img11=new ImageIcon(HomePage.class.getResource("/cpass.jpg")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image img12=new ImageIcon(HomePage.class.getResource("/last.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image img13=new ImageIcon(HomePage.class.getResource("/first.jpg")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);



	 /**
	 * 
	 */

	  
	
	  


	
 
	public static boolean isValid(String email)
	{
	String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
	Pattern pattern = Pattern.compile(regex);
	if (email == null)
	return false;
	return pattern.matcher(email).matches();
	}
	
	
	private JPanel contentPane;
	private JLabel LastNameLabelError,PhoneNoLabelError,dobLabelError,GenderLabelError,AddressLabelError,PassLabelError,CPassLabelError,FirstNameLabelError,EmailidLabelError;
	private JTextField FnametextField;
	private JTextField LnametextField;
	private JTextField PhoneNotextField;
	private JTextField EmailIdtextField;
	private JTextField CPasstextField;
	private JDateChooser DateOfBirth;
	private JTextField PasstextField;
	//private final ButtonGroup buttonGroup = new ButtonGroup();
	/**
	 * Launch the application.6., 
	 */
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterationForm frame = new RegisterationForm();
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
	public RegisterationForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		setBounds(100, 100, 800, 700);
	  // setLocation(null);

		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 51, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		FnametextField = new JTextField();
		FnametextField.setBounds(550, 122, 169, 23);
		FnametextField.setText("Enter first Name");
		FnametextField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(FnametextField.getText().equals("Enter first Name"))
				{
					FnametextField.setText("");
				}
				else
				{
					FnametextField.selectAll();
				}
				
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(FnametextField.getText().equals(""))
				{
					FnametextField.setText("Enter first Name");
				}
			}
		});
		contentPane.setLayout(null);
		FnametextField.setCaretColor(Color.WHITE);
		FnametextField.setForeground(Color.WHITE);
		FnametextField.setBorder(new LineBorder(new Color(0, 0, 51), 0));
		FnametextField.setBackground(new Color(51, 51, 102));
		contentPane.add(FnametextField);
		FnametextField.setColumns(10);
		
		LnametextField = new JTextField();
		LnametextField.setBounds(550, 167, 169, 21);
		LnametextField.setText("Enter Last Name");
		LnametextField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(LnametextField.getText().equals("Enter Last Name"))
				{
					LnametextField.setText("");
				}
				else
				{
					LnametextField.selectAll();
				}
				
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(LnametextField.getText().equals(""))
				{
					LnametextField.setText("Enter Last Name");
				}
			}
			
		});
		LnametextField.setCaretColor(Color.WHITE);
		LnametextField.setForeground(Color.WHITE);
		LnametextField.setBorder(new LineBorder(new Color(0, 0, 51), 0));
		LnametextField.setBackground(new Color(51, 51, 102));
		contentPane.add(LnametextField);
		LnametextField.setColumns(10);
		
		PhoneNotextField = new JTextField();
		PhoneNotextField.setBounds(550, 216, 169, 23);
		PhoneNotextField.setText("Enter Phone Number");
		PhoneNotextField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				
				if(PhoneNotextField.getText().equals("Enter Phone Number"))
				{
					PhoneNotextField.setText("");
				}
				else
				{
					PhoneNotextField.selectAll();
				}
				
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(PhoneNotextField.getText().equals(""))
				{
					PhoneNotextField.setText("Enter Phone Number");
				}
			
			}
		});
		PhoneNotextField.setCaretColor(Color.WHITE);
		PhoneNotextField.setForeground(Color.WHITE);
		PhoneNotextField.setBorder(new LineBorder(new Color(0, 0, 51), 0));
		PhoneNotextField.setBackground(new Color(51, 51, 102));
		contentPane.add(PhoneNotextField);
		PhoneNotextField.setColumns(10);
		
		JRadioButton radioButtonMale = new JRadioButton("Male");
		radioButtonMale.setForeground(new Color(255, 255, 255));
		radioButtonMale.setBackground(new Color(51, 51, 102));
		radioButtonMale.setBounds(550, 368, 59, 23);
		radioButtonMale.setActionCommand("Male");
		contentPane.add(radioButtonMale);
		
		
		
		JRadioButton RadioButtonFemale = new JRadioButton("Female");
		RadioButtonFemale.setForeground(new Color(255, 255, 255));
		RadioButtonFemale.setBackground(new Color(51, 51, 102));
		RadioButtonFemale.setBounds(622, 368, 66, 23);
		RadioButtonFemale.setActionCommand("Female");
		contentPane.add(RadioButtonFemale);
		
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(RadioButtonFemale);
		buttonGroup.add(radioButtonMale);
		
		JTextArea AddresstextArea = new JTextArea();
		AddresstextArea.setBounds(550, 420, 169, 58);
		AddresstextArea.setText("Enter Address");
		AddresstextArea.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				
				if(AddresstextArea.getText().equals("Enter Address"))
				{
					AddresstextArea.setText("");
				}
				else
				{
					AddresstextArea.selectAll();
				}
				
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(AddresstextArea.getText().equals(""))
				{
					AddresstextArea.setText("Enter Address");
				}
			}
		});
		AddresstextArea.setCaretColor(Color.WHITE);
		AddresstextArea.setForeground(Color.WHITE);
		AddresstextArea.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		AddresstextArea.setBackground(new Color(51, 51, 102));
		contentPane.add(AddresstextArea);
		
		EmailIdtextField = new JTextField();
		EmailIdtextField.setBounds(550, 264, 169, 23);
		EmailIdtextField.setText("Enter Email ID");
		EmailIdtextField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				
				if(EmailIdtextField.getText().equals("Enter Email ID"))
				{
					EmailIdtextField.setText("");
				}
				else
				{
					EmailIdtextField.selectAll();
				}
				
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(EmailIdtextField.getText().equals(""))
				{
					EmailIdtextField.setText("Enter Email ID");
				}

			}
		});
		EmailIdtextField.setCaretColor(Color.WHITE);
		EmailIdtextField.setForeground(Color.WHITE);
		EmailIdtextField.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		EmailIdtextField.setBackground(new Color(51, 51, 102));
		contentPane.add(EmailIdtextField);
		EmailIdtextField.setColumns(10);
		
		CPasstextField = new JTextField();
		CPasstextField.setBounds(554, 549, 181, 20);
		CPasstextField.setText("Confirm your Password");
		CPasstextField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				
				if(CPasstextField.getText().equals("Confirm your Password"))
				{
					CPasstextField.setText("");
				}
				else
				{
					CPasstextField.selectAll();
				}
				
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(CPasstextField.getText().equals(""))
				{
					CPasstextField.setText("Confirm your Password");
				}
			}
		});
		CPasstextField.setCaretColor(Color.WHITE);
		CPasstextField.setForeground(Color.WHITE);
		CPasstextField.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		CPasstextField.setBackground(new Color(51, 51, 102));
		contentPane.add(CPasstextField);
		CPasstextField.setColumns(10);
		
		JDateChooser DateOfBirth = new JDateChooser();
		DateOfBirth.setBounds(550, 323, 165, 20);
		DateOfBirth.setBorder(new LineBorder(new Color(0, 0, 51)));
		DateOfBirth.setBackground(new Color(0, 0, 51));
		contentPane.add(DateOfBirth);
		
		JButton btnSubmit = new JButton("Register");
		btnSubmit.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(0, 100, 0), new Color(0, 128, 0)));
		btnSubmit.setBounds(655, 600, 89, 23);
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String fname=FnametextField.getText();
				  String lname=LnametextField.getText();
				  String pno1=PhoneNotextField.getText();
				  String emailid=EmailIdtextField.getText();
				 // String dob=DateOfBirth.getDate().toString();
				  Date dob=DateOfBirth.getDate();
				  String pass1=PasstextField.getText();
				  String Cpass=CPasstextField.getText();
				  String maleR=radioButtonMale.getToolTipText();
				  String FemaleR=RadioButtonFemale.getToolTipText();
				  String add=AddresstextArea.getText();
				  
				  // for first name
				  if(fname.equals("")) {
			        	FirstNameLabelError.setVisible(true);

					}
					else
					{
			        	FirstNameLabelError.setVisible(false);

					}
					// last name
					
				               if(lname.equals("")) {
									LastNameLabelError.setVisible(true);

								}
									
								else {
									LastNameLabelError.setVisible(false);

								}
					
								// for phone Number 
								String regex = "^[6-9]{1}[0-9]{9}$";
								Pattern pattern = Pattern.compile(regex);
								Matcher matcher = pattern.matcher(PhoneNotextField.getText());
								if(!matcher.matches())
								{
									PhoneNoLabelError.setVisible(true);
								}
								else
								{
									PhoneNoLabelError.setVisible(false);
								}
								
								// for email 
								
								String expression = "^[a-zA-Z0-9+_.-]+@(.+)(.com)$"; 
								Pattern p = Pattern.compile(expression);
								Matcher m = p.matcher(EmailIdtextField.getText());
								if(!m.matches())
								{
									EmailidLabelError.setVisible(true);
								}
								else
								{
									EmailidLabelError.setVisible(false);

								}
								
								// dob
								if(((JTextField)DateOfBirth.getDateEditor().getUiComponent()).getText().trim().isEmpty()) {
									dobLabelError.setVisible(true);
								}
	
								else
								{
									dobLabelError.setVisible(false);

								}
								// gender
								
								if(!radioButtonMale.isSelected() && !RadioButtonFemale.isSelected() ) {
									//val5.setText("Gender Field is Empty");
									GenderLabelError.setVisible(true);
									
								}else
								{
									GenderLabelError.setVisible(false);

								}
								
								// pass
								if(pass1.equals( ""))
								{
									PassLabelError.setVisible(true);

								}
								else if (pass1.length() > 8) {
									PassLabelError.setVisible(true);

					        }
						else
						{
							PassLabelError.setVisible(false);

						}
								
								//cpass
							         if (!Cpass.equals(pass1)) {
							        	 CPassLabelError.setVisible(true);
							        }else if(CPasstextField.getText().trim().isEmpty()) {
							        	CPassLabelError.setVisible(true);
							        }
							        else
							        {
							        	 CPassLabelError.setVisible(false);

							        }
							         
							         //adddress 
							         
							         if(AddresstextArea.getText().trim().isEmpty())
							         {
							        	 AddressLabelError.setVisible(true);

							         }
							         else
							         {
							        	 AddressLabelError.setVisible(false);

							         }
							         System.out.println(buttonGroup.getSelection().getActionCommand());
							         
							         ArrayList<String> al=new ArrayList();
							         al.add(FnametextField.getText());
							         al.add(LnametextField.getText());
							         al.add(PhoneNotextField.getText());
							         al.add(EmailIdtextField.getText());
							         al.add(DateOfBirth.getDate().toString());
							        al.add(buttonGroup.getSelection().getActionCommand());
							        
							         al.add(AddresstextArea.getText());
							         al.add(PasstextField.getText());
							         al.add(CPasstextField.getText());
							         
							         if(PasstextField.getText().equals(CPasstextField.getText()))
							         {
							        Database ig=new Database();
							        ig.insertIntoReg(al);
							       // JOptionPane.showMessageDialog(null," Submitted");
							        LoginForm db=new LoginForm();
							        db.setVisible(true);
							        setVisible(false);
							         }
							         else 
							         {
							        	 JOptionPane.showMessageDialog(null,"Dosent Submitted");
							         }
							         }
							        
							
		});
		btnSubmit.setBackground(Color.WHITE);
		btnSubmit.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(btnSubmit);
		
		 LastNameLabelError = new JLabel("Last Name is Requied");
		 LastNameLabelError.setBounds(647, 149, 119, 14);
		 LastNameLabelError.setVisible(false);
		 LastNameLabelError.setForeground(Color.RED);
		contentPane.add(LastNameLabelError);
		
		 PhoneNoLabelError = new JLabel("Incorrect Phone Number");
		 PhoneNoLabelError.setBounds(627, 199, 133, 14);
		 PhoneNoLabelError.setForeground(Color.RED);
		PhoneNoLabelError.setVisible(false);
		contentPane.add(PhoneNoLabelError);
		
		 dobLabelError = new JLabel("Select Date Of Birth");
		 dobLabelError.setBounds(647, 298, 119, 14);
		 dobLabelError.setForeground(Color.RED);
		dobLabelError.setVisible(false);
		contentPane.add(dobLabelError);
		
		 GenderLabelError = new JLabel("Choose gender");
		 GenderLabelError.setBounds(647, 347, 154, 14);
		 GenderLabelError.setForeground(Color.RED);
		GenderLabelError.setVisible(false);
		contentPane.add(GenderLabelError);
		
		 AddressLabelError = new JLabel("Incorrect Address");
		 AddressLabelError.setBounds(647, 387, 147, 14);
		 AddressLabelError.setForeground(Color.RED);
   	 AddressLabelError.setVisible(false);

		contentPane.add(AddressLabelError);
		
		 PassLabelError = new JLabel("Incorrect Paassword");
		 PassLabelError.setBounds(647, 489, 127, 14);
		 PassLabelError.setForeground(Color.RED);
		PassLabelError.setVisible(false);
		contentPane.add(PassLabelError); 
		
		 CPassLabelError = new JLabel("Password doesnt match");
		 CPassLabelError.setBounds(647, 533, 128, 14);
		 CPassLabelError.setForeground(Color.RED);
		CPassLabelError.setVisible(false);
		contentPane.add(CPassLabelError);
		
		 FirstNameLabelError = new JLabel("First Name is required");
		 FirstNameLabelError.setBounds(655, 110, 111, 14);
		 FirstNameLabelError.setForeground(Color.RED);
		 FirstNameLabelError.setBackground(Color.WHITE);
		FirstNameLabelError.setVisible(false);
		contentPane.add(FirstNameLabelError);
		
		 EmailidLabelError = new JLabel("Incorrect Email ");
		 EmailidLabelError.setBounds(640, 250, 126, 14);
		 EmailidLabelError.setForeground(Color.RED);
		   EmailidLabelError.setVisible(false);
		contentPane.add(EmailidLabelError);
		
		JLabel LoginLabel = new JLabel(" already have an account?click here to login");
		LoginLabel.setBounds(465, 634, 251, 14);
		LoginLabel.setForeground(new Color(255, 255, 255));
		LoginLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LoginForm lp=new LoginForm();
				lp.setVisible(true);
				setVisible(false);
			}
		});
		LoginLabel.setFont(new Font("Times New Roman", Font.BOLD, 13));
		contentPane.add(LoginLabel);
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 0, 0), new Color(250, 128, 114)));
		btnNewButton.setBounds(451, 600, 89, 23);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				HomePage hp=new HomePage();
				hp.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(btnNewButton);
		
		JButton ResetNewButton = new JButton("Reset");
		ResetNewButton.setBounds(550, 600, 89, 23);
		ResetNewButton.setBackground(Color.WHITE);
		ResetNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FnametextField.setText(null);
	        	FirstNameLabelError.setVisible(false);

	        	LnametextField.setText(null);
				LastNameLabelError.setVisible(false);

				PhoneNotextField.setText(null);
				PhoneNoLabelError.setVisible(false);

				EmailIdtextField.setText(null);
				EmailidLabelError.setVisible(false);

				DateOfBirth.setDate(null);
				dobLabelError.setVisible(false);

				
				PasstextField.setText(null);
				PassLabelError.setVisible(false);;

				CPasstextField.setText(null);
	        	 CPassLabelError.setVisible(false);

	        	 buttonGroup.clearSelection();								    
					GenderLabelError.setVisible(false);
					
					DateOfBirth.setCalendar(null);
					dobLabelError.setVisible(false);

					
				AddresstextArea.setText(null);
		      	 AddressLabelError.setVisible(false);

				
				
			}

			
		});
		
		ResetNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(ResetNewButton);
		
		PasstextField = new JTextField();
		PasstextField.setBounds(550, 499, 185, 23);
		PasstextField.setText("Enter Password");
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
		PasstextField.setCaretColor(Color.WHITE);
		PasstextField.setForeground(Color.WHITE);
		PasstextField.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		PasstextField.setBackground(new Color(51, 51, 102));
		contentPane.add(PasstextField);
		PasstextField.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setBounds(559, 0, 89, 90);
		lblNewLabel_8.setIcon(new ImageIcon(img));;
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_11 = new JLabel("__________________________");
		lblNewLabel_11.setBounds(550, 135, 186, 14);
		lblNewLabel_11.setForeground(new Color(255, 255, 255));
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_11_1 = new JLabel("__________________________");
		lblNewLabel_11_1.setBounds(550, 174, 186, 23);
		lblNewLabel_11_1.setForeground(Color.WHITE);
		contentPane.add(lblNewLabel_11_1);
		
		JLabel lblNewLabel_11_1_1 = new JLabel("__________________________\r\n");
		lblNewLabel_11_1_1.setBounds(550, 225, 186, 19);
		lblNewLabel_11_1_1.setForeground(Color.WHITE);
		contentPane.add(lblNewLabel_11_1_1);
		
		JLabel lblNewLabel_11_1_1_1 = new JLabel("__________________________\r\n");
		lblNewLabel_11_1_1_1.setBounds(550, 275, 186, 19);
		lblNewLabel_11_1_1_1.setForeground(Color.WHITE);
		contentPane.add(lblNewLabel_11_1_1_1);
		
		JLabel lblNewLabel_11_1_1_1_1 = new JLabel("___________________________");
		lblNewLabel_11_1_1_1_1.setBounds(550, 465, 216, 23);
		lblNewLabel_11_1_1_1_1.setForeground(Color.WHITE);
		contentPane.add(lblNewLabel_11_1_1_1_1);
		
		JLabel lblNewLabel_11_1_1_1_2 = new JLabel("__________________________\r\n");
		lblNewLabel_11_1_1_1_2.setBounds(550, 514, 206, 14);
		lblNewLabel_11_1_1_1_2.setForeground(Color.WHITE);
		contentPane.add(lblNewLabel_11_1_1_1_2);
		
		JLabel lblNewLabel_11_1_1_1_1_1 = new JLabel("__________________________\r\n");
		lblNewLabel_11_1_1_1_1_1.setBounds(550, 558, 200, 14);
		lblNewLabel_11_1_1_1_1_1.setForeground(Color.WHITE);
		contentPane.add(lblNewLabel_11_1_1_1_1_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 774, 661);
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setIcon(new ImageIcon(img2));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(424, 45, 342, 544);
		lblNewLabel_2.setBackground(new Color(153, 102, 153));
		lblNewLabel_2.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), new Color(153, 204, 0)));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(515, 216, 30, 18);
		lblNewLabel_1.setIcon(new ImageIcon(img5));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(522, 264, 36, 23);
		lblNewLabel_3.setIcon(new ImageIcon(img6));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(515, 420, 30, 58);
		lblNewLabel_4.setIcon(new ImageIcon(img7));
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(515, 368, 30, 18);
		lblNewLabel_5.setIcon(new ImageIcon(img8));
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(515, 323, 30, 20);
		lblNewLabel_6.setIcon(new ImageIcon(img9));
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(515, 503, 30, 19);
		lblNewLabel_7.setIcon(new ImageIcon(img10));
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setBounds(522, 543, 36, 23);
		lblNewLabel_9.setIcon(new ImageIcon(img11));
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setBounds(515, 167, 30, 17);
		lblNewLabel_10.setIcon(new ImageIcon(img12));
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setBounds(515, 122, 30, 23);
		lblNewLabel_12.setIcon(new ImageIcon(img13));
		contentPane.add(lblNewLabel_12);
		//setUndecorated(true);
	} 
}
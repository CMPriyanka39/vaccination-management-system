package EclipseGui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import EmailDemo.EmailGenerationDemo;
import RegisterationForm.*;

import com.ceras.dao.BookingDB;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.Period;

import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JDateChooser;

import LoginForm;
import RegisterationForm;

import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

public class DashBoard extends JFrame {
	
	 private static String driver="com.mysql.jdbc.Driver"; 
	  private static String url="jdbc:mysql:///dashboard";
	  private static String user="root";
	  private static String pwd=null;
	  Connection con=null;
     PreparedStatement ps=null;
	  ResultSet rs=null;
	  Statement st=null;
	  String Vaccine;

	private Image img=new ImageIcon(DashBoard.class.getResource("/bac2.jpg")).getImage().getScaledInstance(700,580,Image.SCALE_SMOOTH);
	//private Image img1=new ImageIcon(DashBoard.class.getResource("/book.jpg")).getImage().getScaledInstance(320,700,Image.SCALE_SMOOTH);

	
	private JPanel contentPane;
	private JTextField AadharCardtextField;
	private JLabel AdharErrorLabel;
   private 	JComboBox VaccineCenterBox;
	private JDateChooser dateChooser;
	private JLabel dateLabelError;
	private JLabel VaccineTypeErrorLabel;
	private JLabel VaccinCenterLabelError; 
	private ButtonGroup bg;

	/**
	 * Launch the application.
	 */
	LoginForm lf=new LoginForm();
	
	 private static Pattern aadhaarPattern = Pattern.compile("^[2-9]{1}[0-9]{11}$");
	private JLabel lblNewLabel_3;

	 public static boolean isValidName(String name)
	 {
	  Matcher matcher = aadhaarPattern.matcher(name);
	  return matcher.find();
	 }

	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DashBoard frame = new DashBoard();
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
	
	
	
	public static int calculateAge(LocalDate dob) {
		LocalDate curDate=LocalDate.now();
		if((dob!=null)&&(curDate!=null)){
			return Period.between(dob, curDate).getYears();
			
			
		}else {
			return 0;
		}
		
		
	}
	public DashBoard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 550);
		contentPane = new JPanel();
		
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		 dateLabelError = new JLabel("Choose the Date to BookAppoinment");
		 dateLabelError.setBounds(399, 156, 238, 14);
		 dateLabelError.setForeground(Color.RED);
		 dateLabelError.setFont(new Font("Sitka Text", Font.ITALIC, 12));
		 dateLabelError.setVisible(false);
		 
		  VaccineTypeErrorLabel = new JLabel("Choose the Vaccination type");
		  VaccineTypeErrorLabel.setBounds(399, 208, 177, 14);
		  VaccineTypeErrorLabel.setForeground(Color.RED);
		  VaccineTypeErrorLabel.setFont(new Font("Sitka Text", Font.ITALIC, 12));
		  VaccineTypeErrorLabel.setVisible(false);
		  		
		  		 VaccinCenterLabelError = new JLabel("Choose Vaccination Center");
		  		 VaccinCenterLabelError.setBounds(402, 263, 168, 14);
		  		 VaccinCenterLabelError.setForeground(Color.RED);
		  		 VaccinCenterLabelError.setFont(new Font("Sitka Text", Font.ITALIC, 12));
		  		 VaccinCenterLabelError.setVisible(false); 
		  		 
		  		 JButton btnNewButton = new JButton("Back");
		  		 btnNewButton.setBackground(new Color(51, 204, 204));
		  		 btnNewButton.setBounds(195, 352, 152, 30);
		  		 btnNewButton.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(0, 204, 204), new Color(64, 64, 64)));
		  		 btnNewButton.addActionListener(new ActionListener() {
		  		 	public void actionPerformed(ActionEvent e) {
		  		 		
		  		 		MainDashboard mb=new MainDashboard();
		  		 		mb.setVisible(true);
		  		 		setVisible(false);
		  		 	}
		  		 });
		  		 contentPane.setLayout(null);
		  		 btnNewButton.setFont(new Font("Microsoft Himalaya", Font.BOLD | Font.ITALIC, 30));
		  		 contentPane.add(btnNewButton);
		  		 contentPane.add(VaccinCenterLabelError);
		  
		  		contentPane.add(VaccineTypeErrorLabel);
		 contentPane.add(dateLabelError);
		
		JLabel lblNewLabel = new JLabel("AadharCard Number");
		lblNewLabel.setBounds(177, 122, 184, 32);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Choose Vaccination Type");
		lblNewLabel_1.setBounds(177, 229, 198, 32);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Vaccination Center");
		lblNewLabel_2.setBounds(177, 291, 178, 22);
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		contentPane.add(lblNewLabel_2);
		
		AadharCardtextField = new JTextField();
		AadharCardtextField.setBounds(389, 125, 157, 20);
		contentPane.add(AadharCardtextField);
		AadharCardtextField.setColumns(10);
		
		JRadioButton CovaccineRadio = new JRadioButton("Covaxin");
		CovaccineRadio.setBorder(new LineBorder(new Color(0, 204, 204), 0));
		CovaccineRadio.setBackground(new Color(102, 204, 204));
		CovaccineRadio.setForeground(new Color(0, 0, 128));
		CovaccineRadio.setBounds(389, 233, 85, 23);
		CovaccineRadio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				VaccineCenterBox.setModel(new DefaultComboBoxModel(new String[] {" ","Governament hospital", "Markandey Healthcare","Yashodhara Super Speciality Hospital","Lokmangal Jeevan Hospital","\r\n"
						+ "Ashwini Sahakari Rugnalaya Ani Sanshodhan Kendra"}));
			}
		});
		CovaccineRadio.setFont(new Font("Times New Roman", Font.BOLD, 12));
		contentPane.add(CovaccineRadio);
		
		JRadioButton CovidShield = new JRadioButton("CovidShield");
		CovidShield.setBorder(new LineBorder(new Color(0, 204, 204), 0));
		CovidShield.setBackground(new Color(0, 204, 204));
		CovidShield.setBounds(476, 233, 98, 23);
		CovidShield.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				VaccineCenterBox.setModel(new DefaultComboBoxModel(new String[] {" ","Soham Healthcare","Cns Hospital","Dhanraj Girji Hospital","Mahila Hospital","\r\n"
						+ " Markandey Rugnalaya & Research Center"}));
			}
		});
		CovidShield.setFont(new Font("Times New Roman", Font.BOLD, 12));
		contentPane.add(CovidShield);
		
		 bg=new ButtonGroup();
		bg.add(CovaccineRadio);
		bg.add(CovidShield);
		
		 VaccineCenterBox = new JComboBox();
		 VaccineCenterBox.setBounds(389, 288, 157, 22);
		contentPane.add(VaccineCenterBox);
		
		JButton SubmitButton = new JButton("Book Appoinment");
		SubmitButton.setBounds(357, 350, 168, 32);
		SubmitButton.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(0, 204, 204), new Color(0, 0, 0)));
		SubmitButton.setBackground(new Color(0, 204, 204));
		
		SubmitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				// for adhar card
				String adhar=AadharCardtextField.getText();
				String date=dateChooser.getDateFormatString();
				 String covaccine=CovaccineRadio.getActionCommand();
				  String covid=CovidShield.getActionCommand();
				String VaccineCentre=VaccineCenterBox.getActionCommand();
			
				// AdharCard
				String PATTERN="^[0-9]{12}";
				Pattern ptr2=Pattern.compile (PATTERN); 
				Matcher mtchl=ptr2.matcher(AadharCardtextField.getText()); 
				if (adhar.equals("") && adhar.length()==0)
				{
					AdharErrorLabel.setVisible(true);
				}
				else 
				{
				if (!mtchl.matches()) 
				{
					AdharErrorLabel.setVisible (true);
				}	
				else 
				{

							AdharErrorLabel.setVisible (false);
					//al.add(AadharCardtextField.getText());				}
				}
				// DOB
				
				if(((JTextField)dateChooser.getDateEditor().getUiComponent()).getText().trim().isEmpty())				{
					dateLabelError.setVisible(true);
				}
				else
				{
					//al.add(dateChooser.getDate().toString());
					dateLabelError.setVisible(false);


				}
				// RadioButton
				if(!CovaccineRadio.isSelected() && !CovidShield.isSelected() ) {
					//val5.setText("Gender Field is Empty");
					VaccineTypeErrorLabel.setVisible(true);
					
				}else
				{
					 //al.add(bg.getSelection().getActionCommand());
					VaccineTypeErrorLabel.setVisible(false);


				}
				
				
				// ComboBox
				
				if(VaccineCenterBox.getSelectedItem().equals("SelectedItem"))
				{
					VaccinCenterLabelError.setVisible(true); 
				}
				else
				{
					VaccinCenterLabelError.setVisible(false); 
				}
				
				
				
			
				try
				{
					String query  = "INSERT INTO `bookingdetails`(`AdharNo`, `dateofbirth`, `Vaccinetype`, `centre`) VALUES (?,?,?,?)";
					con=DriverManager.getConnection(url,user,pwd);
					st=con.createStatement();
					ps=con.prepareStatement(query);		
				 
			        ps.setString(1,AadharCardtextField.getText());
				    ps.setString(2,((JTextField)dateChooser.getDateEditor().getUiComponent()).getText());
					if(CovaccineRadio.isSelected())
						ps.setString(3,CovaccineRadio.getText());
					else
					    ps.setString(3,CovidShield.getText()); 
					
					String item=VaccineCenterBox.getSelectedItem().toString();					
				    ps.setString(4,item);
				    
				  // String query1 ="Select *from `registeration_info` where Email='?'"; 
				   if(VaccineCenterBox.getSelectedItem().toString()!=null)
				    { 
					    
					   try 
						{
						 	int stock=0;
						 	Class.forName(driver);
							con=DriverManager.getConnection(url,user,pwd);
							st=con.createStatement();
							
					
						 	if(CovidShield.isSelected())
							 {
						 		Vaccine=CovidShield.getText();
						 		String sql="SELECT Stock FROM `stockdetails` WHERE VaccineName	='"+Vaccine+"'";
								rs=st.executeQuery(sql);
								 // String sql1="UPDATE stocks set stock=stock-1 WHERE vaccineName='"+Vaccine+"'";
									
							 }
							 else 
							 {
								 Vaccine=CovaccineRadio.getText();
								 String sql="SELECT Stock FROM `stockdetails` WHERE VaccineName	='"+Vaccine+"'";
									rs=st.executeQuery(sql);
									// String sql1="UPDATE stocks set stock=stock-1 WHERE vaccineName='"+Vaccine+"'";
										//rs1=stmt.executeQuery(sql1);
							 }
							if(rs.next())
							{
								String s1=rs.getString("stock");
								stock=Integer.parseInt(s1);
								//String s3=rs.getString("firstname");
								 if(stock>0)
								 {
									//update stock code
									 String sql1="UPDATE stockdetails set Stock=Stock-1 WHERE VaccineName='"+Vaccine+"'";
									 st.executeUpdate(sql1);
									 ps.executeUpdate();
								 }
									 else
									 {
										 JOptionPane.showMessageDialog(null,"Stocks are not Available");
									 }
									//JOptionPane.showMessageDialog(null," Submitted");
									 String message="Hello "+lf.uname+" \n we Kindly inform you that \n Your Appoinment for  '"+Vaccine+"' is Successfully Booked !!";
									   String subject="Vaccination Appoinment : Confirmation ";
									   String from="malpeddiaarti@gmail.com";
									   String to=lf.uname;

									   EmailGenerationDemo email=new EmailGenerationDemo();
									   email.sendEmail(message,subject,to,from);
									  // System.out.println("Preparing to send Message....");
										JOptionPane.showMessageDialog(null,"Email send Successfully!!Please Check");

									   
									 
									 
								 	}
								
							}
						
				    
					   catch(Exception ex) 
						{
							JOptionPane.showMessageDialog(null,"Issue occured ,Email not send");
			            }
				    }
					
				}catch(Exception ex) 
				{
					JOptionPane.showMessageDialog(null,ex);
			    }
			}
			   }
			    
				  
						
					

			 
		
			
			
		});
		SubmitButton.setFont(new Font("Microsoft Himalaya", Font.BOLD | Font.ITALIC, 25));
		contentPane.add(SubmitButton);
		
		 AdharErrorLabel = new JLabel("Incorrect Aadhar Number");
		 AdharErrorLabel.setBounds(402, 100, 168, 14);
		 AdharErrorLabel.setForeground(Color.RED);
		 AdharErrorLabel.setFont(new Font("Sitka Text", Font.ITALIC, 12));
		AdharErrorLabel.setVisible(false);
		contentPane.add(AdharErrorLabel);
		
		JLabel lblNewLabel_4 = new JLabel("Choose the Date");
		lblNewLabel_4.setBounds(177, 165, 135, 32);
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		contentPane.add(lblNewLabel_4);
		
		 dateChooser = new JDateChooser();
		 dateChooser.setBounds(389, 181, 157, 20);
		contentPane.add(dateChooser);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(0, 0, 684, 511);
		lblNewLabel_3.setIcon(new ImageIcon(img));
		contentPane.add(lblNewLabel_3);
	}
}

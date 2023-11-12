package EclipseGui;

import java.awt.BorderLayout;

import com.ceras.dao.*;
import com.mysql.jdbc.PreparedStatement;

import net.proteanit.sql.DbUtils;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class ViewAppoinment extends JFrame {
	private Image img=new ImageIcon(MainDashboard.class.getResource("/doc.jpg")).getImage().getScaledInstance(780,550,Image.SCALE_SMOOTH);

	Connection con;

		
			String driver="com.mysql.jdbc.Driver"; 
			 String url="jdbc:mysql:///dashboard";
			  String user="root";
			 String pwd=null;
			 Statement st=null;
			 ResultSet rs=null;

	private JPanel contentPane;
	private JTable table;
	private JScrollPane scrollPane;
	private JButton btnNewButton_1;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewAppoinment frame = new ViewAppoinment();
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
	public ViewAppoinment() {
		/*addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				regData_display();
				}
		});*/
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(59, 113, 665, 138);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 con=DriverManager.getConnection(url,user,pwd);
			 Statement st=con.createStatement();
			 String query="select * from 	bookingdetails";
			ResultSet rs= st.executeQuery(query);
			 ResultSetMetaData rsmd=rs.getMetaData();
			 DefaultTableModel model=(DefaultTableModel)table.getModel();
			  
			 
			 int colms=rsmd.getColumnCount();
			 String[] colName=new String[colms];
			 for(int i=0;i<colms;i++) 
			 {
				 colName[i]=rsmd.getColumnName(i+1);
				 model.setColumnIdentifiers(colName);
				 String user_id, adhar,date,vaccine,center;
				while(rs.next()) {
					user_id=rs.getString(1);
					adhar=rs.getString(2);
					date=rs.getString(3);
					vaccine=rs.getString(4);
					center=rs.getString(5);
					
					String[] rows= {user_id,adhar,date,vaccine,center};
					model.addRow(rows);
					
				}
				
				
				 
			 }
				 
			 
				 
			 
			 
			 
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
	

		
		btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MainDashboard db=new MainDashboard();
				db.setVisible(true);
				setVisible(false);
				
			}
		});
		btnNewButton_1.setFont(new Font("Microsoft Himalaya", Font.BOLD | Font.ITALIC, 26));
		btnNewButton_1.setBounds(311, 301, 89, 28);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Vaccination Details ");
		lblNewLabel.setFont(new Font("Microsoft Himalaya", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel.setBounds(273, 35, 188, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(0, 0, 734, 461);
		lblNewLabel_1.setIcon(new ImageIcon(img));
		contentPane.add(lblNewLabel_1);
	}

}

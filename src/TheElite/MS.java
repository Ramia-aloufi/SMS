package TheElite;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.CardLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Cursor;

public class MS extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private JTextField TeacherIDTF;
	private JTextField TeacherNameTF;
	private JTextField TeacherEmailTF;
	private JTextField TeacherPhoneTF;
	private JTextField TeacherClassIDTF;
	private JTextField TeacherSearchTF;
	private JTable TeacherTable;
	private JTextField ClassroomIDTF;
	private JTextField ClassroomYearTF;
	private JTextField ClassroomGradeTF;
	private JTextField ClassroomSearchTF;
	private JTable ClassroomTable;
	private JTextField ParentNameTF;
	private JTextField ParentEmailTF;
	private JTextField ParentPhoneTF;
	private JTextField ParentStudentIDTF;
	private JTextField ParentSearchTF;
	private JTable ParentTable;
	private JTextField StudentIDTF;
	private JTextField StudentNameTF;
	private JTextField StudentEmailTF;
	private JTextField StudentDOBTF;
	private JTextField StudentClassIDTF;
	private JTextField StudentSearchTF;
	private JTable StudentTable;
    private JTextField UserNameTF;
    private JTextField UserEmailTF;
    private JTextField UserPasswordTF;
    private JTextField UserSearchTF;
    private JTable UserTable;
    private JPanel UserP;
    private JPanel StudentControlPanel;
    private JPanel TeacherControlPanel;
    private JPanel UserControlPanel;
    private JPanel ParentControlPanel;
    private JPanel ClassroomControlPanel;
    private JPanel ParentInfoPanel;
    private JPanel ClassroomInfoPanel;
    private JPanel TeacherInfoPanel;
    private JPanel StudentInfoPanel;








    
	

	/**
	 * Launch the application.
	 */
	Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MS window = new MS();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MS() {
		con = connection.MyConnection();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	    Login login = new Login();
		frame = new JFrame();
		frame.setAutoRequestFocus(false);
		frame.setResizable(false);
		frame.setBounds(new Rectangle(0, 0, 750, 500));
		frame.setLocationRelativeTo(null);

		JPanel HOME = new JPanel();
		HOME.setForeground(Color.WHITE);
		frame.getContentPane().add(HOME, BorderLayout.CENTER);
		HOME.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(174, 0, 576, 478);
		panel_2.setBackground(Color.WHITE);
		HOME.add(panel_2);
		panel_2.setLayout(new CardLayout(0, 0));
		
		JPanel HomeScreen = new JPanel();
		HomeScreen.setBackground(Color.WHITE);
		panel_2.add(HomeScreen, "name_42153112201180");
		HomeScreen.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("The Elite Team Project");
		lblNewLabel_9.setForeground(SystemColor.windowBorder);
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		lblNewLabel_9.setBounds(156, 231, 312, 64);
		HomeScreen.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setIcon(new ImageIcon("/Users/r/eclipse-workspace/TheElite/src/Img/Untitled-2.png"));
		lblNewLabel_10.setBounds(200, 131, 214, 131);
		HomeScreen.add(lblNewLabel_10);
		
		JPanel UserPanel = new JPanel();
		UserPanel.setBackground(Color.WHITE);
		panel_2.add(UserPanel, "name_40147694269191");
		UserPanel.setLayout(null);
		
		JPanel panel_13_1_1_1 = new JPanel();
		panel_13_1_1_1.setBackground(Color.WHITE);
		panel_13_1_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Information", TitledBorder.LEADING, TitledBorder.TOP, null, Color.LIGHT_GRAY));
		panel_13_1_1_1.setLayout(null);
		panel_13_1_1_1.setBounds(29, 18, 527, 134);
		UserPanel.add(panel_13_1_1_1);
		
		JPanel panel_17_1_1_1_1 = new JPanel();
		panel_17_1_1_1_1.setBackground(Color.WHITE);
		panel_17_1_1_1_1.setLayout(null);
		panel_17_1_1_1_1.setBounds(6, 36, 210, 27);
		panel_13_1_1_1.add(panel_17_1_1_1_1);
		
		UserNameTF = new JTextField();
		UserNameTF.setText("");
		UserNameTF.setColumns(10);
		UserNameTF.setBounds(74, 0, 130, 26);
		panel_17_1_1_1_1.add(UserNameTF);
		
		JLabel lblNewLabel_5_1_1_1_1 = new JLabel("Name");
		lblNewLabel_5_1_1_1_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_5_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1_1_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblNewLabel_5_1_1_1_1.setBounds(6, 6, 66, 16);
		panel_17_1_1_1_1.add(lblNewLabel_5_1_1_1_1);
		
		JPanel panel_17_2_1_1_1 = new JPanel();
		panel_17_2_1_1_1.setBackground(Color.WHITE);
		panel_17_2_1_1_1.setLayout(null);
		panel_17_2_1_1_1.setBounds(6, 75, 210, 27);
		panel_13_1_1_1.add(panel_17_2_1_1_1);
		
		UserEmailTF = new JTextField();
		UserEmailTF.setText("");
		UserEmailTF.setColumns(10);
		UserEmailTF.setBounds(74, 0, 130, 26);
		panel_17_2_1_1_1.add(UserEmailTF);
		
		JLabel lblNewLabel_5_2_1_1_1 = new JLabel("Email");
		lblNewLabel_5_2_1_1_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_5_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_2_1_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblNewLabel_5_2_1_1_1.setBounds(6, 6, 66, 16);
		panel_17_2_1_1_1.add(lblNewLabel_5_2_1_1_1);
		
		JPanel panel_17_3_1_1_1 = new JPanel();
		panel_17_3_1_1_1.setBackground(Color.WHITE);
		panel_17_3_1_1_1.setLayout(null);
		panel_17_3_1_1_1.setBounds(311, 36, 210, 27);
		panel_13_1_1_1.add(panel_17_3_1_1_1);
		
		UserPasswordTF = new JTextField();
		UserPasswordTF.setText("");
		UserPasswordTF.setColumns(10);
		UserPasswordTF.setBounds(74, 0, 130, 26);
		panel_17_3_1_1_1.add(UserPasswordTF);
		
		JLabel lblNewLabel_5_3_1_1_1 = new JLabel("Password");
		lblNewLabel_5_3_1_1_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_5_3_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_3_1_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblNewLabel_5_3_1_1_1.setBounds(6, 6, 66, 16);
		panel_17_3_1_1_1.add(lblNewLabel_5_3_1_1_1);
		
		JPanel panel_17_3_1_1_1_1 = new JPanel();
		panel_17_3_1_1_1_1.setBackground(Color.WHITE);
		panel_17_3_1_1_1_1.setLayout(null);
		panel_17_3_1_1_1_1.setBounds(311, 75, 210, 27);
		panel_13_1_1_1.add(panel_17_3_1_1_1_1);
		
		JLabel lblNewLabel_5_3_1_1_1_1 = new JLabel("Permission");
		lblNewLabel_5_3_1_1_1_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_5_3_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_3_1_1_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblNewLabel_5_3_1_1_1_1.setBounds(6, 6, 66, 16);
		panel_17_3_1_1_1_1.add(lblNewLabel_5_3_1_1_1_1);
		ButtonGroup bG = new ButtonGroup();

		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("admin");
		rdbtnNewRadioButton.setForeground(Color.DARK_GRAY);
		rdbtnNewRadioButton.setBounds(72, 1, 71, 23);
		panel_17_3_1_1_1_1.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setActionCommand( rdbtnNewRadioButton.getText() );

		
		JRadioButton rdbtnUser = new JRadioButton("user");
		rdbtnUser.setForeground(Color.DARK_GRAY);
		rdbtnUser.setSelected(true);
		rdbtnUser.setBounds(139, 1, 71, 23);
		panel_17_3_1_1_1_1.add(rdbtnUser);
		rdbtnUser.setActionCommand( rdbtnUser.getText() );

		bG.add(rdbtnNewRadioButton);
		bG.add(rdbtnUser);
		
		JPanel panel_14_1_1_1 = new JPanel();
		panel_14_1_1_1.setBackground(Color.WHITE);
		panel_14_1_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Operation", TitledBorder.LEADING, TitledBorder.TOP, null, Color.LIGHT_GRAY));
		panel_14_1_1_1.setLayout(null);
		panel_14_1_1_1.setBounds(29, 164, 527, 51);
		UserPanel.add(panel_14_1_1_1);
		
		JPanel panel_18_1_1_1 = new JPanel();
		panel_18_1_1_1.setBackground(Color.WHITE);
		panel_18_1_1_1.setBounds(24, 17, 497, 28);
		panel_14_1_1_1.add(panel_18_1_1_1);
		panel_18_1_1_1.setLayout(new GridLayout(0, 3, 25, 10));
		
		JPanel UserADD = new JPanel();
		UserADD.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		UserADD.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String UserName = UserNameTF.getText();
				String UserEmail = UserEmailTF.getText();
				String UserPassword = UserPasswordTF.getText();
				String UserPermission = bG.getSelection().getActionCommand();





				try
				
				{
					PreparedStatement st = con.prepareStatement("INSERT INTO user(name,email,password,permission) VALUES (?,?,?,?);");
					st.setString(1, UserName);
					st.setString(2, UserEmail);
					st.setString(3, UserPassword);
					st.setString(4, UserPermission);
					
					int status  = st.executeUpdate();
					if (status > 0){

	                JOptionPane.showMessageDialog(null,"Data is saved successfully");
					}
					fitchUser();
					UserClearTF();
				
				}

				catch(Exception e1){
	                JOptionPane.showMessageDialog(null,e1);
					} 
	            finally {

	                try{
	                    rs.close();
	                    ps.close();

	                }
	                 catch(Exception e11){
	                   JOptionPane.showMessageDialog(null,e11);
	                }
	            }
				
			}
		});
		UserADD.setBackground(new Color(0, 204, 0));
		panel_18_1_1_1.add(UserADD);
		
		JLabel lblNewLabel_6_1_1_1 = new JLabel("ADD");
		lblNewLabel_6_1_1_1.setForeground(Color.DARK_GRAY);
		UserADD.add(lblNewLabel_6_1_1_1);
		
		JPanel UserEdit = new JPanel();
		UserEdit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		UserEdit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String UserName = UserNameTF.getText();
				String UserEmail = UserEmailTF.getText();
				String UserPassword = UserPasswordTF.getText();
				String UserPermission = bG.getSelection().getActionCommand();
		        int p = JOptionPane.showConfirmDialog(null, "Update", "Update", JOptionPane.YES_NO_OPTION);
		        if (p==0){
		            try{
		            String sql = "UPDATE user  SET name =?,password =?,permission=? WHERE email LIKE ?";
		            ps = con.prepareStatement(sql);
		            ps.setString(1, UserName);
		            ps.setString(2, UserPassword);
		            ps.setString(3, UserPermission);
		            ps.setString(4, UserEmail);
		            
					int status  = ps.executeUpdate();
					if (status > 0){
			             JOptionPane.showMessageDialog(null,"UPDATE!");
							fitchUser();
							UserClearTF();
					}
		            }catch(Exception ea){
		                 JOptionPane.showMessageDialog(null,ea);
		            }
			}
			}
		});
		UserEdit.setBackground(new Color(255, 255, 51));
		panel_18_1_1_1.add(UserEdit);
		
		JLabel lblNewLabel_7_1_1_1 = new JLabel("EDIT");
		lblNewLabel_7_1_1_1.setForeground(Color.DARK_GRAY);
		UserEdit.add(lblNewLabel_7_1_1_1);
		
		JPanel UserDelete = new JPanel();
		UserDelete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		UserDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
	            String num = UserEmailTF.getText();
	            try{
	            String sql = "DELETE FROM user WHERE email LIKE ? ";
	            ps = con.prepareStatement(sql);
	            ps.setString(1, num);
	             ps.execute();
	            
	              JOptionPane.showMessageDialog(null,"DELETED!");
	                fitchUser();
	                UserClearTF();
			        
	            }catch(Exception e11){
	                JOptionPane.showMessageDialog(null,e11);
	            }
			}
		});
		UserDelete.setBackground(Color.RED);
		panel_18_1_1_1.add(UserDelete);
		
		JLabel lblNewLabel_8_1_1_1 = new JLabel("DELETE");
		lblNewLabel_8_1_1_1.setForeground(Color.DARK_GRAY);
		UserDelete.add(lblNewLabel_8_1_1_1);
		
		JPanel panel_15_1_1_1 = new JPanel();
		panel_15_1_1_1.setBackground(Color.WHITE);
		panel_15_1_1_1.setBorder(new TitledBorder(null, "Search ", TitledBorder.LEADING, TitledBorder.TOP, null, Color.LIGHT_GRAY));
		panel_15_1_1_1.setLayout(null);
		panel_15_1_1_1.setBounds(29, 227, 527, 52);
		UserPanel.add(panel_15_1_1_1);
		
		JPanel panel_17_5_1_1_1 = new JPanel();
		panel_17_5_1_1_1.setBackground(Color.WHITE);
		panel_17_5_1_1_1.setLayout(null);
		panel_17_5_1_1_1.setBounds(25, 19, 476, 27);
		panel_15_1_1_1.add(panel_17_5_1_1_1);
		
		UserSearchTF = new JTextField();
		UserSearchTF.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				

			}
		});
		UserSearchTF.setText("");
		UserSearchTF.setColumns(10);
		UserSearchTF.setBounds(74, 0, 363, 26);
		panel_17_5_1_1_1.add(UserSearchTF);
		
		JLabel UserSearch = new JLabel("search");
		UserSearch.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		UserSearch.setBackground(new Color(255, 153, 51));
		UserSearch.setForeground(Color.ORANGE);
		UserSearch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		        String uup = UserSearchTF.getText();
		        if(uup.isEmpty()){
		        	fitchUser();
		        }else{
		                try{
		            String sql = "SELECT * FROM user WHERE "
		                    + "email LIKE ?";
		            ps = con.prepareStatement(sql);
		            ps.setString(1, uup);
		            rs = ps.executeQuery();
		            UserTable.setModel(DbUtils.resultSetToTableModel(rs));

		        }catch(Exception e1){
		            JOptionPane.showMessageDialog(null, e1);
		        }
		        finally {

		            try{
		                rs.close();
		                ps.close();
		            }
		            catch(Exception e11){
		                JOptionPane.showMessageDialog(null,e11);
		            }
		        }
		        }
				
			}
		});
		UserSearch.setHorizontalAlignment(SwingConstants.CENTER);
		UserSearch.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		UserSearch.setBounds(6, 6, 66, 16);
		panel_17_5_1_1_1.add(UserSearch);
		
		JPanel panel_16_1_1_1 = new JPanel();
		panel_16_1_1_1.setBackground(Color.WHITE);
		panel_16_1_1_1.setBorder(new TitledBorder(null, "View", TitledBorder.LEADING, TitledBorder.TOP, null, Color.LIGHT_GRAY));
		panel_16_1_1_1.setLayout(null);
		panel_16_1_1_1.setBounds(29, 291, 527, 181);
		UserPanel.add(panel_16_1_1_1);
		
		UserTable = new JTable();
		UserTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
		        DefaultTableModel ttbbll = (DefaultTableModel)UserTable.getModel();
		        
		        String e11 = ttbbll.getValueAt(UserTable.getSelectedRow(),0).toString();
		        String e22 = ttbbll.getValueAt(UserTable.getSelectedRow(),1).toString();
		        String e33 = ttbbll.getValueAt(UserTable.getSelectedRow(),2).toString();
		        String e44 = ttbbll.getValueAt(UserTable.getSelectedRow(),3).toString();



		        
		        UserNameTF.setText(e11);
		        UserEmailTF.setText(e22);
		        UserPasswordTF.setText(e33);
		        
		        if(e44.equals("admin")) {
		        	rdbtnNewRadioButton.setSelected(true); 
		        } else {
		        	rdbtnUser.setSelected(true); 
		        } 
		        
			}
		});
		UserTable.setBounds(6, 20, 515, 155);
		panel_16_1_1_1.add(UserTable);
		
		JPanel ParentPanel = new JPanel();
		ParentPanel.setBackground(Color.WHITE);
		panel_2.add(ParentPanel, "name_40138641734756");
		ParentPanel.setLayout(null);
		
	    ParentInfoPanel = new JPanel();
	    ParentInfoPanel.setBackground(Color.WHITE);
		ParentInfoPanel.setBorder(new TitledBorder(null, "Information", TitledBorder.LEADING, TitledBorder.TOP, null, Color.LIGHT_GRAY));
		ParentInfoPanel.setLayout(null);
		ParentInfoPanel.setBounds(28, 18, 527, 134);
		ParentPanel.add(ParentInfoPanel);
		
		JPanel panel_17_1_1_1 = new JPanel();
		panel_17_1_1_1.setBackground(Color.WHITE);
		panel_17_1_1_1.setLayout(null);
		panel_17_1_1_1.setBounds(6, 32, 210, 27);
		ParentInfoPanel.add(panel_17_1_1_1);
		
		ParentNameTF = new JTextField();
		ParentNameTF.setText("");
		ParentNameTF.setColumns(10);
		ParentNameTF.setBounds(74, 0, 130, 26);
		panel_17_1_1_1.add(ParentNameTF);
		
		JLabel lblNewLabel_5_1_1_1 = new JLabel("Name");
		lblNewLabel_5_1_1_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_5_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblNewLabel_5_1_1_1.setBounds(6, 6, 66, 16);
		panel_17_1_1_1.add(lblNewLabel_5_1_1_1);
		
		JPanel panel_17_2_1_1 = new JPanel();
		panel_17_2_1_1.setBackground(Color.WHITE);
		panel_17_2_1_1.setLayout(null);
		panel_17_2_1_1.setBounds(6, 84, 210, 27);
		ParentInfoPanel.add(panel_17_2_1_1);
		
		ParentEmailTF = new JTextField();
		ParentEmailTF.setText("");
		ParentEmailTF.setColumns(10);
		ParentEmailTF.setBounds(74, 0, 130, 26);
		panel_17_2_1_1.add(ParentEmailTF);
		
		JLabel lblNewLabel_5_2_1_1 = new JLabel("Email");
		lblNewLabel_5_2_1_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_5_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_2_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblNewLabel_5_2_1_1.setBounds(6, 6, 66, 16);
		panel_17_2_1_1.add(lblNewLabel_5_2_1_1);
		
		JPanel panel_17_3_1_1 = new JPanel();
		panel_17_3_1_1.setBackground(Color.WHITE);
		panel_17_3_1_1.setLayout(null);
		panel_17_3_1_1.setBounds(311, 32, 210, 27);
		ParentInfoPanel.add(panel_17_3_1_1);
		
		ParentPhoneTF = new JTextField();
		ParentPhoneTF.setText("");
		ParentPhoneTF.setColumns(10);
		ParentPhoneTF.setBounds(74, 0, 130, 26);
		panel_17_3_1_1.add(ParentPhoneTF);
		
		JLabel lblNewLabel_5_3_1_1 = new JLabel("Phone Num");
		lblNewLabel_5_3_1_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_5_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_3_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblNewLabel_5_3_1_1.setBounds(6, 6, 66, 16);
		panel_17_3_1_1.add(lblNewLabel_5_3_1_1);
		
		JPanel panel_17_4_1_1 = new JPanel();
		panel_17_4_1_1.setBackground(Color.WHITE);
		panel_17_4_1_1.setLayout(null);
		panel_17_4_1_1.setBounds(311, 84, 210, 27);
		ParentInfoPanel.add(panel_17_4_1_1);
		
		ParentStudentIDTF = new JTextField();
		ParentStudentIDTF.setText("");
		ParentStudentIDTF.setColumns(10);
		ParentStudentIDTF.setBounds(74, 0, 130, 26);
		panel_17_4_1_1.add(ParentStudentIDTF);
		
		JLabel lblNewLabel_5_4_1_1 = new JLabel("Student ID");
		lblNewLabel_5_4_1_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_5_4_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_4_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblNewLabel_5_4_1_1.setBounds(6, 6, 66, 16);
		panel_17_4_1_1.add(lblNewLabel_5_4_1_1);
		
	    ParentControlPanel = new JPanel();
	    ParentControlPanel.setBackground(Color.WHITE);
		ParentControlPanel.setBorder(new TitledBorder(null, "Operation", TitledBorder.LEADING, TitledBorder.TOP, null, Color.LIGHT_GRAY));
		ParentControlPanel.setLayout(null);
		ParentControlPanel.setBounds(28, 164, 527, 52);
		ParentPanel.add(ParentControlPanel);
		
		JPanel panel_18_1_1 = new JPanel();
		panel_18_1_1.setBackground(Color.WHITE);
		panel_18_1_1.setBounds(24, 19, 497, 26);
		ParentControlPanel.add(panel_18_1_1);
		panel_18_1_1.setLayout(new GridLayout(0, 3, 25, 10));
		
		JPanel ParentADD = new JPanel();
		ParentADD.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ParentADD.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String ParentID = ParentStudentIDTF.getText();
				String ParentName = ParentNameTF.getText();
				String ParentEmail = ParentEmailTF.getText();
				String ParentPhone = ParentPhoneTF.getText();





				try
				
				{
					PreparedStatement st = con.prepareStatement("INSERT INTO parents(parent,studentID,parentemail,phoneNo) VALUES (?,?,?,?);");
					st.setString(1, ParentName);
					st.setInt(2, Integer.parseInt(ParentID));
					st.setString(3, ParentEmail);
					st.setInt(4, Integer.parseInt(ParentPhone));
					
					int status  = st.executeUpdate();
					if (status > 0){

	                JOptionPane.showMessageDialog(null,"Data is saved successfully");
					}
					fitchParent();
					ParentClearTF();
				
				}

				catch(Exception e1){
	                JOptionPane.showMessageDialog(null,e1);
					} 
	            finally {

	                try{
	                    rs.close();
	                    ps.close();

	                }
	                 catch(Exception e11){
	                   JOptionPane.showMessageDialog(null,e11);
	                }
	            }
				
			}
		});
		ParentADD.setBackground(new Color(0, 204, 0));
		panel_18_1_1.add(ParentADD);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("ADD");
		lblNewLabel_6_1_1.setForeground(Color.DARK_GRAY);
		ParentADD.add(lblNewLabel_6_1_1);
		
		JPanel ParentEdite = new JPanel();
		ParentEdite.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ParentEdite.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				String e1 =  ParentStudentIDTF.getText();
		        String e2 =  ParentNameTF.getText();
		        String e3 =  ParentEmailTF.getText();
		        String e4 =  ParentPhoneTF.getText();



		        int p = JOptionPane.showConfirmDialog(null, "Update", "Update", JOptionPane.YES_NO_OPTION);
		        if (p==0){
		            try{
		            String sql = "UPDATE parents  SET studentID =?,parentemail =?,phoneNo=? WHERE parent LIKE ?";
		            ps = con.prepareStatement(sql);
		                ps.setInt(1,Integer.parseInt(e1));
		                ps.setString(2,e3);
		                ps.setInt(3,Integer.parseInt(e4));
		                ps.setString(4,e2);

		                
					int status  = ps.executeUpdate();

					if (status > 0){

			             JOptionPane.showMessageDialog(null,"UPDATE!");
			             fitchParent();
			             ParentClearTF();

					}


		            
		            }catch(Exception ea){
		                 JOptionPane.showMessageDialog(null,ea);
		            }
			}
			}
		});
		ParentEdite.setBackground(new Color(255, 255, 51));
		panel_18_1_1.add(ParentEdite);
		
		JLabel lblNewLabel_7_1_1 = new JLabel("EDIT");
		lblNewLabel_7_1_1.setForeground(Color.DARK_GRAY);
		ParentEdite.add(lblNewLabel_7_1_1);
		
		JPanel ParentDelete = new JPanel();
		ParentDelete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ParentDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
	            String num = ParentNameTF.getText();
	            try{
	            String sql = "DELETE FROM parents WHERE parent LIKE ? ";
	            ps = con.prepareStatement(sql);
	            ps.setString(1, num);
	             ps.execute();
	            
	              JOptionPane.showMessageDialog(null,"DELETED!");
	                fitchParent();
	                ParentClearTF();
			        
	            }catch(Exception e11){
	                JOptionPane.showMessageDialog(null,e11);
	            }
				
			}
		});
		ParentDelete.setBackground(Color.RED);
		panel_18_1_1.add(ParentDelete);
		
		JLabel lblNewLabel_8_1_1 = new JLabel("DELETE");
		lblNewLabel_8_1_1.setForeground(Color.DARK_GRAY);
		ParentDelete.add(lblNewLabel_8_1_1);
		
		JPanel panel_15_1_1 = new JPanel();
		panel_15_1_1.setBackground(Color.WHITE);
		panel_15_1_1.setBorder(new TitledBorder(null, "Search", TitledBorder.LEADING, TitledBorder.TOP, null, Color.LIGHT_GRAY));
		panel_15_1_1.setLayout(null);
		panel_15_1_1.setBounds(28, 228, 527, 52);
		ParentPanel.add(panel_15_1_1);
		
		JPanel panel_17_5_1_1 = new JPanel();
		panel_17_5_1_1.setBackground(Color.WHITE);
		panel_17_5_1_1.setLayout(null);
		panel_17_5_1_1.setBounds(28, 19, 476, 27);
		panel_15_1_1.add(panel_17_5_1_1);
		
		ParentSearchTF = new JTextField();
		ParentSearchTF.setText("");
		ParentSearchTF.setColumns(10);
		ParentSearchTF.setBounds(74, 0, 363, 26);
		panel_17_5_1_1.add(ParentSearchTF);
		
		JLabel ParentSearch = new JLabel("search");
		ParentSearch.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ParentSearch.setForeground(Color.ORANGE);
		ParentSearch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
		        String uup = ParentSearchTF.getText();
		        if(uup.isEmpty()){
		        	fitchParent();
		        }else{
		                try{
		            String sql = "SELECT * FROM parents WHERE "
		                    + "parent LIKE ?";
		            ps = con.prepareStatement(sql);
		            ps.setString(1, uup);
		            rs = ps.executeQuery();
		            ParentTable.setModel(DbUtils.resultSetToTableModel(rs));

		        }catch(Exception e1){
		            JOptionPane.showMessageDialog(null, e1);
		        }
		        finally {

		            try{
		                rs.close();
		                ps.close();
		            }
		            catch(Exception e11){
		                JOptionPane.showMessageDialog(null,e11);
		            }
		        }
		        }
			}
		});
		ParentSearch.setHorizontalAlignment(SwingConstants.CENTER);
		ParentSearch.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		ParentSearch.setBounds(6, 6, 66, 16);
		panel_17_5_1_1.add(ParentSearch);
		
		JPanel panel_16_1_1 = new JPanel();
		panel_16_1_1.setBackground(Color.WHITE);
		panel_16_1_1.setBorder(new TitledBorder(null, "View", TitledBorder.LEADING, TitledBorder.TOP, null, Color.LIGHT_GRAY));
		panel_16_1_1.setLayout(null);
		panel_16_1_1.setBounds(28, 292, 527, 180);
		ParentPanel.add(panel_16_1_1);
		
		ParentTable = new JTable();
		ParentTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
		        DefaultTableModel ttbbll = (DefaultTableModel)ParentTable.getModel();
		        
		        String e11 = ttbbll.getValueAt(ParentTable.getSelectedRow(),0).toString();
		        String e22 = ttbbll.getValueAt(ParentTable.getSelectedRow(),1).toString();
		        String e33 = ttbbll.getValueAt(ParentTable.getSelectedRow(),2).toString();
		        String e44 = ttbbll.getValueAt(ParentTable.getSelectedRow(),3).toString();



		        
		        ParentNameTF.setText(e11);
		        ParentStudentIDTF.setText(e22);
		        ParentEmailTF.setText(e33);
		        ParentPhoneTF.setText(e44);
				
			}
			
		});
		ParentTable.setBounds(6, 16, 515, 158);
		panel_16_1_1.add(ParentTable);
		
		JPanel ClassroomPanel = new JPanel();
		ClassroomPanel.setBackground(Color.WHITE);
		panel_2.add(ClassroomPanel, "name_40109624741753");
		ClassroomPanel.setLayout(null);
		
	    ClassroomInfoPanel = new JPanel();
	    ClassroomInfoPanel.setBackground(Color.WHITE);
		ClassroomInfoPanel.setBorder(new TitledBorder(null, "Information", TitledBorder.LEADING, TitledBorder.TOP, null, Color.LIGHT_GRAY));
		ClassroomInfoPanel.setLayout(null);
		ClassroomInfoPanel.setBounds(25, 18, 527, 134);
		ClassroomPanel.add(ClassroomInfoPanel);
		
		JPanel panel_17_6 = new JPanel();
		panel_17_6.setBackground(Color.WHITE);
		panel_17_6.setLayout(null);
		panel_17_6.setBounds(6, 23, 210, 27);
		ClassroomInfoPanel.add(panel_17_6);
		
		ClassroomIDTF = new JTextField();
		ClassroomIDTF.setText("");
		ClassroomIDTF.setColumns(10);
		ClassroomIDTF.setBounds(74, 0, 130, 26);
		panel_17_6.add(ClassroomIDTF);
		
		JLabel lblNewLabel_5_6 = new JLabel("ID");
		lblNewLabel_5_6.setForeground(Color.DARK_GRAY);
		lblNewLabel_5_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_6.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblNewLabel_5_6.setBounds(6, 6, 66, 16);
		panel_17_6.add(lblNewLabel_5_6);
		
		JPanel panel_17_1_1 = new JPanel();
		panel_17_1_1.setBackground(Color.WHITE);
		panel_17_1_1.setLayout(null);
		panel_17_1_1.setBounds(6, 62, 210, 27);
		ClassroomInfoPanel.add(panel_17_1_1);
		
		ClassroomYearTF = new JTextField();
		ClassroomYearTF.setText("");
		ClassroomYearTF.setColumns(10);
		ClassroomYearTF.setBounds(74, 0, 130, 26);
		panel_17_1_1.add(ClassroomYearTF);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("Year");
		lblNewLabel_5_1_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_5_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblNewLabel_5_1_1.setBounds(6, 6, 66, 16);
		panel_17_1_1.add(lblNewLabel_5_1_1);
		
		JPanel panel_17_2_1 = new JPanel();
		panel_17_2_1.setBackground(Color.WHITE);
		panel_17_2_1.setLayout(null);
		panel_17_2_1.setBounds(6, 101, 210, 27);
		ClassroomInfoPanel.add(panel_17_2_1);
		
		ClassroomGradeTF = new JTextField();
		ClassroomGradeTF.setText("");
		ClassroomGradeTF.setColumns(10);
		ClassroomGradeTF.setBounds(74, 0, 130, 26);
		panel_17_2_1.add(ClassroomGradeTF);
		
		JLabel lblNewLabel_5_2_1 = new JLabel("Grade");
		lblNewLabel_5_2_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_5_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_2_1.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblNewLabel_5_2_1.setBounds(6, 6, 66, 16);
		panel_17_2_1.add(lblNewLabel_5_2_1);
		
	    ClassroomControlPanel = new JPanel();
	    ClassroomControlPanel.setBackground(Color.WHITE);
		ClassroomControlPanel.setBorder(new TitledBorder(null, "Operation", TitledBorder.LEADING, TitledBorder.TOP, null, Color.LIGHT_GRAY));
		ClassroomControlPanel.setLayout(null);
		ClassroomControlPanel.setBounds(25, 164, 527, 51);
		ClassroomPanel.add(ClassroomControlPanel);
		
		JPanel panel_18_1 = new JPanel();
		panel_18_1.setBackground(Color.WHITE);
		panel_18_1.setBounds(24, 19, 497, 26);
		ClassroomControlPanel.add(panel_18_1);
		panel_18_1.setLayout(new GridLayout(0, 3, 25, 10));
		
		JPanel ClassroomADD = new JPanel();
		ClassroomADD.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ClassroomADD.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String ClassroomID = ClassroomIDTF.getText();
				String ClassroomYear = ClassroomYearTF.getText();
				String Classroomgrade = ClassroomGradeTF.getText();




				try
				
				{
					PreparedStatement st = con.prepareStatement("INSERT INTO classroom(classroomID,year,grade) VALUES (?,?,?);");
					st.setString(1, ClassroomID);
					st.setString(2, ClassroomYear);
					st.setInt(3, Integer.parseInt(Classroomgrade));
					
					int status  = st.executeUpdate();
					if (status > 0){

	                JOptionPane.showMessageDialog(null,"Data is saved successfully");
					}
					fitchClassroom();
					ClassroomClearTF();
				
				}

				catch(Exception e1){
	                JOptionPane.showMessageDialog(null,e1);
					} 
	            finally {

	                try{
	                    rs.close();
	                    ps.close();

	                }
	                 catch(Exception e11){
	                   JOptionPane.showMessageDialog(null,e11);
	                }
	            }
				
			}
		});
		ClassroomADD.setBackground(new Color(0, 204, 0));
		panel_18_1.add(ClassroomADD);
		
		JLabel lblNewLabel_6_1 = new JLabel("ADD");
		lblNewLabel_6_1.setForeground(Color.DARK_GRAY);
		ClassroomADD.add(lblNewLabel_6_1);
		
		JPanel ClassroomEdit = new JPanel();
		ClassroomEdit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ClassroomEdit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				
				String e1 =  ClassroomIDTF.getText();
		        String e2 =  ClassroomYearTF.getText();
		        String e3 =  ClassroomGradeTF.getText();


		        int p = JOptionPane.showConfirmDialog(null, "Update", "Update", JOptionPane.YES_NO_OPTION);
		        if (p==0){
		            try{
		            String sql = "UPDATE classroom  SET year =?,grade =? WHERE classroomID LIKE ?";
		            ps = con.prepareStatement(sql);
		                ps.setString(1,e2);
		                ps.setInt(2,Integer.parseInt(e3));
		                ps.setString(3,e1);
		                
					int status  = ps.executeUpdate();

					if (status > 0){

			             JOptionPane.showMessageDialog(null,"UPDATE!");
			             fitchClassroom();
			             ClassroomClearTF();

					}


		            
		            }catch(Exception ea){
		                 JOptionPane.showMessageDialog(null,ea);
		            }
			}
				
			}
		});
		ClassroomEdit.setBackground(new Color(255, 255, 51));
		panel_18_1.add(ClassroomEdit);
		
		JLabel lblNewLabel_7_1 = new JLabel("EDIT");
		lblNewLabel_7_1.setForeground(Color.DARK_GRAY);
		ClassroomEdit.add(lblNewLabel_7_1);
		
		JPanel ClassroomDelete = new JPanel();
		ClassroomDelete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ClassroomDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
	            String num = ClassroomIDTF.getText();
	            try{
	            String sql = "DELETE FROM classroom WHERE classroomID LIKE ? ";
	            ps = con.prepareStatement(sql);
	            ps.setString(1, num);
	             ps.execute();
	            
	              JOptionPane.showMessageDialog(null,"DELETED!");
	                fitchClassroom();
	                ClassroomClearTF();
			        
	            }catch(Exception e11){
	                JOptionPane.showMessageDialog(null,e11);
	            }
			}
		});
		ClassroomDelete.setBackground(Color.RED);
		panel_18_1.add(ClassroomDelete);
		
		JLabel lblNewLabel_8_1 = new JLabel("DELETE");
		lblNewLabel_8_1.setForeground(Color.DARK_GRAY);
		ClassroomDelete.add(lblNewLabel_8_1);
		
		JPanel panel_15_1 = new JPanel();
		panel_15_1.setBackground(Color.WHITE);
		panel_15_1.setBorder(new TitledBorder(null, "Search ", TitledBorder.LEADING, TitledBorder.TOP, null, Color.LIGHT_GRAY));
		panel_15_1.setLayout(null);
		panel_15_1.setBounds(25, 227, 527, 51);
		ClassroomPanel.add(panel_15_1);
		
		JPanel panel_17_5_1 = new JPanel();
		panel_17_5_1.setBackground(Color.WHITE);
		panel_17_5_1.setLayout(null);
		panel_17_5_1.setBounds(29, 18, 476, 27);
		panel_15_1.add(panel_17_5_1);
		
		ClassroomSearchTF = new JTextField();
		ClassroomSearchTF.setText("");
		ClassroomSearchTF.setColumns(10);
		ClassroomSearchTF.setBounds(74, 0, 363, 26);
		panel_17_5_1.add(ClassroomSearchTF);
		
		JLabel ClassroomSearch = new JLabel("search");
		ClassroomSearch.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ClassroomSearch.setBackground(Color.WHITE);
		ClassroomSearch.setForeground(Color.ORANGE);
		ClassroomSearch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		        String uup = ClassroomSearchTF.getText();
		        if(uup.isEmpty()){
		        	fitchClassroom();
		        }else{
		                try{
		            String sql = "SELECT * FROM classroom WHERE "
		                    + "classroomID LIKE ?";
		            ps = con.prepareStatement(sql);
		            ps.setString(1, uup);
		            rs = ps.executeQuery();
		            ClassroomTable.setModel(DbUtils.resultSetToTableModel(rs));
		            ClassroomClearTF();

		        }catch(Exception e1){
		            JOptionPane.showMessageDialog(null, e1);
		        }
		        finally {

		            try{
		                rs.close();
		                ps.close();
		            }
		            catch(Exception e11){
		                JOptionPane.showMessageDialog(null,e11);
		            }
		        }
		        }
				
			}
		});
		ClassroomSearch.setHorizontalAlignment(SwingConstants.CENTER);
		ClassroomSearch.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		ClassroomSearch.setBounds(6, 6, 66, 16);
		panel_17_5_1.add(ClassroomSearch);
		
		JPanel panel_16_1 = new JPanel();
		panel_16_1.setBackground(Color.WHITE);
		panel_16_1.setBorder(new TitledBorder(null, "View", TitledBorder.LEADING, TitledBorder.TOP, null, Color.LIGHT_GRAY));
		panel_16_1.setLayout(null);
		panel_16_1.setBounds(25, 290, 527, 182);
		ClassroomPanel.add(panel_16_1);
		
		ClassroomTable = new JTable();
		ClassroomTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
		        DefaultTableModel ttbbll = (DefaultTableModel)ClassroomTable.getModel();
		        
		        String e11 = ttbbll.getValueAt(ClassroomTable.getSelectedRow(),0).toString();
		        String e22 = ttbbll.getValueAt(ClassroomTable.getSelectedRow(),1).toString();
		        String e33 = ttbbll.getValueAt(ClassroomTable.getSelectedRow(),2).toString();


		        
		        ClassroomIDTF.setText(e11);
		        ClassroomYearTF.setText(e22);
		        ClassroomGradeTF.setText(e33);
				
			}
		});
		ClassroomTable.setBounds(6, 20, 515, 137);
		panel_16_1.add(ClassroomTable);
		
		JPanel TeacherPanel = new JPanel();
		TeacherPanel.setBackground(Color.WHITE);
		panel_2.add(TeacherPanel, "name_40109637399279");
		TeacherPanel.setLayout(null);
		
	    TeacherInfoPanel = new JPanel();
	    TeacherInfoPanel.setBackground(Color.WHITE);
		TeacherInfoPanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Information", TitledBorder.LEADING, TitledBorder.TOP, null, Color.LIGHT_GRAY));
		TeacherInfoPanel.setBounds(20, 5, 527, 134);
		TeacherPanel.add(TeacherInfoPanel);
		TeacherInfoPanel.setLayout(null);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBackground(Color.WHITE);
		panel_17.setBounds(6, 23, 210, 27);
		TeacherInfoPanel.add(panel_17);
		panel_17.setLayout(null);
		
		TeacherIDTF = new JTextField();
		TeacherIDTF.setText("");
		TeacherIDTF.setBounds(74, 0, 130, 26);
		panel_17.add(TeacherIDTF);
		TeacherIDTF.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("ID");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblNewLabel_5.setBounds(6, 6, 66, 16);
		panel_17.add(lblNewLabel_5);
		
		JPanel panel_17_1 = new JPanel();
		panel_17_1.setBackground(Color.WHITE);
		panel_17_1.setLayout(null);
		panel_17_1.setBounds(6, 62, 210, 27);
		TeacherInfoPanel.add(panel_17_1);
		
		TeacherNameTF = new JTextField();
		TeacherNameTF.setText("");
		TeacherNameTF.setColumns(10);
		TeacherNameTF.setBounds(74, 0, 130, 26);
		panel_17_1.add(TeacherNameTF);
		
		JLabel lblNewLabel_5_1 = new JLabel("Name");
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblNewLabel_5_1.setBounds(6, 6, 66, 16);
		panel_17_1.add(lblNewLabel_5_1);
		
		JPanel panel_17_2 = new JPanel();
		panel_17_2.setBackground(Color.WHITE);
		panel_17_2.setLayout(null);
		panel_17_2.setBounds(6, 101, 210, 27);
		TeacherInfoPanel.add(panel_17_2);
		
		TeacherEmailTF = new JTextField();
		TeacherEmailTF.setText("");
		TeacherEmailTF.setColumns(10);
		TeacherEmailTF.setBounds(74, 0, 130, 26);
		panel_17_2.add(TeacherEmailTF);
		
		JLabel lblNewLabel_5_2 = new JLabel("Email");
		lblNewLabel_5_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_2.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblNewLabel_5_2.setBounds(6, 6, 66, 16);
		panel_17_2.add(lblNewLabel_5_2);
		
		JPanel panel_17_3 = new JPanel();
		panel_17_3.setBackground(Color.WHITE);
		panel_17_3.setLayout(null);
		panel_17_3.setBounds(311, 23, 210, 27);
		TeacherInfoPanel.add(panel_17_3);
		
		TeacherPhoneTF = new JTextField();
		TeacherPhoneTF.setText("");
		TeacherPhoneTF.setColumns(10);
		TeacherPhoneTF.setBounds(74, 0, 130, 26);
		panel_17_3.add(TeacherPhoneTF);
		
		JLabel lblNewLabel_5_3 = new JLabel("Phone Num");
		lblNewLabel_5_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_3.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblNewLabel_5_3.setBounds(6, 6, 66, 16);
		panel_17_3.add(lblNewLabel_5_3);
		
		JPanel panel_17_4 = new JPanel();
		panel_17_4.setBackground(Color.WHITE);
		panel_17_4.setLayout(null);
		panel_17_4.setBounds(311, 62, 210, 27);
		TeacherInfoPanel.add(panel_17_4);
		
		TeacherClassIDTF = new JTextField();
		TeacherClassIDTF.setText("");
		TeacherClassIDTF.setColumns(10);
		TeacherClassIDTF.setBounds(74, 0, 130, 26);
		panel_17_4.add(TeacherClassIDTF);
		
		JLabel lblNewLabel_5_4 = new JLabel("Class ID");
		lblNewLabel_5_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_4.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblNewLabel_5_4.setBounds(6, 6, 66, 16);
		panel_17_4.add(lblNewLabel_5_4);
		
	    TeacherControlPanel = new JPanel();
	    TeacherControlPanel.setBackground(Color.WHITE);
		TeacherControlPanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Operations", TitledBorder.LEADING, TitledBorder.TOP, null, Color.LIGHT_GRAY));
		TeacherControlPanel.setBounds(20, 151, 527, 52);
		TeacherPanel.add(TeacherControlPanel);
		TeacherControlPanel.setLayout(null);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBackground(Color.WHITE);
		panel_18.setBounds(24, 17, 497, 26);
		TeacherControlPanel.add(panel_18);
		panel_18.setLayout(new GridLayout(0, 3, 25, 10));
		
		JPanel TeacherADD = new JPanel();
		TeacherADD.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		TeacherADD.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String TeacherID = TeacherIDTF.getText();
				String TeacherName = TeacherNameTF.getText();
				String TeacherEmail = TeacherEmailTF.getText();
				String TeacherPhon = TeacherPhoneTF.getText();
				String TeacherClassID = TeacherClassIDTF.getText();



				try
				
				{
					PreparedStatement st = con.prepareStatement("INSERT INTO teacher(teacherID,name,emailID,phoneNo,classroomID) VALUES (?,?,?,?,?);");
					st.setString(1, TeacherID);
					st.setString(2, TeacherName);
					st.setString(3, TeacherEmail);
					st.setInt(4, Integer.parseInt(TeacherPhon));
					st.setString(5, TeacherClassID);
					
					int status  = st.executeUpdate();
					if (status > 0){

	                JOptionPane.showMessageDialog(null,"Data is saved successfully");
					}
	                fitchTeacher();
	                TeacherClearTF();
					
				
				}

				catch(Exception e1){
	                JOptionPane.showMessageDialog(null,e1);
					} 
	            finally {

	                try{
	                    rs.close();
	                    ps.close();

	                }
	                 catch(Exception e11){
	                   JOptionPane.showMessageDialog(null,e11);
	                }
	            }
				
			}
			
		});
		TeacherADD.setBackground(new Color(0, 204, 0));
		panel_18.add(TeacherADD);
		
		JLabel lblNewLabel_6 = new JLabel("ADD");
		TeacherADD.add(lblNewLabel_6);
		
		JPanel TeacherEdit = new JPanel();
		TeacherEdit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		TeacherEdit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				

				
				String e1 =  TeacherIDTF.getText();
		        String e2 =  TeacherNameTF.getText();
		        String e3 =  TeacherEmailTF.getText();
		        String e4 =  TeacherPhoneTF.getText();        
		        String e5 =  TeacherClassIDTF.getText();

		        int p = JOptionPane.showConfirmDialog(null, "Update", "Update", JOptionPane.YES_NO_OPTION);
		        if (p==0){
		            try{
		            String sql = "UPDATE teacher  SET name =?,emailID =?,phoneNo =? WHERE teacherID LIKE ?";
		            ps = con.prepareStatement(sql);
		                ps.setString(1,e2);
		                ps.setString(2,e3);
		                ps.setInt(3,Integer.parseInt(e4));
		                ps.setString(4,e1);
		                
					int status  = ps.executeUpdate();

					if (status > 0){

			             JOptionPane.showMessageDialog(null,"UPDATE!");
			             fitchTeacher();
			             TeacherClearTF();
					}


		            
		            }catch(Exception ea){
		                 JOptionPane.showMessageDialog(null,ea);
		            }
			}}
		});
		TeacherEdit.setBackground(new Color(255, 255, 51));
		panel_18.add(TeacherEdit);
		
		JLabel lblNewLabel_7 = new JLabel("EDIT");
		TeacherEdit.add(lblNewLabel_7);
		
		JPanel TeacherDelete = new JPanel();
		TeacherDelete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		TeacherDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
	            String num = TeacherIDTF.getText();
	            try{
	            String sql = "DELETE FROM teacher WHERE teacherID LIKE ? ";
	            ps = con.prepareStatement(sql);
	            ps.setString(1, num);
	             ps.execute();
	            
	              JOptionPane.showMessageDialog(null,"DELETED!");
	                fitchTeacher();
	                TeacherClearTF();

	            
	            }catch(Exception e11){
	                JOptionPane.showMessageDialog(null,e11);
	            }
				
			}
		});
		TeacherDelete.setBackground(new Color(255, 0, 0));
		panel_18.add(TeacherDelete);
		
		JLabel lblNewLabel_8 = new JLabel("DELETE");
		TeacherDelete.add(lblNewLabel_8);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBackground(Color.WHITE);
		panel_15.setBorder(new TitledBorder(null, "Search", TitledBorder.LEADING, TitledBorder.TOP, null, Color.LIGHT_GRAY));
		panel_15.setBounds(20, 215, 527, 52);
		TeacherPanel.add(panel_15);
		panel_15.setLayout(null);
		
		JPanel panel_17_5 = new JPanel();
		panel_17_5.setBackground(Color.WHITE);
		panel_17_5.setLayout(null);
		panel_17_5.setBounds(24, 17, 476, 27);
		panel_15.add(panel_17_5);
		
		TeacherSearchTF = new JTextField();
		TeacherSearchTF.setText("");
		TeacherSearchTF.setColumns(10);
		TeacherSearchTF.setBounds(74, 0, 363, 26);
		panel_17_5.add(TeacherSearchTF);
		
		JLabel TeacherSearchLBL = new JLabel("search");
		TeacherSearchLBL.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		TeacherSearchLBL.setForeground(Color.ORANGE);
		TeacherSearchLBL.setBackground(Color.ORANGE);
		TeacherSearchLBL.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		        String uup = TeacherSearchTF.getText();
		        if(uup.isEmpty()){
		        	fitchTeacher();
		        }else{
		                try{
		            String sql = "SELECT * FROM teacher WHERE "
		                    + "teacherID LIKE ?";
		            ps = con.prepareStatement(sql);
		            ps.setString(1, uup);
		            rs = ps.executeQuery();
		            TeacherTable.setModel(DbUtils.resultSetToTableModel(rs));

		        }catch(Exception e1){
		            JOptionPane.showMessageDialog(null, e1);
		        }
		        finally {

		            try{
		                rs.close();
		                ps.close();
		            }
		            catch(Exception e11){
		                JOptionPane.showMessageDialog(null,e11);
		            }
		        }
		        }
				
			}
		});
		TeacherSearchLBL.setHorizontalAlignment(SwingConstants.CENTER);
		TeacherSearchLBL.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		TeacherSearchLBL.setBounds(6, 6, 66, 16);
		panel_17_5.add(TeacherSearchLBL);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBackground(Color.WHITE);
		panel_16.setBorder(new TitledBorder(null, "View", TitledBorder.LEADING, TitledBorder.TOP, null, Color.LIGHT_GRAY));
		panel_16.setBounds(20, 279, 527, 180);
		TeacherPanel.add(panel_16);
		panel_16.setLayout(null);
		
		TeacherTable = new JTable();
		TeacherTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		        DefaultTableModel ttbbll = (DefaultTableModel)TeacherTable.getModel();
		        
		        String e11 = ttbbll.getValueAt(TeacherTable.getSelectedRow(),0).toString();
		        String e22 = ttbbll.getValueAt(TeacherTable.getSelectedRow(),1).toString();
		        String e33 = ttbbll.getValueAt(TeacherTable.getSelectedRow(),2).toString();
		        String e44 = ttbbll.getValueAt(TeacherTable.getSelectedRow(),3).toString();
		        String e55 = ttbbll.getValueAt(TeacherTable.getSelectedRow(),4).toString();
		        
				
				 TeacherIDTF.setText(e11);
		         TeacherNameTF.setText(e22);
		         TeacherEmailTF.setText(e33);
		         TeacherPhoneTF.setText(e44);        
		         TeacherClassIDTF.setText(e55);
		         
		        
			}
		});
		TeacherTable.setBounds(6, 21, 515, 144);
		panel_16.add(TeacherTable);
		
		JPanel StudentPanel = new JPanel();
		StudentPanel.setBackground(Color.WHITE);
		panel_2.add(StudentPanel, "name_40070028217254");
		StudentPanel.setLayout(null);
		
	    StudentInfoPanel = new JPanel();
	    StudentInfoPanel.setBackground(Color.WHITE);
		StudentInfoPanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Information", TitledBorder.LEADING, TitledBorder.TOP, null, Color.LIGHT_GRAY));
		StudentInfoPanel.setLayout(null);
		StudentInfoPanel.setBounds(32, 6, 527, 134);
		StudentPanel.add(StudentInfoPanel);
		
		JPanel panel_17_6_2 = new JPanel();
		panel_17_6_2.setBackground(Color.WHITE);
		panel_17_6_2.setLayout(null);
		panel_17_6_2.setBounds(6, 18, 210, 27);
		StudentInfoPanel.add(panel_17_6_2);
		
		StudentIDTF = new JTextField();
		StudentIDTF.setText("");
		StudentIDTF.setColumns(10);
		StudentIDTF.setBounds(74, 0, 130, 26);
		panel_17_6_2.add(StudentIDTF);
		
		JLabel lblNewLabel_5_6_2 = new JLabel("ID");
		lblNewLabel_5_6_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_6_2.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblNewLabel_5_6_2.setBounds(6, 6, 66, 16);
		panel_17_6_2.add(lblNewLabel_5_6_2);
		
		JPanel panel_17_1_1_2 = new JPanel();
		panel_17_1_1_2.setBackground(Color.WHITE);
		panel_17_1_1_2.setLayout(null);
		panel_17_1_1_2.setBounds(6, 57, 210, 27);
		StudentInfoPanel.add(panel_17_1_1_2);
		
		StudentNameTF = new JTextField();
		StudentNameTF.setText("");
		StudentNameTF.setColumns(10);
		StudentNameTF.setBounds(74, 0, 130, 26);
		panel_17_1_1_2.add(StudentNameTF);
		
		JLabel lblNewLabel_5_1_1_2 = new JLabel("Name");
		lblNewLabel_5_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1_1_2.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblNewLabel_5_1_1_2.setBounds(6, 6, 66, 16);
		panel_17_1_1_2.add(lblNewLabel_5_1_1_2);
		
		JPanel panel_17_2_1_2 = new JPanel();
		panel_17_2_1_2.setBackground(Color.WHITE);
		panel_17_2_1_2.setLayout(null);
		panel_17_2_1_2.setBounds(6, 101, 210, 27);
		StudentInfoPanel.add(panel_17_2_1_2);
		
		StudentEmailTF = new JTextField();
		StudentEmailTF.setText("");
		StudentEmailTF.setColumns(10);
		StudentEmailTF.setBounds(74, 0, 130, 26);
		panel_17_2_1_2.add(StudentEmailTF);
		
		JLabel lblNewLabel_5_2_1_2 = new JLabel("Email");
		lblNewLabel_5_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_2_1_2.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblNewLabel_5_2_1_2.setBounds(6, 6, 66, 16);
		panel_17_2_1_2.add(lblNewLabel_5_2_1_2);
		
		JPanel panel_17_3_1_2 = new JPanel();
		panel_17_3_1_2.setBackground(Color.WHITE);
		panel_17_3_1_2.setLayout(null);
		panel_17_3_1_2.setBounds(311, 18, 210, 27);
		StudentInfoPanel.add(panel_17_3_1_2);
		
		StudentDOBTF = new JTextField();
		StudentDOBTF.setText("");
		StudentDOBTF.setColumns(10);
		StudentDOBTF.setBounds(74, 0, 130, 26);
		panel_17_3_1_2.add(StudentDOBTF);
		
		JLabel lblNewLabel_5_3_1_2 = new JLabel("DOB");
		lblNewLabel_5_3_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_3_1_2.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblNewLabel_5_3_1_2.setBounds(6, 6, 66, 16);
		panel_17_3_1_2.add(lblNewLabel_5_3_1_2);
		
		JPanel panel_17_4_1_2 = new JPanel();
		panel_17_4_1_2.setBackground(Color.WHITE);
		panel_17_4_1_2.setLayout(null);
		panel_17_4_1_2.setBounds(311, 57, 210, 27);
		StudentInfoPanel.add(panel_17_4_1_2);
		
		StudentClassIDTF = new JTextField();
		StudentClassIDTF.setText("");
		StudentClassIDTF.setColumns(10);
		StudentClassIDTF.setBounds(74, 0, 130, 26);
		panel_17_4_1_2.add(StudentClassIDTF);
		
		JLabel lblNewLabel_5_4_1_2 = new JLabel("Class ID");
		lblNewLabel_5_4_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_4_1_2.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblNewLabel_5_4_1_2.setBounds(6, 6, 66, 16);
		panel_17_4_1_2.add(lblNewLabel_5_4_1_2);
		
	    StudentControlPanel = new JPanel();
	    StudentControlPanel.setBackground(Color.WHITE);
		StudentControlPanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Operations", TitledBorder.LEADING, TitledBorder.TOP, null, Color.LIGHT_GRAY));
		StudentControlPanel.setLayout(null);
		StudentControlPanel.setBounds(32, 152, 527, 55);
		StudentPanel.add(StudentControlPanel);
		
		JPanel panel_18_1_2 = new JPanel();
		panel_18_1_2.setBackground(Color.WHITE);
		panel_18_1_2.setBounds(25, 23, 496, 26);
		StudentControlPanel.add(panel_18_1_2);
		panel_18_1_2.setLayout(new GridLayout(0, 3, 25, 10));
		
		
		JPanel StudentADD = new JPanel();
		StudentADD.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		StudentADD.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int studentID = Integer.parseInt(StudentIDTF.getText());
				String studentName = StudentNameTF.getText();
				String studentEmail = StudentEmailTF.getText();
				String studentDOB = StudentDOBTF.getText();
				String studentClassID = StudentClassIDTF.getText();



				try
				
				{
					PreparedStatement st = con.prepareStatement("INSERT INTO students VALUES (?,?,?,?,?);");
					st.setInt(1, studentID);
					st.setString(2, studentName);
					st.setString(3, studentEmail);
					st.setString(4, studentDOB);
					st.setString(5, studentClassID);
					
					int status  = st.executeUpdate();
					if (status > 0){

	                JOptionPane.showMessageDialog(null,"Data is saved successfully");
					}
	                fitchStudent();
	                StudentClearTF();

				}

				catch(Exception e1){
	                JOptionPane.showMessageDialog(null,e1);
					} 
	            finally {

	                try{
	                    rs.close();
	                    ps.close();

	                }
	                 catch(Exception e11){
	                   JOptionPane.showMessageDialog(null,e11);
	                }
	            }
			}
		});
		StudentADD.setBackground(new Color(0, 204, 0));
		panel_18_1_2.add(StudentADD);
		
		JLabel lblNewLabel_6_1_2 = new JLabel("ADD");
		StudentADD.add(lblNewLabel_6_1_2);
		
		JPanel StudentEdit = new JPanel();
		StudentEdit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		StudentEdit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		 
				
				String e1 =  StudentIDTF.getText();
		        String e2 =  StudentNameTF.getText();
		        String e3 =  StudentEmailTF.getText();
		        String e4 =  StudentDOBTF.getText();        
		        String e5 =  StudentClassIDTF.getText();

		        int p = JOptionPane.showConfirmDialog(null, "Update", "Update", JOptionPane.YES_NO_OPTION);
		        if (p==0){
		            try{
		            String sql = "UPDATE students  SET name =?,emailID = ?,DOB =?,classroomID =? WHERE studentID LIKE ?";
		            ps = con.prepareStatement(sql);
		                ps.setString(1,e2);
		                ps.setString(2,e3);
		                ps.setString(3,e4);
		                ps.setString(4,e5);
		                ps.setString(5,e1);
		                
//		            ps.execute();
					int status  = ps.executeUpdate();
					if (status > 0){

			             JOptionPane.showMessageDialog(null,"UPDATE!");
			             fitchStudent();
			             StudentClearTF();
					}


		            
		            }catch(Exception ea){
		                 JOptionPane.showMessageDialog(null,ea);
		            }
			}}
		});
		StudentEdit.setBackground(new Color(255, 255, 51));
		panel_18_1_2.add(StudentEdit);
		
		JLabel lblNewLabel_7_1_2 = new JLabel("EDIT");
		StudentEdit.add(lblNewLabel_7_1_2);
		
		JPanel StudentDelete = new JPanel();
		StudentDelete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		StudentDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
	            String num = StudentIDTF.getText();
	            try{
	            String sql = "DELETE FROM students WHERE studentID LIKE ? ";
	            ps = con.prepareStatement(sql);
	            ps.setString(1, num);
	             ps.execute();
	            
	              JOptionPane.showMessageDialog(null,"DELETED!");
	              fitchStudent();
	              StudentClearTF();

	            
	            }catch(Exception e11){
	                JOptionPane.showMessageDialog(null,e11);
	            }
			}
		});
		StudentDelete.setBackground(Color.RED);
		panel_18_1_2.add(StudentDelete);
		
		JLabel lblNewLabel_8_1_2 = new JLabel("DELETE");
		StudentDelete.add(lblNewLabel_8_1_2);
		
		JPanel panel_15_1_2 = new JPanel();
		panel_15_1_2.setBackground(Color.WHITE);
		panel_15_1_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Search", TitledBorder.LEADING, TitledBorder.TOP, null, Color.LIGHT_GRAY));
		panel_15_1_2.setLayout(null);
		panel_15_1_2.setBounds(32, 219, 527, 46);
		StudentPanel.add(panel_15_1_2);
		
		JPanel panel_17_5_1_2 = new JPanel();
		panel_17_5_1_2.setBackground(Color.WHITE);
		panel_17_5_1_2.setLayout(null);
		panel_17_5_1_2.setBounds(24, 16, 476, 24);
		panel_15_1_2.add(panel_17_5_1_2);
		
		StudentSearchTF = new JTextField();
		StudentSearchTF.setText("");
		StudentSearchTF.setColumns(10);
		StudentSearchTF.setBounds(74, 0, 363, 26);
		panel_17_5_1_2.add(StudentSearchTF);
		
		JLabel lblNewLabel_5_5_1_2 = new JLabel("search");
		lblNewLabel_5_5_1_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_5_5_1_2.setForeground(Color.ORANGE);
		lblNewLabel_5_5_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		        String uup = StudentSearchTF.getText();
		        if(uup.isEmpty()){
		        	fitchStudent();
		        }else{
		                try{
		            String sql = "SELECT * FROM students WHERE "
		                    + "studentID LIKE ?";
		            ps = con.prepareStatement(sql);
		            ps.setString(1, uup);
		            rs = ps.executeQuery();
		            StudentTable.setModel(DbUtils.resultSetToTableModel(rs));

		        }catch(Exception e1){
		            JOptionPane.showMessageDialog(null, e1);
		        }
		        finally {

		            try{
		                rs.close();
		                ps.close();
		            }
		            catch(Exception e11){
		                JOptionPane.showMessageDialog(null,e11);
		            }
		        }
		        }
			}
		});
		lblNewLabel_5_5_1_2.setBackground(Color.ORANGE);
		lblNewLabel_5_5_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_5_1_2.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblNewLabel_5_5_1_2.setBounds(6, 6, 66, 16);
		panel_17_5_1_2.add(lblNewLabel_5_5_1_2);
		
		JPanel panel_16_1_2 = new JPanel();
		panel_16_1_2.setBackground(Color.WHITE);
		panel_16_1_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "View", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(192, 192, 192)));
		panel_16_1_2.setLayout(null);
		panel_16_1_2.setBounds(32, 277, 527, 183);
		StudentPanel.add(panel_16_1_2);
		
		StudentTable = new JTable();
		StudentTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		        DefaultTableModel ttbbll = (DefaultTableModel)StudentTable.getModel();
		        
		        String e11 = ttbbll.getValueAt(StudentTable.getSelectedRow(),0).toString();
		        String e22 = ttbbll.getValueAt(StudentTable.getSelectedRow(),1).toString();
		        String e33 = ttbbll.getValueAt(StudentTable.getSelectedRow(),2).toString();
		        String e44 = ttbbll.getValueAt(StudentTable.getSelectedRow(),3).toString();
		        String e55 = ttbbll.getValueAt(StudentTable.getSelectedRow(),4).toString();

		        
		        StudentIDTF.setText(e11);
		        StudentNameTF.setText(e22);
		        StudentEmailTF.setText(e33);
		        StudentDOBTF.setText(e44);
		        StudentClassIDTF.setText(e55);
			}
		});
		StudentTable.setBounds(6, 22, 515, 155);
		panel_16_1_2.add(StudentTable);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 175, 478);
		HOME.add(panel_1);

				panel_1.setBackground(new Color(204, 204, 102));
				panel_1.setLayout(new GridLayout(6, 0, 20, 20));
				
				JPanel TeacherP = new JPanel();
				TeacherP.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
				TeacherP.setBackground(new Color(204, 204, 102));
				TeacherP.setBorder(new LineBorder(Color.WHITE));
				panel_1.add(TeacherP);
				TeacherP.setLayout(new BorderLayout(0, 0));
				
				JLabel lblNewLabel = new JLabel("Teacher");
				lblNewLabel.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						TeacherPanel.setVisible(true);
						ClassroomPanel.setVisible(false);
						StudentPanel.setVisible(false);
						ParentPanel.setVisible(false);
						UserPanel.setVisible(false);
						HomeScreen.setVisible(false);
						fitchTeacher();
						TeacherClearTF();

						
					}
					@Override
					public void mouseEntered(MouseEvent e) {
						TeacherP.setBackground(new Color(204, 204, 153));


					}
					@Override
					public void mouseExited(MouseEvent e) {
						TeacherP.setBackground(new Color(204, 204, 102));
					}
				});
				lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
				lblNewLabel.setForeground(Color.WHITE);
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				TeacherP.add(lblNewLabel);
				
				JPanel StudentP = new JPanel();
				StudentP.setForeground(Color.WHITE);
				StudentP.setBackground(new Color(204, 204, 102));
				StudentP.setBorder(new LineBorder(Color.WHITE));
				panel_1.add(StudentP);
				StudentP.setLayout(new BorderLayout(0, 0));
				
				JLabel lblNewLabel_1 = new JLabel("Student");
				lblNewLabel_1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						TeacherPanel.setVisible(false);
						ClassroomPanel.setVisible(false);
						StudentPanel.setVisible(true);
						ParentPanel.setVisible(false);
						UserPanel.setVisible(false);
						HomeScreen.setVisible(false);
		                fitchStudent();
		                StudentClearTF();

					}
					@Override
					public void mouseEntered(MouseEvent e) {
						StudentP.setBackground(new Color(204, 204, 153));


					}
					@Override
					public void mouseExited(MouseEvent e) {
						StudentP.setBackground(new Color(204, 204, 102));
					}
				});
				lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
				lblNewLabel_1.setForeground(Color.WHITE);
				lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
				StudentP.add(lblNewLabel_1);
				
				JPanel ClassroomP = new JPanel();
				ClassroomP.setBackground(new Color(204, 204, 102));
				ClassroomP.setBorder(new LineBorder(Color.WHITE));
				panel_1.add(ClassroomP);
				ClassroomP.setLayout(new BorderLayout(0, 0));
				
				JLabel lblNewLabel_2 = new JLabel("Classroom");
				lblNewLabel_2.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						TeacherPanel.setVisible(false);
						ClassroomPanel.setVisible(true);
						StudentPanel.setVisible(false);
						ParentPanel.setVisible(false);
						UserPanel.setVisible(false);
						HomeScreen.setVisible(false);
						fitchClassroom();
						ClassroomClearTF();
					}
					@Override
					public void mouseEntered(MouseEvent e) {
						ClassroomP.setBackground(new Color(204, 204, 153));


					}
					@Override
					public void mouseExited(MouseEvent e) {
						ClassroomP.setBackground(new Color(204, 204, 102));
					}
				});
				lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
				lblNewLabel_2.setForeground(Color.WHITE);
				lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
				ClassroomP.add(lblNewLabel_2);
				
				JPanel ParentP = new JPanel();
				ParentP.setBackground(new Color(204, 204, 102));
				ParentP.setBorder(new LineBorder(Color.WHITE));
				panel_1.add(ParentP);
				ParentP.setLayout(new BorderLayout(0, 0));
				
				JLabel lblNewLabel_3 = new JLabel("Parent");
				lblNewLabel_3.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						TeacherPanel.setVisible(false);
						ClassroomPanel.setVisible(false);
						StudentPanel.setVisible(false);
						ParentPanel.setVisible(true);
						UserPanel.setVisible(false);
						HomeScreen.setVisible(false);
						fitchParent();
						ParentClearTF();
					}
					@Override
					public void mouseEntered(MouseEvent e) {
						ParentP.setBackground(new Color(204, 204, 153));
					}
					@Override
					public void mouseExited(MouseEvent e) {
						ParentP.setBackground(new Color(204, 204, 102));
					}
				});
				lblNewLabel_3.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
				lblNewLabel_3.setForeground(Color.WHITE);
				lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
				ParentP.add(lblNewLabel_3);
				
			    UserP = new JPanel();
				UserP.setBackground(new Color(204, 204, 102));
				UserP.setBorder(new LineBorder(Color.WHITE));
				panel_1.add(UserP);
				UserP.setLayout(new BorderLayout(0, 0));
				
				JLabel lblNewLabel_4 = new JLabel("User");
				lblNewLabel_4.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						TeacherPanel.setVisible(false);
						ClassroomPanel.setVisible(false);
						StudentPanel.setVisible(false);
						ParentPanel.setVisible(false);
						HomeScreen.setVisible(false);
						UserPanel.setVisible(true);
						fitchUser();
					}
					@Override
					public void mouseEntered(MouseEvent e) {
						UserP.setBackground(new Color(204, 204, 153));


					}
					@Override
					public void mouseExited(MouseEvent e) {
						UserP.setBackground(new Color(204, 204, 102));
						
					}
				});
				lblNewLabel_4.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
				lblNewLabel_4.setForeground(Color.WHITE);
				lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
				UserP.add(lblNewLabel_4);
				
				JPanel LogOutPanel = new JPanel();
				LogOutPanel.setBorder(new LineBorder(Color.WHITE));
				LogOutPanel.setBackground(new Color(204, 204, 102));
				panel_1.add(LogOutPanel);
				LogOutPanel.setLayout(new BorderLayout(0, 0));
				
				JLabel lblNewLabel_11 = new JLabel("LogOut");
				lblNewLabel_11.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
				        frame.dispose();
				        login.msFrameVisible();
;
				        
					}
				});
				lblNewLabel_11.setForeground(new Color(204, 0, 51));
				lblNewLabel_11.setHorizontalTextPosition(SwingConstants.CENTER);
				lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
				LogOutPanel.add(lblNewLabel_11);
	}
	

   public void access(Boolean bool){ 
    	UserP.setVisible(bool);
    	TeacherControlPanel.setVisible(bool);
    	StudentControlPanel.setVisible(bool);
    	ParentControlPanel.setVisible(bool);
    	ClassroomControlPanel.setVisible(bool);
        ParentInfoPanel.setVisible(bool);
        ClassroomInfoPanel.setVisible(bool);
        TeacherInfoPanel.setVisible(bool);
        StudentInfoPanel.setVisible(bool);
    	
   }
   public void msFrameVisible(){ 
   	frame.setVisible(true);
  }
	 private void ParentClearTF() {
	        ParentStudentIDTF.setText("");
	        ParentNameTF.setText("");
	        ParentEmailTF.setText("");
	        ParentPhoneTF.setText("");
	        ParentStudentIDTF.setText("");
		}

	 private void StudentClearTF() {
        StudentIDTF.setText("");
        StudentNameTF.setText("");
        StudentEmailTF.setText("");
        StudentDOBTF.setText("");
        StudentClassIDTF.setText("");
	}
	 private void TeacherClearTF(){
        TeacherIDTF.setText("");
        TeacherNameTF.setText("");
        TeacherEmailTF.setText("");
        TeacherPhoneTF.setText("");
        TeacherClassIDTF.setText("");
	}
	 private void ClassroomClearTF() {
        ClassroomIDTF.setText("");
        ClassroomYearTF.setText("");
        ClassroomGradeTF.setText("");
	}
	 private void UserClearTF() {
	        UserNameTF.setText("");
	        UserEmailTF.setText("");
	        UserPasswordTF.setText("");

		}
	 private void fitchStudent() {
		 
	       try{
	           String sql = "SELECT * FROM students";
	           ps = con.prepareStatement(sql);
	           rs = ps.executeQuery();
	           StudentTable.setModel(DbUtils.resultSetToTableModel(rs));
	           
	       }catch(Exception e){
	           JOptionPane.showMessageDialog(null, e);
	       }
	        finally {

	                try{
	                    
	                    rs.close();
	                    ps.close();
	                }
	                 catch(Exception e){
	                   JOptionPane.showMessageDialog(null,e);
	                }
	            }
	    }
	 private void fitchTeacher() {
		 
	       try{
	           String sql = "SELECT * FROM teacher";
	           ps = con.prepareStatement(sql);
	           rs = ps.executeQuery();
	           TeacherTable.setModel(DbUtils.resultSetToTableModel(rs));
	           
	       }catch(Exception e){
	           JOptionPane.showMessageDialog(null, e);
	       }
	        finally {

	                try{
	                    
	                    rs.close();
	                    ps.close();
	                }
	                 catch(Exception e){
	                   JOptionPane.showMessageDialog(null,e);
	                }
	            }
	    }
	 private void fitchClassroom() {
		 
	       try{
	           String sql = "SELECT * FROM classroom";
	           ps = con.prepareStatement(sql);
	           rs = ps.executeQuery();
	           ClassroomTable.setModel(DbUtils.resultSetToTableModel(rs));
	           
	       }catch(Exception e){
	           JOptionPane.showMessageDialog(null, e);
	       }
	        finally {

	                try{
	                    
	                    rs.close();
	                    ps.close();
	                }
	                 catch(Exception e){
	                   JOptionPane.showMessageDialog(null,e);
	                }
	            }
	    }
	 private void fitchParent() {
		 
	       try{
	           String sql = "SELECT * FROM parents";
	           ps = con.prepareStatement(sql);
	           rs = ps.executeQuery();
	           ParentTable.setModel(DbUtils.resultSetToTableModel(rs));
	           
	       }catch(Exception e){
	           JOptionPane.showMessageDialog(null, e);
	       }
	        finally {

	                try{
	                    
	                    rs.close();
	                    ps.close();
	                }
	                 catch(Exception e){
	                   JOptionPane.showMessageDialog(null,e);
	                }
	            }
	    }
	 private void fitchUser(){
		 
	       try{
	           String sql = "SELECT * FROM user";
	           ps = con.prepareStatement(sql);
	           rs = ps.executeQuery();
	           UserTable.setModel(DbUtils.resultSetToTableModel(rs));
	           
	       }catch(Exception e){
	           JOptionPane.showMessageDialog(null, e);
	       }
	        finally {

	                try{
	                    
	                    rs.close();
	                    ps.close();
	                }
	                 catch(Exception e){
	                   JOptionPane.showMessageDialog(null,e);
	                }
	            }
	    }

}

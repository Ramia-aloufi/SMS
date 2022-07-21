package TheElite;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.SwingConstants;

public class Login extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private JTextField LoginEmailTF;
	private JTextField LoginPasswordTF;
	
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement ps = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {

        con = connection.MyConnection();

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 475, 388);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 102));
		panel.setBounds(0, 0, 149, 366);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(Login.class.getResource("/Img/aa11.png")));
		lblNewLabel_1.setBounds(6, 232, 131, 78);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("SMS");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(6, 57, 131, 16);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("The Elite Team");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(6, 85, 131, 16);
		panel.add(lblNewLabel_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(null);
		panel_1.setBounds(208, 104, 205, 36);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Email     ");
		panel_1.add(lblNewLabel);
		
		LoginEmailTF = new JTextField();
		panel_1.add(LoginEmailTF);
		LoginEmailTF.setColumns(10);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBorder(null);
		panel_1_1.setBounds(208, 152, 205, 36);
		frame.getContentPane().add(panel_1_1);
		
		JLabel lblPassword = new JLabel("Password");
		panel_1_1.add(lblPassword);
		
		LoginPasswordTF = new JTextField();
		LoginPasswordTF.setColumns(10);
		panel_1_1.add(LoginPasswordTF);
		
		JButton LoginBTN = new JButton("Log In");

		LoginBTN.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
		        String un = LoginEmailTF.getText();
		        String pss = LoginPasswordTF.getText();
		        if(un.equalsIgnoreCase("")){
		            JOptionPane.showMessageDialog(null, "Email Feild Empty");
		        }else if(pss.isEmpty()){
		            JOptionPane.showMessageDialog(null, "Password Feild Empty");
		        }else{
		            try{
		                String sql = "SELECT * FROM user WHERE email=? AND password=?";
		                ps = con.prepareStatement(sql);
		                ps.setString(1, un);
		                ps.setString(2, pss);
		                rs = ps.executeQuery();

		                if(rs.next()){
		                    JOptionPane.showMessageDialog(null,"Login Succeessful");
		                    String permission = rs.getString("Permission");
		                    frame.setVisible(false);
		                    MS ms = new MS();
		                    ms.msFrameVisible();		        
		                    dispose();
		                    System.out.println("login Off");
		                     System.out.println(permission);
		                    String user = "user";
		                    if(permission.equals(user)){
		                        ms.access(false);
		                    }else{
		                         ms.access(true);
		                    }
		                    
		                }else{
		                    JOptionPane.showMessageDialog(null,"Login Failed");
		                    LoginEmailTF.setText("");
		                    LoginPasswordTF.setText("");
		                }
		            }catch(SQLException e1){
		                    JOptionPane.showMessageDialog(null, e1);
		            }
		            finally {
		                try{
		                    rs.close();
		                    ps.close();
		                    frame.dispose();


		                }
		                catch(Exception e11){
		                    JOptionPane.showMessageDialog(null,e11);
		                }
		            }
		        } 
			}
		});
		LoginBTN.setBounds(258, 236, 117, 29);
		frame.getContentPane().add(LoginBTN);
	}
	   public void msFrameVisible(){ 
		   	frame.setVisible(true);
		  }
}

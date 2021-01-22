import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class GUI {

	private JFrame frmEivemployeeInformation;
	private JTextField usernameTextField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frmEivemployeeInformation.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEivemployeeInformation = new JFrame();
		frmEivemployeeInformation.setTitle("EIV (Employee Information Viewer)");
		frmEivemployeeInformation.setBounds(100, 100, 450, 300);
		frmEivemployeeInformation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEivemployeeInformation.getContentPane().setLayout(null);
		
		
		
		JLabel usernameLabel = new JLabel("Name:");
		usernameLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		usernameLabel.setBounds(38, 188, 89, 23);
		frmEivemployeeInformation.getContentPane().add(usernameLabel);
		
		JLabel pwLabel = new JLabel("Password:");
		pwLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		pwLabel.setBounds(38, 222, 89, 23);
		frmEivemployeeInformation.getContentPane().add(pwLabel);
		
		usernameTextField = new JTextField();
		usernameTextField.setBounds(137, 191, 108, 20);
		frmEivemployeeInformation.getContentPane().add(usernameTextField);
		usernameTextField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(137, 225, 108, 20);
		frmEivemployeeInformation.getContentPane().add(passwordField);
		
		JLabel imgLabel = new JLabel("");
		imgLabel.setIcon(new ImageIcon("Images\\imgFile.jpg"));
		imgLabel.setHorizontalAlignment(SwingConstants.CENTER);
		imgLabel.setBounds(0, 0, 434, 113);
		frmEivemployeeInformation.getContentPane().add(imgLabel);
		
		JLabel loginLabel = new JLabel("Welcome to EIV, please enter your login information:");
		loginLabel.setFont(new Font("Arial", Font.BOLD, 14));
		loginLabel.setHorizontalAlignment(SwingConstants.CENTER);
		loginLabel.setBounds(10, 124, 414, 33);
		frmEivemployeeInformation.getContentPane().add(loginLabel);
		
		JButton loginButton = new JButton("Login");
		loginButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
					AppGUI a = new AppGUI();
					a.setVisibility(true);
					frmEivemployeeInformation.dispose();
					
			}
		});
		loginButton.setBounds(305, 217, 119, 33);
		frmEivemployeeInformation.getContentPane().add(loginButton);
	}
}

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;
import java.awt.ComponentOrientation;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JComboBox;


public class AppGUI {

	private JFrame frmEivemployeeInformation;
	private JTextField EmployeeIDtxt;
	private JTextField ageTextField;
	private JTextField titleTextField;
	private JTextField salaryTextField;
	private JTextField statusTextField;
	private JTextField supTextField;
	private JTextField deptTextField;
	private JTextField hireDateTextField;
	StringBuilder str = new StringBuilder();
	StringBuilder str2 = new StringBuilder(); 
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppGUI window = new AppGUI();
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
	public AppGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEivemployeeInformation = new JFrame();
		frmEivemployeeInformation.setResizable(false);
		frmEivemployeeInformation.setTitle("EIV (Employee Information Viewer)");
		frmEivemployeeInformation.setBounds(100, 100, 402, 478);
		frmEivemployeeInformation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEivemployeeInformation.getContentPane().setLayout(null);
		
		
		
		JLabel EmployeeIDLabel = new JLabel("EmployeeID:");
		EmployeeIDLabel.setBounds(10, 11, 84, 24);
		frmEivemployeeInformation.getContentPane().add(EmployeeIDLabel);
		
		
		
		JLabel firstNameLabel = new JLabel("First Name:");
		firstNameLabel.setBounds(10, 67, 84, 24);
		frmEivemployeeInformation.getContentPane().add(firstNameLabel);
		
		JLabel lastNameLabel = new JLabel("Last Name:");
		lastNameLabel.setBounds(99, 67, 84, 24);
		frmEivemployeeInformation.getContentPane().add(lastNameLabel);
		
		JLabel phoneLabel = new JLabel("Phone #:");
		phoneLabel.setBounds(206, 123, 84, 24);
		frmEivemployeeInformation.getContentPane().add(phoneLabel);
		
		JLabel ageLabel = new JLabel("Age");
		ageLabel.setBounds(206, 67, 84, 24);
		frmEivemployeeInformation.getContentPane().add(ageLabel);
		
		JLabel titleLabel = new JLabel("Title:");
		titleLabel.setBounds(10, 123, 84, 24);
		frmEivemployeeInformation.getContentPane().add(titleLabel);
		
		JLabel salaryLabel = new JLabel("Salary:");
		salaryLabel.setBounds(10, 179, 84, 24);
		frmEivemployeeInformation.getContentPane().add(salaryLabel);
		
		JLabel statusLabel = new JLabel("Status:");
		statusLabel.setBounds(206, 179, 84, 24);
		frmEivemployeeInformation.getContentPane().add(statusLabel);
		
		JLabel supLabel = new JLabel("Supervisor:");
		supLabel.setBounds(10, 235, 84, 24);
		frmEivemployeeInformation.getContentPane().add(supLabel);
		
		JLabel deptLabel = new JLabel("Department");
		deptLabel.setBounds(206, 235, 84, 24);
		frmEivemployeeInformation.getContentPane().add(deptLabel);
		
		JLabel hireDateLabel = new JLabel("Hiring Date:");
		hireDateLabel.setBounds(10, 291, 84, 24);
		frmEivemployeeInformation.getContentPane().add(hireDateLabel);
		
		EmployeeIDtxt = new JTextField();
		EmployeeIDtxt.setFont(new Font("Calibri", Font.PLAIN, 13));
		EmployeeIDtxt.setBounds(10, 36, 110, 20);
		frmEivemployeeInformation.getContentPane().add(EmployeeIDtxt);
		EmployeeIDtxt.setColumns(10);
		
		
		MaskFormatter maskName = null;
		try {
			maskName = new MaskFormatter("U*********");
		} catch (ParseException pe) {
			pe.printStackTrace();
		}
		
		
		
		JFormattedTextField firstNameTextField = new JFormattedTextField(maskName);
		firstNameTextField.setHorizontalAlignment(SwingConstants.LEFT);
		firstNameTextField.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		firstNameTextField.setFont(new Font("Calibri", Font.PLAIN, 13));
		firstNameTextField.setColumns(10);
		firstNameTextField.setBounds(10, 88, 84, 24);
		frmEivemployeeInformation.getContentPane().add(firstNameTextField);
		
		/*Refactoring: Moved field to the top for method access and created this new filed due to complications with writing the SWP Update statement*/
		JFormattedTextField lastNameTextField = new JFormattedTextField(maskName);
		lastNameTextField.setHorizontalAlignment(SwingConstants.LEFT);
		lastNameTextField.setFont(new Font("Calibri", Font.PLAIN, 13));
		lastNameTextField.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		lastNameTextField.setColumns(10);
		lastNameTextField.setBounds(99, 88, 84, 24);
		frmEivemployeeInformation.getContentPane().add(lastNameTextField);
	
		
		ageTextField = new JTextField();
		ageTextField.setFont(new Font("Calibri", Font.PLAIN, 13));
		ageTextField.setEditable(false);
		ageTextField.setColumns(10);
		ageTextField.setBounds(206, 92, 110, 20);
		frmEivemployeeInformation.getContentPane().add(ageTextField);
		
		
		
		MaskFormatter maskPhone = null;
		try {
			maskPhone = new MaskFormatter("(###)###-####");
		} catch (ParseException pe) {
			pe.printStackTrace();
		}
		
		/*Refactoring: Moved phoneTextField up to this position as field was created later in development*/
		JFormattedTextField phoneTextField = new JFormattedTextField(maskPhone);
		phoneTextField.setFont(new Font("Calibri", Font.PLAIN, 13));
		phoneTextField.setBounds(206, 146, 110, 24);
		frmEivemployeeInformation.getContentPane().add(phoneTextField);
		
		   
		titleTextField = new JTextField();
		titleTextField.setFont(new Font("Calibri", Font.PLAIN, 13));
		titleTextField.setColumns(10);
		titleTextField.setBounds(10, 148, 186, 20);
		frmEivemployeeInformation.getContentPane().add(titleTextField);
		
		salaryTextField = new JTextField();
		salaryTextField.setFont(new Font("Calibri", Font.PLAIN, 13));
		salaryTextField.setEditable(false);
		salaryTextField.setColumns(10);
		salaryTextField.setBounds(10, 204, 110, 20);
		frmEivemployeeInformation.getContentPane().add(salaryTextField);
		
		statusTextField = new JTextField();
		statusTextField.setVisible(false);
		statusTextField.setEnabled(false);
		statusTextField.setFont(new Font("Calibri", Font.PLAIN, 13));
		statusTextField.setColumns(10);
		statusTextField.setBounds(206, 326, 110, 20);
		frmEivemployeeInformation.getContentPane().add(statusTextField);
		
		supTextField = new JTextField();
		/*Refactoring: Made supervisor Text field uneditable as changing it would create discrepancies with the SQL database in the background*/
		supTextField.setEditable(false);
		supTextField.setFont(new Font("Calibri", Font.PLAIN, 13));
		supTextField.setColumns(10);
		supTextField.setBounds(10, 260, 110, 20);
		frmEivemployeeInformation.getContentPane().add(supTextField);
		
		deptTextField = new JTextField();
		deptTextField.setFont(new Font("Calibri", Font.PLAIN, 13));
		deptTextField.setColumns(10);
		deptTextField.setBounds(206, 260, 110, 20);
		frmEivemployeeInformation.getContentPane().add(deptTextField);
		
		hireDateTextField = new JTextField();
		hireDateTextField.setFont(new Font("Calibri", Font.PLAIN, 13));
		hireDateTextField.setEditable(false);
		hireDateTextField.setColumns(10);
		hireDateTextField.setBounds(10, 326, 153, 20);
		frmEivemployeeInformation.getContentPane().add(hireDateTextField);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setFont(new Font("Calibri", Font.PLAIN, 13));
		String fTime = "Full-Time";
		String pTime = "Part-Time";
		String cTime = "Commission";
		String sTime = "Seasonal";
		comboBox.addItem(fTime);
		comboBox.addItem(pTime);
		comboBox.addItem(cTime);
		comboBox.addItem(sTime);
		comboBox.setBounds(206, 201, 110, 23);
		frmEivemployeeInformation.getContentPane().add(comboBox);
		
		JButton searchEIDButton = new JButton("Search Employee");
		searchEIDButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Integer EID = 0;
				EID = Integer.parseInt(EmployeeIDtxt.getText());
				Employee emp = new Employee(EID);
				firstNameTextField.setText(emp.getFirstName().replaceAll("\s+", ""));
				lastNameTextField.setText(emp.getLastName().replaceAll("\s+", ""));
				titleTextField.setText(emp.getTitle());
				ageTextField.setText(Integer.toString(emp.getAge()));
				phoneTextField.setText(emp.getPhone());
				salaryTextField.setText(Double.toString(emp.getSalary()));
				statusTextField.setText(emp.getStatus());
				supTextField.setText(emp.getSupervisorName());
				deptTextField.setText(emp.getDepartment());
				hireDateTextField.setText(emp.getHiredate());
				String statusString = statusTextField.getText();
				switch (statusString)
				{
				case "Full-Time":
					comboBox.removeItem(fTime);
					comboBox.removeItem(pTime);
					comboBox.removeItem(cTime);
					comboBox.removeItem(sTime);
					comboBox.addItem(fTime);
					comboBox.addItem(pTime);
					comboBox.addItem(cTime);
					comboBox.addItem(sTime);
					break;
				case "Part-Time":
					comboBox.removeItem(fTime);
					comboBox.removeItem(pTime);
					comboBox.removeItem(cTime);
					comboBox.removeItem(sTime);
					comboBox.addItem(pTime);
					comboBox.addItem(fTime);
					comboBox.addItem(cTime);
					comboBox.addItem(sTime);
					break;
				case "Seasonal":
					comboBox.removeItem(fTime);
					comboBox.removeItem(pTime);
					comboBox.removeItem(cTime);
					comboBox.removeItem(sTime);
					comboBox.addItem(sTime);
					comboBox.addItem(fTime);
					comboBox.addItem(pTime);
					comboBox.addItem(cTime);
					
					break;
				case "Commission":
					comboBox.removeItem(fTime);
					comboBox.removeItem(pTime);
					comboBox.removeItem(cTime);
					comboBox.removeItem(sTime);
					comboBox.addItem(cTime);
					comboBox.addItem(fTime);
					comboBox.addItem(pTime);
					comboBox.addItem(sTime);
					break;
				}
				
			}
		});
		searchEIDButton.setBounds(206, 33, 153, 23);
		frmEivemployeeInformation.getContentPane().add(searchEIDButton);
		
		
		JButton saveButton = new JButton("Save");
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				StringBuilder str = new StringBuilder(phoneTextField.getText()); 
				str.deleteCharAt(0);
				str.deleteCharAt(3);
				str.deleteCharAt(6);
				String phoneString = new String(str);
				
				String statusString = new String((String)comboBox.getItemAt(comboBox.getSelectedIndex()) ); 
					switch(statusString)
						{
						case "Full-Time":
							statusString = "F";
							break;
						case "Part-Time":
							statusString = "P";
							break;
						case "Seasonal":
							statusString = "S";
							break;
						case "Commission":
							statusString = "C";
							break;
						}
				
				Integer EID = 0;
				EID = Integer.parseInt(EmployeeIDtxt.getText());
				Employee emp = new Employee(EID);
				emp.editEmployee(firstNameTextField.getText().replaceAll("\s+", ""), lastNameTextField.getText().replaceAll("\s+", ""), titleTextField.getText().trim(), phoneString, statusString, supTextField.getText(), deptTextField.getText().replaceAll("\s+", ""));
				JOptionPane.showMessageDialog(null, "Your changes have been saved!");
			}
		});
		saveButton.setBounds(74, 390, 89, 38);
		frmEivemployeeInformation.getContentPane().add(saveButton);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer EID = 0;
				EID = Integer.parseInt(EmployeeIDtxt.getText());
				Employee emp = new Employee(EID);
				firstNameTextField.setText(emp.getFirstName().replaceAll("\s+", ""));
				lastNameTextField.setText(emp.getLastName().replaceAll("\s+", ""));
				titleTextField.setText(emp.getTitle());
				ageTextField.setText(Integer.toString(emp.getAge()));
				phoneTextField.setText(emp.getPhone());
				salaryTextField.setText(Double.toString(emp.getSalary()));
				statusTextField.setText(emp.getStatus());
				supTextField.setText(emp.getSupervisorName());
				deptTextField.setText(emp.getDepartment());
				hireDateTextField.setText(emp.getHiredate());
				String statusString = statusTextField.getText();
				switch (statusString)
				{
				case "Full-Time":
					comboBox.removeItem(fTime);
					comboBox.removeItem(pTime);
					comboBox.removeItem(cTime);
					comboBox.removeItem(sTime);
					comboBox.addItem(fTime);
					comboBox.addItem(pTime);
					comboBox.addItem(cTime);
					comboBox.addItem(sTime);
					break;
				case "Part-Time":
					comboBox.removeItem(fTime);
					comboBox.removeItem(pTime);
					comboBox.removeItem(cTime);
					comboBox.removeItem(sTime);
					comboBox.addItem(pTime);
					comboBox.addItem(fTime);
					comboBox.addItem(cTime);
					comboBox.addItem(sTime);
					break;
				case "Seasonal":
					comboBox.removeItem(fTime);
					comboBox.removeItem(pTime);
					comboBox.removeItem(cTime);
					comboBox.removeItem(sTime);
					comboBox.addItem(sTime);
					comboBox.addItem(fTime);
					comboBox.addItem(pTime);
					comboBox.addItem(cTime);
					
					break;
				case "Commission":
					comboBox.removeItem(fTime);
					comboBox.removeItem(pTime);
					comboBox.removeItem(cTime);
					comboBox.removeItem(sTime);
					comboBox.addItem(cTime);
					comboBox.addItem(fTime);
					comboBox.addItem(pTime);
					comboBox.addItem(sTime);
					break;
				}
			}
		});
		cancelButton.setBounds(201, 390, 84, 38);
		frmEivemployeeInformation.getContentPane().add(cancelButton);
		
		frmEivemployeeInformation.addWindowListener(new WindowAdapter() {
			  public void windowClosing(WindowEvent e) {
			    int confirmed = JOptionPane.showConfirmDialog(null, 
			        "Any unsaved changes will be lost. Are you sure you wish to exit EIV?", "EIV (Employee Information Viewer)",
			        JOptionPane.YES_NO_OPTION);

			    if (confirmed == JOptionPane.YES_OPTION) {
			    	frmEivemployeeInformation.dispose();
			    }
			    if (confirmed == JOptionPane.NO_OPTION) {
			    	frmEivemployeeInformation.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			    }
			  }
			});
		
	}

	public void setVisibility(boolean b) {
		AppGUI window = new AppGUI();
		window.frmEivemployeeInformation.setVisible(true);
		
	}
	
	
}

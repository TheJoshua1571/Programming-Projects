import java.sql.*;
public class Employee 
{
	
	int employeeID;
	String firstName;
	String lastName;
	int age;
	String title;
	private double salary;
	String status;
	int supervisor_id;
	int bonus;
	String department;
	int insurance;
	String hiredate;
	String phone;
	String supervisorName;
	
	String connectionString = "jdbc:mysql://localhost:3306/company";
	String dbLogin = "javaaccount";
    String dbPassword = "javaaccount";
	
    
  
	public Employee (int employeeID)	
	{
		this.employeeID = employeeID;
		getEmployee();
	}
	

	public String getFirstName() 
	{
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	public String getLastName() 
	{
		return lastName;
	}

	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getStatus() 
	{
		return status;
	}
	
	public void setStatus(String status) 
	{
		
		this.status = status;	
		
		switch(status)
		{
		case "F":
			this.status = "Full-Time";
			break;
		case "P":
			this.status = "Part-Time";
			break;
		case "S":
			this.status = "Seasonal";
			break;
		case "C":
			this.status = "Commission";
			break;
		default:
			this.status = "Unknown";
			break;
		}
		
	}

	
	public int getSupervisor_id() {
		return supervisor_id;
	}

	public void setSupervisor_id(int supervisor_id) {
		this.supervisor_id = supervisor_id;
		
		if (supervisor_id == 6)
		{
			this.supervisorName = "Adelie Beyers";
		}
		else if (supervisor_id == 8)
		{
			this.supervisorName = "Xavier Pogue";
		}
		else if (supervisor_id == 5)
		{
			this.supervisorName = "Carden Patterson";
		}
		else if (supervisor_id == 16)
		{
			this.supervisorName = "Maria Montoya";
		}
		else if (supervisor_id == 10)
		{
			this.supervisorName = "Chang Marble";
		}
		else if (supervisor_id == 1)
		{
			this.supervisorName = "Bob Levin";
		}
		else if (supervisor_id == 3)
		{
			this.supervisorName = "Mario Simmons";
		}
		else
		{
			this.supervisorName = "N/A";
		}
	}
	
	public String getSupervisorName() {
		
		return supervisorName;
	}
	
	public int isBonus() {
		return bonus;
	}

	public void setBonus(int i) {
		this.bonus = i;
		
		if (bonus == 1)
		{
			this.salary = this.salary + 1000;
		}
		
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getInsurance() {
		return insurance;
	}

	public void setInsurance(int insurance) {
		this.insurance = insurance;
		
		if (insurance == 1)
		{
			this.salary = this.salary - 2000;
		}
		else if (insurance == 2)
		{
			this.salary = this.salary - 1500;
		}
		if (insurance == 3)
		{
			this.salary = this.salary - 1000;
		}
		if (insurance == 4)
		{
			this.salary = this.salary - 500;
		}
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setEmployeeID(int parseInt)
	{
		
		//this.employeeID = employeeID;
	}
	
	public void getEmployee()
	{
		Connection conn = null;
		String sql = "SELECT employee_id, first_name, last_name, age, title, salary, status, supervisor_id, bonus, department, insurance, hiredate, phone FROM employees WHERE employee_id = " + this.employeeID + ";";
		try 
	    {
	    	 conn = DriverManager.getConnection(connectionString, dbLogin, dbPassword);
	    		 if (conn != null) 
	    	     {
	    	         //System.out.println("Database connection successful.");
	    	         
	    	         try (Statement stmt = conn.createStatement();
	    	        		 ResultSet rs= stmt.executeQuery(sql))
	    	         {
	    	        	if (rs.next())
						{
								this.setEmployeeID(Integer.parseInt(rs.getString("employee_id")));
								this.setFirstName(rs.getString("first_name"));
								this.setLastName(rs.getString("last_name"));
								this.setAge(Integer.parseInt(rs.getString("age")));
								this.setTitle(rs.getString("title"));
								this.setSalary(Double.parseDouble(rs.getString("salary")));
								this.setStatus(rs.getString("status"));
								this.setSupervisor_id(Integer.parseInt(rs.getString("supervisor_id")));
								this.setBonus(Integer.parseInt(rs.getString("bonus")));
								this.setDepartment(rs.getString("department"));
								this.setInsurance(Integer.parseInt(rs.getString("insurance")));
								this.setHiredate(rs.getString("hireDate"));
								this.setPhone(rs.getString("phone"));
						}
	    	         }

	    	         catch (Exception eSQL)
	    	         {
	    	        	 System.out.print("SQL Exception");
	    	        	 System.out.println(eSQL.getMessage());
	    	         }
	    	     }
	     	 }
	    catch (Exception e) 
	    {
	        System.out.println("Database connection failed.");
	        e.printStackTrace();
	    }
	}
	
	public void editEmployee(String guiFirstName, String guiLastName, String guiTitle, String guiPhone, String guiStatus, String guiSupervisor, String guiDepartment)
	{
		Connection conn = null;
		String sql = "UPDATE employees SET first_name='" + guiFirstName + "', " +

				"last_name='" + guiLastName + "', " +
				"title='" + guiTitle + "', " +
				"phone='" + guiPhone + "', " +
				"status='" + guiStatus + "', " +
				"department='" + guiDepartment + "' "
				
				+ "WHERE employee_id=" + this.employeeID + ";";
		
		try 
		{
			conn = DriverManager.getConnection(connectionString, dbLogin, dbPassword);
	    	if (conn != null) 
	    	{	
	    		try (Statement stmt = conn.createStatement())
	    			
	    				{
	    					stmt.executeUpdate(sql);
	    				}
	    	}
		}
		catch (Exception eSQL)
		{
			 System.out.print("SQL Exception");
        	 System.out.println(eSQL.getMessage());
		}
	}

	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", firstName=" + firstName + ", lastName=" + lastName + ", age="
				+ age + ", title=" + title + ", salary=" + salary + ", status=" + status + ", supervisor_id="
				+ supervisor_id + ", bonus=" + bonus + ", department=" + department + ", insurance=" + insurance
				+ ", hiredate=" + hiredate + ", phone=" + phone + "]";
	}

	
}

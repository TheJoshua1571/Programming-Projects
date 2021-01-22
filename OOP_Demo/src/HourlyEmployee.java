
public class HourlyEmployee extends Employee {

	int hoursWorked;
	double hourlyRate;
	private double salary;
	
	public HourlyEmployee(int employeeID) {
		super(employeeID);
		
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	@Override
	public double getSalary() {
		this.salary = this.hoursWorked * this.hourlyRate;
		return salary;
	}
	
	@Override
	public void printEmployee()
	{
		horizontalLine(80);
		System.out.println("Employee ID: \t" + this.employeeID); 
		System.out.println("Name: \t \t" + this.getFirstName() + " " + this.getLastName());
		System.out.println("Age: \t \t" + this.getAge());
		System.out.println("Hours Worked: \t" + this.getHoursWorked());
		System.out.println("Hourly Rate: \t" + this.getHourlyRate());
		System.out.println("Weekly Pay: \t" + this.getSalary());
		System.out.println("Status: \t" + this.getStatus());
		System.out.println("Department: \t" + this.getDepartment());
		
		str2.append(this.getHiredate());
		str2.delete(4,5);
		String date = str2.substring(4,6) + str2.substring(6,9) + "-" + str2.substring(0, 4);
		System.out.println("Hire Date: \t" + date);
		
		
		str.append(this.getPhone());
		str.insert(0, "(");
		str.insert(4, ")");
		str.insert(8, "-");
		System.out.println("Phone: \t \t" + str);
		
		if(getInsurance() == 0) 
		{
		System.out.println("Insurance: \t" + "None");
		}
		else 
		{
		System.out.println("Insurance: \t" + "Option #" + this.getInsurance());
		}
		
		System.out.println("Supervisor: \t" + this.getSupervisorName());
		horizontalLine(80);
	}

}

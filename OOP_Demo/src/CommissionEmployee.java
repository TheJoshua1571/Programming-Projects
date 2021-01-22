
public class CommissionEmployee extends Employee{

	int salesNumber;
	double ratePerSale;
	private double salary;
	
	
	public CommissionEmployee(int employeeID) {
		super(employeeID);
		}
		
	

	public int getSalesNumber() {
		return salesNumber;
	}

	public void setSalesNumber(int salesNumber) {
		this.salesNumber = salesNumber;
	}
	
    
	public double getRatePerSale() {
		return ratePerSale;
	}



	public void setRatePerSale(double ratePerSale) {
		this.ratePerSale = ratePerSale;
	}



	@Override
	public double getSalary() {
		this.salary = super.getSalary();
		return salary + this.salesNumber * ratePerSale;
	}

	@Override
	public void printEmployee()
	{
		horizontalLine(80);
		System.out.println("Employee ID: \t" + this.employeeID); 
		System.out.println("Name: \t \t" + this.getFirstName() + " " + this.getLastName());
		System.out.println("Age: \t \t" + this.getAge());
		System.out.println("Salary: \t" + this.getSalary());
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
		System.out.println("# of Sales: \t" + this.getSalesNumber());
		horizontalLine(80);
	}
}

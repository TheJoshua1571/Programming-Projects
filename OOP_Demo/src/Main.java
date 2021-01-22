/**
 * 
 * @author Josh Obando
 * @version 1
 * Main method
 */

public class Main {

	public static void main(String[] args) {
   
	/**
	 * This method is the superclass for an Employee object.
	 * No additional instance variables
	 */
	Employee e1 = new Employee(1);	
	e1.printEmployee();
		
	/**
	 * The hourly employee adds a different functionality with 2 new instance variables, hoursWorked and hourlyRate.
	 * After instantiation, set # of hours worked in a week in integers and hourly rate in double.
	 * The printEmployee() method has been modified to display the new set weekly pay
	 */
    HourlyEmployee e2 = new HourlyEmployee(1);
    e2.setHoursWorked(30);
    e2.setHourlyRate(10);
    e2.printEmployee();
    
    /**
     * The commission employee adds 2 new instance variables, salesNumber and ratePerSale. 
     * ratePerSales holds the commission amount per sale, salesNumber holds the number of sales the CommissionEmployee made. 
     * The printEmplyee() method has been modified to output the base salary from the SQL Database + the commissions the employee has made. The number of sales is displayed as well.
     */
    CommissionEmployee e3 = new CommissionEmployee(1);
    e3.setSalesNumber(10);
    e3.setRatePerSale(500.00);
    e3.printEmployee();
	
    /**
     * 
     * As the new SalaryEmployee class is the same as the base Employee class, this class just modifies the printEmployee() method to display the salary as a yearly salary.
     */
    SalaryEmployee e4 = new SalaryEmployee(1);
    e4.printEmployee();
	}
}

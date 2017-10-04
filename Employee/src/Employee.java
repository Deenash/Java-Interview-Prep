
public class Employee {

	private int Employee_Id;
	private String Employee_Name;
	private double Employee_Salary;
	
	public int getEmployee_Id() {
		return Employee_Id;
	}
	public void setEmployee_Id(int employee_Id) {
		Employee_Id = employee_Id;
	}
	public String getEmployee_Name() {
		return Employee_Name;
	}
	public void setEmployee_Name(String employee_Name) {
		Employee_Name = employee_Name;
	}
	public double getEmployee_Salary() {
		return Employee_Salary;
	}
	public void setEmployee_Salary(double employee_Salary) {
		Employee_Salary = employee_Salary;
	}
	
	public double increment_Salary(double salary)
	{
		double new_salary = salary + 100;
		return new_salary;
		
	}
	
	
	
}


class Emp
{
	private String employee_id;
	private String employee_name;
	private double employee_salary;
	public String getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public double getEmployee_salary() {
		return employee_salary;
	}
	public void setEmployee_salary(double employee_salary) {
		this.employee_salary = employee_salary;
	}
	
	
}



public class Employee1234 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp o = new Emp();
		o.setEmployee_id("WE23456");
		o.setEmployee_name("OB");
		o.setEmployee_salary(2000000000);
		
		String employee_id = o.getEmployee_id();
		String employee_name = o.getEmployee_name();
		double employee_salary = o.getEmployee_salary();
		
		System.out.printf("Employee ID: %s\nEmployee Name: %s\nEmployee Salary: %.2f\n", 
                employee_id, employee_name, employee_salary);
}

	}



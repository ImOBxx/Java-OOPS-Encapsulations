
class Employee
{
	private String employee_id;
	private String emp_name;
	private String emp_salary;
	
	public String getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_salary() {
		return emp_salary;
	}
	public void setEmp_salary(String emp_salary) {
		this.emp_salary = emp_salary;
	}
	
}


public class Employee8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();

	    // Set values using setter methods
	    employee.setemployee_id(15);
	    employee.setEmployeeName("Caelius Dathan");
	    employee.setEmployeeSalary(4900.0);

	    // Get values using getter methods
	    int employeeId = employee.getEmployeeId();
	    String employeeName = employee.getEmployeeName();
	    String formattedSalary = employee.getFormattedSalary();

	    // Print the values
	    System.out.println("Employee Details:");
	    System.out.println("ID: " + employeeId);
	    System.out.println("Name: " + employeeName);
	    System.out.println("Salary: " + formattedSalary);

	}

}

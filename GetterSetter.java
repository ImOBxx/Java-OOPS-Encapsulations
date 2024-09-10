

import java.util.Scanner;

public class GetterSetter {

    public static void main(String[] args) {
        // Example of creating and using Employeee objects
        Employeee emp1 = new Employeee("John Doe", "Developer", "New York");
        Employeee emp2 = new Employeee("Jane Smith", "Manager", "Los Angeles");

        System.out.println(emp1);
        System.out.println(emp2);

        // Modify the details of an employee
        emp1.setCity("San Francisco");
        System.out.println("Updated emp1: " + emp1);

        // Using Scanner to get user input for creating a new Employeee
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter Employee Name: ");
        String empName = in.nextLine();
        
        System.out.println("Enter Employee Designation: ");
        String empDeg = in.nextLine();
        
        System.out.println("Enter Employee City: ");
        String empCity = in.nextLine();
        
        Employeee emp3 = new Employeee(empName, empDeg, empCity);
        System.out.println("Newly created employee: " + emp3);

        in.close(); // Close the scanner to avoid resource leak
    }
}

class Employeee {
    private String emp_name;
    private String deg;
    private String city;

    public Employeee(String emp_name, String deg, String city) {
        this.emp_name = emp_name;
        this.deg = deg;
        this.city = city;
    }

    // Getter method
    public String getEmpName() {
        return emp_name;
    }

    // Setter method
    public void setEmpName(String newName) {
        this.emp_name = newName;
    }

    public String getDeg() {
        return deg;
    }

    public void setDeg(String deg) {
        this.deg = deg;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "{Name: " + this.emp_name + ", Deg: " + this.deg + ", City: " + this.city + "}";
    }
}

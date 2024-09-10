import java.util.Scanner;

public class NeagtiveNumberValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		 try {
	            System.out.print("Enter an integer: ");
	            int number = in.nextInt();
	            nNumber(number);
	            System.out.println("You entered a valid number: " + number);
	        } catch (NegativeNumberException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
		 
	      
	    }

	    // Method to validate the number
	    public static void nNumber(int number) throws NegativeNumberException {
	        if (number < 0) {
	            throw new NegativeNumberException("Negative numbers are not allowed.");
	        }
	    }
}


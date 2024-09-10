
class BankAccount
{
	String accnumber;
	double balance;
	public String getAccnumber() {
		return accnumber;
	}
	public void setAccnumber(String accnumber) {
		this.accnumber = accnumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}

public class OOPsBankAcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount();

	    // Set values using setter methods
	    account.setAccnumber("SB-09876");
	    account.setBalance(2000.0);

	    // Get values using getter methods
	    String accountNumber = account.getAccnumber();
	    double balance = account.getBalance();

	    // Print the values
	    System.out.println("Account Number: " + accountNumber);
	    System.out.println("Balance: " + balance);
	  }
	}
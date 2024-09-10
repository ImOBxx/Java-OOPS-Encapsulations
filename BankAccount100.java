

class Account
{
	private String accountNumber;
	private double balance;
	
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}


public class BankAccount100{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account obj = new Account();
		obj.setAccountNumber("SB-7463PIO34");
		obj.setBalance(200000.0);
		
		String accountNumber = obj.getAccountNumber();
		double balance = obj.getBalance();
		
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Balance: " + balance);

	}

}

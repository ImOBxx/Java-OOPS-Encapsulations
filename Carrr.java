
class Car1234
{
	private String company_name;
	private String model_name;
	private int year;
	private double mileage;
	
	
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getModel_name() {
		return model_name;
	}
	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getMileage() {
		return mileage;
	}
}

public class Carrr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1234 o = new Car1234();
		o.setCompany_name("Tesla");
		o.setModel_name("Model S");
		o.setYear(2021);
		
		String company_name = o.getCompany_name();
		String model_name = o.getModel_name();
		int year = o.getYear();
		double mileage = o.getMileage();
		
		System.out.println("Company Name: " + company_name);
		System.out.println("Model Name: " + model_name);
		System.out.println("Make Year: " + company_name);
		System.out.println("Mileage: " + mileage);
	}

}

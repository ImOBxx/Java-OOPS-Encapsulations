
class Person11 {
	
	private String name;
	private int age;
	private String country;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}


public class Person10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person11 obj = new Person11();
		obj.setName("Abhishek Banerjee");
		obj.setAge(25);
		obj.setCountry("USA");
		
		String name = obj.getName();
		int age = obj.getAge();
		String country = obj.getCountry();
		
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Country: " + country);
	}

}


class Rec
{
	private double length;
	private double width;
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	 
	double area()
	{
		return length * width;
	}
	
	double peri()
	{
		return 2 * (length + width);
	}
	 
}

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rec obj = new Rec();
		obj.setLength(100);
		obj.setWidth(2040);
		
		double length = obj.getLength();
		double width = obj.getWidth();
		
		System.out.println("Length: " + length);
		System.out.println("Width: " + width);
		
		System.out.println("Area: " + obj.area());
		System.out.println("Perimeter: " + obj.peri());
		
		

	}

}

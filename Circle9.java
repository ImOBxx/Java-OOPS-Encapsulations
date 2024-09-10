
class Circle
{
	int r;

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	 public double calculateArea() {
		    return Math.PI * r * r;
		  }

		  public double calculatePerimeter() {
		    return 2 * Math.PI * r;
		  }
	
}

public class Circle9 {

	public static void main(String[] args, String r) {
		// TODO Auto-generated method stub
		Circle circle = new Circle();

	    // Set the radius using the setter method
	    circle.setR((int) 7.0);

	    // Get the radius using the getter method
	    double radius = circle.getR();

	    
	    double area = circle.calculateArea();
	    double perimeter = circle.calculatePerimeter();

		System.out.println("Circle Radius: " + r);
	    System.out.println("Circle Area: " + area);
	    System.out.println("Circle Perimeter: " + perimeter);
	  }

	}



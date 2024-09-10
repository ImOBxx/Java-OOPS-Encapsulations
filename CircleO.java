
class Cir
{
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	double area()
	{
		return Math.PI * radius * radius;
	}
	
	
	double peri()
	{
		return 2 * Math.PI * radius;
	}
}


public class CircleO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cir o = new Cir();
		o.setRadius(45);
		
		double radius = o.getRadius();
		
		System.out.println("Area Of The Circle: " + o.area());
		System.out.println("Perimeter Of The Circle: " + o.peri());
	}

}

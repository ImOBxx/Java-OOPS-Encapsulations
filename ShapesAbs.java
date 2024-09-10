
abstract class Shapee
{
	abstract double calculateArea();
}

class Circleee extends Shapee
{
	private double r;
	
	public Circleee(double r)
	{
		this.r = r;
	}
	
	double calculateArea()
	{
		return Math.PI * r * r;
	}
}

class Rectangleee extends Shapee
{
	private double l;
	private double w;
	
	public Rectangleee(double l, double w)
	{
		this.w = w;
		this.l = l;
	}

	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		return l * w;
	}
	
}

public class ShapesAbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapee x = new Circleee(4);
		Shapee c = new Rectangleee(5, 6);
		
		double area1 = x.calculateArea();
		double area2 = c.calculateArea();
		
		System.out.println("Area Of Circle: " + area1);
		System.out.println("Area Of Rectangle: " + area2);
		

	}

}

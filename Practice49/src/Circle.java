
public class Circle extends Shape implements Resizable {
	private int radius;
	
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	
	public Circle() {
		radius = 0;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public double calcArea() {
		double rslt;
		
		rslt = radius * radius * 3.14;
		
		return rslt;
	}
	
	public String toString() {
		String rslt = super.toString();
		
		rslt += ", 반지름: " + radius;
		rslt += ", 면적: " + this.calcArea();
		
		return rslt;
	}
	
	public void draw() {
		System.out.println("원, " + this.toString());
	}
	
	public void resize(double scale) {
		radius = (int)(radius * scale);
	}

}
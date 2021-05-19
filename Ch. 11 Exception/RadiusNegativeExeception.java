package week11_Exception;

public class RadiusNegativeExeception extends Exception{
	private double radius =0;
	
	public RadiusNegativeExeception(double radius) {
		super("The radius is negative"+radius);
		this.radius=radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	
	
}

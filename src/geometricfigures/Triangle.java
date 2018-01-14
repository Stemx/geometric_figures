package geometricfigures;

public class Triangle extends Menu{
	private String name;
	private double height;
	private double base;
	
	public Triangle(String aName, double aHeight, double aBase) {
		setName(aName);
		setHeight(aHeight);
		setBase(aBase);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	
	
}

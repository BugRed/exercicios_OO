package entities;

public class Rectangle {

	public double width;
	public double height;

	public double area() {
		return height * width;
	}
	public double perimeter() {
		return 2*(height + width);
	}
	public double diagonal() {
		return Math.sqrt(Math.pow(height, 2.0) + Math.pow(width, 2.0));
	}
	public String toString() {
		return "Area = "
			+  String.format("%.2f%n", area())
			+ "Perimeter = "
			+ String.format("%.2f%n", perimeter())
			+ "Diagonal = "
			+ String.format("%.2f%n", diagonal());
	}
	

}

class Shapeoperator {
	double areasquare (double side) {
		return side * side;
	}
}

public class Circle1 {
	Shapeoperator side1;
	double pi = 3.14;
	double areacircle(double redius) {
		side1 = new Shapeoperator();
		double area1 = side1.areasquare(redius);
		return pi*area1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle1 a= new Circle1();
		double b = a.areacircle(2.0d);
		System.out.println(b);
	}

}

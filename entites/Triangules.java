package entites;

public class Triangules {
	public double a;
	public double b;
	public double c;
	
	public double area() {
		double p = (a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
	public static String verificacao(double a, double b) {
		if (a > b) {
			return "The larger is X";
		}else {
			return "The larger is Y";
		}
	}
}

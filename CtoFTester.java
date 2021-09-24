// The functions should take a double as a parameter
// The functions should return a double value  

public class CtoFTester {

	public static double celsiusToFahrenheit(double x) {
		return (x * (9/5)) + 32;
}
	public static double fahrenheitToCelsius(double y) {
		return (y - 32.0) * (5/9);
}
	public static void main(String[] args) {
		double x = 75;
		double y = 77;
		System.out.println("75 C is" + celsiusToFahrenheit(x));
		System.out.println("30 F is" + fahrenheitToCelsius(y));
}
}

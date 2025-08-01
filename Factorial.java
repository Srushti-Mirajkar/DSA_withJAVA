package college.srushti;

public class Factorial {
	
	public static int factorial(int n) {
		// base condition
		if(n == 0)
			return 1;
		// explain process in terms of itself
		int r = n * factorial(n-1);
		return r;
	}
	public static void main(String[] args) {
		int res = factorial(5);
		System.out.println("Result: " + res);
	}
}
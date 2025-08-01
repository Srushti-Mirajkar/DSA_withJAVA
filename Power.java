package college.srushti;

public class Power {
	public static int power(int x, int y) {
		// base condition
		if(y == 0)
			return 1;
		// explain process in terms of itself
		int r = x * power(x, y-1);
		return r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		   
		    int result = power(2,5);
		    System.out.println( " power is " + result);
		}

	}



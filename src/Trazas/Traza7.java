package Trazas;

public class Traza7 {
	public static void main (String[]args){
		 int a = 4;
		 int b = 4;
		 b = A (a, b);
		System.out.println( a + " " + b);
		}
		public static int A (int b, int a) {
		int c;
			c = 1;
		if (a > 1) {
			
			c = A (b,a-1);
			
			if (a % 2 == 1)
	
				c = b / c + a;
			else

				c = c + 1;
		}
		return c;
		}
	
}

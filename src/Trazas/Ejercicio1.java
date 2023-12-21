package Trazas;

public class Ejercicio1 {
	
		public static float a, b, c;
		public static void main (String[]args){
		float a, d;
		a = 1.0F; b = 2.0F; c = 3.0F;
		d = func2();
		System.out.println(a + " "+ b +" "+ c + " "+ d);
		}
		public static float func2() {
		float b;
		a = 4.0F; b = 5.0F;
		return 6.0F;
		c = 7.0F;//eto no se puede hacer, daria error
		}
		}
}

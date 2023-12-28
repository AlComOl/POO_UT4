package Trazas;

public class Traza8 {
	
		static final int BASE = 5;
		public static void main (String[]args){
			int x, y;
			x = 10; //1
			y = funcion(x); //2
			System.out.println("x = "+ x +" y = "+ y);
			}
		public static int funcion (int y){
			int x;
			if (y == 0)
			x = 0; //3
			else {
			x = funcion (y / BASE); //4
			x = x * 10 + y % BASE; //5
			}
			return x;
			}
		

}
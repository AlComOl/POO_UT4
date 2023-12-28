package Trazas;

public class Traza6 {
	public static void main (String[]args){
		 int [] y = {21};
		 int [] z= {7};
		 Cambiar(y, z[0]);
		 Cambiar(z, y[0]);
		System.out.println("z=" + z + "y= " +y);
		}
		public static void Cambiar(int [] i, int j) {
		int k;
		 k = j;
		 i[0] = k + j;
		 k = i[0];
		return;
		}
}

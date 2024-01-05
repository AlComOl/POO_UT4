package Trazas;

public class Traza11 {
	public static void main (String[]args){
		int z;
		z = func8(20, 28); //1
		System.out.println(z);
		}
	public static int func8 (int a, int b){
		int c;
		int res;
		c = a % b; //2
		if (c == 0)
		res = b; //3
		else
		res = func8(b, c); //4
		return res;
		}
}

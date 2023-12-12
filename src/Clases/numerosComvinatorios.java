/*
 Autor: Álvaro Comenge 
 
 Fecha: 11/12/23
 
 Ejercicio:
 
 	El número de combinaciones de m elementos tomados de n en n es: donde m!=m*(m-1)*…*1 
 	Realice un programa que lea desde el teclado los valores de m y n. comprobar que m es 
 	mayor que n y calcular el número de combinaciones.
  
 */

package Clases;
import java.util.*;
public class numerosComvinatorios {
	static Scanner entrada=new Scanner(System.in);
	public static void main(String[] args) {
	
		int m,n;
		
		m=getpide();
		n=getpide();
		
		if(m>n) {
			int combinacion= combinacion(m,n);
			
			System.out.println(getmuestra(m,n,combinacion));
		}
	}
	
	public static int getpide() {
		System.out.println("Introduce numero");
		int x= entrada.nextInt();
		return x;
	}
	
	public static int combinacion(int m, int n) {
		
		return factorial(m)/(factorial(n)*factorial(m-n)); 
	}
	
	public static int factorial(int n) {
		int fac=1;
		
		
		for(int i=1;i<=n;i++) {
		fac*=i;
		
		}
		
		return fac;
	}
	
	public static String getmuestra(int m,int n, int combinacion) {
		
		return "convinaciones "+ m +" y " + n + " es "+ combinacion;
	}
}

package Recursividad;
import java.util.*;
/*****************************************************************************************************
 * Autor:Álvaro Comenge 

   Fecha : 3/1/2024

   Implemente un subprograma que calcule recursivamente en cuanto se convierte un capital C 
   al final de N años y a un interés I.

 ****************************************************************************************************/

public class Ejercicio15 {

	public static double interes(double c, double i, int n) {
		double capital;
		if (n==0) {
			capital=c;
		} else {
			capital= (interes(c,i,n-1)*(1+i));
		}
                return capital;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double c,i;
		int n;	
		
		do {
		System.out.println("Introduce Capital, introduce 0 si desea salir.");
		c=sc.nextDouble();
		System.out.println("Introduce Interes entero (si es 4%, escribe 4, si es 0.1%, escribe 0.1)");
		i=sc.nextDouble();
		System.out.println("Introduce Anyos");
		n=sc.nextInt();
		System.out.printf("La capital se convierte en: \n"+ interes(c,i*0.01,n)+"\n");
		} while (c!=0);
		sc.close();
		
	}
}

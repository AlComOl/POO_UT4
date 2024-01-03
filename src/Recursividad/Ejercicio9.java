package Recursividad;
import java.util.*;
/** *************************************************************************************************************************
 * Autor: Álvaro Comenge 
 * Fecha 2/1/2024
 * Descripción: Implemente un subprograma que realice la serie de Fibonacci, que es: 
 * Fibonacci (1)= Fibonacci (2)=1 N > 2 Fibonacci (n)= Fibonacci (n-1) + Fibonacci (n-2)
 * 
 ************************************************************** ***************************************************************/
public class Ejercicio9 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int fibo;
		System.out.println("Introduce el numero de la secuencia Fibonacci");
		fibo=sc.nextInt();
		
		System.out.println(	fibonaccIterativo(fibo));
		
		System.out.println(	fibonacci(fibo));//1
	}
//	funcion fibonachi iterativo cambio de variables
//	al salir del bucle para sumar la variable anterior al numero
//	con el resultado iterativamente.
	public static int fibonaccIterativo(int fibo) {
		int ax=0,m=1,n=1;
		
		for(int contador=0;contador<fibo;contador++) {
			ax=m+n;
				m=n;
				n=ax;	
			
		}
		return ax;
	}
	
	public static int fibonacci(int fibo) {
		int res;
		 
		if(fibo<1) {
			res=1;//2
		}else {
			res=+(fibonacci(fibo-1)+fibonacci(fibo-2));//3	
		
		}
		
		
		return res;
		
	}
	
}

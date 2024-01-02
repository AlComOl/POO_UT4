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
	
	public static int fibonaccIterativo(int fibo) {
		int ax=0,m=1,n=1,cont=0;
		
		for(int contador=0;contador<fibo;contador++) {
			ax=m+n;
				m=n;
				n=ax;	
				cont++;
		}
		return ax;
	}
	
	public static int fibonacci(int fibo) {
		int n=0,m=1,res=1;
		
		if(fibo<1) {
			res=1;//2
		}else {
			res=fibonacci(fibo-1)+fibonacci(fibo-2);//3
			
		}
		return res;
	}

}

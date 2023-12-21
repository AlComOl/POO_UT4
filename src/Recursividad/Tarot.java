package Recursividad;
/*************************************************************************************************
 *   Autor  Álvaro Comenge.
 *   
 *    Fecha 20/12/23
 *   
 *   Para obtener el número de tarot de una persona, hay que sumar los números de su fecha de nacimiento y reducirlos a un solo dígito.
 *   Realice un programa que lea una fecha de teclado y escriba el número del tarot a partir de la fecha leída. La fecha estará formada
 *   por tres números enteros, el día, el mes y el año(4 dígitos). Ejemplo: Supóngase que una persona nace el día 1 de julio de 1966.
 *   La suma 1+7+1996=1974. El resultado obtenido no está formado por un solo dígito, por lo que habrá que sumar las cuatro cifras que componen el número: 1+9+7+4=21. Al igual que antes, el resultado no está formado por un dígito por lo que repetir el proceso, 2+1=3, El resultado obtenido es el número del tarot 3. 
 *
 * 
 * 
 * 
 ************************************************************************************************/
import java.util.*;

public class Tarot {
	public static int sumaDigito(int n) {

	int res;
	if(n<10) {
		res=n;
	}else {
		res=sumaDigito(n/10)+n%10;
	}
	return res;
	}
	
	public static int tarot(int n) {
		
	int res=sumaDigito(n);
		if(res>10)
			res=tarot(res);
		
		return res;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int dia,mes,anyo;
		System.out.println("Introduce dia");
		dia=sc.nextInt();
		System.out.println("Introduce mes ");
		mes=sc.nextInt();
		System.out.println("Introduce anyo");
		anyo=sc.nextInt();
		
		int numero=(dia+mes+anyo);
		
		int Tarot=tarot(numero);
		
		System.out.println(Tarot);
		

	}


}	



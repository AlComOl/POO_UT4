package Recursividad;
import java.util.*;
public class Ejercicio11 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
        int n;//Parametro real
        
        System.out.print("Dame un numero en base decimal para convertirlo a binario: ");
        n = sc.nextInt();
        
        sc.close();
        
        System.out.println("\nEl numero decimal " + n + " en base 2 es: ");
        System.out.println("* Mediante iteracion: " + binarioIterativo(n));
        System.out.println("* Mediante recursividad: " + binarioRecursivo(n));
	}
	
	//version iterativa
		public static long binarioIterativo(int numero){//Parametro formal
			int exponente=0, digito;
			long resultado=0;
			
			while(numero!=0) {
				digito = numero % 2;
				resultado = resultado+digito*(long)Math.pow(10, exponente);
				numero/=2;
				exponente++;
				//System.out.printf("Binario: %.0f %n. binario);
			}
			//resultado=(resultado*10+numero)/10;
			return resultado;
		}	
	
		//version recursiva
				public static long binarioRecursivo(int numero){//Parametros formales
					
					long resultado;
					
					if (numero / 2 == 0) {//Caso base
						resultado = numero;
				    } 
				    else {//Caso general
				        resultado = binarioRecursivo(numero/2)*10+numero%2;
				    }
					return resultado;
				}
	
	}



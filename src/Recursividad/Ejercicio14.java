package Recursividad;
import java.util.Scanner;
/**************************************************************
 * Autor: Álvaro Comenge 
 * Fecha: 23/12/2023
 * 14-Descripción: Implemente un subprograma que halle cual es la primera potencia en base 2 
 * mayor que un número que pasamos como parámetro, devolviendo el valor de dicha potencia y el exponente al que está elevado.
 ***************************************************************/

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce numero para hallar cual es la primera potencia en base 2 mayor que el numero introducido");
        int numero = sc.nextInt();
        int []x= {0};
        int potencia=potenciaMayorDos(numero,x);
        int potenciaIterativa=potenciaMayorDosIterativa(numero,x);
        System.out.println("La potencia en base 2 más próxima a " + numero + " es   cuyo exponente es "+ potencia);
        System.out.println("La potencia en base 2 más próxima a " + numero + " es   cuyo exponente es "+ potenciaIterativa);
    }   
//  FORMA RECURSIVA 
    public static int potenciaMayorDos(int numero, int []x) {
        int res;
        if (Math.pow(2,x[0])>numero) {
        	res=1;
        }
        else {
        	x[0]++;
        	res=2*potenciaMayorDos(numero,x);
        }
        return res;

    }
    
// FORMA ITERATIVA 


    public static int potenciaMayorDosIterativa(int numero, int[] x) {
        int res = 1;
        while (Math.pow(2, x[0]) <= numero) {
            x[0]++;
            res *= 2;
        }
        return res;
    }

  
}

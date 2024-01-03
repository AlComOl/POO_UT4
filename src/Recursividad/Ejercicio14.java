package Recursividad;
import java.util.Scanner;
/**************************************************************
 * Autor: Álvaro Comenge 
 * Fecha: 23/12/2023
 * 14-Descripción: Implemente un subprograma que halle cual es la primera potencia en base 2 
 * mayor que un número que pasamos como parámetro, devolviendo el valor de dicha potencia y el exponente al que está elevado.
 ***************************************************************/

// CON RECURSIVIDAD



public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int numero = sc.nextInt();
        sc.close();
        int result = potencia(numero);
        int exponente = exponente(result);
        System.out.println("La potencia en base 2 más próxima a " + numero + " es " + result + ", cuyo exponente es " + exponente);
    }
  
    public static int potencia(int num) {
        int res = 0;
        if (num == 0 || num == 1) res = 2;
        else res = potencia(num / 2) * 2;
        return res;
    }

    public static int contador = 0;

    public static int exponente(int res){

        if ((res / 2) != 1){
            exponente(res / 2);
            contador++;
        }
        else contador++;
        return contador;
    }
}

// SIN RECURSIVIDAD


//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int numero = tec.nextInt();
//        sc.close();
//        int result = potenciaEnBase2MasProxima(numero);
//        System.out.println("La potencia en base 2 más próxima a " + numero + " es " + result + ", cuyo exponente es " + (int)Math.sqrt(result));
//    }
//  
//    public static int potenciaEnBase2MasProxima(int num) {
//        byte exponente = 0;
//        while (Math.pow(2, exponente) <= num) {
//            exponente++;
//        }
//        return (int)Math.pow(2, exponente);
//    }
//}

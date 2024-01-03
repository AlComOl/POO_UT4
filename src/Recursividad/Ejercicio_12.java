package Recursividad;
import java.util.Scanner;
/** *************************************************************************************************************************
 * Autor: Álvaro Comenge 
 * Fecha 23/12/2023
 * Descripción: El máximo común divisor(m.c.d.) entre dos números enteros mayores que cero viene dado por la siguiente forma:
Escriba un programa que calcule el máximo común divisor entre dos números.
 ************************************************************** ***************************************************************/




public class Ejercicio_12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce dos numeros para calcular su MCD");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        System.out.println("El MCD es: " + MCD(n1,n2));

    }

    public static int MCD(int n1, int n2) {

        int resultado;

        if (n1 % n2 == 0) {  //Caso base.
            resultado = n2;
        } else {
            resultado = MCD(n2, n1 % n2);
        }
        return resultado; 
        //Recursividad simple y directa.
    }
}

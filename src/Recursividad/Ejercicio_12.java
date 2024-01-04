package Recursividad;
import java.util.Scanner;
/** *************************************************************************************************************************
 * Autor: Álvaro Comenge 
 * Fecha 3/01/2024
 * Descripción: El máximo común divisor(m.c.d.) entre dos números enteros mayores que cero viene dado por la siguiente forma:
   Escriba un programa que calcule el máximo común divisor entre dos números.
 ************************************************************** ***************************************************************/




public class Ejercicio_12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce dos numeros para calcular su MCD");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        System.out.println("El MCD Iterativo es "+ MCDIterativo(n1,n2));
        
        System.out.println("El MCD es: " + MCD(n1,n2));//1

    }
    public static int MCDIterativo(int n1,int n2) {
    	int temp,aux;
    	if(n1<n2) {
    		temp=n1;
    		n1=n2;
    		n2=temp;
    	}
    	while(n2>2) {
    		aux=n1;
    		n1=n2;
    		n2=aux%n2;
    	}
    	return n2;
    }

    public static int MCD(int n1, int n2) {

        int res;

        if (n1 % n2 == 0) {  //Caso base.
            res = n2;//2
        } else { 
            res = MCD(n2, n1 % n2);//3
        }
        return res; 
        //Recursividad simple y directa.
    }
}

package Recursividad;

/**************************************************************
 * Autor: Álvaro Comenge
 * Fecha 3/01/24
 * Descripción: Calcule el primer término de la siguiente serie que sea mayor o igual a un valor V 
 * que se le pasa como parámetro y devuelva el lugar que ocupa en la serie y el valor:
 * A1=0
 * An=n+(An-1)!
 * Banco de Pruebas:
 * A2 = 2 + (A1)! = 2 + 0! = 3
 * A3 = 3 + (A2)! = 3 + 3! = 9
 * A4 = 4 + (A3)! = 4 + 9! = 362884
 ***************************************************************/

public class Ejercicio16{
    public static void main(String[] args) {
        System.out.println(funcionCompleta(3));
        
    }

    public static int funcionCompleta(int numero){
        int result;
        if (numero == 1) {
        	result = 0;
        }
        else {
        	result = numero + valorFactorial(funcionCompleta(numero-1));
        }
        return result;
    }

    public static int valorFactorial(int num){
        int sol;
        if (num == 0) {
        	sol = 1;
        }
        else {
        	sol = num * valorFactorial(num-1);
        }
        return sol;
    }
}


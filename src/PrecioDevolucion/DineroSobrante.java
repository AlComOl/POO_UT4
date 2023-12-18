/**********************************************************
 * Autor: Álvaro Comenge 
 * 
 * Fecha: 16/12/23
 * 
 * Diseñe un programa que dada una cantidad a pagar y 
 * el dinero con el que se paga, devuelva desglosado en billetes y monedas el dinero que sobre.
 * 
 * 
 * 
 *********************************************************/

package PrecioDevolucion;
import java.util.Scanner;
public class DineroSobrante {

		public static void main(String[] args) {
			Scanner tec = new Scanner (System.in);
			float cantidad, pago, resto; 
			

	        
	        System.out.print("Introduce la cantidad a pagar: ");
	        cantidad = tec.nextFloat();
	        System.out.print("Introduce la cantidad pagada: ");
	        pago = tec.nextFloat();
	        
	        tec.close();
	        
	        //resto = pago - cantidad;
	        resto = Math.round((pago - cantidad)*100f)/100f;
	        //Funciona erroneo con 4,5,35,25,... cts de �, y el redondeo no lo resuelve
	        //Solucion: hay que trabajar con enteros
	        if(resto < 0)
	        	System.out.print("La cantidad pagada es insuficiente!!");
	        else
	        	System.out.print("\nLa cantidad de dinero sobrante es: ");
	        	System.out.print(resto);
	            System.out.print("€");
	        	System.out.print(vueltas(resto));
	    }
		
		public static String vueltas(float dinero) {
			int b500 = 0, b200 = 0, b100 = 0, b050 = 0, b020 = 0, b010 = 0, b005 = 0;//numero de billetes en euros
			int m200 = 0, m100 = 0, m050 = 0, m020 = 0, m010 = 0, m005 = 0, m002 = 0, m001 = 0;//numero de monedas en euro y centimo/s		
				if(dinero >= 500) {
					b500 = (int)dinero/500;
					dinero = dinero - 500 * b500;
				}
				
				if(dinero >= 200) {
					b200 = (int)dinero/200;
					dinero = dinero - 200 * b200;
				}
							
				if(dinero >= 100) {
					b100 = (int)dinero/100;
					dinero = dinero - 100 * b100;
				}
							
				if(dinero >= 50) {
					b050 = (int)dinero/50;
					dinero = dinero - 50 * b050;
				}
							
				if(dinero >= 20) {
					b020 = (int)dinero/20;
					dinero = dinero - 20 * b020;
				}
							
				if(dinero >= 10) {
					b010 = (int)dinero/10;
					dinero = dinero - 10 * b010;
				}
							
				if(dinero >= 5) {
					b005 = (int)dinero/5;
					dinero = dinero - 5 * b005;
				}
							
				if(dinero >= 2) {
					m200 = (int)dinero/2;
					dinero = dinero - 2 * m200;
				}
							
				if(dinero >= 1) {
					m100 = (int)dinero/1;
					dinero = dinero - 1 * m100;
				}
							
				if(dinero >= 0.50) {
					m050 = (int)(dinero/0.5);
					dinero = dinero - 0.50f * m050;
				}
							
				if(dinero >= 0.20) {
					m020 = (int)(dinero/0.2);
					dinero = dinero - 0.20f * m020;
				}
							
				if(dinero >= 0.10) {
					m010 = (int)(dinero/0.1);
					dinero = dinero - 0.10f * m010;
				}
							
				if(dinero >= 0.05) {
					m005 = (int)(dinero/0.05);
					dinero = dinero - 0.05f * m005;
				}
							
				if(dinero >= 0.02) {
					m002 = (int)(dinero/0.02);
					dinero = dinero - 0.02f * m002;
				}
							
				if(dinero >= 0.01) {
					m001 = (int)(dinero/0.01);
					
				}
			
			return "\nBillete/s de 500€: " + b500 + "\nBillete/s de 200€: " + b200 + "\nBillete/s de 100€: " + b100 + "\nBillete/s de 50€: " + b050 + "\nBillete/s de 20€: " + b020 + "\nBillete/s de 10€: " + b010 + "\nBillete/s de 5€: " + b005 + "\nMoneda/s de 2€: " + m200 + "\nMoneda/s de 1€: " + m100 + "\nMoneda/s de 50 cts de €: " + m050 + "\nMoneda/s de 20 cts de €: " + m020 + "\nMoneda/s de 10 cts de €: " + m010 + "\nMoneda/s de 5 cts de €: " + m005 + "\nMoneda/s de 2 cts de €: " + m002 + "\nMoneda/s de 1 cent de €: " + m001;
		}
}

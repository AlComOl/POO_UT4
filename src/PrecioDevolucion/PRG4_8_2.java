package PrecioDevolucion;


	import java.util.*;
	public class PRG4_8_2 {
	    
	   public static void darCambio(int c) {
		   if (c!=0) {
		   		int d;
		 		int salidaB;
		 		while (c!=0) {	
		 			if (c >= 50000) {
		 			    d = 50000;
		 			} else if (c >= 20000) {
		 			    d = 20000;
		 			} else if (c >= 10000) {
		 			    d = 10000;
		 			} else if (c >= 5000) {
		 			    d = 5000;
		 			} else if (c >= 2000) {
		 			    d = 2000;
		 			} else if (c >= 1000) {
		 			    d = 1000;
		 			} else if (c >= 500) {
		 			    d = 500;
		 			} else if (c >= 200) {
		 			    d = 200;
		 			} else if (c >= 100) {
		 			    d = 100;
		 			} else if (c >= 50) {
		 			    d = 50;
		 			} else if (c >= 20) {
		 			    d = 20;
		 			} else if (c >= 10) {
		 			    d = 10;
		 			} else if (c >= 5) {
		 			    d = 5;
		 			} else if (c >= 2) {
		 			    d = 2;
		 			} else if (c >= 1) {
		 			    d = 1;
		 			} else {
		 			    d = 0;
		 			}
		 			if (d>0) {
		 				salidaB= c/d;
		 				c=c%d;
		 				if (salidaB>0&&d>=500) {
		 					System.out.println("Billete de "+ d/100 + " euros: "+ salidaB);
		 				}
		 				if (salidaB>0&&d<=200&&d>100) {
		 					System.out.println("Moneda de "+ d/100 + " euros: "+ salidaB);
		 				}
		 				if (salidaB>0&&d<=100&&d>50) {
		 					System.out.println("Moneda de "+ d/100 + " euro: "+ salidaB);
		 				}
		 				if (salidaB>0&&d<=50&&d>1) {
		 					System.out.println("Moneda de "+ d + " centimos: "+ salidaB);
		 				}
		 				if (salidaB>0&&d==1) {
		 					System.out.println("Moneda de "+ d + " centimo: "+ salidaB);
		 				}
		 			}
		 		}
		  }
	   }

	    public static void main(String args[]) {
	      double cantidadaPagar,cantidaddePago;
	      int aPagarEnCent,dePagoEnCent;
	      Scanner entrada= new Scanner(System.in);
	    
	        System.out.println("Introduce la cantidad a pagar");
	        cantidadaPagar=entrada.nextDouble();
	        System.out.println("Introduce la cantidad de pago");
	        cantidaddePago=entrada.nextDouble();
	        aPagarEnCent=(int)(cantidadaPagar*100);
	        dePagoEnCent=(int)(cantidaddePago*100);
	        if (cantidaddePago<cantidadaPagar) {
	            System.out.println("Cantidad insuficiente, procedemos a la devolución del dinero introducido");
	        } else {
	        	System.out.printf("Cambio a dar: "+"%5.2f%n",cantidaddePago-cantidadaPagar);	
	     		darCambio(dePagoEnCent-aPagarEnCent);
	        }
	    

	    
	    }
	}

package SalarioNeto;
import java.util.*;
/***********************************************************
 * Autor : Álvaro Comenge 
 * 
 * fecha: 12/12/23
 * 
 * Según el diseño de programa siguiente obtén el salario neto de n trabajadores de acuerdo a las siguientes premisas:

    Las 38 primeras horas semanales se cobran a la tarifa ordinaria.
    Cualquier hora extra realizada se cobra a 1.5 veces la tarifa ordinaria.
    Los primeros 500€ están libres de impuestos. Los siguientes 400€ están sometidos a unas retenciones del 25% y las restantes al 45%.

Por teclado se pide el número de trabajadores y la tarifa ordinaria.
 * 
 ************************************************************/
public class salarioNeto {

	
	public static void main (String[] args) {
		Scanner entrada=new Scanner(System.in);
		
//Introducuimos el numero de trabajadores
		pideTrab(entrada);
//metemos el valor de la funcion en la variable para poder meterla dentro de calNeto
		double a=pideTar();
	
		
//la salida de cal neto, con las funciones que estan dentro nos da la salida
		calNeto(a);
		
		
	}
	
	
	
//	introducimos por parametro el numero de trabajadores *devuelve el numero de trabajadores
	public static int pideTrab(Scanner entrada) {
		
		int trabajador;
		System.out.println("introduce el numero de trabajadores");
		trabajador=entrada.nextInt();
		return trabajador;
		
	}
//	introducimos el precio de la tarifa y devuelve el precio por hora ingresado
	public static double pideTar() {
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("introduce el tarifa");
		double precio = entrada.nextDouble();
		return precio;
		
	}
// introducimos el parámetro param, tasa por hora que se utiliza en el cálculo del sueldo bruto.
	public static void calNeto(double param) {
		Scanner entrada=new Scanner(System.in);
		int h=pideHora();
		double s=calsueldo(h,param);
		double sn=calImp(s);
		imprimir(s,sn);
		
	}
//	introcucimo las horas 
	public static int pideHora() {
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Dime horas");
		int horas=entrada.nextInt();
		
		return horas;
		
	}
//	calculamos el sueldo con las premisas correspondientes 
	public static double calsueldo(int param1 , double param2) {
		Scanner entrada=new Scanner(System.in);
		double calsueldo;
		if(param1>38) {
//			hacemos el casting de las horas porque calsueldo es double
			calsueldo=((double)param1*param2)*1.5;
		}else {
		 calsueldo=(double)param1*param2;
		}
		return calsueldo;
	}
	
//	calculamos los impuestos con las premisas correspondientes
	public static double calImp(double param) {
		Scanner entrada=new Scanner(System.in);
		double neto=0;
//		premisas
		if(param<500) {
		neto=param;
		}else if(param>500&&param<900) {
			neto=param-(param*0.25);
		}else if(param>900) {
			neto=param-(param*0.45);
		}
		return neto;
		
		
	}
//	metodo imprimir imprime la salida del ejercicio 
	public static void imprimir (double param1,double param2) {
		Scanner entrada=new Scanner(System.in);
		System.out.println(" Salario bruto  "+ param1 +"\n Salario neto  "+param2);
	}
}

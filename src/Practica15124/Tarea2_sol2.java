package Practica15124;
import java.util.*;
//Tarea 2.- Realice un programa que muestra el seno y coseno de los valores devueltos por una función que calcula y 
//el seno y coseno de un ángulo introducido por teclado. El programa termina cuando se introduce por teclado un valor centinela.
//Para convertir de grados a radianes, multiplica el número de grados por π/180. Esto dará la medida en radianes.
//Si tienes un ángulo de 90 grados y quieres saber cuánto mide en radianes, multiplica 90 por π/180.

//ESTA FORMA MEZCLA ANGULOS Y RADIANES METEMOS ANGULOS Y DEVOLVEMOS RADIANES Y NO ES MUY BUENA
public class Tarea2_sol2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		final int CENTINELA=-1;//Centinela cuando se ontroduce este valor sale y pide otro Angulo
		double Grados;
		
		System.out.println("Introcuce el Angulo");
		Grados=sc.nextDouble();
		double sen[]= {Grados};
		double cos[]= {Grados};
		
		System.out.println(senCos(Grados,sen,cos));
	}
	
	public static String senCos(double Grados,double sen[],double cos[]) {
		
		 sen[0]=Math.sin(sen[0]*Math.PI/180);
		 cos[0]=Math.cos(cos[0]*Math.PI/180);
		 
		return "\n El seno del Angulo es :"+ sen[0]+"\n El coseno del Angulo es :"+cos[0];
	}
	
}
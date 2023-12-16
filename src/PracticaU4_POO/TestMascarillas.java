package PracticaU4_POO;
import java.util.*;

public class TestMascarillas {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int opcion;
		
		do {
			System.out.println(" \n 1-Venta de un mascarilla quirurgica \n 2-Venta de una mascarilla \n 0-Salir");
			 opcion=entrada.nextInt();
			
			 
			 switch (opcion) {

			case 1:
				System.out.println("introduce precio ");
				double precio=entrada.nextDouble();
				System.out.println("introduce precio maximo");
				double preciomax=entrada.nextDouble();
				MascarillaQuirurgica m1=new MascarillaQuirurgica(precio, preciomax);
				System.out.println(m1);
				
				break;
			case 2:
				System.out.println("Introduce el tipo de mascarilla NK95, FFP1, FFP2, FFP3 .....");
				String tipo=entrada.next();
				
				System.out.println("Introduce el precio de la mascarilla");
				double pcio=entrada.nextDouble();
				RestodeMascarillas rm1= new RestodeMascarillas(tipo, pcio);
				System.out.println(rm1);
				break;

			default:
				System.out.println("Estas opciones no estan configuradas");
				break;
			}
			
		}while(opcion!=0);

	}

}

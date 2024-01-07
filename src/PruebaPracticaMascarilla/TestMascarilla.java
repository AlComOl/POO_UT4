package PruebaPracticaMascarilla;
import java.util.*;
public class TestMascarilla {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int opcion,cantidad;
		double precioMaximo=0,precio=0,precio1=0;
		String tipo;
		
		do {
		System.out.println("\n 1-Venta de una mascarilla quirurgica \n 2-Venta de una mascarilla \n 0-SALIR");
		opcion=sc.nextInt();
		
		
			switch (opcion) {
			case 1:
					
					System.out.println("Establece el precio maximo");
					precioMaximo=sc.nextDouble();
					System.out.println("Establece el precio");
					precio=sc.nextDouble();
					MascarillaQuirurgica mq1=new MascarillaQuirurgica(precio,precioMaximo);
					
					System.out.println(mq1.toString());
				
				break;
			case 2:
				
					System.out.println("Tipo de mascarilla");
					tipo=sc.next();
				
					System.out.println("definir precio");
					precio1=sc.nextDouble();
					restoMascarillas rm1=new restoMascarillas(tipo,precio1);
					System.out.println(rm1.toString());
				break;
			default:
				break;
			
		}
		}while(opcion!=0) ;
		}
	}



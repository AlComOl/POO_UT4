package PracticaU4_1_24;
import java.util.*;
public class TestInstalacion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int opcion=0;

		System.out.println("Introduce niveles maximo y minimos de PH");
			float min=sc.nextFloat();
			System.err.println();
			float max=sc.nextFloat();
			ControlPH piscina1=new ControlPH();
			piscina1.setMaxpH(min);
			piscina1.setMinpH(max);
			
			do {
				System.out.println("1) Introducir valores de medición."
						+ "2) Procesar medición.\r\n"
						+ "3) Consultar el rango del pH a controlar.\r\n"
						+ "4) Cambiar el rango del pH a controlar.\r\n"
						+ "5) Salir del programa\n");
				switch (opcion) {
				case 1: {
					System.out.println("Introduce Temperatura ");
					float dato=sc.nextFloat();
					 piscina1.setLectura(dato);
					System.out.println("Introduce PH");
					float dato1=sc.nextFloat();
					 piscina1.setLectura(dato);
					System.out.println("Introduce potencia");
					float dato2=sc.nextFloat();
					 piscina1.setLectura(dato);
					
				
				}
				case 2: {
					
				}
				case 3: {
					System.out.println("Los valores del PH de las piscina son:");
					piscina1.setMinpH(min);
					piscina1.setMinpH(max);
					
					
					
				}
				case 4: {
					
					
				}
				case 5: {
					
					
				}
				default:
					
				}
					

			} while (condition);
			
			
	}

}

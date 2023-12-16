package Ejercicio7;
import java.util.Scanner;
public class MediaCaracteres {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int numLineas = 0;
	        int sumaCaracteres = 0;
			System.out.println("Escribe el texto que quieras, (para salir ---> enter ): ");
	        while (true) {
	            String linea = scanner.nextLine();
	            if (linea.length() == 0) {
	                break;
	            }
	            numLineas++;
	            sumaCaracteres += linea.length();
	        }

	        double mediaCaracteres = (double) sumaCaracteres / numLineas;
	        System.out.printf("La media de caracteres por linea es: "+ mediaCaracteres);
	    }
	}


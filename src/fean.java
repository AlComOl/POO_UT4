
import java.util.Scanner;

public class fean {
    
    public static int calcularCodigoVerificacion(String numeroEntrada) {
        int suma = 0;

        char[] codigo = numeroEntrada.toCharArray();
    
        for (int i = 0; i < codigo.length; i++) {
            int digito = Character.getNumericValue(codigo[i]);

            
            if (i % 2 == 0) { 
                suma += digito * 3 + obtenerMenorDerecha(codigo, i);
            } else {
                suma += digito * 2 + obtenerMayorIzquierda(codigo, i);
            }
        }

        return suma;
    }

    private static int obtenerMenorDerecha(char[] digitos, int posicion) {
        int siguientePosicion = posicion + 1;

    int menorDerecha = 0;  

    while (siguientePosicion < digitos.length) {
        char caracter = digitos[siguientePosicion];
        if (caracter != '0') {
            int digito = Character.getNumericValue(caracter);
            
            if (menorDerecha == 0 || digito < menorDerecha) {
                menorDerecha = digito;
            }
        }

        siguientePosicion++;
    }

    return menorDerecha;
    }

    private static int obtenerMayorIzquierda(char[] digitos, int posicion) {
        int anteriorPosicion = posicion - 1;
    
        int mayorIzquierda = 0;
    
        while (anteriorPosicion >= 0) {
            char caracter = digitos[anteriorPosicion];
            if (caracter != '0') {
                int digito = Character.getNumericValue(caracter);
                if (mayorIzquierda == 0 || digito > mayorIzquierda) {
                    mayorIzquierda = digito;
                }
            }
            anteriorPosicion--;
        }
    
        return mayorIzquierda;
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        final double LIMITE= Math.pow(10,18);
        double numCasosPrueba;
        String numeroEntrada;

        numCasosPrueba= tec.nextDouble();

        if(numCasosPrueba>=1 && numCasosPrueba <= LIMITE){
            numeroEntrada=tec.next();

             int codigoVerificacion = calcularCodigoVerificacion(numeroEntrada);
             System.out.println(codigoVerificacion);
        }
    }
}
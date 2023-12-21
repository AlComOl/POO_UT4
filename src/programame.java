import java.util.Scanner;

public class programame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int N = scanner.nextInt(); // Número de votos

            if (N == 0) {
                 // Termina si el número de votos es 0
            }

            int votosAustraliaNuevaZelanda = 0;
            int votosColombia = 0;

            // Contar los votos por cada candidatura
            for (int i = 0; i < N; i++) {
                String voto = scanner.next(); // Lee el voto

                if (voto.equals("Australia-NuevaZelanda")) {
                    votosAustraliaNuevaZelanda++;
                } else if (voto.equals("Colombia")) {
                    votosColombia++;
                }
            }

            // Determinar la candidatura ganadora o si hay empate
            if (votosAustraliaNuevaZelanda > votosColombia) {
                System.out.println("Australia-NuevaZelanda");
            } else if (votosColombia > votosAustraliaNuevaZelanda) {
                System.out.println("Colombia");
            } else {
                System.out.println("EMPATE");
            }
        }

        scanner.close();
    }
}

import java.util.Random;
import java.util.Scanner;

public class Casino {
    public Casino() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Introduce la cantidad de dinero inicial: ");
        double dineroUsuario = scanner.nextDouble();
        boolean jugando = true;

        while(jugando) {
            int numeroAleatorio = random.nextInt(3) + 1;
            System.out.println("\nNúmero aleatorio: " + numeroAleatorio);
            switch (numeroAleatorio) {
                case 1:
                    dineroUsuario *= 2.0F;
                    System.out.println("Has duplicado tu dinero, Ahora tienes: " + dineroUsuario);
                    break;
                case 2:
                    dineroUsuario /= 2.0F;
                    System.out.println("Has perdido la mitad de tu dinero, Ahora tienes: " + dineroUsuario);
                    break;
                case 3:
                    dineroUsuario = 0.0F;
                    System.out.println("Has perdido todo tu dinero, Fin del juego.");
                    jugando = false;
            }

            if (numeroAleatorio != 3) {
                System.out.print("¿Quieres seguir jugando? (s/n): ");
                String respuesta = scanner.next();
                if (respuesta.equalsIgnoreCase("n")) {
                    jugando = false;
                }
            }
        }

        System.out.println("Tu dinero final es: " + dineroUsuario);
        scanner.close();
    }
}

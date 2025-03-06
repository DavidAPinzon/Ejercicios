import java.util.Random;
import java.util.Scanner;

public class AdivinarNum {
    public static void main(String[] args) {
        Random ale = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroale = ale.nextInt(50) + 1;
        int intentos = 3;
        int intentoUsuario;
        int contadorwhile = 0;

        System.out.println("Adivina el numero entre 1 y 50");

        while (contadorwhile < intentos) {
            System.out.println("Intento: " + (contadorwhile + 1)+ ": ");
            intentoUsuario = scanner.nextInt();

            if (intentoUsuario == numeroale) {
                System.out.println("Numero Adivinado");
                return;
            } else if (intentoUsuario < numeroale) {
                System.out.println("El numero a adivinar es mayor");
            } else {
                System.out.println("El numero a adivinar es menor");
            }
            contadorwhile++;
        }
        System.out.println("Perdiste, el numero era: " + numeroale);

    }
}
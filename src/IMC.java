import java.util.Locale;
import java.util.Scanner;

public class IMC {
    public IMC() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Ingrese su peso en kilogramos");
        if (scanner.hasNextDouble()) {
            double peso = scanner.nextDouble();
            if (peso <= (double)0.0F) {
                System.out.println("El peso debe ser un número positivo.");
                scanner.close();
            } else {
                System.out.println("Ingrese su estatura en metros");
                if (scanner.hasNextDouble()) {
                    double estatura = scanner.nextDouble();
                    if (estatura <= (double)0.0F) {
                        System.out.println("La estatura debe ser un número positivo.");
                        scanner.close();
                    } else {
                        double IMC = peso / Math.pow(estatura, 2.0F);
                        double bajoPeso = 18.5F;
                        double normopesoMin = 18.5F;
                        double normopesoMax = 24.9;
                        double sobrepesoGrado1Min = 25.0F;
                        double sobrepesoGrado1Max = 26.9;
                        double sobrepesoGrado2Min = 27.0F;
                        double sobrepesoGrado2Max = 29.9;
                        double obesidadTipo1Min = 30.0F;
                        double obesidadTipo1Max = 34.9;
                        double obesidadTipo2Min = 35.0F;
                        double obesidadTipo2Max = 39.9;
                        double obesidadTipo3Min = 40.0F;
                        double obesidadTipo3Max = 49.9;
                        double obesidadTipo4Min = 50.0F;
                        String imcFormateado = String.format("%.2f", IMC);
                        if (IMC < bajoPeso) {
                            System.out.println("Su IMC es: " + imcFormateado);
                            System.out.println("Bajo peso");
                        } else if (IMC >= normopesoMin && IMC <= normopesoMax) {
                            System.out.println("Su IMC es: " + imcFormateado);
                            System.out.println("Normopeso");
                        } else if (IMC >= sobrepesoGrado1Min && IMC <= sobrepesoGrado1Max) {
                            System.out.println("Su IMC es: " + imcFormateado);
                            System.out.println("Sobrepeso grado I");
                        } else if (IMC >= sobrepesoGrado2Min && IMC <= sobrepesoGrado2Max) {
                            System.out.println("Su IMC es: " + imcFormateado);
                            System.out.println("Sobrepeso grado II");
                        } else if (IMC >= obesidadTipo1Min && IMC <= obesidadTipo1Max) {
                            System.out.println("Su IMC es: " + imcFormateado);
                            System.out.println("Obesidad tipo I");
                        } else if (IMC >= obesidadTipo2Min && IMC <= obesidadTipo2Max) {
                            System.out.println("Su IMC es: " + imcFormateado);
                            System.out.println("Obesidad tipo II");
                        } else if (IMC >= obesidadTipo3Min && IMC <= obesidadTipo3Max) {
                            System.out.println("Su IMC es: " + imcFormateado);
                            System.out.println("Obesidad tipo III (mórbida)");
                        } else if (IMC >= obesidadTipo4Min) {
                            System.out.println("Su IMC es: " + imcFormateado);
                            System.out.println("Obesidad tipo IV (extrema)");
                        } else {
                            System.out.println("Fuera del rango");
                        }

                        scanner.close();
                    }
                } else {
                    System.out.println("Entrada inválida. Ingrese un número.");
                    scanner.close();
                }
            }
        } else {
            System.out.println("Entrada inválida. Ingrese un número.");
            scanner.close();
        }
    }
}
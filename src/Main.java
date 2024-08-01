//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingrese la nota en un rango de 1 a 10 para saber cual es su calificación:");
        int nota = scanner.nextInt();

        switch (nota){
            case 0:
                System.out.println("Número no válido, por favor verifique.");
                break;
            case 1:
                System.out.println("Su calificación es: F");
                break;
            case 2:
                System.out.println("Su calificación es: F");
                break;
            case 3:
                System.out.println("Su calificación es: D");
                break;
            case 4:
                System.out.println("Su calificación es: D");
                break;
            case 5:
                System.out.println("Su calificación es: C");
                break;
            case 6:
                System.out.println("Su calificación es: C");
                break;
            case 7:
                System.out.println("Su calificación es: B");
                break;
            case 8:
                System.out.println("Su calificación es: B");
                break;
            case 9:
                System.out.println("Su calificación es: A");
                break;
            case 10:
                System.out.println("Su calificación es: A");
                break;
            default:
                System.out.println("Número no válido, por favor verifique.");
        }
      scanner.close();
    }
}
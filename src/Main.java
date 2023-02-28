import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba una cadena de 9 caracteres que contenga _ O y X: ");
        String lector = scanner.nextLine();

        if (lector.length() != 9) {
            System.out.println("La cadena debe tener exactamente 9 caracteres >:(");
            return;
        }

        System.out.println("Cadena puesta: " + lector);

        System.out.println("Estilo: ");
        System.out.println(" " + lector.charAt(0) + " | " + lector.charAt(1) + " | " + lector.charAt(2) + " ");
        System.out.println("---|---|---");
        System.out.println(" " + lector.charAt(3) + " | " + lector.charAt(4) + " | " + lector.charAt(5) + " ");
        System.out.println("---|---|---");
        System.out.println(" " + lector.charAt(6) + " | " + lector.charAt(7) + " | " + lector.charAt(8) + " ");
    }}
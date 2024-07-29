import java.util.Scanner;

public class tonta2 {
    public static void main(String[] args) {
        Scanner scannertick = new Scanner(System.in);
        Tickets tickets = new Tickets();

        int i = 1;
        while (i <= 5) {
            System.out.println("Ingrese el nombre de la asignatura " + i + ":");
            String nombre = scannertick.nextLine();
            System.out.println("Ingrese el promedio de " + nombre + ":");
            float promedio = scannertick.nextFloat();
            scannertick.nextLine(); 
            i++;
        }

        scannertick.close();
    }
}

import java.util.Scanner;
public class tonta2 {
    public static void main(String[] args){
        Scanner cliente = new Scanner(System.in);
        Tickets ticket = new Tickets();
        String nombreC,ubicacion,noTicket,email,nombreT = "";
        int cantBol, Capacidadt = 0; 
        Teatro teatro = new Teatro(); 
        float presupuesto;
        Localidad balcon1 = new Localidad();
        Localidad balcon2 = new Localidad();
        Localidad platea = new Localidad();
        int i = 1;
        int dec = 0;
        while(i<=5){
            System.out.println("Bienvenido! ¿Es dueño del teatro o cliente?");
            System.out.println("Si es dueño del teatro ingrese 1, si es cliente ingrese 2");
            dec = cliente.nextInt(); 
            if(dec==1){
                System.out.println("Bienvenido! Ingrese el nombre del teatro");
                nombreT = cliente.nextLine();
                System.out.println("Ingrese la cantidad de asientos de su balcon 1 ó VIP");
                balcon1.setCapacidad(cliente.nextInt());
                System.out.println("Ingrese la cantidad de asientos de su balcon 2");
                balcon2.setCapacidad(cliente.nextInt());
                System.out.println("Ingrese la cantidad de asientos de su platea");
                platea.setCapacidad(cliente.nextInt());
            }  
            teatro = new Teatro(nombreT, 0, balcon1, balcon2, platea,ticket);
            teatro.calculardisp();
            if(dec==2){
                System.out.println("Bienvenido! Ingrese su nombre");
                nombreC = cliente.nextLine();
                System.out.println("Ingrese el tipo de ubicación que desea en el teatro");
                System.out.println("Balcon1,Balcon2 o Platea");
                ubicacion = cliente.nextLine();
                System.out.println("Ingrese su correo electrónico");
                email = cliente.nextLine();
                System.out.println("Ingrese la cantidad de boletos que desea comprar");
                cantBol = cliente.nextInt();
                System.out.println("Ingrese su presupuesto total");
            }
            i++;
        }
    }
}

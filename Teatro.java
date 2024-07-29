public class Teatro {
private String Nombre;
private int Capacidad;
private Localidad balcon1;
private Localidad balcon2;
private Localidad platea;

    //Constructores

    public Teatro(){
this.Nombre = new String();
this.Capacidad = 0;
this.balcon1= new Localidad();
this.balcon2=new Localidad();
this.platea=new Localidad(); 
}
public Teatro(String Nombre, int Capacidad, Localidad balcon1, Localidad balcon2, Localidad platea){
    this.Nombre = Nombre;
    this.Capacidad=Capacidad;
    this.balcon1=balcon1;
    this.balcon2=balcon2;
    this.platea=platea;
    }

    //sets y gets
    //Funciones
public int calculardisp(){
int total = balcon1.getCapacidad()+balcon2.getCapacidad()+platea.getCapacidad();
this.Capacidad = total; 
return total; 
} 
//Calcula y retorna la cantidad de asientos disponibles en todo el teatro.
public int Actudisp(){
int cbalcon1= balcon1.getCapacidad(); 
}

}

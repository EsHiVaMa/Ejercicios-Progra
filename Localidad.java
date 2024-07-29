public class Localidad {
    private int Capacidad;
    private float Precio;

    //Constructores

    public Localidad(){
this.Capacidad = 0;
this.Precio = 0.0f; 
}
public Localidad(int Capacidad, float Precio){
    this.Capacidad=Capacidad;
    this.Precio=Precio;
    }

    //sets y gets
public int getCapacidad(){
    return Capacidad;
}

}

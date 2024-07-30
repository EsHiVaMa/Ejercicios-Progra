public class Localidad {
    private int Capacidad;
    private float Precio;

    public float getPrecio() {
        return this.Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

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
public int setCapacidad(int Capacidad){
    return (this.Capacidad=Capacidad);
}

}

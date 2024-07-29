public class Teatro {
private String Nombre;
private int Capacidad;
private Localidad balcon1;
private Localidad balcon2;
private Localidad platea;
private int totalTickvent;
private Tickets tick;

    //Constructores

    public Teatro(){
this.Nombre = new String();
this.Capacidad = 0;
this.balcon1= new Localidad();
this.balcon2=new Localidad();
this.platea=new Localidad(); 
this.totalTickvent=0;
this.tick=new Tickets();
}
public Teatro(String Nombre, int Capacidad, Localidad balcon1, Localidad balcon2, Localidad platea,int totalTickvent,Tickets tick){
    this.Nombre = Nombre;
    this.Capacidad=Capacidad;
    this.balcon1=balcon1;
    this.balcon2=balcon2;
    this.platea=platea;
    this.totalTickvent=totalTickvent;
    this.tick=tick;
    }

    //sets y gets
    //Funciones
public int calculardisp(){
int total = balcon1.getCapacidad()+balcon2.getCapacidad()+platea.getCapacidad();
this.Capacidad = total; 
return total; 
} //Calcula y retorna la cantidad de asientos disponibles en todo el teatro.
public int getCapacidad(){
    return Capacidad;
}
public int Actudisp(){
int ticketstol = tick.getcantBol();
int ubi = tick.tubicación();
int total = this.Capacidad;  
int cbalcon1= balcon1.getCapacidad();
int cbalcon2=balcon2.getCapacidad();
int cplatea=platea.getCapacidad(); 
if(ubi==1){
cbalcon1=cbalcon1-ticketstol;
}
if(ubi==2){
    cbalcon2=cbalcon2-ticketstol;
}
if(ubi==3){
    cplatea=cplatea-ticketstol;
}
return (this.Capacidad=total);
}

}


public class Tickets {
private int cantBol; 
private String nombreC;
private String ubicacion; 
private Teatro teatro; 
private String noTicket; 
private String email;
private float presupuesto;

    //Constructores

    public Tickets(){
this.cantBol = 0;
this.nombreC = new String();
this.ubicacion= new String();
this.teatro=new Teatro();
this.noTicket=new String();
this.email=new String();
this.presupuesto=0.0f; 
}
public Tickets(int cantBol,String nombreC,String ubicacion,Teatro teatro, String noTicket, String email,float presupuesto){
    this.cantBol=cantBol;
    this.nombreC=nombreC;
    this.ubicacion=ubicacion;
    this.teatro=teatro;
    this.noTicket=noTicket;
    this.email=email;
    this.presupuesto=presupuesto;
}

    //sets y gets
public int getcantBol(){
    return cantBol;
}
public String getubicacion(){
    return ubicacion;
}
public float getPresupuesto(){
    return presupuesto;
}
//funciones generales

public int tubicación(){
    int i=0;
    String dec = getubicacion();
    if(dec=="Balcon1"){
        i = 1;
    }
    if(dec=="Balcon2"){
        i=2;
    }
    if(dec=="Platea"){
        i=3;
    }
    return i;
}
public float totalmoney(){
float money=0.0f;
float precio1=1800.0f;
float precio2=300.0f;
float preciop=600.0f;
int x = tubicación(); 
int y = getcantBol();
if(x==1){
money = y * precio1; 
}
if(x==2){
money = y*precio2;
}
if(x==3){
    money = y*preciop;
}
return money;
}
public boolean validarPresupuesto(){
    float a = getPresupuesto();
    float b = totalmoney();
    boolean validacion = true; 
    if(a>=b){
        System.out.println("Felicidades, cuenta con el dinero suficiente para pagar sus boletos");
        validacion = true;
    } 
    if(a<b){
        System.err.println("Su presupuesto es menor a la compra que desea realizar");
        validacion = false;
    }
return validacion;
}//Valida si el presupuesto es suficiente para la compra de boletos. 
//Retorna true si es suficiente, false si no lo es.
public boolean validarDisponibilidad(){
    Localidad cbalcon1 = teatro.getbalcon1();
    Localidad cbalcon2 = teatro.getbalcon2();
    Localidad cplatea = teatro.getplatea();
    int b1 = cbalcon1.getCapacidad();
    int b2 = cbalcon2.getCapacidad();
    int p1 = cplatea.getCapacidad();
    int iu = tubicación();
    int cb = getcantBol();
    int x = 100;
    boolean r=true;
    if (iu==1){
        x = b1-cb;
    }
    if(iu==2){
        x = b2-cb;
    }
    if(iu==3){
        x = p1-cb;
    }
    if (x<6){
        r = false;
    }
    return r;
}//Valida si hay suficientes asientos disponibles en la localidad seleccionada.
// Retorna true si hay disponibilidad, false si no la hay.
public Tickets registrarventa() {
        boolean a = validarPresupuesto();
        boolean b = validarDisponibilidad();
        if (!a || !b) {
            return null;
        }
        return this;
    }//Registra o no la venta del ticket.
}

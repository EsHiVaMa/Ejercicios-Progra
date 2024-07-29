public class Tickets {
private int cantBol; 
private String nombreC;
private String ubicacion; 
private Teatro teatro; 
private String noTicket; 
private String email;

    //Constructores

    public Tickets(){
this.cantBol = 0;
this.nombreC = new String();
this.ubicacion= new String();
this.teatro=new Teatro();
this.noTicket=new String();
this.email=new String(); 
}
public Tickets(int cantBol,String nombreC,String ubicacion,Teatro teatro, String noTicket, String email){
    this.cantBol=cantBol;
    this.nombreC=nombreC;
    this.ubicacion=ubicacion;
    this.teatro=teatro;
    this.noTicket=noTicket;
    this.email=email;
}

    //sets y gets
public int getcantBol(){
    return cantBol;
}
public String getubicacion(){
    return ubicacion;
}
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
public String validarPresupuesto(){
}
}

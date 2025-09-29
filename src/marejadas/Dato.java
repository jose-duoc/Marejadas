package marejadas;

public class Dato {
    protected double anio;
    protected double mes;
    protected double dia;
    protected double hora;
    
    public Dato(double anio, double mes, double dia, double hora){
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
        this.hora = hora;
    }
    public void mostrar(){
        System.out.println("fecha:" + anio + "-" + mes + "-" + dia + " Hora: " + hora);
    }
}

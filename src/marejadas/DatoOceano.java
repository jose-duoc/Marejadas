package marejadas;

public class DatoOceano extends Dato{
    private double hm0; //Altura media de las olas en metros
    private double tz; //Periodo medio de la ola en segundos
    private double te; //Periodo energético de la ola en segundos
    
    public DatoOceano(double anio, double mes, double dia, double hora, double hm0, double tz, double te){
        super(anio, mes,dia,hora);
        this.hm0 = hm0;
        this.tz = tz;
        this.te = te;
    }
    
    //Polimorfismo
    @Override
    public void mostrar(){
        System.out.println("Fecha: "+ anio + "-" + mes + "-" + dia +" "+ hora+ "h"+" | Hm0=" + hm0 + " | Tz="+ tz+ " |Te="+te);
    }
}

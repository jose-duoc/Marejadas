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
        System.out.println("Fecha: "+ anio + "-" + mes + "-" + dia +" "+ hora+ "h"+" | Hm0=" + getHm0() + " | Tz="+ getTz()+ " |Te="+getTe());
    }

    /**
     * @return the hm0
     */
    public double getHm0() {
        return hm0;
    }

    /**
     * @param hm0 the hm0 to set
     */
    public void setHm0(double hm0) {
        this.hm0 = hm0;
    }

    /**
     * @return the tz
     */
    public double getTz() {
        return tz;
    }

    /**
     * @param tz the tz to set
     */
    public void setTz(double tz) {
        this.tz = tz;
    }

    /**
     * @return the te
     */
    public double getTe() {
        return te;
    }
    /**
     * @param te the te to set
     */
    public void setTe(double te) {
        this.te = te;
    }
    
    public double getAnio(){
        return anio;
    }
    public double getMes(){
        return mes;
    }
    public double getDia(){
        return dia;
    }
    public double getHora(){
        return hora;
    }
}

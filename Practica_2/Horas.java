/*
    *
    * Clase deteerminada a modelar las horas
    * 
    */

public class Horas{
     private int horas;
     
     /*
     *
     * Constructor de la clase, inicializamos las horas en 0
     * 
     */
     
     public Horas(){
          this.horas = 0;
     }
     
     /*
     *
     * Metodo para incrementar las horas 1 por 1 en el intervalo
     * [0-23] despues reseteamos a 0
     * @return true si se resetea a 0, false en otro caso
     * 
     */
     
     public void incrementar(){
          this.horas++;
          if(this.horas > 23){
               this.horas = 0;
          }
     }
     
     /*
     *
     * Metodo para obtener la hora
     * @return hora actual
     * 
     */
     
     public int getHoras(){
          return this.horas;
     }
     
     /*
     *
     * Metodo para establecer la hora
     * @return hora a establecer
     * 
     */
     
     public void setHoras(int horas){
          this.horas = horas;
     }
}
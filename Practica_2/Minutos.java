/*
    *
    * Clase determinada a modelar minutos.
    * 
    */
   public class Minutos{
         private int minutos;
         
         /*
         *
         * Constructor de la clase, inicializamos los minutos en 0.
         * 
         */
         
         public Minutos(){
              this.minutos = 0;
         }
         
         /*
         *
         * Metodo para incrementar los minutos 1 por 1 en el intervalo
         * [0-59] despues reseteamos a 0
         * @return true si se resetea a 0, false en otro caso.
         * 
         */
         
         public boolean incrementar(){
              this.minutos++;
              if(this.minutos > 59){
                this.minutos = 0;
                return true;
              }
              return false;
         }
         
         /*
         *
         * Metodo para obtener los minutos.
         * @return minutos actuales
         * 
         */
         
         public int getMinutos(){
              return this.minutos;
         }
         
         /*
         *
         * Metodo para establecer los minutos.
         * 
         */
         
         public void setMinutos(int minutos){
              this.minutos = minutos;
         }
   }
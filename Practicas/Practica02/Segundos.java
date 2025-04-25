/*
    *
    * Clase detetrminada a modelar segundos
    *
    */

    public class Segundos {
        private int segundos;
    
        /*
        *
        * Constructor de la clase, incializamos los segundos en 0
        * 
        */
    
       public Segundos(){
           this.segundos = 0;
       }
    
        /*
        *
        * Metodo para incrementar los segundos 1 por 1 en el intervalo
        * [0-59] despues reseteamos a 0.
        * @return true si se resetea a 0, false en otro caso
        * 
        */
    
       public boolean incrementar(){
             this.segundos++;
             if(this.segundos > 59){
                  this.segundos = 0;
                  return true;
             }
             return false;
        }
        
         /*
         *
         * Metodo para obtener los segundos.
         * @return segundos
         * 
         */
    
        public int getSegundos(){
            return this.segundos;
        }
    
        /*
        *
        * Metodo para establecer los segundos.
        * 
        */
    
        public void setSegundos(int segundos){
            this.segundos = segundos;
        }
    }
        
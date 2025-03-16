/**
 * Interfaz que define los métodos para un recipiente con forma de cilindro
 * que puede almacenar un volumen líquido.
 */
public interface RecipienteInterfaz {
    /**
     * Calcula la dimension de un recipiente utilizando la formula matematica para el
     * volumen de un cilindro.
     *
     * @return dimension
     */
    public double dimension();

    /**
     * Calcula y devuelve la cantidad maxima de liquido que cabe en
     * el recipiente, utilizando la formula matematica del volumen para un cilindro
     *
     * @return capacidadTotal 
     */
    public double capacidadTotal();

    /**
     * Calcula y devuelve la cantidad actual de liquido en
     * el recipiente
     *
     * @return cantidadActual.
     */
    public double cantidadActual();

    /**
     * Calcular y devuelve la diferencia entre la capacidad total y
     * la cantidad actual del recipiente.
     *
     * @return capacidadRestante.
     */
    public double capacidadRestante();

    /**
     * Indica si el recipiente esta vacio, es decir, la cantidadTotal es cero.
     * @return false si cantidadTotal es distinnta de 0 
     * @return true si cantidadTotal es igual 0
     */
    public boolean estaVacio();

    /**
     * Indica si el recipiente esta lleno, es decir, la cantidad
     * de liquido que contiene es igual a la de su capacidad.
     *
     * @return true si cantidadActual es igual a capacidadtotal
     * @return false si cantidadActual es menor a capacidadTotal
     */
    public boolean estaLleno();

    /**
     * Agregar una nueva cantidad de liquido al recipiente
     * Se debera devolver la cantidad de liquido excedente.
     * Crear un metodo auxiliar cantidadAgregar para la cantidad a agregar al recipiente
     * Y otro metodo auxiliar para el excedentte de liquido llamdo cantidadExcedente
     * Por ejemplo, si un recipiente tiene cantidadActual 15 y
     * capacidadTotal 20, al agregar con 10 debera actualizar
     * la cantidad actual a 20 y devolver un excedente de 5.
     *
     * @param cantidadAgregar La cantidad de liquido a agregar.
     * @return cantidadExcedente. Puede ser cero si cantidaadAgregar + cantidadActual = capacidadTotal.
     */
    public double agrergar(double cantidadAgregar);

    /**
     * Actualizar cantidadActual = 0
     *
     * @return La cantidadActual antes de actualizar.
     */
    public double vacia();

    /**
     * Vierte el contenido de un primer recipiente en otro recipiente respetando 
     * la capacidad maxima del otro recipiente y en caso de haber excedente, este excedente
     * se debe guardar en el primer recipiente 
     * Por ejemplo, si un primer recipiente tiene cantidadActual 10 y
     * vertemos su contenido en un otro recipiente con cantidadActual 3
     * y capacidadTotal 5, entonces debe regresar que el primer
     * recipiente quede con cantidadActual 8 y el otro recipiente con
     * cantidadActual 5.
     *
     * @param otro El recipiente donde se vertira el liquido del primer recipiente
     */
    public void vierte(Recipiente otro);

    /**
     * Indica si el recipiente tiene exactamente las mismas
     * dimensiones que otro recipiente. Solo comparar las dimensiones.
     *
     * @param otro El otro recipiente con que se va a comparar la dimension.
     * @return true si dimension de recipiente es igual a dimension de recipiente otro 
     * @return false si dimension de recipiente NO es igual a dimension de recipiente otro
     */
    public boolean mismasDimensiones(Recipiente otro);

    /**
     * Indica si el recipiente tiene exactamente la misma
     * capacidad total que otro. Solo revisamos la capacidad total
     *
     * @param otro El otro recipiente a comparar
     * @return true si capacidadTotal de recipiente es igual a capacidadTotal de recipiente otro
     * @return false si capacidadTotal de recipiente NO es igual a capacidadTotal de recipiente otro
     */
    public boolean mismaCapacidad(Recipiente otro);

    /**
     * Indica si un recipiente tiene mayor cantidad actual que otro recipiente.
     *
     * @param otro El otro recipiente con que va a comparar
     * @return true si cantidadActual de recipiente es igual a cantidadActual de otro recipiente
     * @return false si cantidadActual de recipiente NO es igual a cantidadActual de otro recipiente
     */
    public boolean contieneMas(Recipiente otro);

    /**
     * Indica si el recipiente tiene mayor capacidadTotal que otro recipiente 
     *
     * @param otro El otro recipiente con que se va a comparar
     * @return true si tiene mayor capacidad restante, false en otro caso.
     */
    public boolean cabeMas(Recipiente otro);

    /**
     * Crea un nuevo recipiente con cantidadActual igual a 0 cuya capacidadTotal es igual
     * a la cantidadActual del otro recipiente.
     * Por ejemplo, a partir de otro recipiente de altura 'h' y radio 'r'
     * con cantidadActual igual a la mitad de dimension, entonces se creea un nuevo recipiente
     * de altura 'h/2' y radio 'r'
     *
     * @return Un nuevo recipiente vacío con dimension igual a cantidadActual del otro recipiente.
     */
    public Recipiente creaContenedorJusto();

    /**
     * Devuelve una cadena que exhiba con buen formato la
     * dimension, capacidadActual y cantidadActual del recipiente.
     *
     * @return La cadena correspondiente al recipiente.
     */
    public String muestra();
}
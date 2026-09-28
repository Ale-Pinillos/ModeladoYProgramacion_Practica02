/**
 * Representa un ingrediente de manguitos para un helado.
 *
 */
public class Mangos extends Topping{

    /**
     * Crea un ingrediente de manguitos para el helado.
     *
     * @param iceCream el helado al que se agregarán los manguitos
     */
    public Mangos(IceCream iceCream){
        this.iceCream = iceCream;
        this.description = ", manguitos";
        this.name = "manguitos";
        this.cost = 15;
    }
}

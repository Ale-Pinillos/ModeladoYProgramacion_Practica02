/**
 * Representa un ingrediente de fresitas para un helado.
 *
 */
public class Strawberries extends Topping{

    /**
     * Crea un ingrediente de fresitas para el helado.
     *
     * @param iceCream el helado al que se agregarán las fresitas
     */
    public Strawberries(IceCream iceCream){
        this.iceCream = iceCream;
        this.description = ", fresitas";
        this.name = "fresitas";
        this.cost = 15;
    }
}

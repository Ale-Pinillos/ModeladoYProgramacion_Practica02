/**
 * Representa un ingrediente de malvaviscos para un helado.
 *
 */
public class Marshmallows extends Topping{

    /**
     * Crea un ingrediente de malvaviscos para el helado.
     *
     * @param iceCream el helado al que se agregarán las malvaviscos
     */
    public Marshmallows(IceCream iceCream){
        this.iceCream = iceCream;
        this.description = ", malvaviscos";
        this.name = "malvaviscos";
        this.cost = 8;
    }
}

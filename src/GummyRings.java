/**
 * Representa un ingrediente de gomitas de aros para un helado.
 *
 */
public class GummyRings extends Topping{

    /**
     * Crea un ingrediente de gomitas de aros para el helado.
     *
     * @param iceCream el helado al que se agregarán las gomitas de aros
     */
    public GummyRings(IceCream iceCream){
        this.iceCream = iceCream;
        this.description = ", gomitas de aro";
        this.name = "gomitas de aro";
        this.cost = 14;
    }
}

/**
 * Representa un complemento de gomitas de gusano para un helado.
 *
 */
public class GummyWorms extends Topping{

    /**
     * Crea un ingrediente de gomitas de gusano para el helado.
     *
     * @param iceCream el helado al que se agregarán las gomitas de gusano
     */
    public GummyWorms(IceCream iceCream){
        this.iceCream = iceCream;
        this.description = ", gomitas de gusano";
        this.name = "gomitas de gusano";
        this.cost = 10;
    }
}

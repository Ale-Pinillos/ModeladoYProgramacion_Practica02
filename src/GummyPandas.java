/**
 * Representa un ingrediente de gomitas de pandas para un helado.
 *
 */
public class GummyPandas extends Topping{

    /**
     * Crea un ingrediente de gomitas de pandas para el helado.
     *
     * @param iceCream el helado al que se agregarán las gomitas de pandas
     */
    public GummyPandas(IceCream iceCream){
        this.iceCream = iceCream;
        this.description = ", gomitas de panda";
        this.name = "gomitas de panda";
        this.cost = 12;
    }
}

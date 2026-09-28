/**
 * Representa un ingrediente de chispas de chocolate para un helado.
 *
 */
public class ChocolateChips extends Topping{

    /**
     * Crea un ingrediente de chispas de chocolate para el helado.
     *
     * @param iceCream el helado al que se agregarán las chispas de chocolate
     */
    public ChocolateChips(IceCream iceCream){
        this.iceCream = iceCream;
        this.description = ", chispas de chocolate";
        this.name = "chispas de chocolate";
        this.cost = 15;
    }
}

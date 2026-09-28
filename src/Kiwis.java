/**
 * Representa un ingrediente de kiwis para un helado.
 *
 */
public class Kiwis extends Topping{

    /**
     * Crea un ingrediente de kiwis para el helado.
     *
     * @param iceCream el helado al que se agregarán los kiwis
     */
    public Kiwis(IceCream iceCream){
        this.iceCream = iceCream;
        this.description = ", kiwis";
        this.name = "kiwis";
        this.cost = 15;
    }
}

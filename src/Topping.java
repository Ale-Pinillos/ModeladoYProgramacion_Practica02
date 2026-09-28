/**
 * Representa un ingrediente adicional para un helado.
 *
 */
public class Topping extends IceCream{
    /**
     * Helado al que se le agrega el ingrediente extra.
     */
    protected IceCream iceCream;

    /**
     * Devuelve el costo total del helado incluyendo el ingrediente extra.
     *
     * @return el costo del helado más el costo del ingrediente
     */
    public int getCost(){
        return iceCream.getCost() + this.cost;
    }

    /**
     * Devuelve el nombre del helado.
     *
     * @return el nombre del helado
     */
    public String getName(){
        return iceCream.getName();
    }

    /**
     * Devuelve la descripción del helado junto con la descripción
     * del ingrediente.
     *
     * @return la descripción del helado y del ingrediente
     */
    public String getDescription(){
        return iceCream.getDescription() + this.description;
    }
}

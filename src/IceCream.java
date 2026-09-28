/**
 * Representa la informacion basica para un helado.
 *
 */
public abstract class IceCream{
    /**
     * Descripción del helado.
     */
    protected String description;

    /**
     * Nombre del helado.
     */
    protected String name;

    /**
     * Costo del helado.
     */
    protected int cost;

    /**
     * Regresa el costo del helado.
     *
     * @return el costo del helado
     */
    public int getCost(){
        return cost;
    }

    /**
     * Regresa el nombre del helado.
     *
     * @return el nombre del helado
     */
    public String getName(){
        return name;
    }

    /**
     * Regresa la descripción del helado.
     *
     * @return la descripción del helado
     */
    public String getDescription(){
        return description;
    }
}

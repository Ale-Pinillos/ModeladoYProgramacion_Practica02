/**
 * Representa un producto que puede ser vendido en la pizzeria,
 * proporcionando la informacion de precio y descripcion comun a
 * todos los articulos vendibles (pizzas, helados y los toppings).
 */
public interface Product {

    /**
     * Obtiene el costo del producto.
     *
     * @return el precio del producto.
     */
    int getCost();

    /**
     * Obtiene el nombre del producto.
     *
     * @return el nombre del producto.
     */
    String getName();

    /**
     * Obtiene la descripcion del producto.
     *
     * @return la descripcion del producto.
     */
    String getDescription();
}

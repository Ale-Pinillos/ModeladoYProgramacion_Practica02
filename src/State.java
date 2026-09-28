/**
 * Define las operaciones que pueden ser ejecutadas por los diferentes
 * estados del robot.
 *
 */
public interface State{
    
    /**
     * Procesa el evento de llamada al robot.
     *
     * @return mensaje correspondiente al resultado de la llamada
     */
    public String call();

    /**
     * Procesa la solicitud de cancelación del pedido.
     *
     * @return mensaje correspondiente al resultado de la cancelación
     */
    public String cancelOrder();

    /**
     * Procesa la solicitud de ordenar un helado.
     *
     * @return mensaje correspondiente al resultado de la solicitud
     */
    public String orderIceCream();

    /**
     * Procesa la solicitud de ordenar una pizza.
     *
     * @param pizzaType tipo de pizza que se desea ordenar
     * @return mensaje correspondiente al resultado de la solicitud
     */
    public String orderPizza(Pizza pizzaType);

    /**
     * Procesa la confirmación del pedido.
     *
     * @return mensaje correspondiente al resultado de la confirmación
     */
    public String confirmOrder();

    /**
     * Procesa la solicitud para iniciar la preparación del pedido.
     *
     * @return mensaje correspondiente al resultado de la solicitud
     */
    public String requestPreparation();

    /**
     * Procesa la selección del tipo de masa de la pizza.
     *
     * @param dough tipo de masa seleccionado
     * @return mensaje correspondiente al resultado de la selección
     */
    public String chooseDough(String dough);

    /**
     * Procesa la selección del sabor del helado.
     *
     * @param flavor sabor de helado seleccionado
     * @return mensaje correspondiente al resultado de la selección
     */
    public String chooseFlavor(IceCream flavor);

    /**
     * Procesa la selección de un ingrediente adicional para el helado.
     *
     * @param topping tipo de ingrediente adicional seleccionado
     * @return mensaje correspondiente al resultado de la selección
     */
    public String addTopping(ToppingType topping);

    /**
     * Procesa la solicitud de entrega del pedido.
     *
     * @return mensaje correspondiente al resultado de la solicitud
     */
    public String requestDelivery();

    /**
     * Procesa el evento que indica que la preparación del helado ha terminado.
     *
     * @return mensaje correspondiente al resultado del evento
     */
    public String finishPreparation();
    
}

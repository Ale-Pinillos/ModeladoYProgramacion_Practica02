/**
 * Representa el estado en el que el robot se encuentra atendiendo
 * directamente a un cliente.
 *
 */
public class ServingClientState implements State{

    /**
     * Robot al que pertenece este estado.
     */
    private Robot robot;

    /**
     * Construye un estado de servicio de un robot.
     *
     * @param robot robot que utilizará este estado
     */
    public ServingClientState(Robot robot){
        this.robot = robot;
    }

    /**
     * Procesa una llamada mientras el robot ya se encuentra
     * atendiendo al cliente.
     *
     * @return mensaje indicando que la operación no es válida
     */
    public String call(){
        return "Operacion invalida, el robot ya esta frente a ti";
    }

    /**
     * Cancela el pedido actual y devuelve al robot a su estado
     * de reposo.
     *
     * <p>También restablece los datos del pedido mediante el método
     * {@code reset()}.</p>
     *
     * @return mensaje indicando que el robot vuelve a dormir
     */
    public String cancelOrder(){
        robot.setState(robot.sleeping());
        robot.reset();
        return "El robot regresa a dormir";
    }

    /**
     * Agrega un helado al pedido y cambia el estado del robot
     * para esperar la confirmación del cliente.
     *
     * @return mensaje indicando que el helado fue agregado al pedido
     */
    public String orderIceCream(){
        robot.addIceCream();
        robot.setState(robot.waitingForConfirmation());

        return "Helado agregado a la orden, puedes pedir una pizza o confirmar tu orden";
    }

    /**
     * Agrega una pizza al pedido y cambia el estado del robot
     * para esperar la confirmación del cliente.
     *
     * @param pizzaType tipo de pizza que se agregará al pedido
     * @return mensaje indicando que la pizza fue agregada al pedido
     */
    public String orderPizza(Pizza pizzaType){
        robot.addPizza(pizzaType);
        robot.setState(robot.waitingForConfirmation());

        return "Pizza agregada a la orden, puedes pedir un helado o confirmar tu orden";
    }

    /**
     * Intenta confirmar un pedido cuando todavía no se ha agregado
     * ningún producto.
     *
     * @return mensaje indicando que la operación no es válida
     */
    public String confirmOrder(){
        return "Operacion invalida, no has ordenado nada aun";
    }

    /**
     * Intenta solicitar la preparación cuando todavía no se ha
     * realizado ningún pedido.
     *
     * @return mensaje indicando que la operación no es válida
     */
    public String requestPreparation(){
        return "Operacion invalida, no has ordenado nada aun";
    }

    /**
     * Intenta seleccionar el tipo de masa cuando todavía no se
     * ha realizado ningún pedido.
     *
     * @param dough tipo de masa seleccionado
     * @return mensaje indicando que la operación no es válida
     */
    public String chooseDough(String dough){
        return "Operacion invalida, no has ordenado nada aun";
    }

    /**
     * Intenta seleccionar el sabor del helado cuando todavía no
     * se ha realizado ningún pedido.
     *
     * @param flavor sabor de helado seleccionado
     * @return mensaje indicando que la operación no es válida
     */
    public String chooseFlavor(IceCream flavor){
        return "Operacion invalida, no has ordenado nada aun";
    }

    /**
     * Intenta agregar un ingrediente adicional cuando todavía no
     * se ha realizado ningún pedido.
     *
     * @param topping ingrediente adicional seleccionado
     * @return mensaje indicando que la operación no es válida
     */
    public String addTopping(ToppingType topping){
        return "Operacion invalida, no has ordenado nada aun";
    }

    /**
     * Intenta solicitar la entrega cuando todavía no se ha realizado
     * ningún pedido.
     *
     * @return mensaje indicando que la operación no es válida
     */
    public String requestDelivery(){
        return "Operacion invalida, no has ordenado nada aun";
    }

    /**
     * Intenta finalizar la preparación cuando todavía no se ha
     * realizado ningún pedido.
     *
     * @return mensaje indicando que la operación no es válida
     */
    public String finishPreparation(){
        return "Operacion invalida, no has ordenado nada aun";
    }
    
}

/**
 * Representa el estado en el que el robot espera la confirmación
 * del pedido por parte del cliente.
 *
 */
public class WaitingForConfirmationState implements State{

    /**
     * Robot al que pertenece este estado.
     */
    private Robot robot;

    /**
     * Construye un estado de espera de confirmación asociado a un robot.
     *
     * @param robot robot que utilizará este estado
     */
    public WaitingForConfirmationState(Robot robot){
	this.robot = robot;
    }

    /**
     * Procesa una llamada mientras el robot ya se encuentra frente
     * al cliente.
     *
     * @return mensaje indicando que la operación no es válida
     */
    public String call(){
	return "Operacion invalida, el robot ya esta frente a ti";
    }

    /**
     * Cancela el pedido actual y devuelve al robot a su estado de reposo.
     *
     * <p>También restablece todos los datos del pedido mediante
     * el método {@code reset()}.</p>
     *
     * @return mensaje indicando que el robot regresa a dormir
     */
    public String cancelOrder(){
	robot.setState(robot.sleeping());
	robot.reset();

	return "El robot regresa a dormir";
    }

    /**
     * Agrega un helado al pedido.
     *
     * @return mensaje indicando que el helado fue agregado y que
     * el pedido puede ser confirmado
     */
    public String orderIceCream(){
        if(robot.hasIceCream()){
            return "Ya se ha pedido un helado";
        }
	robot.addIceCream();

	return "Helado agregado, ya puede confirmar su orden";
    }

    /**
     * Agrega una pizza al pedido.
     *
     * @param pizzaType tipo de pizza que se agregará al pedido
     * @return mensaje indicando que la pizza fue agregada y que
     * el pedido puede ser confirmado
     */
    public String orderPizza(Pizza pizzaType){
        if(robot.hasPizza()){
            return "Ya se ha pedido una pizza";
        }
	robot.addPizza(pizzaType);

	return "Pizza agregada, ya puede confirmar su orden";
    }

    /**
     * Confirma el pedido y cambia el estado del robot para esperar
     * las instrucciones necesarias para su preparación.
     *
     * @return mensaje indicando que el pedido fue confirmado
     */
    public String confirmOrder(){
	robot.setState(robot.waitingForInstructions());

	return "Orden confirmada, esperando instrucciones de preparacion";
    }

    /**
     * Intenta solicitar la preparación antes de confirmar el pedido.
     *
     * @return mensaje indicando que primero se debe confirmar la orden
     */
    public String requestPreparation(){
	return "Operacion invalida, se debe confirmar la orden primero";
    }

    /**
     * Intenta seleccionar el tipo de masa antes de confirmar el pedido.
     *
     * @param dough tipo de masa seleccionado
     * @return mensaje indicando que primero se debe confirmar la orden
     */
    public String chooseDough(String dough){
	return "Operacion invalida, se debe confirmar la orden primero";
    }

    /**
     * Intenta seleccionar el sabor del helado antes de confirmar el pedido.
     *
     * @param flavor sabor de helado seleccionado
     * @return mensaje indicando que primero se debe confirmar la orden
     */
    public String chooseFlavor(IceCream flavor){
	return "Operacion invalida, se debe confirmar la orden primero";
    }

    /**
     * Intenta agregar un ingrediente adicional antes de confirmar el pedido.
     *
     * @param topping ingrediente adicional seleccionado
     * @return mensaje indicando que primero se debe confirmar la orden
     */
    public String addTopping(ToppingType topping){
	return "Operacion invalida, se debe confirmar la orden primero";
    }

    /**
     * Intenta solicitar la entrega antes de confirmar el pedido.
     *
     * @return mensaje indicando que primero se debe confirmar la orden
     */
    public String requestDelivery(){
	return "Operacion invalida, se debe confirmar la orden primero";
    }

    /**
     * Intenta finalizar la preparación antes de confirmar el pedido.
     *
     * @return mensaje indicando que primero se debe confirmar la orden
     */
    public String finishPreparation(){
	return "Operacion invalida, se debe confirmar la orden primero";
    }

}

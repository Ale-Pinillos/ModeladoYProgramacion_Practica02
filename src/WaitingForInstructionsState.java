/**
 * Representa el estado en el que el robot espera las instrucciones
 * necesarias para preparar el pedido.
 *
 */
public class WaitingForInstructionsState implements State{

    /**
     * Robot al que pertenece este estado.
     */
    private Robot robot;

    /**
     * Construye un estado de espera de instrucciones asociado a un robot.
     *
     * @param robot robot que utilizará este estado
     */
    public WaitingForInstructionsState(Robot robot){
	this.robot = robot;
    }

    /**
     * Procesa una llamada mientras el robot está recibiendo
     * instrucciones para el pedido.
     *
     * @return mensaje indicando que la operación no es válida
     */
    public String call(){
	return "Operacion invalida, ahora se esta tomando instrucciones para la orden";
    }

    /**
     * Intenta cancelar el pedido mientras el robot está recibiendo
     * instrucciones.
     *
     * @return mensaje indicando que la operación no es válida
     */
    public String cancelOrder(){
	return "Operacion invalida, no es posible cancelar la orden";
    }

    /**
     * Intenta agregar un helado después de que el pedido ya fue confirmado.
     *
     * @return mensaje indicando que la operación no es válida
     */
    public String orderIceCream(){
	return "Operacion invalida, ya se confirmo la orden";
    }

    /**
     * Intenta agregar una pizza después de que el pedido ya fue confirmado.
     *
     * @param pizzaType tipo de pizza solicitada
     * @return mensaje indicando que la operación no es válida
     */
    public String orderPizza(Pizza pizzaType){
	return "Operacion invalida, ya se confirmo la orden";
    }

    /**
     * Intenta confirmar nuevamente un pedido que ya fue confirmado.
     *
     * @return mensaje indicando que la operación no es válida
     */
    public String confirmOrder(){
	return "Operacion invalida, ya se confirmo la orden";
    }

    /**
     * Procesa la solicitud para comenzar la preparación del pedido.
     *
     * <p>Si no existe una pizza en el pedido, el robot pasa directamente
     * al estado de preparación. Si existe una pizza y ya se seleccionó
     * el tipo de masa, también cambia al estado de preparación.</p>
     *
     * @return mensaje correspondiente al resultado de la solicitud
     */
    public String requestPreparation(){
	if(!robot.hasPizza()){
	    robot.setState(robot.preparingOrder());
	    return "El robot espera instrucciones sobre el helado";
	}

	if(robot.doughChosen()){
	    robot.setState(robot.preparingOrder());
	    String s = "Instrucciones recibidas, preparacion de pizza terminada";

	    if(robot.hasIceCream())
		s += "/nEl robot espera instrucciones sobre el helado";

	    return s;
	}

	return "Operacion invalida, el robot necesita instrucciones";
    }

    /**
     * Selecciona el tipo de masa para la pizza.
     *
     * <p>La masa solamente puede seleccionarse si existe una pizza
     * en el pedido.</p>
     *
     * @param dough tipo de masa seleccionado
     * @return mensaje correspondiente al resultado de la selección
     */
    public String chooseDough(String dough){
        if(robot.doughChosen())
            return "Ya se ha elegido el tipo de masa";

	if(robot.hasPizza()){
	    robot.setPizzaDough(dough);
	    return "Tipo de masa elegido para la pizza anotado";
	}

	return "No se ha ordenado pizza";
    }

    /**
     * Intenta seleccionar el sabor del helado mientras el robot
     * está recibiendo instrucciones para la pizza.
     *
     * @param flavor sabor de helado seleccionado
     * @return mensaje indicando que la operación no es válida
     */
    public String chooseFlavor(IceCream flavor){
	return "Operacion invalida, en este momento se estan tomando instrucciones para la pizza, no el helado";
    }

    /**
     * Intenta agregar un ingrediente adicional al helado mientras
     * el robot está recibiendo instrucciones para la pizza.
     *
     * @param topping ingrediente adicional seleccionado
     * @return mensaje indicando que la operación no es válida
     */
    public String addTopping(ToppingType topping){
	return "Operacion invalida, en este momento se estan tomando instrucciones para la pizza, no el helado";
    }

    /**
     * Intenta solicitar la entrega mientras todavía se están
     * recibiendo instrucciones para el pedido.
     *
     * @return mensaje indicando que la operación no es válida
     */
    public String requestDelivery(){
	return "Operacion invalida, aun se esta tomando instrucciones para la orden";
    }

    /**
     * Intenta finalizar la preparación mientras todavía se están
     * recibiendo instrucciones para el pedido.
     *
     * @return mensaje indicando que la operación no es válida
     */
    public String finishPreparation(){
	return "Operacion invalida, aun se esta tomando instrucciones para la orden";
    }

}

/**
 * Representa el estado en el que el robot se encuentra preparando
 * el pedido del cliente.
 *
 */
public class PreparingOrderState implements State{

    /**
     * Robot al que pertenece este estado.
     */
    private Robot robot;

    /**
     * Construye un estado de preparación asociado a un robot.
     *
     * @param robot robot que utilizará este estado
     */
    public PreparingOrderState(Robot robot){
	this.robot = robot;
    }

    /**	 
     * Procesa una llamada mientras el robot está preparando el pedido.
     *
     * @return mensaje indicando que la operación no es válida
     */
    public String call(){
	return "Operacion invalida, el robot espera instrucciones sobre el helado";
    }
      
    /**	 
     * Procesa la cancelación del pedido.
     *
     * @return mensaje indicando que el pedido ya no puede cancelarse
     */
    public String cancelOrder(){
	return "Operacion invalida, ya no es posible cancelar";
    }

    /**
     * Procesa una nueva solicitud de helado.
     *
     * @return mensaje indicando que ya no es posible realizar un nuevo pedido
     */
    public String orderIceCream(){
	return "Operacion invalida, ya no es posible ordenar";
    }

    /**
     * Procesa una nueva solicitud de pizza.
     *
     * @param pizzaType tipo de pizza solicitada
     * @return mensaje indicando que ya no es posible realizar un nuevo pedido
     */
    public String orderPizza(Pizza pizzaType){
	return "Operacion invalida, ya no es posible ordenar";
    }

    /**
     * Procesa la confirmación del pedido.
     *
     * @return mensaje indicando que el pedido ya fue confirmado
     */
    public String confirmOrder(){
	return "Operacion invalida, la orden ya fue confirmada";
    }

    /**
     * Procesa una solicitud para iniciar la preparación.
     *
     * @return mensaje indicando que la preparación de la pizza ya fue completada
     */
    public String requestPreparation(){
	return "Operacion invalida, ya se completo la preparacion de la pizza";
    }

    /**
     * Procesa la selección del tipo de masa.
     *
     * @param dough tipo de masa seleccionado
     * @return mensaje indicando que la preparación de la pizza ya fue completada
     */
    public String chooseDough(String dough){
	return "Operacion invalida, ya se completo la preparacion de la pizza";
    }

    /**
     * Selecciona el sabor del helado.
     *
     * <p>Primero verifica que exista un helado en el pedido y que
     * todavía no se haya seleccionado su sabor. Si las condiciones
     * se cumplen, asigna el sabor recibido al robot.</p>
     *
     * @param flavor sabor de helado seleccionado
     * @return mensaje correspondiente al resultado de la operación
     */
    public String chooseFlavor(IceCream flavor){
	if(!robot.hasIceCream())
	    return "Operacion invalida, no se ha pedido un helado en la orden, puede finalizar la preparacion";

	if(robot.hasIceCream() && robot.flavorChosen())
	    return "El sabor de helado ya ha sido elegido antes";

	robot.setIceCream(flavor);
	return "El sabor de helado ha sido elegido";
    }

    /**
     * Agrega un ingrediente adicional al helado.
     *
     * <p>Verifica que exista un helado en el pedido y controla que
     * cada tipo de ingrediente pueda agregarse como máximo tres veces.</p>
     *
     * @param topping ingrediente adicional que se desea agregar
     * @return mensaje correspondiente al resultado de la operación
     */
    public String addTopping(ToppingType topping){
	if(!robot.hasIceCream()){
	    return "Operacion invalida, no se ha pedido un helado en la orden, puede finalizar la preparacion";
	}

	switch(topping){
	case WORMS:
	    if(robot.getWorms() == 3)
		return "Solo se puede agregar hasta 3 veces cada ingrediente";
	    
	    robot.addNewTopping(topping);
	    break;
	case PANDAS:
	    if(robot.getPandas() == 3)
		return "Solo se puede agregar hasta 3 veces cada ingrediente";

	    robot.addNewTopping(topping);
	    break;
	case RINGS:
	    if(robot.getRings() == 3)
		return "Solo se puede agregar hasta 3 veces cada ingrediente";
	    
	    robot.addNewTopping(topping);
	    break;
	case CHOCOLATE:
	    if(robot.getChocolate() == 3)
		return "Solo se puede agregar hasta 3 veces cada ingrediente";

	    robot.addNewTopping(topping);
	    break;
	case MARSHMALLOWS:
	    if(robot.getMarshmallows() == 3)
		return "Solo se puede agregar hasta 3 veces cada ingrediente";

	    robot.addNewTopping(topping);
	    break;
	case STRAWBERRIES:
	    if(robot.getStrawberries() == 3)
		return "Solo se puede agregar hasta 3 veces cada ingrediente";

	    robot.addNewTopping(topping);
	    break;
	case MANGOS:
	    if(robot.getMangos() == 3)
		return "Solo se puede agregar hasta 3 veces cada ingrediente";

	    robot.addNewTopping(topping);
	    break;
	case KIWIS:
	    if(robot.getKiwis() == 3)
		return "Solo se puede agregar hasta 3 veces cada ingrediente";

	    robot.addNewTopping(topping);
	    break;
	}

	return "Se ha agregado el ingrediente extra";
    }

    /**
     * Procesa la solicitud de entrega del pedido.
     *
     * @return mensaje indicando que el pedido todavía no está terminado
     */
    public String requestDelivery(){
	return "Operacion invalida, la orden aun no esta terminada";
    }

    /**
     * Finaliza la preparación del pedido cuando se cumplen las condiciones
     * necesarias.
     *
     * <p>Si no hay helado o ya se seleccionó el sabor, cambia el estado
     * del robot a {@code WaitingRequestState}. En caso contrario, indica
     * que todavía es necesario seleccionar el sabor del helado.</p>
     *
     * @return mensaje correspondiente al resultado de la operación
     */
    public String finishPreparation(){
	if(!robot.hasIceCream() || robot.flavorChosen()){
	    robot.setState(robot.waitingRequest());
	    return "El robot espera instrucciones para entregar la orden";
	}

	return "Operacion invalida, el robot necesita saber el sabor del helado";
    }

}

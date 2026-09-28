/**
 * Representa el estado en el que el robot ya tiene una orden completamente
 * preparada y se encuentra esperando la solicitud de entrega al cliente.
 *
 */
public class WaitingRequestState implements State{

    /**
     * Referencia al robot cuyo estado y operaciones son administrados.
     */
    private Robot robot;

    /**
     * Crea un nuevo estado de espera de solicitud de entrega.
     *
     * @param robot robot al que pertenece este estado.
     */
    public WaitingRequestState(Robot robot){
	this.robot = robot;
    }

    /**
     * Indica que el robot ya tiene una orden lista y no necesita ser llamado.
     *
     * @return mensaje indicando que la operación no es válida en este estado.
     */
    public String call(){
	return "Operacion invalida, el robot ya tiene una orden lista";
    }

    /**
     * Indica que la orden no puede ser cancelada porque ya está lista.
     *
     * @return mensaje indicando que la operación no es válida en este estado.
     */
    public String cancelOrder(){
	return "Operacion invalida, el robot ya tiene una orden lista";
    }

    /**
     * Indica que no se puede agregar un helado a una orden que ya está lista.
     *
     * @return mensaje indicando que la operación no es válida en este estado.
     */
    public String orderIceCream(){
	return "Operacion invalida, el robot ya tiene una orden lista";
    }

    /**
     * Indica que no se puede agregar una pizza a una orden que ya está lista.
     *
     * @param pizzaType tipo de pizza que se intentaría agregar.
     * @return mensaje indicando que la operación no es válida en este estado.
     */
    public String orderPizza(Pizza pizzaType){
	return "Operacion invalida, el robot ya tiene una orden lista";
    }

    /**
     * Indica que la orden ya se encuentra confirmada y lista.
     *
     * @return mensaje indicando que la operación no es válida en este estado.
     */
    public String confirmOrder(){
	return "Operacion invalida, el robot ya tiene una orden lista";
    }

    /**
     * Indica que la preparación ya fue realizada y no puede solicitarse
     * nuevamente.
     *
     * @return mensaje indicando que la operación no es válida en este estado.
     */
    public String requestPreparation(){
	return "Operacion invalida, el robot ya tiene una orden lista";
    }

    /**
     * Indica que ya no se puede modificar el tipo de masa de la pizza.
     *
     * @param dough tipo de masa que se intentaría seleccionar.
     * @return mensaje indicando que la operación no es válida en este estado.
     */
    public String chooseDough(String dough){
	return "Operacion invalida, el robot ya tiene una orden lista";
    }

    /**
     * Indica que ya no se puede seleccionar el sabor del helado.
     *
     * @param flavor sabor de helado que se intentaría seleccionar.
     * @return mensaje indicando que la operación no es válida en este estado.
     */
    public String chooseFlavor(IceCream flavor){
	return "Operacion invalida, el robot ya tiene una orden lista";
    }

    /**
     * Indica que ya no se pueden agregar ingredientes adicionales al helado.
     *
     * @param topping ingrediente extra que se intentaría agregar.
     * @return mensaje indicando que la operación no es válida en este estado.
     */
    public String addTopping(ToppingType topping){
	return "Operacion invalida, el robot ya tiene una orden lista";
    }

    /**
     * Entrega la orden al cliente, genera el ticket correspondiente y
     * establece al robot nuevamente en el estado de reposo.
     *
     * @return mensaje indicando que la orden fue entregada y mostrando
     * el ticket generado.
     */
    public String requestDelivery(){
	robot.setState(robot.sleeping());

	return "El robot entrega la orden junto con el ticket:\n\n" + robot.generateTicket() + "\n\n El robot regresa a dormir";
    }

    /**
     * Indica que la preparación ya fue terminada y no puede finalizarse
     * nuevamente.
     *
     * @return mensaje indicando que la operación no es válida en este estado.
     */
    public String finishPreparation(){
	return "Operacion invalida, el robot ya tiene una orden lista";
    }

}

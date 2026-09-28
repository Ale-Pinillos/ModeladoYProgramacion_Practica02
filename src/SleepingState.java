/**
 * Representa el estado en el que el robot se encuentra dormido o inactivo.
 *
 */
public class SleepingState implements State{

    /**
     * Robot al que pertenece este estado.
     */
    private Robot robot;

    /**
     * Construye un estado de descanso asociado a un robot.
     *
     * @param robot robot que utilizará este estado
     */
    public SleepingState(Robot robot){
        this.robot = robot;
    }

    /**
     * Procesa una llamada al robot.
     *
     * <p>Al recibir una llamada, el robot cambia al estado
     * {@code ServingClientState} para comenzar a atender al cliente.</p>
     *
     * @return mensaje indicando que el robot aparece frente al cliente
     */
    public String call(){
        robot.setState(robot.servingClient());
        return "El robot aparece frente a ti, ya puedes ordenar";
    }

    /**
     * Intenta cancelar un pedido mientras el robot está dormido.
     *
     * @return mensaje indicando que la operación no es válida
     */
    public String cancelOrder(){
        return "Operacion invalida, el robot esta durmiendo";
    }

    /**
     * Intenta ordenar un helado mientras el robot está dormido.
     *
     * @return mensaje indicando que la operación no es válida
     */
    public String orderIceCream(){
        return "Operacion invalida, el robot esta durmiendo";
    }

    /**
     * Intenta ordenar una pizza mientras el robot está dormido.
     *
     * @param pizzaType tipo de pizza solicitada
     * @return mensaje indicando que la operación no es válida
     */
    public String orderPizza(Pizza pizzaType){
        return "Operacion invalida, el robot esta durmiendo";
    }

    /**
     * Intenta confirmar un pedido mientras el robot está dormido.
     *
     * @return mensaje indicando que la operación no es válida
     */
    public String confirmOrder(){
        return "Operacion invalida, el robot esta durmiendo";
    }

    /**
     * Intenta solicitar la preparación de un pedido mientras el robot
     * está dormido.
     *
     * @return mensaje indicando que la operación no es válida
     */
    public String requestPreparation(){
        return "Operacion invalida, el robot esta durmiendo";
    }

    /**
     * Intenta seleccionar el tipo de masa mientras el robot está dormido.
     *
     * @param dough tipo de masa seleccionado
     * @return mensaje indicando que la operación no es válida
     */
    public String chooseDough(String dough){
        return "Operacion invalida, el robot esta durmiendo";
    }

    /**
     * Intenta seleccionar el sabor del helado mientras el robot está dormido.
     *
     * @param flavor sabor de helado seleccionado
     * @return mensaje indicando que la operación no es válida
     */
    public String chooseFlavor(IceCream flavor){
        return "Operacion invalida, el robot esta durmiendo";
    }

    /**
     * Intenta agregar un ingrediente adicional mientras el robot está dormido.
     *
     * @param topping ingrediente adicional seleccionado
     * @return mensaje indicando que la operación no es válida
     */
    public String addTopping(ToppingType topping){
        return "Operacion invalida, el robot esta durmiendo";
    }

    /**
     * Intenta solicitar la entrega mientras el robot está dormido.
     *
     * @return mensaje indicando que la operación no es válida
     */
    public String requestDelivery(){
        return "Operacion invalida, el robot esta durmiendo";
    }

    /**
     * Intenta finalizar la preparación mientras el robot está dormido.
     *
     * @return mensaje indicando que la operación no es válida
     */
    public String finishPreparation(){
        return "Operacion invalida, el robot esta durmiendo";
    }
    
}

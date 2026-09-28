public class WaitingForConfirmationState implements State{

    private Robot robot;

    public WaitingForConfirmationState(Robot robot){
        this.robot = robot;
    }
    
    public String call(){
        return "Operacion invalida, el robot ya esta frente a ti";
    }

    public String cancelOrder(){
        robot.setState(robot.sleeping());

        return "El robot regresa a dormir";
    }

    public String orderIceCream(){
        robot.addIceCream();

        return "Helado agregado, ya puede confirmar su orden";
    }

    public String orderPizza(Pizza pizzaType){
        robot.addPizza(pizzaType);

        return "Pizza agregada, ya puede confirmar su orden";
    }

    public String confirmOrder(){
        robot.setState(robot.waitingForInstructions());

        return "Orden confirmada, esperando instrucciones de preparacion";
    }

    public String requestPreparation(){
        return "Operacion invalida, se debe confirmar la orden primero";
    }

    public String chooseDough(String dough){
        return "Operacion invalida, se debe confirmar la orden primero";
    }

    public String chooseFlavor(IceCream flavor){
        return "Operacion invalida, se debe confirmar la orden primero";
    }

    public String addTopping(ToppingType topping){
        return "Operacion invalida, se debe confirmar la orden primero";
    }

    public String requestDelivery(){
        return "Operacion invalida, se debe confirmar la orden primero";
    }

    public String finishPreparation(){
        return "Operacion invalida, se debe confirmar la orden primero";
    }
    
}

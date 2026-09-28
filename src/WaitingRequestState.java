public class WaitingRequestState implements State{

    private Robot robot;

    public WaitingRequestState(Robot robot){
        this.robot = robot;
    }
    
    public String call(){
        return "Operacion invalida, el robot ya tiene una orden lista";
    }

    public String cancelOrder(){
        return "Operacion invalida, el robot ya tiene una orden lista";
    }

    public String orderIceCream(){
        return "Operacion invalida, el robot ya tiene una orden lista";
    }
    
    public String orderPizza(Pizza pizzaType){
        return "Operacion invalida, el robot ya tiene una orden lista";
    }

    public String confirmOrder(){
        return "Operacion invalida, el robot ya tiene una orden lista";
    }

    public String requestPreparation(){
        return "Operacion invalida, el robot ya tiene una orden lista";
    }

    public String chooseDough(String dough){
        return "Operacion invalida, el robot ya tiene una orden lista";
    }

    public String chooseFlavor(IceCream flavor){
        return "Operacion invalida, el robot ya tiene una orden lista";
    }

    public String addTopping(ToppingType topping){
        return "Operacion invalida, el robot ya tiene una orden lista";
    }

    public String requestDelivery(){
        robot.setState(robot.sleeping());

        return "El robot entrega la orden junto con el ticket:\n\n" + robot.generateTicket() + "\n\n El robot regresa a dormir";
    }

    public String finishPreparation(){
        return "Operacion invalida, el robot ya tiene una orden lista";
    }
    
}

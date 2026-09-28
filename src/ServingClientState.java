public class ServingClientState implements State{

    private Robot robot;

    public ServingClientState(Robot robot){
        this.robot = robot;
    }
    
    public String call(){
        return "Invalid operation, the robot is already in front of you";
    }

    public String cancelOrder(){
        robot.setState(robot.sleeping());
        robot.reset();
        return "The robot goes back to sleep";
    }

    public String orderIceCream(){
        robot.addIceCream();
        robot.setState(robot.waitingForConfirmation());

        return "Ice cream added to order, you may now add a pizza or confirm your order";
    }

    public String orderPizza(Pizza pizzaType){
        robot.addPizza(pizzaType);
        robot.setState(robot.waitingForConfirmation());

        return "Pizza added to order, you may now add an ice cream or confirm your order";
    }

    public String confirmOrder(){
        return "Invalid operation, you haven't ordered anything yet";
    }

    public String requestPreparation(){
        return "Invalid operation, you haven't ordered anything yet";
    }

    public String chooseDough(String dough){
        return "Invalid operation, you haven't ordered anything yet";
    }

    public String chooseFlavor(IceCream flavor){
        return "Invalid operation, you haven't ordered anything yet";
    }

    public String addTopping(ToppingType topping){
        return "Invalid operation, you haven't ordered anything yet";
    }

    public String requestDelivery(){
        return "Invalid operation, you haven't ordered anything yet";
    }

    public String finishPreparation(){
        return "Invalid operation, you haven't ordered anything yet";
    }
    
}

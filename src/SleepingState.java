public class SleepingState implements State{

    private Robot robot;

    public SleepingState(Robot robot){
        this.robot = robot;
    }
    
    public String call(){
        robot.setState(robot.servingClient());
        return "The robot appears in front of you, you may order now";
    }

    public String cancelOrder(){
        return "Invalid operation, robot is sleeping";
    }

    public String orderIceCream(){
        return "Invalid operation, robot is sleeping";
    }

    public String orderPizza(Pizza pizzaType){
        return "Invalid operation, robot is sleeping";
    }

    public String confirmOrder(){
        return "Invalid operation, robot is sleeping";
    }

    public String requestPreparation(){
        return "Invalid operation, robot is sleeping";
    }

    public String chooseDough(String dough){
        return "Invalid operation, robot is sleeping";
    }

    public String chooseFlavor(IceCream flavor){
        return "Invalid operation, robot is sleeping";
    }

    public String addTopping(ToppingType topping){
        return "Invalid operation, robot is sleeping";
    }

    public String requestDelivery(){
        return "Invalid operation, robot is sleeping";
    }

    public String finishPreparation(){
        return "Invalid operation, robot is sleeping";
    }
    
}

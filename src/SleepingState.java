public class SleepingState implements State{

    private Robot robot;

    public SleepingState(Robot robot){
        this.robot = robot;
    }
    
    public String call(){
        robot.setState(robot.servingClient());
        return "El robot aparece frente a ti, ya puedes ordenar";
    }

    public String cancelOrder(){
        return "Operacion invalida, el robot esta durmiendo";
    }

    public String orderIceCream(){
        return "Operacion invalida, el robot esta durmiendo";
    }

    public String orderPizza(Pizza pizzaType){
        return "Operacion invalida, el robot esta durmiendo";
    }

    public String confirmOrder(){
        return "Operacion invalida, el robot esta durmiendo";
    }

    public String requestPreparation(){
        return "Operacion invalida, el robot esta durmiendo";
    }

    public String chooseDough(String dough){
        return "Operacion invalida, el robot esta durmiendo";
    }

    public String chooseFlavor(IceCream flavor){
        return "Operacion invalida, el robot esta durmiendo";
    }

    public String addTopping(ToppingType topping){
        return "Operacion invalida, el robot esta durmiendo";
    }

    public String requestDelivery(){
        return "Operacion invalida, el robot esta durmiendo";
    }

    public String finishPreparation(){
        return "Operacion invalida, el robot esta durmiendo";
    }
    
}

public class WaitingForInstructionsState implements State{

    private Robot robot;

    public WaitingForInstructionsState(Robot robot){
        this.robot = robot;
    }
    
    public String call(){
        return "Operacion invalida, la orden esta por ser preparada";
    }

    public String cancelOrder(){
        return "Operacion invalida, no es posible cancelar la orden";
    }

    public String orderIceCream(){
        return "Operacion invalida, ya se confirmo la orden";
    }

    public String orderPizza(Pizza pizzaType){
        return "Operacion invalida, ya se confirmo la orden";
    }

    public String confirmOrder(){
        return "Operacion invalida, ya se confirmo la orden";
    }

    public String requestPreparation(){
        
    }

    public String chooseDough(String dough){

        robot.setPizzaDough(dough);

        return "Tipo de masa elegido para la pizza";
    }

    public String chooseFlavor(IceCream flavor){

    }

    public String addTopping(ToppingType topping){

    }

    public String requestDelivery(){

    }

    public String finishPreparation(){

    }
    
}

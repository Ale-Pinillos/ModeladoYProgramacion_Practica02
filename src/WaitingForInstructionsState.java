public class WaitingForInstructionsState implements State{

    private Robot robot;

    public WaitingForInstructionsState(Robot robot){
        this.robot = robot;
    }
    
    public String call(){
        return "Operacion invalida, ahora se esta tomando instrucciones para la orden";
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
        if(!robot.hasPizza()){
            robot.setState(robot.preparingOrder());
            return "El robot espera instrucciones sobre el helado";
        }
            
        if(robot.doughChosen()){
            robot.setState(robot.preparingOrder());
            String s = "Instrucciones recibidas, preparacion de pizza terminada":
            
            if(robot.hasIceCream())
                s += "/nEl robot espera instrucciones sobre el helado";

            return s;
        }

        return "Operacion invalida, el robot necesita instrucciones";
    }

    public String chooseDough(String dough){

        if(robot.hasPizza()){
            robot.setPizzaDough(dough);
            return "Tipo de masa elegido para la pizza anotado";
        }

        return "No se ha ordenado pizza";
    }

    public String chooseFlavor(IceCream flavor){
        return "Operacion invalida, en este momento se estan tomando instrucciones para la pizza, no el helado";
    }

    public String addTopping(ToppingType topping){
        return "Operacion invalida, en este momento se estan tomando instrucciones para la pizza, no el helado";
    }

    public String requestDelivery(){
        return "Operacion invalida, aun se esta tomando instrucciones para la orden";
    }

    public String finishPreparation(){
        return "Operacion invalida, aun se esta tomando instrucciones para la orden";
    }
    
}

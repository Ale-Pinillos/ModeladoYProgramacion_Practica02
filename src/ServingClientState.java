public class ServingClientState implements State{

    private Robot robot;

    public ServingClientState(Robot robot){
        this.robot = robot;
    }
    
    public String call(){
        return "Operacion invalida, el robot ya esta frente a ti";
    }

    public String cancelOrder(){
        robot.setState(robot.sleeping());
        robot.reset();
        return "El robot regresa a dormir";
    }

    public String orderIceCream(){
        robot.addIceCream();
        robot.setState(robot.waitingForConfirmation());

        return "Helado agregado a la orden, puedes pedir una pizza o confirmar tu orden";
    }

    public String orderPizza(Pizza pizzaType){
        robot.addPizza(pizzaType);
        robot.setState(robot.waitingForConfirmation());

        return "Pizza agregada a la orden, puedes pedir un helado o confirmar tu orden";
    }

    public String confirmOrder(){
        return "Operacion invalida, no has ordenado nada aun";
    }

    public String requestPreparation(){
        return "Operacion invalida, no has ordenado nada aun";
    }

    public String chooseDough(String dough){
        return "Operacion invalida, no has ordenado nada aun";
    }

    public String chooseFlavor(IceCream flavor){
        return "Operacion invalida, no has ordenado nada aun";
    }

    public String addTopping(ToppingType topping){
        return "Operacion invalida, no has ordenado nada aun";
    }

    public String requestDelivery(){
        return "Operacion invalida, no has ordenado nada aun";
    }

    public String finishPreparation(){
        return "Operacion invalida, no has ordenado nada aun";
    }
    
}

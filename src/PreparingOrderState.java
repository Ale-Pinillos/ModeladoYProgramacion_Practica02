public class PreparingOrderState implements State{

    private Robot robot;

    public PreparingOrderState(Robot robot){
        this.robot = robot;
    }
    
    public String call();

    public String cancelOrder();

    public String orderIceCream();

    public String orderPizza(Pizza pizzaType);

    public String confirmOrder();

    public String requestPreparation();

    public String chooseDough(String dough);

    public String chooseFlavor(IceCream flavor);

    public String addTopping(ToppingType topping);

    public String requestDelivery();

    public String finishPreparation();
    
}

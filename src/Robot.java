public class Robot{

    // States
    private SleepingState sleeping;
    private ServingClientState serving;
    private WaitingForConfirmationState waitingForConfirmation;
    private WaitingForInstructionsState waitingForInstructions;
    private PreparingOrderState preparingOrder;
    private WaitingRequestState waitingRequest;
    private State actualState;

    // Order data
    private int numberOfPizzas = 0;
    private int numberOfIceCreams = 0;
    private Pizza pizza;
    private IceCream iceCream;

    private boolean doughChosen = false;

    // Counters for toppings
    private int counterWorms = 0;
    private int counterPandas = 0;
    private int counterRings = 0;
    private int counterChocolate = 0;
    private int counterMarshmallows = 0;
    private int counterStrawberries = 0;
    private int counterMangos = 0;
    private int counterKiwis = 0;

    public Robot(){
        sleeping = new SleepingState();
        serving = new ServingClientState();
        waitingForConfirmation = new WaitingForConfirmation();
        waitingForInstructions = new WaitingForInstructions();
        preparingOrder = new PreparingOrderState();
        waitingRequest = new WaitingRequestState();

        actualState = sleeping;

        pizza = null;
        iceCream = null;
    }

    // STATE-RELATED METHODS

    public void setState(State newState){
        actualState = newState;
    }

    public State sleeping(){
        return sleeping;
    }

    public State servingClient(){
        return servingClient;
    }

    public State waitingForConfirmation(){
        return waitingForConfirmation;
    }

    public State waitingForInstructions(){
        return waitingForInstructions;
    }

    public State preparingOrder(){
        return preparingOrder;
    }

    public State waitingRequest(){
        return waitingRequest;
    }

    // EVENT_RELATED METHODS

    public String call(){
        return actualState.call();
    }

    public String cancelOrder(){
        return actualState.cancelOrder();
    }

    public String orderIceCream(){
        return actualState.orderIceCream();
    }

    public String orderPizza(Pizza pizzaType){
        return actualState.orderPizza(pizzaType);
    }

    public String confirmOrder(){
        return actualState.confirmOrder();
    }

    public String requestPreparation(){
        return actualState.requestPreparation();
    }

    public String chooseDough(String dough){
        return actualState.chooseDough();
    }
    
    public String chooseFlavor(IceCream flavor){
        return actualState.chooseFlavor();
    }

    public String addTopping(ToppingType topping){
        return actualState.addTopping();
    }

    public String requestDelivery(){
        return actualState.requestDelivery();
    }
    
    public String finishPreparation(){
        return actualState.finishPreparation();
    }

    // ORDER-RELATED METHODS

    public void addPizza(Pizza newPizza){
        numberOfPizzas++;
        pizza = newPizza;
    }
    
    public void addIceCream(){
        numberOfIceCreams++;
    }

    public boolean doughChosen(){
        return doughChosen;
    }

    public boolean hasPizza(){
        return numberOfPizzas > 0;
    }

    // TICKET
    
    public String generateTicket(){
        // TODO
    }
}

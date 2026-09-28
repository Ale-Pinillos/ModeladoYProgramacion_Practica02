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
        sleeping = new SleepingState(this);
        serving = new ServingClientState(this);
        waitingForConfirmation = new WaitingForConfirmationState(this);
        waitingForInstructions = new WaitingForInstructionsState(this);
        preparingOrder = new PreparingOrderState(this);
        waitingRequest = new WaitingRequestState(this);

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
        return serving;
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
        return actualState.chooseDough(dough);
    }
    
    public String chooseFlavor(IceCream flavor){
        return actualState.chooseFlavor(flavor);
    }

    public String addTopping(ToppingType topping){
        return actualState.addTopping(topping);
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

    public boolean flavorChosen(){
        return iceCream != null;
    }

    public boolean hasPizza(){
        return numberOfPizzas > 0;
    }

    public boolean hasIceCream(){
        return numberOfIceCreams > 0;
    }

    public void setPizzaDough(String dough){
        doughChosen = true;

        pizza.setDoughType(dough);
    }

    public void setIceCream(IceCream iceCream){
        this.iceCream = iceCream;
    }

    public void addNewTopping(ToppingType topping){
        switch(topping){
        case WORMS:
            counterWorms++;

            iceCream = new GummyWorms(iceCream);
            break;
        case PANDAS:
            counterPandas++;

            iceCream = new GummyPandas(iceCream);
            break;
        case RINGS:
            counterRings++;

            iceCream = new GummyRings(iceCream);
            break;
        case CHOCOLATE:
            counterChocolate++;

            iceCream = new ChocolateChips(iceCream);
            break;
        case MARSHMALLOWS:
            counterMarshmallows++;

            iceCream = new Marshmallows(iceCream);
            break;
        case STRAWBERRIES:
            counterStrawberries++;

            iceCream = new Strawberries(iceCream);
            break;
        case MANGOS:
            counterMangos++;

            iceCream = new Mangos(iceCream);
            break;
        case KIWIS:
            counterKiwis++;
            
            iceCream = new Kiwis(iceCream);
            break;
        }
    }

    // COUNTER GETTERS
    public int getWorms(){
        return counterWorms;
    }

    public int getPandas(){
        return counterPandas;
    }

    public int getRings(){
        return counterRings;
    }

    public int getChocolate(){
        return counterChocolate;
    }

    public int getMarshmallows(){
        return counterMarshmallows;
    }

    public int getStrawberries(){
        return counterStrawberries;
    }

    public int getMangos(){
        return counterMangos;
    }

    public int getKiwis(){
        return counterKiwis;
    }

    // TICKET
    
    public String generateTicket(){
        // TODO
        String s = "=================================================================="
            +  "                         TICKET DE ORDEN                          "
            +  "\n\n\n"
            +  "Productos:\n\n";

        if(pizza != null){
            s += "[] " + pizza.getName() + "   Precio: " + pizza.getCost() + "\n\n";
        }

        if(iceCream != null){
            s += "[] " + iceCream.getName() + "     Descripcion del helado: " + iceCream.getDescription() + "       Precio del helado: " + iceCream.getCost() + "\n\n";
        }

        s += "Precio total: " + (pizza.getCost() + iceCream.getCost()) + "\n\n"
            + "==================================================================";


        this.reset();
        
        return s;
    }

    public void reset(){
        pizza = null;
        iceCream = null;

        numberOfPizzas = 0;
        numberOfIceCreams = 0;

        counterWorms = 0;
        counterPandas = 0;
        counterRings = 0;
        counterChocolate = 0;
        counterMarshmallows = 0;
        counterStrawberries = 0;
        counterMangos = 0;
        counterKiwis = 0;

        doughChosen = false;
    }
}

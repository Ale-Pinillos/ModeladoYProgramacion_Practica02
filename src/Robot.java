/**
 * Representa al robot encargado de gestionar el proceso de atención
 * y preparación de pedidos.
 *
 * <p>El robot utiliza el patrón de diseño State para controlar los
 * diferentes estados en los que puede encontrarse durante la atención
 * de un cliente. También almacena la información relacionada con los
 * productos solicitados y mantiene contadores para los ingredientes
 * adicionales seleccionados.</p>
 */
public class Robot{

    // States
    /**
     * Estado en el que el robot se encuentra dormido o inactivo.
     */
    private SleepingState sleeping;

    /**
     * Estado en el que el robot está atendiendo a un cliente.
     */
    private ServingClientState serving;

    /**
     * Estado en el que el robot espera la confirmación del pedido.
     */
    private WaitingForConfirmationState waitingForConfirmation;

    /**
     * Estado en el que el robot espera instrucciones del cliente.
     */
    private WaitingForInstructionsState waitingForInstructions;

    /**
     * Estado en el que el robot está preparando el pedido.
     */
    private PreparingOrderState preparingOrder;

    /**
     * Estado en el que el robot espera una nueva solicitud.
     */
    private WaitingRequestState waitingRequest;

    /**
     * Estado actual en el que se encuentra el robot.
     */
    private State actualState;

    // Order data
    /**
     * Cantidad de pizzas agregadas al pedido.
     */
    private int numberOfPizzas = 0;

    /**
     * Cantidad de helados agregados al pedido.
     */
    private int numberOfIceCreams = 0;

    /**
     * Pizza seleccionada para el pedido.
     */
    private Pizza pizza;

    /**
     * Helado seleccionado para el pedido.
     */
    private IceCream iceCream;

    /**
     * Indica si el cliente ya seleccionó la masa de la pizza.
     */
    private boolean doughChosen = false;

    // Counters for toppings
    /**
     * Cantidad de gomitas con forma de gusanos agregadas al helado.
     */
    private int counterWorms = 0;

    /**
     * Cantidad de gomitas con forma de pandas agregadas al helado.
     */
    private int counterPandas = 0;

    /**
     * Cantidad de gomitas en forma de aros agregadas al helado.
     */
    private int counterRings = 0;

    /**
     * Cantidad de chispas de chocolate agregadas al helado.
     */
    private int counterChocolate = 0;

    /**
     * Cantidad de malvaviscos agregados al helado.
     */
    private int counterMarshmallows = 0;

    /**
     * Cantidad de fresas agregadas al helado.
     */
    private int counterStrawberries = 0;

    /**
     * Cantidad de mangos agregados al helado.
     */
    private int counterMangos = 0;

    /**
     * Cantidad de kiwis agregados al helado.
     */
    private int counterKiwis = 0;


    /**
     * Construye un nuevo robot e inicializa todos sus estados.
     *
     * <p>El estado inicial del robot es {@code sleeping}. La pizza
     * y el helado se inicializan sin ningún producto seleccionado.</p>
     */
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

    /**
     * Cambia el estado actual del robot.
     *
     * @param newState nuevo estado que tendrá el robot
     */
    public void setState(State newState){
        actualState = newState;
    }

    /**
     * Obtiene el estado de reposo del robot.
     *
     * @return estado {@code SleepingState}
     */
    public State sleeping(){
        return sleeping;
    }

    /**
     * Obtiene el estado en el que el robot atiende a un cliente.
     *
     * @return estado {@code ServingClientState}
     */
    public State servingClient(){
        return serving;
    }

    /**
     * Obtiene el estado en el que el robot espera la confirmación
     * del pedido.
     *
     * @return estado {@code WaitingForConfirmationState}
     */
    public State waitingForConfirmation(){
        return waitingForConfirmation;
    }

    /**
     * Obtiene el estado en el que el robot espera instrucciones para la pizza.
     *
     * @return estado {@code WaitingForInstructionsState}
     */
    public State waitingForInstructions(){
        return waitingForInstructions;
    }

    /**
     * Obtiene el estado en el que el robot prepara el pedido de helado.
     *
     * @return estado {@code PreparingOrderState}
     */
    public State preparingOrder(){
        return preparingOrder;
    }

    /**
     * Obtiene el estado en el que el robot espera una solicitud de entrega de la orden.
     *
     * @return estado {@code WaitingRequestState}
     */
    public State waitingRequest(){
        return waitingRequest;
    }

    // EVENT_RELATED METHODS

    /**
     * Procesa el evento de llamada al robot utilizando el estado actual.
     *
     * @return mensaje correspondiente al resultado del evento
     */
    public String call(){
        return actualState.call();
    }

    /**
     * Procesa el evento de cancelación del pedido utilizando el estado actual.
     *
     * @return mensaje correspondiente al resultado del evento
     */
    public String cancelOrder(){
        return actualState.cancelOrder();
    }

    /**
     * Procesa el evento de solicitud de un helado utilizando el estado actual.
     *
     * @return mensaje correspondiente al resultado del evento
     */
    public String orderIceCream(){
        return actualState.orderIceCream();
    }

    /**
     * Procesa el evento de solicitud de una pizza utilizando el estado actual.
     *
     * @param pizzaType tipo de pizza solicitado
     * @return mensaje correspondiente al resultado del evento
     */
    public String orderPizza(Pizza pizzaType){
        return actualState.orderPizza(pizzaType);
    }

    /**
     * Procesa el evento de confirmación del pedido utilizando el estado actual.
     *
     * @return mensaje correspondiente al resultado del evento
     */
    public String confirmOrder(){
        return actualState.confirmOrder();
    }

    /**
     * Procesa el evento de solicitud de preparación del pedido.
     *
     * @return mensaje correspondiente al resultado del evento
     */
    public String requestPreparation(){
        return actualState.requestPreparation();
    }

    /**
     * Procesa la selección del tipo de masa utilizando el estado actual.
     *
     * @param dough tipo de masa seleccionado
     * @return mensaje correspondiente al resultado del evento
     */
    public String chooseDough(String dough){
        return actualState.chooseDough(dough);
    }

    /**
     * Procesa la selección del sabor del helado utilizando el estado actual.
     *
     * @param flavor sabor de helado seleccionado
     * @return mensaje correspondiente al resultado del evento
     */
    public String chooseFlavor(IceCream flavor){
        return actualState.chooseFlavor(flavor);
    }

    /**
     * Procesa la selección de un ingrediente extra para el helado utilizando
     * el estado actual.
     *
     * @param topping ingrediente extra seleccionado
     * @return mensaje correspondiente al resultado del evento
     */
    public String addTopping(ToppingType topping){
        return actualState.addTopping(topping);
    }

    /**
     * Procesa la solicitud de entrega del pedido utilizando el estado actual.
     *
     * @return mensaje correspondiente al resultado del evento
     */
    public String requestDelivery(){
        return actualState.requestDelivery();
    }

    /**
     * Procesa el evento que indica que la preparación del pedido ha terminado.
     *
     * @return mensaje correspondiente al resultado del evento
     */
    public String finishPreparation(){
        return actualState.finishPreparation();
    }

    // ORDER-RELATED METHODS

    /**
     * Agrega una pizza al pedido.
     *
     * @param newPizza pizza que será agregada al pedido
     */
    public void addPizza(Pizza newPizza){
        numberOfPizzas++;
        pizza = newPizza;
    }

    /**
     * Incrementa la cantidad de helados del pedido.
     */
    public void addIceCream(){
        numberOfIceCreams++;
    }

    /**
     * Comprueba si ya se seleccionó una masa para la pizza.
     *
     * @return {@code true} si se seleccionó una masa; {@code false} en caso contrario
     */
    public boolean doughChosen(){
        return doughChosen;
    }

    /**
     * Comprueba si ya se seleccionó un sabor de helado.
     *
     * @return {@code true} si existe un helado seleccionado; {@code false} en caso contrario
     */
    public boolean flavorChosen(){
        return iceCream != null;
    }

    /**
     * Comprueba si el pedido contiene al menos una pizza.
     *
     * @return {@code true} si existe al menos una pizza; {@code false} en caso contrario
     */
    public boolean hasPizza(){
        return numberOfPizzas > 0;
    }

    /**
     * Comprueba si el pedido contiene al menos un helado.
     *
     * @return {@code true} si existe al menos un helado; {@code false} en caso contrario
     */
    public boolean hasIceCream(){
        return numberOfIceCreams > 0;
    }

    /**
     * Establece el tipo de masa seleccionado para la pizza.
     *
     * <p>Además de marcar que la masa ya fue seleccionada, asigna
     * el tipo de masa a la pizza actual.</p>
     *
     * @param dough tipo de masa seleccionado
     */
    public void setPizzaDough(String dough){
        doughChosen = true;

        pizza.setDoughType(dough);
    }

    /**
     * Establece el helado actual del pedido.
     *
     * @param iceCream helado que será asignado al pedido
     */
    public void setIceCream(IceCream iceCream){
        this.iceCream = iceCream;
    }

    /**
     * Agrega un nuevo ingrediente extra al helado.
     *
     * <p>Dependiendo del tipo de ingrediente recibido, incrementa
     * el contador correspondiente y crea un nuevo objeto decorador
     * alrededor del helado actual.</p>
     *
     * @param topping tipo de ingrediente adicional que se agregará
     */
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

    /**
     * Obtiene la cantidad de ingredientes de tipo gomita de gusanos agregados.
     *
     * @return cantidad de gusanos
     */
    public int getWorms(){
        return counterWorms;
    }

    /**
     * Obtiene la cantidad de ingredientes de tipo gomitas de pandas agregados.
     *
     * @return cantidad de pandas
     */
    public int getPandas(){
        return counterPandas;
    }

    /**
     * Obtiene la cantidad de ingredientes de tipo gomitas de aros agregados.
     *
     * @return cantidad de aros
     */
    public int getRings(){
        return counterRings;
    }

    /**
     * Obtiene la cantidad de ingredientes de tipo chispas de chocolate agregadas.
     *
     * @return cantidad de chispas de chocolate
     */
    public int getChocolate(){
        return counterChocolate;
    }

    /**
     * Obtiene la cantidad de ingredientes de tipo malvaviscos agregados.
     *
     * @return cantidad de malvaviscos
     */
    public int getMarshmallows(){
        return counterMarshmallows;
    }

    /**
     * Obtiene la cantidad de ingredientes de tipo fresas agregadas.
     *
     * @return cantidad de fresas
     */
    public int getStrawberries(){
        return counterStrawberries;
    }

    /**
     * Obtiene la cantidad de ingredientes de tipo mangos agregados.
     *
     * @return cantidad de mangos
     */
    public int getMangos(){
        return counterMangos;
    }

    /**
     * Obtiene la cantidad de ingredientes de tipo kiwis agregados.
     *
     * @return cantidad de kiwis
     */
    public int getKiwis(){
        return counterKiwis;
    }

    // TICKET


    /**
     * Genera el ticket correspondiente al pedido actual.
     *
     * <p>El ticket contiene los productos seleccionados, sus nombres,
     * descripciones y precios, así como el precio total del pedido.
     * Después de generar el ticket, se restablecen los datos del pedido.</p>
     *
     * @return cadena de texto que representa el ticket del pedido
     */
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

    /**
     * Restablece los datos del pedido y los contadores de ingredientes
     * a sus valores iniciales.
     *
     * <p>También elimina la pizza y el helado actuales y marca como
     * no seleccionada la masa de la pizza.</p>
     */
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

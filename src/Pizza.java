import java.util.List;

/**
 * Clase abstracta que define la plantilla de preparacion de una pizza.
 */
public abstract class Pizza implements Product {

    /** Contador usado para generar un identificador unico por pizza. */
    private static int nextId = 1;

    /** Identificador de la pizza. */
    protected int id;

    /** nombre de la pizza. */
    protected String name;

    /** precio de la pizza. */
    protected int cost;

    /** Indica si la pizza es vegetariana. */
    protected boolean vegetarian;

    /** Lista de quesos que lleva la pizza. */
    protected List<String> cheeses;

    /** Lista de proteinas que lleva la pizza (vacia si es vegetariana). */
    protected List<String> proteins;

    /** Tipo de masa elegido por el cliente; cadena vacia cuando todavia no se ha elegido una. */
    protected String dough;

    /**
     * Construye una pizza con sus datos base. El tipo de masa no se
     * recibe aqui porque el cliente lo elige después con chooseDough.
     *
     * @param name         nombre de la pizza.
     * @param cost         precio fijo de la pizza.
     * @param vegetariana  si la pizza es vegetariana.
     * @param cheeses      lista de quesos de la pizza.
     * @param proteins     lista de proteinas de la pizza (vacia si es vegetariana).
     */
    public Pizza(String name, int cost, boolean vegetarian, List<String> cheeses, List<String> proteins) {
        this.id = nextId++;
        this.name = name;
        this.cost = cost;
        this.vegetarian = vegetarian;
        this.cheeses = cheeses;
        this.proteins = proteins;
        this.dough = "";
    }

    /**
     * Asigna el tipo de masa elegido por el cliente. Se llama en el estado
     * WaitignForConfirmation del robot como consecuencia del evento
     * chooseDough.
     *
     * @param dough tipo de masa (Napolitana, Romana o Americana).
     */
    public void setDoughType(String dough) {
        this.dough = dough;
    }

    /**
     * Indica si ya se eligio el tipo de masa. Usado como guarda en
     * las transiciones del diagrama de estados.
     *
     * @return true si ya se asigno un tipo de masa.
     */
    public boolean doughChosen() {
        return !dough.equals("");
    }

    /**
     * Metodo plantilla que ejecuta en orden todos los pasos de
     * preparacion de la pizza y concatena el resultado de cada uno
     * en un solo String para que Pizzeria lo imprima.
     *
     * @return la secuencia completa de la preparacion.
     */
    public String preparePizza() {
        StringBuilder sb = new StringBuilder();
        sb.append(prepareDough()).append("\n");
        sb.append(rollOutDough()).append("\n");
        sb.append(addTomatoSauce()).append("\n");
        sb.append(addCheese()).append("\n");
        sb.append(addProtein()).append("\n");
        sb.append(addSpices()).append("\n");
        sb.append(putInOven()).append("\n");
        sb.append(waitForPizza()).append("\n");
        sb.append(takeOutOven()).append("\n");
        sb.append(packageIt());
        return sb.toString();
    }

    /**
     * Prepara la masa segun el tipo elegido por el cliente.
     *
     * @return descripcion del paso realizado.
     */
    public String prepareDough() {
        return "Preparando la masa " + dough + "...";
    }

    /**
     * Aplana la masa ya preparada.
     *
     * @return descripcion del paso realizado.
     */
    public String rollOutDough() {
        return "Aplanando la masa...";
    }

    /**
     * Coloca la salsa de tomate sobre la masa aplanada.
     *
     * @return descripcion del paso realizado.
     */
    public String addTomatoSauce() {
        return "Colocando salsa de tomate...";
    }

    /**
     * Agrega el o los quesos correspondientes a esta pizza. Paso
     * variable, cada subclase concreta lo implementa.
     *
     * @return descripcion del paso realizado.
     */
    public abstract String addCheese();

    /**
     * Agrega la o las proteins correspondientes a esta pizza. Paso
     * variable, cada subclase concreta lo implementa.
     *
     * @return descripcion del paso realizado.
     */
    public abstract String addProtein();

    /**
     * Coloca las especias finales sobre la pizza.
     *
     * @return descripcion del paso realizado.
     */
    public String addSpices() {
        return "Colocando especias...";
    }

    /**
     * Mete la pizza al horno.
     *
     * @return descripcion del paso realizado.
     */
    public String putInOven() {
        return "Metiendo la pizza al horno...";
    }

    /**
     * Espera el tiempo de coccion de la pizza.
     *
     * @return descripcion del paso realizado.
     */
    public String waitForPizza() {
        return "Esperando a que se cocine...";
    }

    /**
     * Saca la pizza ya cocida del horno.
     *
     * @return descripcion del paso realizado.
     */
    public String takeOutOven() {
        return "Sacando la pizza del horno...";
    }

    /**
     * Empaqueta la pizza para su entrega.
     *
     * @return descripcion del paso realizado.
     */
    public String packageIt() {
        return "Empaquetando la pizza...";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getCost() {
        return cost;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * {@inheritDoc}
     * Construye una descripcion pensada para el menu interactivo:
     * name, si es vegetariana, sus ingredients y su costo.
     */
    @Override
    public String getDescription() {
        String type = vegetarian ? "vegetariana" : "no vegetariana";

        StringBuilder ingredients = new StringBuilder();
        for (String cheese : cheeses) {
            ingredients.append(cheese).append(", ");
        }
        for (String protein : proteins) {
            ingredients.append(protein).append(", ");
        }
        if (ingredients.length() > 0) {
            ingredients.setLength(ingredients.length() - 2);
        }

        return name + " (" + type + "): " + ingredients + " - $" + cost;
    }
}

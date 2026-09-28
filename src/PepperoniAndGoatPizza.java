import java.util.Arrays;

/**
 * Pizza Pepperoni de Cabra: el sabor picante y salado del pepperoni
 * contrasta con la acidez del queso de cabra.
 */
public class PepperoniAndGoatPizza extends Pizza {

    /**
     * Construye la pizza Pepperoni de Cabra con sus quesos, proteina
     * y precio.
     */
    public PepperoniAndGoatPizza() {
        super("Pepperoni de Cabra", 165, false, Arrays.asList("Mozzarella", "queso de cabra"), Arrays.asList("Pepperoni"));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String addCheese() {
        StringBuilder sb = new StringBuilder("Anadiendo queso: ");
        for (String cheese : cheeses) {
            sb.append(cheese).append(" ");
        }
        return sb.toString().trim();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String addProtein() {
        StringBuilder sb = new StringBuilder("Anadiendo proteina: ");
        for (String protein : proteins) {
            sb.append(protein).append(" ");
        }
        return sb.toString().trim();
    }
}

import java.util.Arrays;

/**
 * Pizza clasica de pepperoni: mozzarella fundida, pepperoni y
 * parmesano al final.
 */
public class PepperoniPizza extends Pizza {

    /**
     * Construye la pizza Clasica de Pepperoni con sus quesos,
     * proteina y precio.
     */
    public PepperoniPizza() {
        super("Clasica de Pepperoni", 150, false, Arrays.asList("Mozzarella", "Parmesano"), Arrays.asList("Pepperoni"));
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

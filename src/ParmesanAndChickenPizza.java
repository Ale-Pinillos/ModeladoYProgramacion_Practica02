import java.util.Arrays;

/**
 * Pizza Pollo Parmesano: mozzarella abundante, pollo sazonado y
 * parmesano.
 */
public class ParmesanAndChickenPizza extends Pizza {

    /**
     * Construye la pizza Pollo Parmesano con sus quesos, proteina
     * y precio.
     */
    public ParmesanAndChickenPizza() {
        super("Pollo Parmesano", 160, false, Arrays.asList("Mozzarella", "Parmesano"), Arrays.asList("Pollo"));
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

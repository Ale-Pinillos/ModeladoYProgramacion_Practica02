import java.util.Arrays;

/**
 * Pizza Jamon y Parmesano: sencilla y equilibrada, con el
 * parmesano potenciando el sabor del jamon.
 */
public class HamAndParmesanPizza extends Pizza {

    /**
     * Construye la pizza Jamon y Parmesano con sus quesos,
     * proteina y precio.
     */
    public HamAndParmesanPizza() {
        super("Jamon y Parmesano", 145, false, Arrays.asList("Mozzarella", "Parmesano"), Arrays.asList("Jamon"));
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

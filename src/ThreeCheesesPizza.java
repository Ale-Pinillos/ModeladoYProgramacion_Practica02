import java.util.Arrays;
import java.util.Collections;

/**
 * Pizza Tres cheeses: vegetariana, mozzarella para fundir, cabra
 * para sabor y parmesano para intensidad. No lleva proteina.
 */
public class ThreeCheesesPizza extends Pizza {

    /**
     * Construye la pizza Tres cheeses con sus cheeses y precio.
     * No lleva proteina.
     */
    public ThreeCheesesPizza() {
        super("Tres quesos", 155, true, Arrays.asList("Mozzarella", "queso de cabra", "Parmesano"), Collections.emptyList());
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
     * Al ser vegetariana, no hay proteina que agregar.
     */
    @Override
    public String addProtein() {
        return "Sin proteina: pizza vegetariana";
    }
}

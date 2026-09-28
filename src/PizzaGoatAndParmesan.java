import java.util.Arrays;
import java.util.Collections;

/**
 * Pizza Cabra y Parmesano: vegetariana, con sabores intensos y
 * mas sofisticados.
 */
public class PizzaGoatAndParmesan extends Pizza {

    /**
     * Construye la pizza Cabra y Parmesano con sus quesos y
     * precio. No lleva proteina.
     */
    public PizzaGoatAndParmesan() {
        super("Cabra y Parmesano", 140, true, Arrays.asList("Queso de cabra", "Parmesano"), Collections.emptyList());
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
        return sb.toString().trim(); //CAMBIAR
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

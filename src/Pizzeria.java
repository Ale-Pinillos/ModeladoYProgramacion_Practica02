import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Representa a la Pizzeria "El pequeno Cesarin". Se encarga de la logica de la interfaz
 * interactiva en consola. Es el puente entre las clases de todos los patrones.
 */
public class Pizzeria {

    /**
     * Metodo encargado de leer y verificar la entrada del usuario en consola.
     * Se utiliza en la interfaz interactiva. Si es valido, devuelve la opcion ingresada 
     * para que el switch lo use. Si es invalida, imprime un mensaje de error.
     * @param sc el input de consola
     * @return la opcion ingresada por el usuario validada
     */
    private static int readOption(Scanner sc){
        try {
            return sc.nextInt();
        } catch (InputMismatchException ime) {
            System.out.println("Solo se aceptan numeros. Por favor, seleccione una de las opciones disponibles.");
            sc.nextLine();
            return -1;
        }
    }

    /**
     * Sub-menu que permite elegir una de los 6 diferentes tipos de pizzas disponibles.
     * Crea los objetos pizzas de acuerdo a la opcion elegida y se las pasa a robot a
     * traves de su metodo orderPizza. Si se cancela la orden, se regresa al menu 
     * principal.Despues de cada accion, se deja de desplegar este menu y se regresa al 
     * menu cuya opcion lo llamo.
     * @param sc el input de consola
     * @param robot el robot encargado de manejar cada accion delegada por el usuario
     */
    private static void menuPizzaOptions(Scanner sc, Robot robot) {
        boolean keepRunningPO = true;
        while (keepRunningPO) {
            System.out.println("Lirol Cisa: Seleccione uno de nuestros 6 sabores de pizza, por favor");
            System.out.println("1. Pizza de Queso Parmesano y Jamon");
            System.out.println("2. Pizza de Pollo y Queso Parmesano");
            System.out.println("3. Pizza de Pepperoni y Queso de Cabra");
            System.out.println("4. Pizza Clasica de Pepperoni");
            System.out.println("5. Pizza de Queso Parmesano y Queso de Cabra");
            System.out.println("6. Pizza de Tres Quesos");
            System.out.println("0. Cancelar orden");

            int option = readOption(sc);

            switch (option) {
                case 1:
                    System.out.println(robot.orderPizza(new HamAndParmesanPizza()));
                    keepRunningPO = false;
                    break;
                case 2:
                    System.out.println(robot.orderPizza(new ParmesanAndChickenPizza()));
                    keepRunningPO = false;
                    break;
                case 3:
                    System.out.println(robot.orderPizza(new PepperoniAndGoatPizza()));
                    keepRunningPO = false;
                    break;
                case 4:
                    System.out.println(robot.orderPizza(new PepperoniPizza()));
                    keepRunningPO = false;
                    break;
                case 5:
                    System.out.println(robot.orderPizza(new GoatAndParmesanPizza()));
                    keepRunningPO = false;
                    break;
                case 6:
                    System.out.println(robot.orderPizza(new ThreeCheesesPizza()));
                    keepRunningPO = false;
                    break;
                case 0:
                    System.out.println(robot.cancelOrder());
                    keepRunningPO = false;
                    break;
                default:
                    System.out.println("Opcion invalida. Por favor, seleccione una de las opciones disponibles.");
            }
        }
    }

    /**
     * Sub-menu que muestra las opciones de sabores de helado disponibles.
     * Crea los objetos helado y se los pasa al robot a traves de su metodo
     * orderIceCream. Si se cancela la orden, se regresa al menu principal.
     * Despues de cada accion, se deja de desplegar este menu y se regresa 
     * al menu cuya opcion lo llamo.
     * @param sc
     * @param robot
     */
    private static void menuIceCreamOptions(Scanner sc, Robot robot) {
        boolean keepRunningIC = true;
        while (keepRunningIC) {
            System.out.println("Lirol Cisa: Seleccione uno de nuestros 3 sabores de helado, por favor");
            System.out.println("1. Helado de Vainilla");
            System.out.println("2. Helado de Fresa");
            System.out.println("3. Helado de Chocolate");
            System.out.println("0. Cancelar orden");

            int option = readOption(sc);

            switch (option) {
                case 1:
                    System.out.println(robot.chooseFlavor(new VanillaIceCream()));
                    keepRunningIC = false;
                    Pizzeria.menuToppingsOptions(sc, robot);
                    break;
                case 2:
                    System.out.println(robot.chooseFlavor(new StrawberryIceCream()));
                    keepRunningIC = false;
                    Pizzeria.menuToppingsOptions(sc, robot);
                    break;
                case 3:
                    System.out.println(robot.chooseFlavor(new ChocolateIceCream()));
                    keepRunningIC = false;
                    Pizzeria.menuToppingsOptions(sc, robot);
                    break;
                case 0:
                    System.out.println(robot.cancelOrder());
                    keepRunningIC = false;
                    break;
                default:
                    System.out.println("Opcion invalida. Por favor, seleccione una de las opciones disponibles.");
            }
        }
    }

    /**
     * Sub-menu que muestra los tipos de masa disponibles. Pasa los nombres de los
     * tipos de masa al robot para que este los asigne a la pizza. Muestra un mensaje
     * de opcion invalida si el cliente trata de cancelar la orden. Despues de cada 
     * accion, se deja de desplegar este menu y se regresa al menu cuya opcion lo llamo.
     * @param sc
     * @param robot
     */
    private static void menuDoughOptions(Scanner sc, Robot robot) {
        boolean keepRunningDO = true;
        while (keepRunningDO) {
            System.out.println("Lirol Cisa: Seleccione uno de nuestros 3 tipos de masa, por favor");
            System.out.println("1. Napolitana");
            System.out.println("2. Romana");
            System.out.println("3. Americana");
            System.out.println("0. Cancelar orden");

            int option = readOption(sc);

            switch (option) {
                case 1:
                    System.out.println(robot.chooseDough("Napolitana"));
                    keepRunningDO = false;
                    break;
                case 2:
                    System.out.println(robot.chooseDough("Romana"));
                    keepRunningDO = false;
                    break;
                case 3:
                    System.out.println(robot.chooseDough("Americana"));
                    keepRunningDO = false;
                    break;
                case 0:
                    System.out.println(robot.cancelOrder());
                    keepRunningDO = false;
                    break;
                default:
                    System.out.println("Opcion invalida. Por favor, seleccione una de las opciones disponibles.");
            }
        }
    }
    
    /**
     * Sub-menu que muestra todas las opciones de toppings disponibles para helado. 
     * Pasa los nombres de los toppings al robot a traves de su metodo addTopping.
     * Despues de cada accion, se deja de desplegar este menu y se regresa al menu 
     * cuya opcion lo llamo.
     * @param sc
     * @param robot
     */
    private static void menuToppingsOptions(Scanner sc, Robot robot) {
        boolean keepRunningTO = true;
        while (keepRunningTO) {
            System.out.println("Lirol Cisa: Seleccione uno de nuestros 8 toppings disponibles, por favor");
            System.out.println("1. Gomitas de Gusano");
            System.out.println("2. Gomitas de Panda");
            System.out.println("3. Gomitas de Aro");
            System.out.println("4. Chispas de Chocolate");
            System.out.println("5. Malvaviscos");
            System.out.println("6. Fresitas");
            System.out.println("7. Manguitos");
            System.out.println("8. Kiwis");
            System.out.println("0. Terminar Preparacion");

            int option = readOption(sc);

            switch (option) {
                case 1:
                    System.out.println(robot.addTopping("GummyWorms"));
                    keepRunningTO = false;
                    break;
                case 2:
                    System.out.println(robot.addTopping("GummyPandas"));
                    keepRunningTO = false;
                    break;
                case 3:
                    System.out.println(robot.addTopping("GummyRings"));
                    keepRunningTO = false;
                    break;
                case 4:
                    System.out.println(robot.addTopping("ChocolateChips"));
                    keepRunningTO = false;
                    break;
                case 5:
                    System.out.println(robot.addTopping("Marshmallows"));
                    keepRunningTO = false;
                    break;
                case 6:
                    System.out.println(robot.addTopping("Strawberries"));
                    keepRunningTO = false;
                    break;
                case 7:
                    System.out.println(robot.addTopping("Mangos"));
                    keepRunningTO = false;
                    break;
                case 8:
                    System.out.println(robot.addTopping("Kiwis"));
                    keepRunningTO = false;
                    break;
                case 0:
                    System.out.println(robot.finishPreparation());
                    keepRunningTO = false;
                    break;
                default:
                    System.out.println("Opcion invalida. Por favor, seleccione una de las opciones disponibles.");
            }
        }
    }

    /**
     * Metodo principal de la clase. Despliega el menu interactivo en la consola y
     * coordina las respuestas de acuerdo a las opciones elegidas por el cliente.
     * Se muestran todas las acciones que el cliente puede realizar.
     */
    public static void openPizzeria(){
        Robot lirolCisa = new Robot();
        Scanner sc = new Scanner(System.in);
        boolean keepRunning = true;

        while(keepRunning){
            System.out.println("========================================= BIENVENIDO A PIZZERIA 'El Pequeno Cesarin'=========================================");
            System.out.println("Nos hace muy felices informarle que, a partir de ahora, contamos con un nuevo robot, Lirol Cisa.");
            System.out.println("El se encargara de atender y realizar los pedidos. Llamalo para empezar a ser atendido.");
            System.out.println("1. Llamar a nuestro robot");
            System.out.println("2. Cancelar Orden");
            System.out.println("3. Ordenar Pizza");
            System.out.println("4. Ordenar Helado");
            System.out.println("5. Confirmar Orden");
            System.out.println("6. Elegir la masa");
            System.out.println("7. Elegir el sabor de helado");
            System.out.println("8. Agregar un topping");
            System.out.println("9. Solicitar preparacion");
            System.out.println("10. Solicitar entrega");
            System.out.println("11. Terminar preparacion");
            System.out.println("0. salir");

            int option = readOption(sc);

            switch(option){
                case 1:
                    System.out.println(lirolCisa.call());
                    break;
                case 2:
                    System.out.println(lirolCisa.cancelOrder());
                    break;
                case 3:
                    System.out.println(lirolCisa.orderPizza(null));
                    Pizzeria.menuPizzaOptions(sc, lirolCisa);
                    break;
                case 4:
                    System.out.println(lirolCisa.orderIceCream());
                    break;
                case 5:
                    System.out.println(lirolCisa.confirmOrder());
                    break;
                case 6:
                    System.out.println(lirolCisa.chooseDough(null));
                    break;
                case 7:
                    System.out.println(lirolCisa.chooseFlavor(null));
                    Pizzeria.menuIceCreamOptions(sc, lirolCisa);
                    break;
                case 8:
                    System.out.println(lirolCisa.addTopping(null));
                    break;
                case 9:
                    System.out.println(lirolCisa.requestPreparation());
                    break;
                case 10:
                    System.out.println(lirolCisa.requestDelivery());
                    break;
                case 11:
                    System.out.println(lirolCisa.finishPreparation());
                    break;
                case 0:
                    System.out.println("Gracias por su visita, Vuelva pronto.");
                    keepRunning = false;
                    break;
                default:
                    System.out.println("Opcion Invalida. Por favor, seleccione una de las opciones disponibles.");
            }
        }
    }
}

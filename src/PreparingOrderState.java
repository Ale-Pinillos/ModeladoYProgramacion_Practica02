public class PreparingOrderState implements State{

    private Robot robot;

    public PreparingOrderState(Robot robot){
        this.robot = robot;
    }
    
    public String call(){
        return "Operacion invalida, el robot espera instrucciones sobre el helado";
    }

    public String cancelOrder(){
        return "Operacion invalida, ya no es posible cancelar";
    }

    public String orderIceCream(){
        return "Operacion invalida, ya no es posible ordenar";
    }

    public String orderPizza(Pizza pizzaType){
        return "Operacion invalida, ya no es posible ordenar";
    }

    public String confirmOrder(){
        return "Operacion invalida, la orden ya fue confirmada";
    }

    public String requestPreparation(){
        return "Operacion invalida, ya se completo la preparacion";
    }

    public String chooseDough(String dough){
        return "Operacion invalida, ya se completo la preparacion";
    }

    public String chooseFlavor(IceCream flavor){
        if(!robot.hasIceCream())
            return "Operacion invalida, no se ha pedido un helado en la orden, puede finalizar la preparacion";
        
        if(robot.hasIceCream() && robot.flavorChosen())
            return "El sabor de helado ya ha sido elegido";
        
        robot.setIceCream(flavor);
        return "El sabor de helado ha sido elegido";
    }

    public String addTopping(ToppingType topping){
        if(!robot.hasIceCream()){
            return "Operacion invalida, no se ha pedido un helado en la orden, puede finalizar la preparacion";
        }
        
        switch(topping){
        case WORMS:
            if(robot.getWorms() == 3)
                return "Solo se puede agregar hasta 3 veces cada ingrediente";

            robot.addTopping(topping);
            break;
        case PANDAS:
            if(robot.getPandas() == 3)
                return "Solo se puede agregar hasta 3 veces cada ingrediente";

            robot.addTopping(topping);
            break;
        case RINGS:
            if(robot.getRings() == 3)
                return "Solo se puede agregar hasta 3 veces cada ingrediente";

            robot.addTopping(topping);
            break;
        case CHOCOLATE:
            if(robot.getChocolate() == 3)
                return "Solo se puede agregar hasta 3 veces cada ingrediente";

            robot.addTopping(topping);
            break;
        case MARSHMALLOWS:
            if(robot.getMarshmallows() == 3)
                return "Solo se puede agregar hasta 3 veces cada ingrediente";

            robot.addTopping(topping);
            break;
        case STRAWBERRIES:
            if(robot.getStrawberries() == 3)
                return "Solo se puede agregar hasta 3 veces cada ingrediente";

            robot.addTopping(topping);
            break;
        case MANGOS:
            if(robot.getMangos() == 3)
                return "Solo se puede agregar hasta 3 veces cada ingrediente";

            robot.addTopping(topping);
            break;
        case KIWIS:
            if(robot.getKiwis() == 3)
                return "Solo se puede agregar hasta 3 veces cada ingrediente";

            robot.addTopping(topping);
            break;
        }

        return "Se ha agregado el ingrediente extra";
    }

    public String requestDelivery(){
        return "Operacion invalida, la orden aun no esta terminada";
    }

    public String finishPreparation(){
        if(!robot.hasIceCream() || robot.flavorChosen()){
            robot.setState(robot.waitingRequest());
            return "El robot espera instrucciones para entregar la orden";
        }

        return "Operacion invalida, el robot necesita saber el sabor del helado";
    }
    
}

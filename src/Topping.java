public class Topping extends IceCream{
    protected IceCream iceCream;

    public int getCost(){
        return iceCream.getCost() + this.cost;
    }

    public String getName(){
        return iceCream.getName();
    }

    public String getDescription(){
        return iceCream.getDescription + this.description;
    }
}

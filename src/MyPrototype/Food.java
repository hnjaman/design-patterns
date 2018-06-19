package MyPrototype;

public abstract class Food implements Cloneable{
    public double itemPrice;    // global price for mas and murgi
    public abstract String prepareFood();

    public static double foodPrice() {
        double price=20;    // local price for vat only
        return price;
    }

    public Food clone() throws CloneNotSupportedException
    {
        return(Food)super.clone();
    }
}

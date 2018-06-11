package MyDecorator;

public class Murgi extends FoodDecorator {
    public Murgi(Food plainFood) {
        super(plainFood);
    }

    public String prepareFood() {
        return super.prepareFood()+" + Murgi.";
    }

    public double foodPrice() {
        return super.foodPrice()+25;
    }
}

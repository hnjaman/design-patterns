package MyDecorator;

public class Mas extends FoodDecorator {
    public Mas(Food plainFood) {
        super(plainFood);
    }

    public String prepareFood() {
        return super.prepareFood()+" + Mas.";
    }

    public double foodPrice() {
        return super.foodPrice()+30;
    }
}

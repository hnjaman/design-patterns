package MyDecorator;

public class FoodDecorator extends Food{
    public Food plainFood;
    public FoodDecorator(Food plainFood){
        this.plainFood=plainFood;
    }

    @Override
    public String prepareFood() {
        return plainFood.prepareFood();
    }

    @Override
    public double foodPrice() {
        return plainFood.foodPrice();
    }
}

package src.Decorator;

public class ChineeseFood extends FoodDecorator {

    public ChineeseFood(Food newFood)    {
        super(newFood);
    }

    public String prepareFood(){
        return super.prepareFood() +" With Fried Rice and Manchurian  ";
    }
    public double foodPrice()   {
        return super.foodPrice()+65.0;
    }
}

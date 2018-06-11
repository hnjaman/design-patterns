package Decorator;

import MyDecorator.Food;

public abstract class FoodDecorator extends Food {
    private Food newFood;
    public FoodDecorator(Food newFood)  {
        this.newFood=newFood;
    }
    public String prepareFood(){
        return newFood.prepareFood();
    }
    public double foodPrice(){
        return newFood.foodPrice();
    }
}

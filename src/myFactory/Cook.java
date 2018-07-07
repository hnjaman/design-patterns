package myFactory;

public class Cook extends Service {
    @Override
    double getCost() {
        return 20000;
    }

    @Override
    String serviceStatus() {
        return "Items are aready and "+getCost()+" is your bill \n";
    }
}

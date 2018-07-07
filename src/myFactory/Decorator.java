package myFactory;

public class Decorator extends Service {
    @Override
    double getCost() {
        return 10000;
    }

    @Override
    String serviceStatus() {
        return "Decoration is ready and "+getCost()+" is your bill \n";
    }

}

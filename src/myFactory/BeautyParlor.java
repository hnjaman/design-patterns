package myFactory;

public class BeautyParlor extends Service {
    @Override
    double getCost() {
        return 5000;
    }

    @Override
    String serviceStatus() {
        return "Bride is ready and "+getCost()+" is your bill \n";
    }
}

package MyDecorator;

public class VortaPackage extends Food{

    @Override
    public String prepareFood() {
        return "Vat, Vorta";
    }

    @Override
    public double foodPrice() {
        return 25;
    }
}

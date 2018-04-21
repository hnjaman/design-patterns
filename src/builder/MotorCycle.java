package builder;

public class MotorCycle implements IBuilder {
    private Product product = new Product();
    @Override
    public void BuildBody()
    {
        product.Add("This is a body of a Motorcycle");
    }
    @Override
    public void InsertWheels()
    {
        product.Add("2 wheels are added");
    }
    @Override
    public void AddHeadlights()
    {
        product.Add("1 Headlights are added");
    }
    @Override
    public Product GetVehicle()
    {
        return product;
    }
}

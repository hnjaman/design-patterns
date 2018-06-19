package prototype;

public abstract class BasicCar implements Cloneable {

    public String modelname;
    public int price=100000;

    public String getModelname()
    {
        return modelname;
    }

    public void setModelname(String modelname)
    {
        this.modelname = modelname;
    }

    public static int setPrice()
    {
        int price = 100000;
       // Random r = new Random();
       // int p = r.nextInt(100000);
      //  price = p;
        return price;
    }

    public BasicCar clone() throws CloneNotSupportedException
    {
        return(BasicCar)super.clone();
    }
}

package singleton;

public class SingletonPatternEx {
    public static void main(String[] args)
    {
        Captain c1 = Captain.getCaptain();  // create a captain object
        System.out.println("Our Captain object is : "+c1);
        System.out.println("Trying to make another captain for our team");
        Captain c2 = Captain.getCaptain();
        if(c1 == c2)
        {
            System.out.println("c1 and c2 are same object "+c2);
        }
    }
}

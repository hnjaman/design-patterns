package singleton;

public class SelectACaptain {
    public static void main(String[] args)
    {
        // create a captain object
        Captain c1 = Captain.getCaptain();
        System.out.println("Our Captain object is : "+c1);
        System.out.println("Trying to make another captain for our team");
        Captain c2 = Captain.getCaptain();
        if(c1 == c2)
        {
            System.out.println("c1 and c2 are same object "+c2);
        }
    }
}

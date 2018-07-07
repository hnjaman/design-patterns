package singleton;

public class Captain {
    private static Captain captain;
    //We make the constructor private to prevent the use of "new"
    private Captain() {
    }

    public static Captain getCaptain() {
        // Lazy initialization
        if (captain == null) {
            captain = new Captain();
            System.out.println("New Captain selected for our team");
        } else {
            System.out.print("You already have a Captain for your team.");
        }
        return captain;
    }
}

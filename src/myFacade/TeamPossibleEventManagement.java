package myFacade;

public class TeamPossibleEventManagement {
    Cook cook;
    Decorator decorator;
    BeautyParlor beautyParlor;

    public TeamPossibleEventManagement() {
        cook = new Cook();
        decorator = new Decorator();
        beautyParlor = new BeautyParlor();
    }
    public void arrangeWeddingProgram()
    {
        cook.cooking();
        decorator.setEnvironment();
        beautyParlor.brideGrooming();
        System.out.println("Thanks for inviting us to arrange such a beautiful wedding like this");
    }
}

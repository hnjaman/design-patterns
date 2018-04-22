package state;

public class StatePatternEx {
    public static void main(String[] args) {
        System.out.println("***State Pattern Demo***\n");

        //Initially TV is Off
       // Off initialState = new Off();
        On initialState = new On();
        TV tv = new TV(initialState);
        //First time press
        tv.pressButton();
        //Second time press
        tv.pressButton();
        tv.pressButton();
    }
}

package bridge;

public class Triangle extends Shape {
    protected Triangle(IColor c) {
        super(c);
    }

    //Implementer-specific method
    @Override
    void drawShape(int border) {
        System.out.print(" This Triangle is colored with: ");
        color.fillWithColor(border);
    }

    //Abstraction-specific method
    @Override
    void modifyBorder(int border, int increment) {
        System.out.println("\nNow we are changing the border length " + increment + "times");
        border = border * increment;
        drawShape(border);
    }
}

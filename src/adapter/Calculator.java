package src.adapter;


/*Calculator can calculate the area of a rectangle. To calculate the area we need a
Rectangle input.*/
public class Calculator {
    Rect rectangle;

    public double getArea(Rect r) {
        rectangle = r;
        return rectangle.l * rectangle.w;
    }
}

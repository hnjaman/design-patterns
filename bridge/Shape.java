package bridge;

public abstract class Shape {
    //Composition
    protected bridge.IColor color;
    protected Shape(bridge.IColor c)
    {
        this.color = c;
    }
    abstract void drawShape(int border);
    abstract void modifyBorder(int border,int increment);
}

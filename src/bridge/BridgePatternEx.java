package bridge;

public class BridgePatternEx {
    public static void main(String[] args) {

        System.out.println("*****BRIDGE PATTERN*****");

        //Coloring Green to Triangle
        System.out.println("\nColoring Triangle:");
        IColor green = new GreenColor();
        Shape triangleShape = new Triangle(green);
        triangleShape.drawShape(20);
        triangleShape.modifyBorder(20, 3);

        //Coloring Red to Rectangle
        System.out.println("\n\nColoring Rectangle :");
        IColor red = new RedColor();
        Shape rectangleShape = new Rectangle(red);
        rectangleShape.drawShape(50);
        //Modifying the border length twice
        rectangleShape.modifyBorder(50, 2);
    }
}

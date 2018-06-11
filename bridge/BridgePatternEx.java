package bridge;

public class BridgePatternEx {
    public static void main(String[] args) {

        System.out.println("*****BRIDGE PATTERN*****");

        //Coloring Green to Triangle
        System.out.println("\nColoring Triangle:");
        bridge.IColor green = new bridge.GreenColor();
        bridge.Shape triangleShape = new bridge.Triangle(green);
        triangleShape.drawShape(20);
        triangleShape.modifyBorder(20, 3);

        //Coloring Red to Rectangle
        System.out.println("\n\nColoring Rectangle :");
        bridge.IColor red = new bridge.RedColor();
        bridge.Shape rectangleShape = new bridge.Rectangle(red);
        rectangleShape.drawShape(50);
        //Modifying the border length twice
        rectangleShape.modifyBorder(50, 2);
    }
}

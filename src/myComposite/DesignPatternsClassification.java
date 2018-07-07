package myComposite;

import java.util.List;

public class DesignPatternsClassification {
    public static void main(String[] args) {
        DesignPattern designPattern = new DesignPattern("Design Patterns");
        DesignPattern creational = new DesignPattern("Creational Pattern");
        DesignPattern structural = new DesignPattern("Structural Pattern");
        DesignPattern behavioral = new DesignPattern("Behavioral Pattern");

        designPattern.add(creational);
        designPattern.add(structural);
        designPattern.add(behavioral);

        DesignPattern singleton = new DesignPattern("Singleton pattern");
        DesignPattern prototype = new DesignPattern("Prototype pattern");
        DesignPattern factoryMethod = new DesignPattern("Factory Method pattern");
        DesignPattern abstractFactory = new DesignPattern("Abstract Factory pattern");
        DesignPattern builder = new DesignPattern("Builder Pattern");

        DesignPattern proxy = new DesignPattern("Composite Pattern");
        DesignPattern decorator = new DesignPattern("Decorator Pattern");
        DesignPattern facade = new DesignPattern("Composite Pattern");
        DesignPattern composite = new DesignPattern("Decorator Pattern");
        DesignPattern adapter = new DesignPattern("Composite Pattern");
        DesignPattern bridge = new DesignPattern("Composite Pattern");
        DesignPattern flyweight = new DesignPattern("Composite Pattern");

        creational.add(singleton);
        creational.add(prototype);
        creational.add(factoryMethod);
        creational.add(abstractFactory);
        creational.add(builder);

        structural.add(decorator);
        structural.add(composite);


        List<iDesignpattern> designpatternsType = designPattern.getclassifiedpatterns();
        System.out.println("Design Patterns");
        for ( iDesignpattern dp : designpatternsType ) {
            System.out.println("\t"+dp.getPatternName());
        }


        List<iDesignpattern> creationalPatternTypes = creational.getclassifiedpatterns();
        System.out.println("\nCreational Patterns");
        for(iDesignpattern cp : creationalPatternTypes){
            System.out.println("\t"+cp.getPatternName());
        }

    }
}

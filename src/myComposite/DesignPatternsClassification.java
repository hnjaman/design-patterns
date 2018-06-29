package myComposite;

import java.util.List;

public class DesignPatternsClassification {
    public static void main(String[] args) {
        DesignPattern designPattern = new DesignPattern("Design Patterns");
        DesignPattern creationalPattern = new DesignPattern("Creational Patterns");
        DesignPattern structuralPattern = new DesignPattern("Structural Patterns");
        DesignPattern behavioralPattern = new DesignPattern("Behavioral Patterns");

        designPattern.add(creationalPattern);
        designPattern.add(structuralPattern);
        designPattern.add(behavioralPattern);

        DesignPattern singletonPattern = new DesignPattern("Singleton pattern");
        DesignPattern prototypePattern = new DesignPattern("Prototype pattern");
        DesignPattern decoratorPattern = new DesignPattern("Decorator Pattern");
        DesignPattern compositePattern = new DesignPattern("Composite Pattern");

        List<iDesignpattern> designpatternsType = designPattern.getclassifiedpatterns();
        for ( iDesignpattern dp : designpatternsType ) {
            System.out.println(dp.getPatternName());
        }
    }
}

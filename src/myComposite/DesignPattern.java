package myComposite;

import java.util.ArrayList;
import java.util.List;

public class DesignPattern implements iDesignpattern{
    private String patternName;
    private List<iDesignpattern> classifiedpatterns;

    DesignPattern(String patternName) {
        this.patternName = patternName;
        classifiedpatterns = new ArrayList<iDesignpattern>();
    }

    public void add(DesignPattern designPattern){
        classifiedpatterns.add(designPattern);
    }

    public void remove(DesignPattern designPattern){
        classifiedpatterns.remove(designPattern);
    }

    public List<iDesignpattern> getclassifiedpatterns() {
        return classifiedpatterns;
    }

    @Override
    public String getPatternName() {
        return patternName;
    }
}

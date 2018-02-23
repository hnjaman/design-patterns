package factory;

// https://www.javatpoint.com/factory-method-design-pattern
//Calculate Electricity bill a real world Example.

// Step1 

//We are going to create a Plan abstract class.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

abstract class Plan {

    protected double rate;

    abstract void getRate();

    public void calculateBill(int units) {
        System.out.println(units * rate);
    }

}
//end of Plan class.

// Step 2 

//We are going to create a Concrete classes that extends Plan abstract class.

class DomesticPlan extends Plan {
    //@override
    public void getRate() {
        rate = 3.50;
    }
}
//end of DomesticPlan class.

class CommercialPlan extends Plan {
    //@override
    public void getRate() {
        rate = 7.50;
    }
}
//end of CommercialPlan class.

class InstitutionalPlan extends Plan {
    //@override
    public void getRate() {
        rate = 5.50;
    }
}
//end of InstitutionalPlan class.

// Step 3

//Create a GetPlanFactory to generate object of concrete classes based on given information.

class GetPlanFactory {

    //use getPlan method to get object of type Plan
    public Plan getPlan(String planType) {
        if (planType == null) {
            return null;
        }

        if (planType.equalsIgnoreCase("DOMESTICPLAN")) {
            return new DomesticPlan();
        } else if (planType.equalsIgnoreCase("COMMERCIALPLAN")) {
            return new CommercialPlan();
        } else if (planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
            return new InstitutionalPlan();
        }

        return null;
    }
}
//end of GetPlanFactory class.

// Step 4

//Use the GetPlanFactory to get the object of concrete classes by passing an information such as type(DOMESTICPLAN/COMMERCIALPLAN/INSTITUTIONALPLAN).

class GenerateBill {

    public static void main(String args[]) throws IOException {

        GetPlanFactory planFactory = new GetPlanFactory();

        //get an object of DomesticPlan and call its getPlan()method.
        // But we want to calculate the bill for one plan at time not all.
        // for this we IO concept.

        System.out.print("Enter the name of plan for which the bill will be generated: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String planName = br.readLine();

        System.out.print("Enter the number of units for bill will be calculated: ");

        int units = Integer.parseInt(br.readLine());

        Plan p = planFactory.getPlan(planName);

        //call getRate() method and calculateBill()method of DomesticPaln.
        System.out.print("Bill amount for " + planName + " of  " + units + " units is: ");
        p.getRate();
        p.calculateBill(units);
    }
}//end of GenerateBill class.

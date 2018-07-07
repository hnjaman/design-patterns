package myFactory;

import java.util.Scanner;

public class TeamPossibleEMFarm {
    public static void main(String[] args) throws Exception {
        String serviceName = null;
        GetService getService = new GetService();

        do{
            System.out.print("==== Service Menu ====\n");
            System.out.print(" 1. cook.          \n");
            System.out.print(" 2. beauty parlor. \n");
            System.out.print(" 3. decorator.     \n");
            System.out.print(" 4. exit           \n");
            System.out.print("Please make a Order: ");

            Scanner sc = new Scanner(System.in);
            serviceName = sc.nextLine();

            switch (serviceName) {
                case "cook":{
                    Service callingCook = getService.callingService("cook");
                    System.out.println(callingCook.serviceStatus());
                }
                break;

                case "beauty parlor":{
                    Service callingBeautyParlor = getService.callingService("beauty parlor");
                    System.out.println(callingBeautyParlor.serviceStatus());
                }
                break;

                case "decorator":{
                    Service callingDecorator = getService.callingService("decorator");
                    System.out.println(callingDecorator.serviceStatus());
                }
                break;

                case "exit":{
                    System.out.println("### Thank you sir. Hope we will be invited later \n");
                }
                return;

                default:{
                    System.out.println("### Sir, "+serviceName+" service is not available \n");
                }
                break;
            }//end of switch
        }while(serviceName != "exit");
    }
}

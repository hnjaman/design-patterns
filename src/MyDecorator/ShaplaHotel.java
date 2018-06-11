package MyDecorator;

import java.util.Scanner;

public class ShaplaHotel {
    public static String choice;
    public static void main(String[] args) {
        do{
            System.out.print("==== Food Menu ====\n");
            System.out.print(" 1. vorta.         \n");
            System.out.print(" 2. mas.           \n");
            System.out.print(" 3. murgi.         \n");
            System.out.print(" 4. exit           \n");
            System.out.print("Enter your choice: ");

            Scanner sc = new Scanner(System.in);
            choice = sc.nextLine();
            switch (choice) {
                case "vorta":{
                    VortaPackage vortaPackage = new VortaPackage();
                    System.out.println("### You have eaten "+vortaPackage.prepareFood());
                    System.out.println("### Your Bill is "+vortaPackage.foodPrice()+" Taka");
                }
                break;

                case "mas":{
                    Food mas = new Mas(new VortaPackage());
                    System.out.println("### You have eaten "+mas.prepareFood());
                    System.out.println("### Your Bill is "+mas.foodPrice()+" Taka");
                }
                break;

                case "murgi":{
                    Food murgi = new Murgi(new VortaPackage());
                    System.out.println("### You have eaten "+murgi.prepareFood());
                    System.out.println("### Your Bill is "+murgi.foodPrice()+" Taka");
                }
                break;

                case "exit":{
                    System.out.println("### Mama abar aisen");
                }
                return;

                default:{
                    System.out.println("### Mama "+choice+" saash!!!!!");
                }
                break;
            }//end of switch

        }while(choice != "exit");
    }
}

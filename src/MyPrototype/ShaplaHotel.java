package MyPrototype;

public class ShaplaHotel {
    public static void main(String[] args) throws CloneNotSupportedException {
        Food mas = new Mas();
        mas.itemPrice=30;

        Food cloneItem;
        cloneItem=mas.clone();
        cloneItem.itemPrice=mas.itemPrice+Food.foodPrice();
        System.out.println(cloneItem.itemPrice+" is bill for "+mas.prepareFood());

        Food murgi = new Murgi();
        murgi.itemPrice=25;
        cloneItem=murgi.clone();
        cloneItem.itemPrice=murgi.itemPrice+Food.foodPrice();
        System.out.println(cloneItem.itemPrice+" is bill for "+murgi.prepareFood());
    }
}


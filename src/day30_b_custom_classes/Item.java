package day30_b_custom_classes;
// Custom class - Template how the object of this class will behave
public class Item {
    //Instance variable
    String name;
    double prise;



    public String toString (){
        String msg = "Item info: " + "\n\tName: " + name + "\n\tPrice: " + prise;

        return msg;
    }
}

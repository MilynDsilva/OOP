public class class_object {
    String fruitname;
    int fruitprice;
    //constructor
    class_object(String name, int price) {
        this.fruitname=name;
        this.fruitprice=price;
    }
public static void main(String args[]) {
    //objs
    class_object fruit1=new class_object("Apple", 25);
    class_object fruit2=new class_object("Mangoo", 30);
    //accesing data through ref
    System.out.println("The fruit name is "+fruit1.fruitname+" and its price is "+fruit1.fruitprice);
    System.out.println("The fruit name is "+fruit2.fruitprice+" and its price is "+fruit2.fruitprice);
    
}
}
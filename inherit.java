class fruits {
    String taste = "Sweet";
    String nature = "Dry";
}
public class inherit extends fruits {
    String color ="Yellow";

    public static void main(String args[]) {
       inherit object1 = new inherit();
       System.out.println(object1.nature+" fruits are "+object1.taste+" and Mangoo is "+object1.color+" in color");
    }
}
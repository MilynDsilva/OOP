class fruits1 {
    int fruitprice(){
        return 0;   
    }  
}
class mango1 extends fruits1 {
    int fruitprice(){
        return 10;   
    }  
}
class apple1 extends fruits1 {
    int fruitprice(){
        return 14;   
    }  
}
class methoverriding {
public static void main(String args[]) {
 mango1 mg = new mango1();
 apple1 ap = new apple1();
 System.out.println("Price of a mangoo is "+mg.fruitprice());
 System.out.println("Price of an apple is "+ap.fruitprice());   
}
}

//If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java
https://www.javatpoint.com/method-overriding-in-java
interface fruit1{
    final int price =10;
    void display();
}

class interface1 implements fruit1 {
    
    public void display() {
        System.out.println("Apple is worth "+price);
        
    }

public static void main(String args[]) {
    interface1 i= new interface1();
    i.display();
    System.out.println(price);
    }
}
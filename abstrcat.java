abstract class fruit {
    public abstract void sound();

}
public class abstrcat extends fruit {
    
    public void sound()
    {
        System.out.println("Apple");
    }

public static void main(String args[]) {
    fruit fruit = new abstrcat();
    fruit.sound();
    
    }

}
class encapsulation
{
    private int nooffruits =0;
    public void setnooffruits (int count){
        nooffruits= count;
    }
    public int getnooffruits()
    {
        return nooffruits;
    }
}
public class encap {
    
public static void main(String args[]) {
encapsulation fruit = new encapsulation();
fruit.setnooffruits(500);
System.out.println("No of fruits are "+fruit.getnooffruits());
    
}
}

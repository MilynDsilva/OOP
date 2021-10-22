class encapsulation
{
    private String name;
    private int age;

    public String getname() {
        return name;
    }
    public void setname(String newname)
    {
        name = newname;
    }

    public int getage() {
        return age;
    }
    public void setage(int newage)
    {
        age = newage;
    }
    
}
public class encap {
    
public static void main(String args[]) {
encapsulation en = new encapsulation();
en.setname("John");
en.setage(20);
System.out.println("Name "+en.getname()+" and age is "+en.getage());

    
}
}







// class encapsulation
// {
//     private int nooffruits =10;
//     public void setnooffruits (int count){
//         nooffruits= count;
//     }
//     public int getnooffruits()
//     {
//         return nooffruits;
//     }
// }
// public class encap {
    
// public static void main(String args[]) {
// encapsulation fruit = new encapsulation();
// //fruit.setnooffruits(500);
// System.out.println("No of fruits are "+fruit.getnooffruits());
    
// }
// }

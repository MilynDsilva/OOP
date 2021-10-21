class Overloading
{
    public void disp(char c)
    {
         System.out.println(c);
    }
    public void disp(char c, int num)  
    {
         System.out.println(c + " "+num);
    }
}
public class polymorphism
{
   public static void main(String args[])
   {
       Overloading obj = new Overloading();
       obj.disp('a');
       obj.disp('a',10);
   }
}
// class animal {
//     public void sound()
//     {
//         System.out.println("Sound");
//     }
// }
// class dog {
//     public void sound()
//     {
//         System.out.println("Sound");
//     }
// }

// public class polymorphism extends animal{
//     public class dog extends animal {
//     public void sound()
//     {
//         System.out.println("Meow");
//     }
// }
//     public static void main(String args[]) {
//         animal anim = new animal();
//         dog dog = new dog();
//         anim.sound();
       
//     }
    
// }
    
    
    
    

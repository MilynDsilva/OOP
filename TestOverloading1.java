class multiwithconstructor1 {
    static int multiwithconstructor(int a,int b){
        return a*b;
    }
    static double multiwithconstructor(double a,double b,double c){
        return a*b*c;
    }
}
class multiwithoutconstructor1 {
    static int multi(int a,int b){
        return a*b;
    }
    static double multi(double a,double b,double c){
        return a*b*c;
    }
}
class TestOverloading1{
public static void main(String args[]) {
    System.out.println(multiwithconstructor1.multiwithconstructor(10,10));   
    System.out.println(multiwithconstructor1.multiwithconstructor(12.5,1.2,10));
    System.out.println(multiwithoutconstructor1.multi(11,10));   
    System.out.println(multiwithoutconstructor1.multi(10.2,11.3,10));
}
}
//By changing number of arguments ^
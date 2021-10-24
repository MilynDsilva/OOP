class multiwithconstructor {
    static int multiwithconstructor(int a,int b){
        return a*b;
    }
    static int multiwithconstructor(int a,int b,int c){
        return a*b*c;
    }
}
class multiwithoutconstructor {
    static int multi(int a,int b){
        return a*b;
    }
    static int multi(int a,int b,int c){
        return a*b*c;
    }
}
class TestOverloading{
public static void main(String args[]) {
    System.out.println(multiwithconstructor.multiwithconstructor(10,10));   
    System.out.println(multiwithconstructor.multiwithconstructor(12,12,10));
    System.out.println(multiwithoutconstructor.multi(11,10));   
    System.out.println(multiwithoutconstructor.multi(10,11,10));
}
}
//By changing number of arguments ^
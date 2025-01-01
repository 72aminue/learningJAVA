// same method name but with different parameter
class demo{
    void test(){
        System.out.println("no parameter");
    }
    void test(int a){
        System.out.println("parameter a="+a);

    }
    void test(int a, int b){
        System.out.println("two parameter:" +a+" "+b);

    }
}


public class overloadingMethod {
    public static void main(String[] args) {
        demo D= new demo();
        D.test();
        D.test(8);
        D.test(6,7 );

    }
}

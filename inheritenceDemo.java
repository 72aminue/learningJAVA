//create a superclass
class A{
    int i,j;
    void showij(){
        System.out.println("i and j:" +i+","+j);
    }

}
// create a subclass extends the superclass A
class B extends A{
    int  k;
    void showk() {
        System.out.println("k is :" + k);
    }
    void sum(){
            System.out.println("i+j+k="+(i+j+k));
        }

}



public class inheritenceDemo {
    public static void main(String[] args) {
        A superOb=new A();
        B subOb= new B();
        subOb.i=10;// we can use i and j for subob object as well because of inheritance
        subOb.j=20;
        subOb.k=30;
        superOb.showij();

        subOb.showij();
        subOb.showk();
        subOb.sum();
    }
}
// make sure that your method or variable isn't private or it will not be accesible by the subclass
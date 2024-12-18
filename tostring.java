class Car{

    String color= "black";
    int number=100;
    String model="AA";

    public String toSting(){

        return "\n"+color+ "\n"+number +"\n"+ model;

    }

}



public class tostring {
    public static void main(String[] args) {
     Car C1= new Car();
        System.out.println(C1.toSting());

    }
}

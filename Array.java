import java.util.Arrays;
class twoArray{

}

class autoArray{


    int [] month_days={31,28,31,30,31,30,31,31,30,31,30,31};


}
public class Array {
    public static void main(String[] args) {

        autoArray myArray= new autoArray();

        System.out.println("April has " + myArray.month_days[3] + " days");


        //printing Array with for loop

        for(int i=0; i<myArray.month_days.length; i++){
            System.out.println(myArray.month_days[i]);
        }
        //printingg array with for each loop
        for (int days:myArray.month_days){
            System.out.println(days);
        }
        // printing with toString()
        System.out.println("Arrays: "+ Arrays.toString(myArray.month_days));
    }


}




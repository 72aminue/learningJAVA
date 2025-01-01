import java.util.*;
public class arraylist {
    public static void main(String[] args) {

        ArrayList<Integer>marks=new ArrayList<>();

        //Adding elements in arraylist

        marks.add(24);
        marks.add(57);
        marks.add(45);
        marks.add(64);
        marks.add(56);

        System.out.println("Before change:"+marks);
        // adding on specific position
        marks.add(1,46);// 46 will replace 57
        System.out.println("After change:"+marks);

        ArrayList<Integer>number=new ArrayList<>();
        number.add(4);
        number.add(6);
        number.add(8);
        System.out.println(number);

        //addAll: adding two list together(datatype has to be compatible)
        marks.addAll(number);
        System.out.println("After merging two list:"+marks);
        // addall on specific location
        marks.addAll(1,number);
        System.out.println("number will add from 2nd position"+marks);

        //cloning an arraylist:
        ArrayList<String>list1=new ArrayList<>();
        list1.add("Apple");
        list1.add("banana");
        ArrayList<String>list2=(ArrayList<String>) list1.clone();
        System.out.println("Orriginal list1"+list1);
        System.out.println("Cloned list2"+list2);
        //check(return true/ false)  if the list contains the element:

        ArrayList<String>fruit=new ArrayList<>();
        fruit.add("Orange");
        fruit.add("Melon");
        System.out.println(fruit.contains("Orange")+"  RETURN -- TRUE");
        System.out.println(fruit.contains("Apple")+"   RETURN-- FALSE");

        //increase Capacity
        ArrayList<Integer>grades=new ArrayList<>();//initial capacity is 10
        grades.ensureCapacity(100);//now initial capacity is 100

        //forEach:perform the given action on each element
        ArrayList<String>names=new ArrayList<>();
        names.add("akib");
        names.add("sophia");
        //printing with forEach
        names.forEach(element-> System.out.println("printing with forEach method "+element));// add the printing text with both akib and sophia
        names.forEach(element-> System.out.println(element.toUpperCase()));

        // get: returns an specific elements in the specific position in the list
        ArrayList<String>list=new ArrayList<>();
        list.add("Akib");
        list.add("Sophia");
        System.out.println(list.get(1));//get(index)

   // indexof= opposite of get() gives the index of an object

        ArrayList<String>permit= new ArrayList<>();
        permit.add("Akib");
        permit.add("Sophia");
        System.out.println(permit.indexOf("Akib"));// wrong entry will return -1


   //isEmpty: returns true if the list is empty
   ArrayList<String>newList=new ArrayList<>();
        System.out.println(newList.isEmpty());// return true
   newList.add("good");
        System.out.println(newList.isEmpty());// return

   // lastIndexOf(object o)  returns the last occurance of the specified elemnt if not found then return -1
        ArrayList<String>newlist= new ArrayList<>();
        newlist.add("apple");
        newlist.add("banana");
        newlist.add("apple");
        System.out.println(newlist.lastIndexOf("Apple"));

   // remove  any specific element of the list
   ArrayList<String>list3=new ArrayList<>();
   list3.add("Apple");
   list3.add("orage");
   list3.add("banana");
   list3.remove(2); // remove banana
   list3.remove("Apple");// remove apple
        System.out.println(list3);

//removeif, remove with some specific condition

        ArrayList<Integer>num= new ArrayList<>();
        for (int i=0; i<11; i++){
            num.add(i);
        }
        System.out.println(num);

        num.removeIf(n-> n%2==0);// remove all the even number

        System.out.println(num);
//        // remove range
//
//        ArrayList<Integer>tenNum=new ArrayList<>();
//        for (int i=0; i<11; i++) {
//            tenNum.add(i);
//        }
//        tenNum.removeRange(1,5);// index of 1 to 5 will be gone
//        System.out.println(tenNum);


        //replaceALl
        ArrayList<Integer>tenNum=new ArrayList<>();
        for (int i=0; i<11; i++) {
            tenNum.add(i);
        }

        tenNum.replaceAll(n-> n*n);
            System.out.println(tenNum);

    }
}

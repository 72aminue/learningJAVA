//java control statement and loop

public class ifstatement {
    public static void main(String[] args) {
        int x, y;
        x=10;
        y=20;
        if (x<y) System.out.println("X is less than y");
        x*=2;
        if (x==y) System.out.println("X and Y is same");
        x*=2;
        if(x>y) System.out.println("X is greater than Y");
        if (x==y) System.out.println("X and Y is same");// won't display cause x is not equal to y anymore
    }
}



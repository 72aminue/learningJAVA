import java.util.Arrays;
public class multidomentionArry {
    public static void main(String[] args) {
        int[][] flats = new int[2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][2] = 203;
        flats[1][0] = 201;
        flats[1][1] = 202;
        //using for each loop
        for (int[] row : flats) {
            for (int flat : row) {
                System.out.print(flat + " ");


            }
            System.out.println(" ");
        }

        //basic way
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    //using deepToSring
        System.out.println("Multi-Dimentional Array: "+ Arrays.deepToString(flats));

    }

}









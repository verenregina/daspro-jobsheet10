import java.util.Scanner;
public class ModifikasiNumbers29 {

    public static void main(String[] args) {
        int [][] myNumbers = new int [3][5];
      
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Panjang baris ke-" + (i+1) +": "+myNumbers[i].length);
        }
    }
}
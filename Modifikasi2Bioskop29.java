import java.util.Scanner;
public class Modifikasi2Bioskop29 {
    public static void main(String[] args) {
    String[][] penonton = new String[4][2];
    System.out.println(penonton.length);

    for (int i = 0; i < penonton.length; i++){
     System.out.println("Panjang baris ke-" + (i+1) + ": " + penonton[i].length);
    }
    System.out.println(penonton.length);
    for (String[] barisPenonton : penonton) {
        System.out.println("Panjang baris: " + barisPenonton.length);
    }
    for (int i =0; i < penonton.length; i++) {
        System.out.println("Penonton pada baris ke-" + (i+1) + String.join(", ",penonton[i]));
    }
    }
}

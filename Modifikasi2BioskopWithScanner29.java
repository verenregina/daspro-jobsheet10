import java.util.Scanner;
public class Modifikasi2BioskopWithScanner29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");

            System.out.println("Pilih menu (1-3): ");
            int pilihanMenu = sc.nextInt();
            sc.nextLine();

            switch (pilihanMenu) {
                case 1:
                    System.out.println("Masukkan nama: ");
                    nama = sc.nextLine();

                    do {
                        System.out.println("Masukkan baris: ");
                        baris = sc.nextInt();
                        System.out.println("Masukkan kolom: ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        if (isValidInput(penonton, baris, kolom)) {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Data penonton berhasil diinput.");
                        } else {
                            System.out.println("Warning: Kursi sudah terisi. Masukkan baris dan kolom yang benar.");
                        }
                    } while (!isValidInput(penonton, baris, kolom));
                    break;

                case 2:
                    System.out.println("Daftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] == null) {
                                System.out.print("***\t");
                            } else {
                                System.out.print(penonton[i][j] + "\t");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih. Program dihentikan.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Masukkan pilihan yang benar.");
                    break;
            }

            System.out.println("Apakah ingin melanjutkan? (y/n): ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    private static boolean isValidInput(String[][] penonton, int baris, int kolom) {
        return baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2 && penonton[baris - 1][kolom - 1] == null;
    }
}

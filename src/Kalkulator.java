import java.util.Scanner;

/**
 * Created by rioswarawan on 3/12/18.
 */
public class Kalkulator {

    public Kalkulator() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan Nama : ");
            int nilai1 = scanner.nextInt();

            System.out.print("Masukkan NIM : ");
            int nilai2 = scanner.nextInt();

            System.out.println("Pilih Operator");
            System.out.println("1. Tambah");
            System.out.println("2. Kurang");
            System.out.println("3. Kali");
            System.out.println("4. Bagi");
            System.out.print("Pilihan (1..4)? ");
            int operator = scanner.nextInt();

            hitung(nilai1, nilai2, operator);
        } catch (Exception ex) {
            System.out.print("Error: " + ex.getMessage());
        }
    }

    private void hitung(int nilai1, int nilai2, int operator) {

        int hasil;
        if (operator == 1) {
            hasil = nilai1 + nilai2;
            System.out.printf("%d + %d = %d", nilai1, nilai2, hasil);

        } else if (operator == 2) {
            hasil = nilai1 - nilai2;
            System.out.printf("%d - %d = %d", nilai1, nilai2, hasil);

        } else if (operator == 3) {
            hasil = nilai1 * nilai2;
            System.out.printf("%d * %d = %d", nilai1, nilai2, hasil);

        } else if (operator == 4) {
            hasil = nilai1 / nilai2;
            System.out.printf("%d / %d = %d", nilai1, nilai2, hasil);

        } else {
            System.out.println("Operator tidak ditemukan");
        }
    }
}

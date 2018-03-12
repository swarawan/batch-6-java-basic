import java.util.Scanner;

/**
 * Created by rioswarawan on 3/12/18.
 */
public class Kalkulator {

    KalkulatorModel model = new KalkulatorModel();

    public void printKalkulator() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan Nilai 1 : ");
            model.setNilai1(scanner.nextInt());

            System.out.print("Masukkan Nilai 2 : ");
            model.setNilai2(scanner.nextInt());

            System.out.println("Pilih Operator");
            System.out.println("1. Tambah");
            System.out.println("2. Kurang");
            System.out.println("3. Kali");
            System.out.println("4. Bagi");
            System.out.print("Pilihan (1..4)? ");
            int operator = scanner.nextInt();

            hitung(operator);
        } catch (Exception ex) {
            errorHandling();
        } finally {
            printKalkulator();
        }
    }

    private void errorHandling() {
        System.out.println("Salah brooooooo.... integer harusnya");
    }

    private void hitung(int operator) {

        int nilai1 = model.getNilai1();
        int nilai2 = model.getNilai2();
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

import java.util.Scanner;

/**
 * Created by rioswarawan on 3/12/18.
 */
public class Mahasiswa {

    String nama;
    String nim;
    String dosenPembimbing;

    public Mahasiswa() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama : ");
        nama = scanner.nextLine();

        System.out.print("Masukkan NIM : ");
        nim = scanner.nextLine();

        System.out.print("Masukkan Dosen Pembimbing : ");
        dosenPembimbing = scanner.nextLine();
    }

    public void printDataDiri() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Dosen Pembimbing : " + dosenPembimbing);
    }
}

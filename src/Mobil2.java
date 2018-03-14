/**
 * Created by rioswarawan on 3/7/18.
 */
public class Mobil2 {

    Integer jumlahRoda = 4;
    Integer umur = 50;
    boolean mesinDepan = false;
    boolean setirBulat = true;
    boolean pintuAtas = false;
    int jumlahPintu = 4;
    int jumlahKnalpot = 1;
    String warna = "merah";

    public Mobil2(String namaToko) {
        System.out.println("Saya beli mobile di toko = " + namaToko);
    }

    public void printNama(String nama) {
        System.out.println("Nama Saya = " + nama);
    }

    public void print() {
        System.out.println("Jumlah Roda = " + jumlahRoda);
        System.out.println("Warna Mobil2 = " + warna);
    }

    public int tambahRoda() {
        return jumlahRoda + 5;
    }
}

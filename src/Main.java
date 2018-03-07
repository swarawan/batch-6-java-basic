/**
 * Created by rioswarawan on 3/7/18.
 */
public class Main {

    public static void main(String[] args) {
        Mobil avanza = new Mobil("Sumber Buku");
        avanza.printNama("Annas");
        avanza.print();
        System.out.println("Jumlah Roda Baru = " + avanza.tambahRoda());
    }
}

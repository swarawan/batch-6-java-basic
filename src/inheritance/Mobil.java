package inheritance;

/**
 * Created by rioswarawan on 3/14/18.
 */
public class Mobil extends Kendaraan {

    public Mobil(String merk) {
        super(merk);
    }

    public void maju() {
        System.out.println("Mobil berjalan maju");
    }

    @Override
    public void belok() {
        System.out.println("kanan");
    }
}

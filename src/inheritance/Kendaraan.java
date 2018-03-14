package inheritance;

/**
 * Created by rioswarawan on 3/14/18.
 */
public abstract class Kendaraan {

    String merk;

    public Kendaraan(String merk) {
        this.merk = merk;
    }

    public void maju() {
        System.out.println("Kendaraan " + merk + " berjalan maju");
        belok();
    }

    abstract public void belok();
}

/**
 * Created by rioswarawan on 3/9/18.
 */
public class Parkir {

    /**
     * total roda <= 2 		-> lahan parkir sebelah kiri
     * total roda > 2 <=4 	-> lahan parkir sebelah kanan
     * total roda > 4		-> basement
     */

    public void parkirIfElse(int jumlahRoda) {

        System.out.print("Kendaraan dengan jumlah roda " + jumlahRoda);

        if (jumlahRoda <= 2) {
            System.out.println(" diparkir di sebelah kiri gedung");

        } else if (jumlahRoda > 3 && jumlahRoda <= 4) {
            System.out.println(" diparkir di sebelah kanan gedung");

        } else {
            System.out.println(" diparkir di basement");

        }
    }

    public void parkirSwitchCase(int jumlahRoda) {
        System.out.print("Kendaraan dengan jumlah roda " + jumlahRoda);
        switch (jumlahRoda) {
            case 2:
                System.out.println(" diparkir di sebelah kiri gedung");
                break;
            case 4:
                System.out.println(" diparkir di sebelah kanan gedung");
                break;
            default:
                System.out.println(" diparkir di basement");
                break;
        }
    }

    public void parkir() {

        // array
        int[] kumpulanTotalRoda = {2, 5, 6, 9, 4, 2, 18, 19};

        for (int index = 0; index < kumpulanTotalRoda.length; index++) {
            int totalRoda = kumpulanTotalRoda[index];
            parkirIfElse(totalRoda);
        }
    }

    public void parkir4() {
        int[] kumpulanTotalRoda = {2, 5, 6, 9, 4, 2, 18, 19};

        for (int index : kumpulanTotalRoda) {
            int totalRoda = kumpulanTotalRoda[index];
            parkirIfElse(totalRoda);
        }
    }

    public void parkir2() {
        int[] kumpulanTotalRoda = {2, 5, 6, 9, 4, 2, 18, 19};

        int index = 0;
        while (index < kumpulanTotalRoda.length) {
            int totalRoda = kumpulanTotalRoda[index];
            parkirIfElse(totalRoda);

            index++;
        }
    }

    public void parkir3() {
        int[] kumpulanTotalRoda = {2, 5, 6, 9, 4, 2, 18, 19};

        int index = 0;
        do {
            int totalRoda = kumpulanTotalRoda[index];
            parkirIfElse(totalRoda);

            index++;
        } while (index < kumpulanTotalRoda.length);
    }
}

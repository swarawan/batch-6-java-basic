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
        System.out.println("Jumlah Roda : " + jumlahRoda);
        if (jumlahRoda <= 2) {
            System.out.println("Kendaraan diparkir di sebelah kiri gedung");
        } else if (jumlahRoda <= 4) {
            System.out.println("Kendaraan diparkir di sebelah kanan gedung");
        } else {
            System.out.println("Kendaraan diparkir di basement");
        }
    }

    public void parkirSwitchCase(int jumlahRoda) {
        System.out.println("Jumlah Roda : " + jumlahRoda);
        switch (jumlahRoda) {
            case 2:
                System.out.println("Kendaraan diparkir di sebelah kiri gedung");
                break;
            case 4:
                System.out.println("Kendaraan diparkir di sebelah kanan gedung");
                break;
            default:
                System.out.println("Kendaraan diparkir di basement");
                break;
        }
    }
}

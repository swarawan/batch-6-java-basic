package number;

/**
 * Created by rioswarawan on 3/14/18.
 */
public class CheckNumberImpl implements CheckNumber {

    private TebakAngkaView view;

    public CheckNumberImpl(TebakAngkaView view) {
        this.view = view;
    }

    @Override
    public void checkGanjilGenap(int number) {
        if (number == 0) {
            return;
        }

        if (number % 2 == 0) {
            view.print("Genap");
        } else {
            view.print("Ganjil");
        }
    }
}

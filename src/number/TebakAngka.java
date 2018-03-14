package number;

import java.util.Scanner;

/**
 * Created by rioswarawan on 3/14/18.
 */
public class TebakAngka implements TebakAngkaView {

    private CheckNumber checkNumber = new CheckNumberImpl(this);

    public TebakAngka() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Masukkan sebuah angka: ");
//        int number = scanner.nextInt();

//        checkNumber.checkGanjilGenap(number);
        loop();
    }

    public void loop() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        for (int number : numbers) {
            if (number > 10) {
                break;
            }
            System.out.print(number + ", ");
        }

        System.out.println();

        for (int number : numbers) {
            if (number <= 10) {
                System.out.print(number + ", ");
            }
        }
    }

    @Override
    public void print(String text) {
        System.out.println(text);
    }
}

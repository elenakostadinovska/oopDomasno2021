import java.util.Random;
import java.util.Scanner;

class CoinTosser {
    static String[] headortail = {"glavi", "pisma"};
    static Random random = new Random();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Vnesi kolku pati sakas da ja frlis parickata: ");
        int numberOfTimes = input.nextInt();

        for (int i = 1; i <= numberOfTimes; i++) {
            toss();
        }

    }

    public static void toss() {
        System.out.println(headortail[random.nextInt(2)]);
    }
}

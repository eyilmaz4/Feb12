package Feb12;
import java.util.Scanner;
public class GGame {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int num = 109;
        int guess = 0;

        while (guess != num) {
            System.out.println("guess a number");
            guess = x.nextInt();

            if (guess < num) {
                System.out.println("larger");
            } else if (guess > num) {
                System.out.println("smaller");
            } else {
                System.out.println("congrats");
            }
        }
    }

}

package Feb12;
import java.util.Scanner;
public class WhileLoopYes {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        String answer = " ";
        while (!answer.equalsIgnoreCase("Y")) {
            System.out.println("java is fun ? Y/N");
             answer = x.nextLine();
        }
    }
}

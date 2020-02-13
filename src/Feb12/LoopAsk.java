package Feb12;
import java.util.Scanner;
public class LoopAsk {
    public static void main(String[]args){
        Scanner x=new Scanner(System.in);
        System.out.println("Enter i");
        int start=x.nextInt();
        System.out.println("Enter j");
        int end=x.nextInt();
System.out.println("enter what you want to print");
    String toPrint=x.nextLine();

        for(int i=start;i<end;i++){

                System.out.println(toPrint);

            }


        }

    }


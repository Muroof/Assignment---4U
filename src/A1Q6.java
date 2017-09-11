
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ranam3235
 */
public class A1Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int start = 100;
        Scanner input = new Scanner(System.in);

        // ask user for number between 50 and 100 and if not followed they are cheating
        System.out.println("Enter a number between 50 and 100 to stop at:");
        // store input as number
        int number = input.nextInt();

        if (number < 50 || number > 100) {
            System.out.println("STOP CHEATING");
        } else {
            // if start is greater than number by 5, count down (by 5)
            while (start > number) {
                if (start - 5 > number) {
                    start = start - 5;
                    System.out.println(start);
                }


            }

        }
    }
}

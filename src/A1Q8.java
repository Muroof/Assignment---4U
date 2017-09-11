
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ranam3235
 */
public class A1Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("What's the inital amount my guy:");
        int inital = input.nextInt(); 
        System.out.println("What's the inital interest rate in percent?:");
        int interest = input.nextInt();
        
        interest = interest / 100;
        
        int balance = inital;
        
        balance = (1 + interest) * balance;
        
        
        


    }
}

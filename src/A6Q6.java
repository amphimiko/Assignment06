
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pintm1551
 */
public class A6Q6 {

    public static int lastDigit(int n) {
        if (n < 0) {                                                            //removes negatives
            n = n * -1;
        }
        n = n % 10;                                                             //gets last digit
        return n;                                                               //returns number
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);                                 //Create Scanner
        System.out.println("Input a number to get the last digit");             //Asks to input number
        int n = input.nextInt();                                                //recieves number
        System.out.println(lastDigit(n));                                       //prints answer
    }
}

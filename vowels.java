import javax.swing.*;
import java.util.Scanner;

public class vowels {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a character");
        char c  = sc.nextLine().charAt(0);
        if (c == 'a' || c =='e' || c == 'i' || c == 'o'|| c== 'u')
        {
            System.out.println("the given character " + c + " is a vowel");
        }
         else
         {
             System.out.println("the given character " + c + " is a consonant");
        }
    }
}

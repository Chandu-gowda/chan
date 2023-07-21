import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a year");
                int n = sc.nextInt();
        {
            if(n%4==0)
            {
                System.out.println("the given year " + n + " is a leapyear");
            }
            else
            {
                System.out.println(" the given year " + n + " is not a leapyear");
            }
        }
    }
}


import java.util.Scanner;

public class oddoreven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        {
            if(n%2==0)
            {
                System.out.println("the given number " + n + " is a even number");
            }
            else
            {
                System.out.println(" the given number " + n + " is a odd number");
            }
        }
    }
}


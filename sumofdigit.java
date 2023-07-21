import java.util.Scanner;

public class sumofdigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the two digit number");
        int n = sc.nextInt();
        {
            int digit1 = n/10;
            int digit2 = n%10;
            int sum = digit1+digit2;

            System.out.println(sum);

        }

    }
}


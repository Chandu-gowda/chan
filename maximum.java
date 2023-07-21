import java.util.Scanner;

public class maximum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no1:");
        int no1 = sc.nextInt();
        System.out.println("enter no2:");
        int no2 = sc.nextInt();
        {
            if(no1>no2)
            {
                System.out.println("no1 is greater than no2:");
            }
            else
            {
                System.out.println("no2 is greater than no1:");
            }
        }

    }

}

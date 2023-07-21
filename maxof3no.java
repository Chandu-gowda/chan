import java.util.Scanner;

public class maxof3no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number 1");
        int n1 = sc.nextInt();
        System.out.println("enter a number 2");
        int n2 = sc.nextInt();
        System.out.println("enter a number 3");
        int n3 = sc.nextInt();
        if(n1>n2)
        {
            System.out.println(n1 + " is maximum ");
        }
        else if (n2>n3)
        {
                System.out.println(n2 + " is maximum ");
        }
        else
            System.out.println(n3 + " is maximum ");
        }

        }

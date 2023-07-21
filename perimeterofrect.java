import java.util.Scanner;

public class perimeterofrect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of a rectangle");
        int length = sc.nextInt();
        System.out.println("enter the breadth of a rectangle");
        int breadth = sc.nextInt();
        {
            int p = length * breadth;
            float peri=2*p;
            System.out.println(peri);
        }
    }
}


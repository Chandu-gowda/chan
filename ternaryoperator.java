import java.util.Scanner;
public class ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("enter the second  number:");
        int num2 = sc.nextInt();
    int result= (num1 > num2)? num1:num2;
            System.out.println(+result+" is greater");

        }
}



import java.util.Scanner;

public class maxoftwo {
        public static int findMax(int a, int b) {
            return Math.max(a, b);
        }

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter num1:");
            int num1 = sc.nextInt();
            System.out.println("Enter num2:");
            int num2 = sc.nextInt();


            int max = findMax(num1, num2);

            System.out.println("Maximum of " + num1 + " and " + num2 + " is " + max);
        }
    }


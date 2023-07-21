import java.util.Scanner;

public class simpleprog1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("hello");

        System.out.println("enter your name:");
        String name = sc.nextLine();

        System.out.println("enter your age:");
        int age = sc.nextInt();

        sc.nextLine();

        System.out.println("enter something:");
        String sm = sc.nextLine();

        System.out.print("hello," + name + " !you are " + age + " years old. " + sm );
        sc.close();
    }
}

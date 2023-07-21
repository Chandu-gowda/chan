import java.util.Scanner;

public class triangle {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the base of an triangle");
            int base = sc.nextInt();
            System.out.println("enter the height of an triangle");
            int height = sc.nextInt();
                int p = base*height;
                double triangle = 0.5 * p;
                System.out.println(+triangle);
        }
    }


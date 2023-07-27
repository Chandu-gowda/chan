
import java.util.Scanner;

    public class areaofcircle{
      public  static double pi = 3.14;
        static double calculateArea(int r) {
            return pi * r * r;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter radius of circle: ");
            int r = sc.nextInt();
            System.out.println("Area of circle is: " + calculateArea(r));
        }
    }



import java.util.Scanner;

public class costofitem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the price of an item");
        int price = sc.nextInt();
        System.out.println("enter the quantity of an item");
        int quantity = sc.nextInt();
        {
            float cost=price*quantity;
            System.out.println(cost);
        }
    }
}


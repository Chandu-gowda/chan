
import java.util.Scanner;
public class arrayMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        System.out.println("enter numbers");
        int arr[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                arr[i][j] = sc.nextInt();

            }
        }
        System.out.println("Array elements; ");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                System.out.print(arr[i][j]);

            }
            System.out.println();
        }

    }
}

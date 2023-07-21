import java.util.Scanner;

public class minutes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter total minutes");
        int minute = sc.nextInt();
        {
            int a = minute;
            float b = a;
            float hour = minute/60;
            float mins = minute%60;
            System.out.println(hour + " hours " + mins + " minutes ");


        }
    }
}

import java.util.Scanner;

public class inchtocm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length in inches");
        int inch = sc.nextInt();
        {
            float cm = (float)((float)inch * 2.54);
            System.out.println(cm + " cm ");


        }
    }
}

import java.util.Scanner;

public class celcius{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter temperature value in celcius");
        int celcius = sc.nextInt();
        {
            float fahrenheit = (9/5)*celcius+32;
            System.out.println(fahrenheit);
        }

    }
}

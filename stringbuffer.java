import java.util.Scanner;

public class Stringbuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer str=new StringBuffer("Chandana");
        System.out.println(str.append("gowda"));
        System.out.println(str.length());
        System.out.println(str.capacity());
        System.out.println(str.delete(4,8));
        System.out.println(str.insert(4,"dana"));
        System.out.println(str.replace(0,  8, "chan"));
        System.out.println(str.reverse());
    }
}

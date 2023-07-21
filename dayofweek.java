import java.util.Scanner;

public class dayofweek {
    public static void main(String[] args) {
        int day;
        String daysofweeek;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number from 1 to 7");
         day = sc.nextInt();
      switch (day) {
          case 1:
              daysofweeek = "SUNDAY";
              break;
          case 2:
              daysofweeek = "MONDAY";
              break;
          case 3:
              daysofweeek = "TUESDAY";
              break;
          case 4:
              daysofweeek = "WEDNESDAY";
              break;
          case 5:
              daysofweeek = "THURSDAY";
              break;
          case 6:
              daysofweeek = "FRIDAY";
              break;
          case 7:
              daysofweeek = "SATURDAY";
              break;
          default:
              daysofweeek = "invalid number";
              break;
      }
      System.out.println(daysofweeek);

      }
    }

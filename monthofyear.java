import java.util.Scanner;

public class monthofyear {
    public static void main(String[] args) {
        int month;
        String monthofyear;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number from 1 to 12");
        month = sc.nextInt();
        switch (month) {
            case 1:
                monthofyear = "JANUARY";
                break;
            case 2:
                monthofyear = "FEBRUARY";
                break;
            case 3:
                monthofyear = "MARCH";
                break;
            case 4:
                monthofyear = "APRIL";
                break;
            case 5:
                monthofyear = "MAY";
                break;
            case 6:
                monthofyear = "JUNE";
                break;
            case 7:
                monthofyear= "JULY";
                break;
            case 8:
                monthofyear = "AUGUST";
                break;
            case 9:
                monthofyear = "SEPTEMBER";
                break;
            case 10:
                monthofyear = "OCTOBER";
                break;
            case 11:
                monthofyear = "NOVEMBER";
                break;
            case 12:
                monthofyear= "DECEMBER";
                break;

            default:
                monthofyear = "invalid number";
                break;
        }
        System.out.println(monthofyear);

    }
}


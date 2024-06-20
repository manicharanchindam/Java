
import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entry the day :");
        int day =sc.nextInt();
        String dayname;

        switch (day) {
            case 1:
            dayname = "Monday";
            break;
            case 2:
            dayname = "Tuesday";    
            break;
            case 3:
            dayname = "Wednesday";
            break;
            case 4:
            dayname = "Thursday";
            break;
            case 5:
            dayname = "Friday";
            break;
            case 6:
            dayname = "Saturday";
            break;
            case 7:
            dayname = "Sunday";
            break;
            default:
            dayname = "Invalid ";
            break;
        }
        System.out.println("The Day is : " + dayname);
       
    }
}


import java.util.Scanner;

public class student {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("enter your id");
        int id =sc.nextInt();
        System.out.println("Enter your grade");
        char g =sc.next().charAt(0);
        System.out.println("my name is "+name);
        System.out.println("my id is "+id);
        System.out.println("my grade is "+g);
    }
}

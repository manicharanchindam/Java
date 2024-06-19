import java.util.Scanner;
public class studentdata {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int pass=40;
        System.out.println("Enter the marks in telugu");
        int telugu = sc.nextInt();
        System.out.println("Enter the marks in english");
        int english = sc.nextInt();
        System.out.println("Enter the marks in maths"); 
        int maths = sc.nextInt();
        System.out.println("Enter the marks in science");
        int science = sc.nextInt();
        System.out.println("Enter the marks in history");
        int history = sc.nextInt();
        int total = telugu+english+maths+science+history;
        if(telugu>=pass && english>=pass && maths>=pass && science>=pass && history>=pass){
            System.out.println(total);

            if(total>=400 && total<=500){
                System.out.println("Grade is: A");
            }
            else if(total>=300 && total<400){
                System.out.println("Grade is: B");
            }
            else if(total>=200 && total<300){
                System.out.println("Grade is: C");
            }
            else{
                System.out.println("Grade is:  f");
            }
        }
        else if(telugu<pass || english<pass || maths<pass || science<pass || history<pass)
        {
            System.out.println("markes in telugu are : "+telugu);
            System.out.println("markes in english are : "+english);
            System.out.println("markes in maths are : "+maths);
            System.out.println("markes in science are : "+science);
            System.out.println("markes in history are : "+history);
            System.out.println("fail");
        }
        else
            {
            System.out.println("fail");
        }
    

    }
    
}

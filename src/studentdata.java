import java.util.Scanner;
public class studentdata {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int pass=40;
        System.out.println("Enter the marks in Telugu");
        int telugu = sc.nextInt();
        System.out.println("Enter the marks in English");
        int english = sc.nextInt();
        System.out.println("Enter the marks in Maths"); 
        int maths = sc.nextInt();
        System.out.println("Enter the marks in Science");
        int science = sc.nextInt();
        System.out.println("Enter the marks in History");
        int history = sc.nextInt();
        int total = telugu+english+maths+science+history;
        if(telugu>=pass && english>=pass && maths>=pass && science>=pass && history>=pass){
            System.out.println("Total marks are : "+total);

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
            if(telugu<pass){
                System.out.println("your failed in Telugu");
            }
            if(english<pass){
                System.out.println("Your failed in english");
            }
            if(maths<pass){
                System.out.println("Your failed in maths");
            }
            if(science<pass){
                System.out.println("Your failed in science");
            }
            if(history<pass){
                System.out.println("Your failed in history");
            }
            
        }
        else
            {
            System.out.println("fail");
        }
    

    }
    
}

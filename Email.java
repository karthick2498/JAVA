import java.util.Scanner;
public class Email {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        if(str.matches(".*@.mail.*")){
            System.out.println("It is an Email ID");

            int i=str.indexOf("@");
            String uname=str.substring(0,i);
            String domain=str.substring(i+1,str.length());
            System.out.println("The User name is : "+uname);
            System.out.println("The Domain name is : "+ domain);
           
        }
        else{
            System.out.println("Not a valid Email ID");
        }

        
    }
}

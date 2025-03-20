import java.util.Scanner;
public class username{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String correctusername="paras";
    String correctpassword="1677";
    System.out.println("eneter the username");
    String username=sc.nextLine();
    System.out.println("eneter password");
    String password=sc.nextLine();
    
    if(username.equals("paras") && password.equals(123456));{
           System.out.println("login succesful");
    }
    
    }
}

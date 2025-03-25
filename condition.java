import java.util.Scanner;
public class condition{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        int a=sc.nextInt();
        System.out.println("eneter the value");
        int b=sc.nextInt();
        if(a<b){
            System.out.println("b is greater than a");
        }
        else{
            System.out.println("a is grater than b");
        
        }


    }

}
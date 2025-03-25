import java.util.Scanner;
public class anuj{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("eneter the percentage");
        double value =sc.nextDouble();
        if( value >=90 && value<=100 ){
            System.out.println("the number is between 90 and 100");
            
        }
       
        else{
            System.out.println("number is not between them");
        }
        
    }
}
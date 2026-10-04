import java.util.Scanner;

public class Main{
    

    
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        
        System.out.println("hello");
        
        
        System.out.println("eneter sp");
        int sp = sc.nextInt();
    
        System.out.println("eneter cp");
        int cp =sc.nextInt();
        if(sp>cp){
            System.out.println("i made profit");
            System.out.println(sp-cp);
        }
        else if(sp<cp){
            System.out.println("i made loss");
            System.out.println(cp-sp);
        }
    }
    
    
    
    
    
}

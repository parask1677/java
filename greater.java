import java.util. Scanner;
public class greater{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("eneter number first");
        double a=sc.nextDouble();
        System.out.println("eeter second number");
        double  b=sc.nextDouble();
        System.out.println("eneter third number");
        double c=sc.nextDouble();
         if(a>b && a>c){
            System.out.println("the number is greater  ,a is greter ");
            
         }
         else if (b>c && b>a) {
            System.out.println("the b is greater");
          
             
         }
         
         else{
            System.out.println("c  is greatter");
         }
        
    }
}

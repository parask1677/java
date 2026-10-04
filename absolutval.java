import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc =new  Scanner (System.in);
		System.out.println("eneter a number");
		int n=sc.nextInt();
		if(n<0){
		    
		    n = n*(-1);
		}
		System.out.println("values is abslute:"+n);
		
		
		
	}
}

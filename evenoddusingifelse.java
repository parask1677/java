import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc =new  Scanner (System.in);
		System.out.println("eneter a number");
		int n=sc.nextInt();
		
		if(n%2==0){
		    System.out.println("number is even");
		}
		else if(n%2!=0){
		    System.out.println("number is odd");
		}
		
		
	}
}

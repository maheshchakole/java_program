import java.util.Scanner;
public class PalindromeNo {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
	     System.out.print("Input a number: ");
	      n = sc.nextInt();
	     int sum = 0, r;
		 int temp = n;    
	     while(n>0)
		   {    
	        r = n % 10;   
	        sum = (sum*10)+r;    
	        n = n/10;    
	       }    
	      if(temp==sum)    
	        System.out.println("It is a Palindrome number.");    
	      else    
	        System.out.println("Not a palindrome");    

	}

}

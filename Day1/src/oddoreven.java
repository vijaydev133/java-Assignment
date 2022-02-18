import java.util.*;
public class oddoreven {
     public static void main(String args[]) {
    	 Scanner inp = new Scanner(System.in);
    	 System.out.println("Enter a number to check whether it is odd or even: ");
    	 int inp1 = inp.nextInt();
    	 
    	 if(inp1 % 2 == 0) {
    		 System.out.println("The entered number "+ inp1 +" is even");
    	 }else{
    		 System.out.println("The entered number "+ inp1 +" is odd");
    	 }
     }
}

import java.util.Scanner;

public class pyramidpattern 
{
     public static void main(String args[]) 
     {
    	 int i,j,k,row;
    	 Scanner inp = new Scanner(System.in);
    	 System.out.println("Enter a number: ");
    	 row = inp.nextInt();
    	 for(i=0; i<row; i++) 
    	 {
    		 for(k=row-i; k>1; k--) 
    		 {
    			System.out.print(" "); 
    		 }
    		 for(j=0; j<= i; j++)
    		 {
    			 System.out.print("* ");
    		 }
    		 System.out.println(" ");
    	 }
     }
}

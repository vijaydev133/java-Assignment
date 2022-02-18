import java.util.Scanner;

public class Dofactorial {
	public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a number to find factorial: ");
    	
        int number = inp.nextInt();
        long fact = 1;
        for(int i = 1; i <= number; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}

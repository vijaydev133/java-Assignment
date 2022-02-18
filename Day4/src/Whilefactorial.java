import java.util.Scanner;

public class Whilefactorial {
	public static void main(String args[]) {
		Scanner inp = new Scanner(System.in);
        System.out.println("Enter a number to find factorial: ");
    	
        int number = inp.nextInt();
    long fact = 1;
    int i = 1 ;
    while(i<=number)
    {
        fact = fact * i;
        i++;
    }
    System.out.println("Factorial of "+number+" is: "+fact);
}
}

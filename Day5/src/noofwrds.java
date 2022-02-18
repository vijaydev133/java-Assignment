import java.util.Scanner;

public class noofwrds {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
        String str = inp.nextLine();
 
        int count = 1;
 
        for (int i = 0; i < str.length() - 1; i++)
        {
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ') && (str.charAt(i) != ','))
            {
                count++;
            }
        }
        System.out.println("Number of words in a string : " + count);
    }
}

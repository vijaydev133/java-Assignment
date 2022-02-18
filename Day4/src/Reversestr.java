import java.util.Scanner;

public class Reversestr {
	public static void main (String[] args) {
	       Scanner inp = new Scanner(System.in);
	       System.out.println("Enter a word: ");
	       String inp1 = inp.nextLine();
     String str= inp1, nstr="";
     char ch;
    
   System.out.print("Original word: ");
   System.out.println(str); //Example word
    
   for (int i=0; i<str.length(); i++)
   {
     ch= str.charAt(i); //extracts each character
     nstr= ch+nstr; //adds each character in front of the existing string
   }
   System.out.println("Reversed word: "+ nstr);
 }
}

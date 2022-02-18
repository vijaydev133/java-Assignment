import java.util.Scanner;

public class vowelorconsonent {
	public static void main(String args[]) {
	      boolean bool = false;
	      System.out.println("Enter a character :");
	      Scanner sc = new Scanner(System.in);
	      char ch = sc.next().charAt(0);
	      /*
	       * The Java charAt() method returns a character at a 
	       * specific index position in a string. The first character in a 
	       * string has the index position 0. charAt() returns a
	       *  single character.It does not return a range of characters.
	       */
	      if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
	      switch(ch) {
	         case 'A' :
	         case 'E' :
	         case 'I' :
	         case 'O' :
	         case 'U' :
	         case 'a' :
	         case 'e' :
	         case 'i' :
	         case 'o' :
	         case 'u' : bool = true;
	      }
	      
	      if(bool == true){
	         System.out.println("Given character " + ch + " is an vowel ");
	      }else{
	         System.out.println("Given character " + ch + " is a consonant ");
	      }
	      }else {
	    	  System.out.println("Given character " + ch + " is a number, kindly type a alphabet ");
	      }
	   }
}

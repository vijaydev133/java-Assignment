
public class checkstrinend {
	 public static void main(String[] args)
	    {
	        String str1 = "Python Exercises";
	        //String str2 = "Python Exercise";

	        // The String to check the above two Strings to see
	        // if they end with this value (se).
	        String end_str = "se";

	        // Check first two Strings end with end_str
	        boolean ends1 = str1.endsWith(end_str);
	        //boolean ends2 = str2.endsWith(end_str);

	        if(ends1) {
	        	System.out.println("The String ends with the "+ end_str);
	        }
	        else {
	        	System.out.println("The String not ending with the "+ end_str);
	        }
	    }
}

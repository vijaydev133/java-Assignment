import java.util.Scanner;

public class primenumberbtwtwo {
	public static void main(String[] args) {
         Scanner inp = new Scanner(System.in);
         System.out.println("Enter the lower interval: ");
         int low = inp.nextInt();
         System.out.println("Enter the higher interval: ");
         int high = inp.nextInt();
        

        while (low < high) {
            boolean flag = false;

            for(int i = 2; i <= low/2; ++i) {
                // condition for nonprime number
                if(low % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && low != 0 && low != 1)
                System.out.print(low + " ");

            ++low;
        }
    }
}

import java.util.*;

public class insvalueinarr {
	public static void main(String[] args) {  
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter in which place the element should be inserted: ");
		int inp1 = inp.nextInt();
		System.out.println("Enter the element to be inserted: ");
		int inp2 = inp.nextInt();
		Integer arr[] = {1,2,3,4,5,6};  
		int n = arr.length;  
		int index = (inp1 - 1);  
		System.out.println("Original Array: "+Arrays.toString(arr));  
		Integer newArr[] = new Integer[n+1];  
		int j = 0;  
		  
		for(int i = 0; i<newArr.length; i++) {  
		if(i==index) {  
		newArr[i] = inp2;  
		}else {  
		newArr[i] = arr[j];  
		j++;  
		}  
		}  
		//newArr[index] = 7;  
		  
		System.out.println("Array after adding value: "+ Arrays.toString(newArr));  
		}  
}

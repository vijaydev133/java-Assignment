package day2;

import java.util.Scanner;

public class larandsmlofarr 
{
      public static void main(String args[])
      {
    	  int l = 0, s = 100;
    	  Scanner inp = new Scanner(System.in);
    	  System.out.println("Enter the length of array: ");
    	  int inp1 = inp.nextInt();
    	  int arr[] = new int[inp1];
    	  //System.out.println(arr.length);
    	  System.out.println("Enter the elements for the array: ");
    	  for(int i=0; i<arr.length; i++)
    	  {
    		  arr[i] = inp.nextInt();
    		  if(arr[i] > l)
        	  {
        		  l = arr[i];
        	  }
        	  if(arr[i] < s)
        	  {
        		  s = arr[i];
        	  }
    	  }
    	  //System.out.println(arr[2]);
    	 
    	  System.out.println("The largest number is: "+ l);
    	  System.out.println("The Smallest number is: "+ s);
      }
}

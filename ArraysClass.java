package samples;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;

//Array assignments
public class ArraysClass {

	public static void main(String[] args) {
		arrayAssignments();
		duplicate();
		compareArrays();

	}
	
	public static void arrayAssignments() {
		  Scanner input = new Scanner(System.in);
	      System.out.println("How long is your list of numbers?");
	      int size = input.nextInt();
	      int[] myArray = new int[size];
	      System.out.println("Enter number amounts");

	      for(int i=0; i<size; i++) {
	         myArray[i] = input.nextInt();
	      }
	        int total = 0;
	      for(int i=0; i<size; i++) {
		         total = myArray[i] + total;
	        }
	      
	      double avg = total/Double.valueOf(size);
	      
	      System.out.println("Average of list of numbers is: " + avg);
	      
	      Arrays.sort(myArray);
	      
	      System.out.println("Array in order: " + Arrays.toString(myArray));
	      
	      Scanner input2 = new Scanner(System.in);
	      System.out.println("Enter amount to find in array");
	      int size2 = input2.nextInt();
	      
	      boolean found = false; 
	      for(int i=0; i<size; i++) {
		         if(myArray[i] == size2) {
		         System.out.println("Match found at index: " + i);
		         found = true;
		         }
	        }
	      if(!found) {
	    	  System.out.println("Not in list");
	      }
	      
	      int[] myArray2 = new int[size];
	      int end = size-1;
	      for(int i=0; i<size; i++) {
		         myArray2[i] = myArray[end];
		         end--;
	        }
	      System.out.println("Reversed array" + Arrays.toString(myArray2));
	      
	      	Scanner input3 = new Scanner(System.in);
			System.out.println("Enter index to be removed(must be between 0-" + (size-1) + ")");
			int index = input3.nextInt();
			
			int[] myArray3 = new int[size-1];
			
			int usedIndex = 0;
			for(int i=0; i<size-1; i++) {
		         if(i == index) {
		        	 usedIndex++;
		         }
		         myArray3[i] = myArray2[usedIndex]; 
		         usedIndex++;
	        }
			
		  System.out.println("Array with index removed: " + Arrays.toString(myArray3));
		  
		  Arrays.sort(myArray3);
		  int secondHighest = myArray3[(myArray3.length)-2];
		  System.out.println("Second largest value: " + secondHighest);
		  
		  int[] arrayCopy = new int[myArray3.length];
		  
		  for(int i=0; i<myArray3.length; i++) {
			  	arrayCopy[i]= myArray3[i];		
		  }
		  System.out.println("Original Array: " + Arrays.toString(myArray3));
		  System.out.println("Copied Array: " + Arrays.toString(arrayCopy));
		  
		 int[] randomArray = new int[100];
		 for(int i=0; i<randomArray.length; i++) {
			 randomArray[i] = ThreadLocalRandom.current().nextInt(0, 100 + 1);
		 }
		 System.out.println("Random Array: " + Arrays.toString(randomArray));
	}
	
	
	  public static void duplicate() {
		  
		  Scanner input = new Scanner(System.in);
	      System.out.println("How long is your list of numbers?");
	      int size = input.nextInt();
	      int[] myArray = new int[size];
	      System.out.println("Enter number amounts");

	      for(int i=0; i<size; i++) {
	         myArray[i] = input.nextInt();
	      }
	        int total = 0;
	      for(int i=0; i<size; i++) {
		         total = myArray[i] + total;
	        }
		
	
		 for(int i=0; i<myArray.length; i++) {
			 for(int j=0; j<myArray.length; j++) {
		  			if(myArray[i]==myArray[j]){
		  			   if(i!=j) {	
		  			    System.out.println(myArray[i] + "is a duplicate");
		  			    j = myArray.length+1;
		  			   }
		  			}
			  }	
		  }
	  }
	  
	  public static void compareArrays() {
		  
		  Scanner input = new Scanner(System.in);
	      System.out.println("Length of first Array?");
	      int size = input.nextInt();
	      int[] myArray = new int[size];
	      System.out.println("Enter number amounts");

	      for(int i=0; i<size; i++) {
	         myArray[i] = input.nextInt();
	      }
	        int total = 0;
	      for(int i=0; i<size; i++) {
		         total = myArray[i] + total;
	        }
		
	      Scanner input2 = new Scanner(System.in);
	      System.out.println("Length of second Array?");
	      int size2 = input2.nextInt();
	      int[] myArray2 = new int[size2];
	      System.out.println("Enter number amounts");

	      for(int i=0; i<size2; i++) {
	         myArray2[i] = input2.nextInt();
	      }
	        int total2 = 0;
	      for(int i=0; i<size2; i++) {
		         total2 = myArray2[i] + total2;
	        }
	      boolean same = true;
	      
	      if(myArray.length==myArray2.length) {
	      for(int i=0; i<myArray.length; i++) {
	    	  if(myArray[i]!=myArray2[i])
	    		  same = false;
	        }
	      }
	      else {
	    	  System.out.println("Array is not equal");
	    	  same = false;
	      }
	      if(same) 
	    	  System.out.println("Array is equal");
	      else
	    	  System.out.println("Array is not equal");
	}
}	

//new commit ggg

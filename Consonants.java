package samples;

import java.util.Scanner;

public class Consonants {

	public static void main(String[] args) {
		consonants();

	}
	
	
	public static void consonants() {
		 //input from user
		 Scanner myObj = new Scanner(System.in);
	        System.out.println("Enter Sentence");
	        String sentence = myObj.nextLine();
	        
	        	String letters = "AEIOU";
	        	int consonantAmount = 0;
	        //outer loop array for sentence
	        for (char ch: sentence.toCharArray()) {
	        	     int fiveChecks = 0;//resets after 5 checks of each vowels
	        	     //inner loop checks each letter against all vowels
	           for (char vow: letters.toCharArray()) { 
	        	 if(Character.toUpperCase(ch) != vow ) {
                      
                      fiveChecks++;
	        		  if (fiveChecks==5)
	        			  consonantAmount++;//if no vowels match it is a consonant
	        	   }
	        	   
	           }
	                                             }
	                         //output          
	        System.out.println("Your sentence countains " + consonantAmount + " consonants");  
		
	}

}

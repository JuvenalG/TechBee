package samples;

import java.util.Scanner;

public class Consonants {

	public static void main(String[] args) {
		String sentence = scanSentence();
		System.out.println("Your sentence countains " + consonants(sentence) + " consonants");

	}
	
	
	public static int consonants(String sentence) {
		 //input from user
		 
	        
	        	String letters = "AEIOU";
	        	int consonantAmount = 0;
	        //outer loop array for sentence
	        for (char ch: sentence.toCharArray()) {
	        	     int fiveChecks = 0;//resets after 5 checks of each vowels
	        	     //inner loop checks each letter against all vowels
	           for (char vow: letters.toCharArray()) {    //ensures blank space are not used
	        	 if(Character.toUpperCase(ch) != vow && Character.isWhitespace(ch) != true ) {
                      
                      fiveChecks++;
	        		  if (fiveChecks==5 )
	        			  consonantAmount++;//if no vowels match it is a consonant
	        	   }
	        	   
	           }
	                                             }
	                         //output          
	       return  consonantAmount;
		
	}
    public static String scanSentence() {
    	Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Sentence");
        String sentence = myObj.nextLine();
        return sentence;
		
	}
}

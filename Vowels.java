package samples;
import java.util.Scanner;

import java.lang.reflect.Method;

public class Vowels {
	public static void main(String[] args) {
		
		String loop = "y";
		 //loop to repeat program
		while(loop == "y") {                               //calls method
			 System.out.println("Your sentence countains " + vowels() + " vowels");  
		Scanner myObj = new Scanner(System.in);
        System.out.println("Continue? enter Y or N");

        String answer = myObj.nextLine();
 
        if(answer.toUpperCase().equals("N")) {
        	loop="N";
        	System.out.println("EXITED");
        }
		}
		
	}
	
    public static int vowels() {
    	
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Sentence");

        String sentence = myObj.nextLine();
        
        	String letters = "AEIOU";
        	int vowelAmount = 0;
         //uses nested for loop to checke each vowel letter against each letter in sentence
        for (char ch: sentence.toCharArray()) {
        	  
           for (char vow: letters.toCharArray()) { 
        	 if(Character.toUpperCase(ch) == vow ) {
        		  vowelAmount++;
        	   }
           }
                                             }
                                   
         return vowelAmount;
    }
		
	
 }


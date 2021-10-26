package samples;
import java.util.Scanner;

import java.lang.reflect.Method;

public class Vowels {
	public static void main(String[] args) {
		
		String loop = "y";
		
		while(loop == "y") {
		vowels();
		Scanner myObj = new Scanner(System.in);
        System.out.println("Continue? enter Y or N");

        String answer = myObj.nextLine();
 
        if(answer.toUpperCase().equals("N")) {
        	loop="N";
        	System.out.println("EXITED");
        }
		}
		
	}
	
    public static void vowels() {
    	
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Sentence");

        String sentence = myObj.nextLine();
        
        	String letters = "AEIOU";
        	int vowelAmount = 0;
        
        for (char ch: sentence.toCharArray()) {
        	  
           for (char vow: letters.toCharArray()) { 
        	 if(Character.toUpperCase(ch) == vow ) {
        		  vowelAmount++;
        	   }
           }
                                             }
                                   
        System.out.println("Your sentence countains " + vowelAmount + " vowels");  
    }
		
	
 }


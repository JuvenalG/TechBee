package samples;

import java.util.Scanner;

public class Words {

	public static void main(String[] args) {
		name();

	}
	
    public static void name() {
    	 Scanner myObj = new Scanner(System.in);
         System.out.println("Enter Sentence, must contain at least 2 words:");

         String sentence = myObj.nextLine();
         
         int words = 0;
         
         for (char ch: sentence.toCharArray()) {
        	  if(Character.isWhitespace(ch)) 
        		  words++;
              }
         
         System.out.println("Sentence has " + (words+1) + " words");

         
         
    }
}
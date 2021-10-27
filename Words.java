package samples;

import java.util.Scanner;

public class Words {

	public static void main(String[] args) {
		System.out.println("Sentence has " + wordCount() + " words");

	}
	//returns amount of words in sentence
    public static int wordCount() {
    	 Scanner myObj = new Scanner(System.in);
         System.out.println("Enter Sentence, must contain at least 2 words:");

         String sentence = myObj.nextLine();
         
         int words = 0;
         
         for (char ch: sentence.toCharArray()) {
        	  if(Character.isWhitespace(ch)) 
        		  words++;
              }
         
         return words+1;
    }
}
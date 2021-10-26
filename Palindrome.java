package samples;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		palindrome();
	}
	
	
	
	
	public static void palindrome() {
		

	Scanner myObj = new Scanner(System.in);
    System.out.println("Enter Sentence");

    String sentence = myObj.nextLine();
    
    char[] reverse = new char[sentence.length()];
    
    for (int i = 0; i < sentence.length(); i++) {
        reverse[sentence.length() - i - 1] = sentence.charAt(i);
    }
    
     boolean check = true;
     
  
    for (int i = 0; i < sentence.length(); i++) {
        if(reverse[i] != sentence.charAt(i))
        	check = false;
        }
    
    if(check==true) 
    	System.out.println(sentence + " is a true Palindrome");
    else
    	System.out.println(sentence + " is not a Palindrome");
    	
    
    
  
}
}
package samples;
import java.util.Arrays;
import java.util.Scanner;


public class Homework {
	public static void main(String[] args) {
		System.out.println(slide23());		
		System.out.println(slide29());
		ArrayWithInt doubleValue = slide32();
	
		System.out.println("Numbers between selected numbers: " + Arrays.toString(doubleValue.getArrayParameter()));
		System.out.println("Sum of numbers between added together: " + doubleValue.getSum());		
}
     
		static String slide23() {
		    System.out.println("---Slide23---");
			
			double var = 20;
			double var2 = 80;
			String answer;
			double var3 = (var + var2) * 25;
			System.out.println(var3);
			double remainder = var3 % 40;

			if(remainder<=20) {
				answer = "Total was over the limit";
			}
				else {
					answer = "Total was under the limit";
				}	
			return answer;
		}
	
	
	
	
	  /*Note*/
		static String slide29() {
			System.out.println("---Slide29---");
						
			char letter = 'A';
			String answer = null;
			switch (letter) {
				case 'A':
					answer = "Apple";
					break;
				case 'B':
					answer = "Banana";
					break;
				case 'C':
					answer = "Cherries";
					break;
				case 'D':
					answer = "Dragonfruit";
					break;
				case 'E':
					answer = "Elderberry";
					break;	
		                   }
					return answer;
                                 }
		
		static ArrayWithInt slide32() {
			System.out.println("---Slide32---");
			
			Scanner myObj = new Scanner(System.in);
			System.out.println("Enter first number: ");
			int num1 = myObj.nextInt();
			
			Scanner myObj2 = new Scanner(System.in);
			System.out.println("Enter second number: ");
			int num2 = myObj2.nextInt();
			
			System.out.println("\n");
			
			int[] numbersBetween = new int[num2-2];
			
			for(int i = num1; i<num2-1; i++)
			 	numbersBetween[i-1] = i+1;
			
			  
	
			
			System.out.println("\n");
			
			int sum = 0;
			int finalSum = 0;
		while(num1 <= num2-2) {
			num1++;
			sum = num1 + sum;
			if(num1==num2-1)
				finalSum = sum;	
			}
			
			ArrayWithInt doubleValue = new ArrayWithInt();
			doubleValue.setSum(finalSum);
			doubleValue.setArrayParameter(numbersBetween);
			return doubleValue;
		}
}








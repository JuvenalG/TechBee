package samples;
import java.util.Scanner;


public class Homework {
	public static void main(String[] args) {
		slide23();		
		slide29();
		slide32();
				
}
     
		static void slide23() {
		    System.out.println("---Slide23---");
			
			double var = 20;
			double var2 = 80;
			
			double var3 = (var + var2) * 25;
			System.out.println(var3);
			double remainder = var3 % 40;

			if(remainder<=20) {
				System.out.println("Total was over the limit");
			}
				else {
					System.out.println("Total was under the limit");
				}			
		}
	
	
	
	
	  /*Note*/
		static void slide29() {
			System.out.println("---Slide29---");
						
			char letter = 'A';
			
			switch (letter) {
				case 'A':
					System.out.println("Apple");
					break;
				case 'B':
					System.out.println("Banana");
					break;
				case 'C':
					System.out.println("Cherries");
					break;
				case 'D':
					System.out.println("DragonFruit");
					break;
				case 'E':
					System.out.println("ElderBerry");
					break;	
		                   }
                                 }
		
		static void slide32() {
			System.out.println("---Slide32---");
			
			Scanner myObj = new Scanner(System.in);
			System.out.println("Enter first number: ");
			int num1 = myObj.nextInt();
			
			Scanner myObj2 = new Scanner(System.in);
			System.out.println("Enter second number: ");
			int num2 = myObj2.nextInt();
			
			System.out.println("\n");
			
			for(int i = num1+1; i<num2; i++)
				System.out.println(i);
		
			System.out.println("\n");
			
			int sum = 0;
		while(num1 <= num2-2) {
			num1++;
			sum = num1 + sum;
			if(num1==num2-1)
				System.out.println("Sum of numbers between selected numbers: " + sum);
			}
			
		}
}








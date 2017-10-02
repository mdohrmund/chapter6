package excercises;

import java.util.Scanner;

public class Triangle {


	public static void main(String[] args)
	{
     
	double sideA, sideB, sideC, answer;
	Scanner input = new Scanner(System.in);
	String chooseSideString = null;
	
	System.out.println("\nPlease enter which side you are looking for >>> \nA\nB\nC");
	chooseSideString = input.nextLine();
	
	if(chooseSideString.equalsIgnoreCase("A"))
	{
		System.out.println("Please enter side B");
		sideB = input.nextInt();
		System.out.println("Please enter side C");
		sideC = input.nextInt();
		sideA = (sideC * sideC) - (sideB * sideB);
		answer = sideA/2;
		System.out.println("Side A is " + answer);
	}
		
	if(chooseSideString.equalsIgnoreCase("B"))
	{
		System.out.println("Please enter side A");
		sideA = input.nextInt();
		System.out.println("Please enter side C");
		sideC = input.nextInt();
		sideB = (sideC * sideC) - (sideA * sideA);
		answer = sideB/2;
		System.out.println("Side B is " + answer);
	}
	
	if(chooseSideString.equalsIgnoreCase("C"))
	{
		System.out.println("Please enter side B");
		sideB = input.nextInt();
		System.out.println("Please enter side A");
		sideA = input.nextInt();
		sideC = (sideA * sideA) - (sideB * sideB);
		answer = sideC/2;
		System.out.println("Side C is " + answer);
	}
		
		
	
		
		

}
}

import java.util.*;
public class Calculator {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float a, b, c;
		System.out.print("Enter the number 1: ");
		a=sc.nextFloat();
		System.out.print("Enter the number 2: ");
		b=sc.nextFloat();
		System.out.println("\nChoices :-\n\n1. Addition\n2. Difference\n3. Product\n4. Division");
		System.out.print("\nEnter the choice Here : ");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			c = a+b;
			System.out.println("The Sum is : "+c);
			break;
			
		case 2:
			c = a-b;
			System.out.println("The Difference is : "+c);
			break;
			
		case 3:
			c = a*b;
			System.out.println("The Product is : "+c);
			break;
			
		case 4:
			c = a/b;
			System.out.println("The Division is : "+c);
			break;
			
			default :
				System.out.println("Invalid Operation!");
		}
	}

}


public class Add {

	public static void main(String[] args) {
		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int sum = num1 + num2;
		int diff = num1 - num2;
		System.out.print("The sum of "+args[0]+"+"+args[1]+" is ");
		System.out.println("="+sum);
		System.out.println(diff);

	}

}

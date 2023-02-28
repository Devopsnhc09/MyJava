import java.util.Scanner;
class add
{
	public static void main(String []args)
	{ 
		int num1, num2, sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number:");
		num1 = Integer.parseInt(args[0]);
		System.out.println("Enter Second Number:");
		num2 = Integer.parseInt(args[1]);
		
		sum = num1 + num2;
		System.out.println("sum of these numbers: "+sum);
	}
}
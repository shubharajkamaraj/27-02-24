import java.util.Scanner;

class Modulus
{
	public static void main(String args[])
	{
		// int x =  42;
		// double y =  42.25;
		Scanner scin = new Scanner(System.in);
		System.out.println("Enter value of x : ");
		int x = scin.nextInt();
		System.out.println("Enter value of y : ");
		double y = scin.nextDouble();
		System.out.println("x mod 10 = " + x % 10);
		System.out.println("y mod 10 = " + y % 10);
	}
}

/*

Enter value of x :
42
Enter value of y :
42.25
x mod 10 = 2
y mod 10 = 2.25

*/
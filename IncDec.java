import java.util.Scanner;

class IncDec
{
	public static void main(String args[])
	{
		Scanner scin = new Scanner(System.in);
		System.out.println("Enter value of a : ");
		int a = scin.nextInt();
		System.out.println("Enter value of b : ");
		int b = scin.nextInt();
		int c;
		int d;
		c = ++b;
		d = a++;
		c++;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
	}
}

/*

Enter value of a :
1
Enter value of b :
2
a = 2
b = 3
c = 4
d = 1

*/
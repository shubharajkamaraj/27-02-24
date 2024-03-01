import java.util.Scanner;

class OpEquals
{
	public static void main(String args[])
	{
		Scanner scin = new Scanner(System.in);
		System.out.println("Enter value of a : ");
		int a = scin.nextInt();
		System.out.println("Enter value of b : ");
		int b = scin.nextInt();
		System.out.println("Enter value of c : ");
		int c = scin.nextInt();
	
		a += 5;
		b *= 4;
		c += a *b;
		c %= 6;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}
}

/*

Enter value of a :
1
Enter value of b :
2
Enter value of c :
3
a = 6
b = 8
c = 3
*/
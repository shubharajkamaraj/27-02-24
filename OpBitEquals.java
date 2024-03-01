import java.util.Scanner;
class OpBitEquals
{
	public static void main(String args[])
	{
		Scanner scin = new Scanner(System.in);
		System.out.println("Enter value of a : "); // 1
		int a = scin.nextInt();
		System.out.println("Enter value of b : "); // 2
		int b = scin.nextInt();
		System.out.println("Enter value of c : "); // 3
		int c = scin.nextInt();
		
		a |= 4;
		b >>= 1;
		c <<= 1;
		a ^= c;
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
a = 3
b = 1
c = 6

*/
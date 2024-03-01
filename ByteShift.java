import java.util.Scanner;

class ByteShift
{
	public static void main(String args[])
	{
		Scanner scin = new Scanner(System.in);
		System.out.println("Enter value of a : ");
		byte a = scin.nextByte();
		byte b;
		int i;
		i = a << 2;
		b = (byte) (a << 2);
		System.out.println("Original value of a : " + a);
		System.out.println("i and b :" + i +" " + b);

	}
}

/*

Enter value of a :
64
Original value of a : 64
i and b :256 0

*/
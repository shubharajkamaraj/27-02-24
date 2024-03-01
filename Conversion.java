import java.util.Scanner;


class Conversion
{
	public static void main(String args[])
	{
	byte b;
	int i;  // 257;
	double d; //  323.142;
	Scanner scin = new Scanner(System.in);
	System.out.println("Enter integer value : ");
	i=scin.nextInt();
	System.out.println("Enter double value : ");
	d=scin.nextDouble();
	System.out.println("\n Conversion of int to byte ");
	b=(byte)i;
	System.out.println("i and b "+i+" "+b);
	System.out.println("\n Conversion of double to int");
	i=(int)d;
	System.out.println("d and i "+d+" "+i);
	System.out.println("\nConversion of double to byte ");
	b=(byte)d;
	System.out.println("d and b "+d+" "+b);
	}
}

/*

E:\JDK\javaprograms>java Conversion
Enter integer value :
257
Enter double value :
323.142

 Conversion of int to byte
i and b 257 1

 Conversion of double to int
d and i 323.142 323

Conversion of double to byte
d and b 323.142 67

*/
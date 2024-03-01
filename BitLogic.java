import java.util.Scanner;

class BitLogic
{
	public static void main(String args[])
	{
		String binary[] = {
		"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111" };
	Scanner scin = new Scanner(System.in);
	System.out.println("Enter value of a : "); // a = 3
	int a = scin.nextInt();
	System.out.println("Enter value of b : ");  // b = 6
	int b = scin.nextInt();
	int c = a | b;
	int d = a & b;
	int e = a ^ b;
	int f = (-a & b)|(a & -b);
	int g = -a & 0x0f;
	
	System.out.println("     a = " + binary[a]);
	System.out.println("     b = " + binary[b]);
	System.out.println("   a|b = " + binary[c]);
	System.out.println("   a&b = " + binary[d]);
	System.out.println("   a^b = " + binary[e]);
	System.out.println(" -a&b|a&-b = " + binary[f]);
	System.out.println("    -a = " + binary[g]);
	}
}

/*

    Enter value of a :
3
Enter value of b :
6
     a = 0011
     b = 0110
   a|b = 0111
   a&b = 0010
   a^b = 0101
 -a&b|a&-b = 0110
    -a = 1101

*/
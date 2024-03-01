import java.util.Scanner;

/*
class CharDemo
{
	public static void main(String args[])
	{
		int ch1;
		char ch2='Y';
		Scanner scin=new Scanner(System.in);
		System.out.println("Enter a Character : ");
		ch1=scin.nextInt();
		ch1=(char)ch1;
		
		System.out.println("ch1 and ch2 : ");
		System.out.println(ch1 + " " + ch2);
	}
}




// output

E:\JDK\javaprograms>javac CharDemo.java

E:\JDK\javaprograms>java CharDemo
Enter a Character :
x
Exception in thread "main" java.util.InputMismatchException
        at java.base/java.util.Scanner.throwFor(Scanner.java:939)
        at java.base/java.util.Scanner.next(Scanner.java:1594)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
        at CharDemo.main(CharDemo.java:12)


*/

class CharDemo
{
	public static void main(String args[])
	{
		char ch1=88;
		char ch2='Y';
		
		System.out.println("ch1 and ch2 : ");
		System.out.println(ch1 + " " + ch2);
	}
}


// ch1 and ch2 :
// X Y
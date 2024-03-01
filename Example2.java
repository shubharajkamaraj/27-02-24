
import java.util.Scanner;

class Example2
	{
	public static void main(String args[])
		{
			int num;
			Scanner scin=new Scanner(System.in);
			System.out.println("Enter the number : ");
			num=scin.nextInt();
			System.out.println("This is num : "+num);
			num=num*2;
			System.out.println("The value of num * 2 is : "+num);
		}
}


/*

Enter the number :
100
This is num : 100
The value of num * 2 is : 200

*/
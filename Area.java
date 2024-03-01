import java.util.Scanner;
class Area
{
	public static void main(String args[])
	{
		double pi,r,a;
		pi=3.1416;
		Scanner scin=new Scanner(System.in);
		System.out.println("Enter the radius : ");
		r=scin.nextDouble();
		a=pi*r*r;
		System.out.println("Area of circle : "+a);
	}
}


/*

Enter the radius :
10.8
Area of circle : 366.436224

*/
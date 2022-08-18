import java.lang.*;
import java.util.*;
import MarvellousMatrix.Matrix;

class program331
{
	public static void main(String arg[]);
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number of rows:");
		int x=sobj.nextInt();
		
		System.out.println("Enter the cols:");
		int y=sobj.nextInt();
		
		Matrix mobj=new Matrix(x,y);
		mobj.Accept();
		mobj.Display();
	}
}
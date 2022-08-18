//problems on pattern printing in OOP.

import java.lang.*;
import java.util.*;
 
 
 
class Pattern
{
	private int iRow,iCol;
	
	public Pattern(int a,int b)
	{
		iRow=a;
		iCol=b;
	}
	public void Display()
	{
		for(int i=1;i<=iRow;i++)
		{
			for(int j=1;j<=iCol;j++)
			{
				System.out.print("*\t");
			}
			System.out.println();
		}
	}
}
class pp137
{
	public static void main(String arg[])
	{
		Pattern pobj=new Pattern(4,4);
		
		pobj.Display();
	}
}
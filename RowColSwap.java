//Row swap 

import java.lang.*;
import java.util.*;
import MarvellousMatrix.Matrix;

class MyMatrix extends Matrix
{
	public MyMatrix(int a,int b)
	{
		super(a,b);
	}
	public void SwapRow()
	{
		int iTemp=0;
		
		for(int i=0;i<iRow-1;i+=2)
		{
			for(int j=0;j<iCol;j++)
			{
				iTemp=Arr[i][j];
				Arr[i][j]=Arr[i+1][j];
				Arr[i+1][j]=iTemp;
			}
		}
	}
	
	public void SwapCol()
	{
		int iTemp=0;
		
		for(int i=0;i<iRow;i++)
		{
			for(int j=0;j<iCol-1;j+=2)
			{
				iTemp=Arr[i][j];
				Arr[i][j]=Arr[i][j+1];
				Arr[i][j+1]=iTemp;
			}
		}
	}
}

class RowColSwap
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number of rows:");
		int x=sob.nextInt();
		
		System.out.println("Enter number of cols:");
		int y=sobj.nextInt();
		
		MyMatrix mobj=new Matrix(x,y);
		mobj.Accept();
		mobj.Display();
		
		mobj.SwapRow();
		System.out.println("Data after swaping:");
		mobj.Display();
		
	}
}
//accept N elements from user and display it in array.

import java.util.*;
import java.lang.*;

class Array
{
	public int Arr[];
	
	public Array(int iSize)
	{
		Arr=new int[iSize];
	}
	
	protected void finalize()
	{
		Arr=null;
	}
	
	public void Accept()
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter elemets:");
		
		for(int i=0;i<Arr.length;i++)
		{
			Arr[i]=sobj.nextInt();
		}
	}
	
	public void Display()
	{
		System.out.println("Elements from array are:");
		for(int i=0;i<Arr.length;i++)
		{
			System.out.println(Arr[i]);
		}
	}
}
class ArraySort
{
	public static void main(String arg[])
	{
		Array obj=new Array(5);
		obj.Accept();
		obj.Display();
	}
}
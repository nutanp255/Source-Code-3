//sort the array by using bubble sort(bubble sort means elements in array gives incresing order).

import java.util.*;
import java.lang.*;

 interface MarvellousSearchSort
{
	public void Accept();
	public void Display();
	public void BubbleSort();
	public void InsertionSort();
	public void SelectionSort();
}
class Array implements MarvellousSearchSort
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
			System.out.print(Arr[i]+" ");
		}
	}
	
	public void BubbleSort(char type)			//random array sort in increasing order
	{
		int i=0,j=0,temp=0;
		boolean Swap=false;
		
		if(type=='I'||type=='i')
		{
			for(i=0;i<Arr.length;i++)
			{
				Swap=false;
				for(j=0;j<Arr.length-i-1;j++)
				{
					if(Arr[j]>Arr[j+1])
					{
						temp=Arr[j];
						Arr[j]=Arr[j+1];
						Arr[j+1]=temp;
						Swap=true;
					}
				}
				System.out.println("pass: "+(i+1));
				Display();
				if(Swap==false)
				{
					break;
				}
			}
		}
		
		if(type=='D'||type=='d')
		{
			for(i=0;i<Arr.length;i++)
			{
				Swap=false;
				for(j=0;j<Arr.length-i-1;j++)
				{
					if(Arr[j]<Arr[j+1])
					{
						temp=Arr[j];
						Arr[j]=Arr[j+1];
						Arr[j+1]=temp;
						Swap=true;
					}
				}
				System.out.println("pass: "+(i+1));
				Display();
				if(Swap==false)
				{
					break;
				}
			}
		}
	}
	
	public void InsertionSort()
	{}
	
	public void SelectionSort()
	{}
	
}

class ArrBubbleIncDec
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the size of array: ");
		int size=sobj.nextInt();
		
		Array aobj=new Array(size);
		aobj.Accept();
		aobj.Display();
		
		aobj.BubbleSort(d);
		System.out.println("Data after sorting:");
		aobj.Display();
	}
}
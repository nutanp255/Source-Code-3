//write a java program which accept array from user and from new array 
//which is combination of contents of first and second array.

import java.util.*;

class MyArray
{
	public void ArrayConcate(int arr1[],int arr2[])
	{
		int i=0;
		Scanner sobj=new Scanner(System.in);
		
		int iNo=arr1.length+arr2.length;
		int arr3[]=new int[iNo];
		
		System.out.println("Enter elements of First array :");
		for(i=0;i<arr1.length;i++)
		{
			arr1[i]=sobj.nextInt();
			arr3[i]=arr1[i];
		}
		
		System.out.println("First Array: ");
		for(i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		
		System.out.println();
		System.out.println("Enter elements of second array: ");
		for(i=0;i<arr2.length;i++)
		{
			arr2[i]=sobj.nextInt();
			arr3[arr1.length+i]=arr2[i];
		}
		
		System.out.println("Second Array: ");
		for(i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+" ");
		}

		System.out.println();
		System.out.println(" New Concated array:");
		for(i=0;i<arr3.length;i++)
		{
			System.out.print(arr3[i]+" ");
		}
		
	}
}
class ConcateArray
{
	public static void main(String arg[])
	{
		int iRet=0;
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number of element of first array:");
		int no1=sobj.nextInt();
		
		System.out.println("Enter number of element of second array:");
		int no2=sobj.nextInt();
		
		int Arr[]=new int[no1];
		int Brr[]=new int[no2];
		
		MyArray mobj=new MyArray();
		mobj.ArrayConcate(Arr,Brr);
	}
}
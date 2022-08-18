//write a java program which accpet marks of N students from user and display class of each student.
/*
Less than 35-  Fail
Less than 50-  pass class
Less than 60-  second class
Less than 70-  first class
Greater than 70- first class with distiction.
 
input:67.3 45.8 88.9
output:
67.3- first class
45.8- pass class
88.9- first class with distiction.
*/

import java.util.*;

class MyArray
{
	public void Percentage(float brr[])
	{
		int i=0;
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter marks:");
		for(i=0;i<brr.length;i++)
		{
			brr[i]=sobj.nextFloat();
		}
		
		for(i=0;i<brr.length;i++)
		{
			if(brr[i]<=35)
			{
				System.out.println("Fail.");
			}
			else if(brr[i]<=50)
			{
				System.out.println("pass class.");
			}
			else if(brr[i]<=60)
			{
				System.out.println("second class");
			}
			else if(brr[i]<=70)
			{
				System.out.println("first class");
			}
			else if((brr[i]>70)&&(brr[i]<=100))
			{
				System.out.println("first class with distiction.");
			}
			else
			{
				System.out.println("There is no class.");
			}
		}
	}
}
class DisplayClass
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter Number of student marks:");
		int iMark=sobj.nextInt();
				
		float Arr[]=new float[iMark];
		
		MyArray mobj=new MyArray();
		mobj.Percentage(Arr);
	}
}
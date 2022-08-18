//input: 78956
/*
7 8 9 5 6
7 8 9 5
7 8 9 
7 8
7
*/

import java.lang.*;
import java.util.*;

class pattern8
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int no=sobj.nextInt();
		
		String str=Integer.toString(no);
		char arr[]=str.toCharArray();
		
		for(int i=arr.length-1;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(arr[j]+" ");
			}
			System.out.println();
		}
	}
}
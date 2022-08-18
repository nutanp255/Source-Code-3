//input:78956

/*
7 7 7 7 7
8 8 8 8 8
9 9 9 9 9
5 5 5 5 5
6 6 6 6 6
*/

import java.lang.*;
import java.util.*;

class pattern7
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int no=sobj.nextInt();
		
		String str=Integer.toString(no);
		
		char Arr[]=str.toCharArray();
		
		for(int i=0;i<Arr.length;i++)
		{
			for(int j=0;j<Arr.length;j++)
			{
				System.out.print(Arr[i]+" ");
			}
			System.out.println();
		}
	}
}

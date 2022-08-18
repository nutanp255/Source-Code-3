//input: Hello
/*
H e l l o
H e l l
H e l
H e
H
*/

import java.lang.*;
import java.util.*;

class pattern4
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter string:");
		String str=sobj.nextLine();
		
		char Arr[]=str.toCharArray();
		
		for(int i=Arr.length-1;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(Arr[j]+" ");
			}
			System.out.println();
		}
	}
}
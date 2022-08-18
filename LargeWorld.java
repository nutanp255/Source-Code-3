//aceppt string from user and display large world in that string.

import java.io.*;
import java.util.*;

class LargeWorld
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the string:");
		String str=sobj.nextLine();
		
		String newstr=str.replaceAll("\\s+"," ");
		String newstr2=newstr.trim();
		
		String arr[]=newstr2.split(" ");
		
		int iMax=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].length()>iMax)
			{
				iMax=arr[i].length();
			}
		}
		System.out.println("length of largest world: "+iMax);
	}
}

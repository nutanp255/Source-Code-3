//accept string from useer and count small characters.

import java.io.*;
import java.util.*;

class SmallChar
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the string:");
		String str=sobj.nextLine();
		
		char arr[]=str.toCharArray();
		int iCnt=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]>='a')&&(arr[i]<='z'))
			{
				iCnt++;
			}
		}
		System.out.println("Number of small character are:"+iCnt);
	}
}
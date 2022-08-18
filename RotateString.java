//accept one string from user and check wheather second string is rotation of first string.
//str1=hello		str2=lohel
//marvellous      ousmarvell

import java.lang.*;
import java.util.*;

class RotateString
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter first string:");
		String str1=sobj.nextLine();
		
		System.out.println("Enter rotated string:");
		String str2=sobj.nextLine();
		
		if(str1.length()!=str2.length())
		{
			System.out.println("String are not same.");
			return;
		}
		
		String str3=str1+str1;
		
		if(str3.contains(str2))
		{
			System.out.println("string are in rotation");
		}
		else
		{
			System.out.println("string are not in rotation");
		}
	}
}
//sort character array with anagran string.

import java.io.*;
import java.util.*;

class SortChar
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter first string:");
		String str1=sobj.nextLine();
		
		System.out.println("Enter second string:");
		String str2=sobj.nextLine();
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		char arr[]=str1.toCharArray();
		char brr[]=str2.toCharArray();
		
		Arrays.sort(arr);
		Arrays.sort(brr);
		
		System.out.println(arr);
		System.out.println(brr);
		
		if(Arrays.equals(arr,brr))
		{
			System.out.println("String are anagram");
		}
		else
		{
			System.out.println("String are not anagram");
		}
	}
}



//reverse each world at that place concat one after next.


import java.io.*;
import java.util.*;

class RevConcat
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the string:");
		String str=sobj.nextLine();
		
		String newstr=str.replaceAll("\\s+"," ");
		String newstr2=newstr.trim();
		
		String arr[]=newstr2.split(" ");			//arr with saprate world.
		
		StringBuffer finalstr=new StringBuffer();
		
		for(int i=0;i<arr.length;i++)
		{
			StringBuffer sb=new StringBuffer(arr[i]);
			finalstr.append((sb.reverse()).append(" "));
		}
		
		System.out.println(finalstr);
	}
}

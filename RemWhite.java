//accept string from user and count number of world in that extra whitespaces are not consider.


import java.io.*;
import java.util.*;

class RemWhite
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the string:");
		String str=sobj.nextLine();
		
		String newstr=str.replaceAll("\\s+"," ");
		String arr[]=newstr.split(" ");
		
		System.out.println("Number of worlds are: "+arr.length);
	}
}

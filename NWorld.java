//accept string from user and count number of world in that whitespaces

import java.io.*;
import java.util.*;

class NWorld
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the string:");
		String str=sobj.nextLine();
		
		String arr[]=str.split(" ");
		
		System.out.println("Number of worlds are: "+arr.length);
	}
}
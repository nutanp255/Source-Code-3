//accept number from user and check 1st nibble is on or not.

import java.util.*;
import java.lang.*;

class Betwise1
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number:");
		int iNo=sobj.nextInt();
		
		int iMask=0x0000000f;
		int iResult=0;
		
		iResult=iNo&iMask;
		
		if(iResult==iMask)
		{
			System.out.println("First nible is completely on.");
		}
		else
		{
			System.out.println("First nible is off.");
		}
		
	}
}
//accept number and renge from user and check from that renge bit is on or off.
//7th to 10th bit is on or off.(start and ending point also)

import java.util.*;
import java.lang.*;

class Betwise3
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number:");
		long iNo=sobj.nextLong();
		
		System.out.println("Enter starting point:");
		int iStart=sobj.nextInt();
		
		System.out.println("Enter ending point:");
		int iEnd=sobj.nextInt();
		
		long iMask1=0xffffffff;
		long iMask2=0xffffffff;
		long iMask=0;
		
		iMask1=iMask1<<(iStart-1);
		iMask2=iMask2>>(32-iEnd);
		
		iMask=iMask1&iMask2;
		
		System.out.println(iMask);
		
		long iResult=0;
		
		iResult=iNo&iMask;
		
		if(iResult==iMask)
		{
			System.out.println("Bits are on.");
		}
		else
		{
			System.out.println("Bits are off.");
		}
	}
}
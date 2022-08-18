//accept number from user and check 7rd bit is on or off.

import java.lang.*;
import java.util.*;

class Betwise
{
	public boolean ChkBit(int iNo)
	{
		int iMask=64;
		int iResult=0;
		
		iResult=iNo&iMask;
		
		if(iResult==0)
		{
			return false;
		}
		else
		{
			return true;
		}
			
	}	
}

class Betwise160
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int value=sobj.nextInt();
		
		Betwise bobj=new Betwise();
		boolean bRet=bobj.ChkBit(value);
		
		if(bRet==true)
		{
			System.out.println("Bit is On");
		}
		else
		{
			System.out.println("Bit is off");
		}
		
	}
}
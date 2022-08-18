//Accept number from user and on 27th bit of that number and if it is on then return as it is.

import java.lang.*;
import java.util.*;

class Betwise
{
	public int OnBit(int iNo)
	{
		int iMask=0X04000000;
		int iResult=0;
		
		iResult=iNo|iMask;
		
		return iResult;
			
	}	
}

class Betwise165
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int value=sobj.nextInt();
		
		Betwise bobj=new Betwise();
		int iRet=bobj.OnBit(value);
		System.out.println("Updated number is: "+iRet);
		
		
	}
}
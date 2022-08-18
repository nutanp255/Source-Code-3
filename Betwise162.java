//accept number from user and check 21rd bit is on or off.with hexadecimal
//0000 0000 0000 0001 0000 0000 0000 0000
//
import java.lang.*;
import java.util.*;

class Betwise
{
	public boolean ChkBit(int iNo)
	{
		int iMask=0X00100000;		//1048576
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

class Betwise162
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
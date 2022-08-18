//Accept number from user as well as position of number and toggle the bit at that position return the number.import java.lang.*;
import java.util.*;
import java.lang.*;

class Betwise
{
	public int ToggleBit(int iNo,int iPos)
	{
		if((iPos<=0)||(iPos>=32))
		{
			System.out.println("Invalid position");
			return 0;
		}
		int iMask=0X00000001;
		int iResult=0;	
		
		iMask=iMask<<(iPos-1);
		
		iResult=iNo^iMask;
		return iResult;
	}		
}

class Betwise168
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int value=sobj.nextInt();
		
		System.out.println("Enter position:");
		int pos=sobj.nextInt();
		
		Betwise bobj=new Betwise();
		int iRet=bobj.ToggleBit(value,pos);
		System.out.println("updated number is: "+iRet);	
	}
} 
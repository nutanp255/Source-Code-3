//accept number from user and toggle 4th&7th bit of that number.(if on then off,&if off then on)
//	0 0 1 0 1 0 1 1 	iNo
//	0 0 0 0 1 0 0 0 	iMask
//--------------------------
//	0 0 1 0 0 0 1 1		iResult
import java.lang.*;
import java.util.*;

class Betwise
{
	public int OnBit(int iNo)
	{
		int iMask=0X00000048;
		int iResult=0;
		
		iResult=iNo^iMask;
		
		return iResult;
			
	}	
}

class Betwise167
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
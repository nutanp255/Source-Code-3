//accept number from user and check 1st and last nible is on or not.
import java.util.*;
import java.lang.*;

class Betwise2
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number:");
		int iNo=sobj.nextInt();
		
		long iMask=0xf000000f;
		long iResult=0;
		
		iResult=iNo&iMask;
		
		
		if(iResult==iMask)
		{
			System.out.println("First and last nible is completely on.");
		}
		else
		{
			System.out.println("First and last nible is off.");
		}
		
	}
}
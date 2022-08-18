//Accept number from user convert it into binary.

import java.lang.*;
import java.util.*;

class Betwise
{
	public void DisplayBinary(int iNo)
	{
		int iDigit=0;
		
		while(iNo!=0)
		{
			iDigit=iNo%2;
			System.out.print(iDigit);
			iNo=iNo/2;
		}
		System.out.println();
	}	
}

class Betwise158
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int value=sobj.nextInt();
		
		Betwise bobj=new Betwise();
		bobj.DisplayBinary(value);
		
	}
}
//factor of number.

import java.lang.*;
import java.util.*;
class Demo
{
	public void  Factor(int iNo)
	{
		int iCnt=0;
		for(iCnt=1; iCnt<iNo; iCnt++)
		{
			if((iCnt%iNo)==0)
			{
				System.out.println(iCnt);
			}
		}
	}
}
class program32
{
	public static void main(String a[])
	{
		int ivalue=0;
		Scanner sobj= new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sobj.nextInt();
		
		
		
	}
}
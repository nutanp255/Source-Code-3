//accept string from user and display frequency of each world.

import java.util.*;

class FreqWorld
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter string:");
		String str=sobj.nextLine();
		
		String arr[]=str.Split();
		
		HashMap<String,Integer> hobj=new HashMap<>();
		
		for(String ch:arr)
		{
			if(hobj.containsKey(ch))
			{
				int Freq=hobj.get(ch);
				hobj.put(ch,Freq+1);		//if 'ch' is present in hashmap then increase by 1.
			}
			else
			{
				hobj.put(ch,1);					//if 'ch' not contain value in hashmap then take value 1.
			}
		}
		Set<String>setobj=hobj.keySet();
		
		int iMax=0;
		String c=" ";
		
		for(String value:setobj)
		{
			if(hobj.get(value)>iMax)
			{
				iMax=hobj.get(value);
				c=value;
			}
		}
		
		System.out.println(c  +"occurs maximum number of times ie:"+ iMax);
	}
}
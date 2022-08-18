//accept string and display maximum number of character with helpof set.

import java.util.*;

class MaxChar_Set
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter string:");
		String str=sobj.nextLine();
		
		char arr[]=str.toCharArray();
		
		HashMap<Character,Integer> hobj=new HashMap<>();
		
		for(char ch:arr)
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
		Set<Character>setobj=hobj.keySet();
		System.out.println(setobj);
	}
}
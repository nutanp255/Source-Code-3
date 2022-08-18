//accept string from user and display frequency of each character.

import java.util.*;

class FreqEachChar
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
				hobj.put(ch,Freq+1);
			}
			else
			{
				hobj.put(ch,1);					//if ch not contain value in hashmap then take value 1
			}
		}
		System.out.println(hobj);	
	}
}
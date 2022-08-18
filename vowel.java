import java.lang.*;
import java.util.*;

class Marvellous extends Thread
{
	String s1;
	Marvellous(String s)
	{
		s1=s;
		start();
	}
	public void run()
	{
		System.out.println("vowels are: ");
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A')
			{
				System.out.println(ch);
			}
			try
		{
		Thread.sleep(1000);
		}
		catch(Exception obj)
		{}
		}
		
	}
}
public class vowel
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter string:");
		String str1=sobj.nextLine();
		Marvellous v=new Marvellous(str1);
	}
}
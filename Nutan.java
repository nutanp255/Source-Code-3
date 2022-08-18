import java.lang.*;

class Demo implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Value os i:"+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception obj){}
		}
	}
}
class Nutan 
{
	public static void main(String arg[])throws Exception
	{
		Demo dobj=new Demo();
		Thread t1=new Thread(dobj,"first");
		
		Demo dobj1=new Demo();
		Thread t2=new Thread(dobj1,"second");
		
		t1.start();
		t1.join();
		t2.start();
	}
}
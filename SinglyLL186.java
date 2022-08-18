import java.lang.*;
import java.util.*;

class node
{
	public int data;
	public node next;		//struct node *next;
}

class SinglyLL
{
	public node head;
	public int count;
	
	public SinglyLL()
	{
		head=null;
		count=0;
	}
	public void InsertFisrt(int no)
	{
		node newn=new node();
		newn.data=no;
		newn.next=null;
		
		if(head==null)
		{
			head=newn;
		}
		else
		{
			newn.next=head;
			head=newn;
		}
		count++;
	}
	
	public void InsertLast(int no)
	{
		node newn=new node();
		newn.data=no;
		newn.next=null;
		
		if(head==null)
		{
			head=newn;
		}
		else
		{
			node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;	
			}
			temp.next=newn;
		}
		count++;
	}
	public void Display()
	{
		node temp=head;
		
		System.out.println("Elements in linked list: ");
		while(temp!=null)
		{
			System.out.print("|"+temp.data+"|->");
			temp=temp.next;
		}
		System.out.println("NULL");
	}
	
	public int CountNode()
	{
		return count;
	}
	
	public void DeleteFirst()
	{
		if(count==0)
		{
			return;
		}
		else if(count==1)
		{
			head=null;
		}
		else
		{
			node temp=head;
			head=head.next;
			temp=null;
		}
		count--;
	}
	
	public void DeleteLast()
	{
		node temp=head;
		if(count==0)
		{
			return;
		}
		else if(count==1)
		{
			head=null;
		}
		else
		{
			node temp=head;
			while(temp.next.next!=null)
			{
				temp=temp.next;
			}
			temp.next=null;
		}
		count--;
	}
	
	public void InsertAtPos(int no,int pos)
	{
		if((pos<1)||(pos>count+1))
		{
			return;
		}
		else if(pos==1)
		{
			InsertFirst(no);
		}
		else if(pos==count+1)
		{
			InsertLast(no);
		}
		else
		{
			node newn= new node();
			newn.data=no;
			newn.next=null;
			
			node temp=head;
			
			for(int i=1;i<pos-1;i++)
			{
				temp=temp.next;
			}
			newn.next=temp.next;
			temp.next=newn;
			
			count++;
		}
	}
	public void DeleteAtPos(int pos)
	{
		if((pos<1)||(pos>count))
		{
			return;
		}
		else if(pos==1)
		{
			DeleteFirst();
		}
		else if(pos==count)
		{
			DeleteLast();
		}
		else
		{
			node temp=head;
			
			for(int i=1;i<pos-1;i++)
			{
				temp=temp.next;
			}
			temp.next=temp.next.next;
			count--;
		}
	}
}

class SinglyLL186
{
	public static void main(String arg[])
	{
		SinglyLL obj =new SinglyLL();
		obj.InsertFirst(51);
		obj.InsertFirst(21);
		obj.InsertFirst(11);
		
		obj.InsertLast(101);
		obj.InsertLast(121);
		
		obj.InsertAtPos(55,4);
		obj.Display();
		obj.DeleteAtPos(4);
		obj.Display();
		System.out.println("Number of element are:"+obj.CountNode());
		
		obj.DeleteFirst();
		obj.DeleteLast();
		
		obj.Display();
		System.out.println("Number of element are:"+obj.CountNode());
		
		
	}
}
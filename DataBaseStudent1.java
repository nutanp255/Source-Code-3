//database table/schema
//create table student(RID int,Name varchar(255),salary int);

import java.util.*;
import java.lang.*;

class Student
{
	public int RID;
	public String Name;
	public int Salary;
	
	private static int Generator;
	
	static
	{
		Generator=0;
	}
	
	public Student(String str,int value)
	{
		this.RID=++Generator;
		this.Name=str;
		this.Salary=value;
	}
	
	public void DisplayData()
	{
		System.out.println(this.RID+"\t"+this.Name+"\t"+this.Salary);
	}
}

class DBMS
{	
	LinkedList<Student>lobj; 
	
	public DBMS()									//constructor
	{
		lobj=new LinkedList<>();					//object of LL.
	}
	
	//insert into student piyush 1000;
	//select * from student;
	public void StartDBMS()
	{
		Scanner scanobj=new Scanner(System.in);
		
		System.out.println("Marvellous customised DBMS started successfully......");
		String Query="";
		
		while(true)
		{
			System.out.print("Marvellous DBMS console >");
			Query=scanobj.nextLine();
			
			String tokens[]=Query.split(" ");
			int QuerySize=tokens.length;
			
			if(QuerySize==1)
			{
				if("Help".equals(tokens[0]))
				{
					System.out.println("This application is used demonstrates the customised DBMS");
					System.out.println("Exit: Terminate DBMS");
					System.out.println("Display all data: select * from student");
					System.out.println("Insert data: Insert into student Name Salary");
				}
				else if("Exit".equals(tokens[0]))
				{
					System.out.println("Thank you using Marvellous DBMS!!!");
					break;
				}
			}
			else if(QuerySize==2)
			{
				
			}
			else if(QuerySize==4)
			{
				//select * from student;
				if("select".equals(tokens[0]))
				{
					if("*".equals(tokens[1]))
					{
						DisplayAll();
					}
				}
			}
			else if(QuerySize==5)
			{
				//insert into student Nutan 1000;
				if("Insert".equals(tokens[0]))
				{
					InsertData(tokens[3],Integer.parseInt(tokens[4]));
				}
			}
			
		}
	}
	
	//Insert into queary
	public void InsertData(String str,int value)
	{
		Student sobj=new Student(str,value);			//object of student.
		lobj.add(sobj);									//LL madhe value add keli.
	}
	
	//Display all without condition.
	public void DisplayAll()
	{
		for(Student sref:lobj)
		{
			sref.DisplayData();
		}
	}
	
	//Display by RID
	public void DisplaySpecific(int rid)
	{
		for(Student sref:lobj)
		{
			if(sref.RID==rid)
			{
				sref.DisplayData();
				break;
			}
		}
	}
	
	//Display by name.
	public void DisplaySpecific(String str)				//fun overloading by changing prototype.
	{
		for(Student sref:lobj)
		{
			if(str.equals(sref.Name))
			{
				sref.DisplayData();
			}
		}
	}
	
	//Display by RID.
	public void DeleteSpecific(int rid)
	{
		int index=0;
		for(Student sref:lobj)
		{
			if(sref.RID==rid)
			{
				lobj.remove(index);
				break;
			}
			index++;
		}
	}
	
	//Display by name.
	public void DeleteSpecific(String str)
	{
		int index=0;
		for(Student sref:lobj)
		{
			if(str.equals(sref.Name))
			{
				lobj.remove(index);
				break;
			}
			index++;
		}
	}
	
	public void AggregateMax()
	{
		int iMax=0;
		Student temp=null;
		
		for(Student sref:lobj)
		{
			if(sref.Salary>iMax)
			{
				iMax=sref.Salary;
				temp=sref;
			}
		}
		System.out.println("I formation of student having maximum salary:");
		temp.DisplayData();
	}
	
	//minimum salary	
	public void AggregateMin()
	{
		int iMin=(lobj.getFirst()).Salary;
		Student temp=lobj.getFirst();
		
		for(Student sref:lobj)
		{
			if(sref.Salary<iMin)
			{
				iMin=sref.Salary;
				temp=sref;
			}
		}
		System.out.println("I formation of student having minimum salary:");
		temp.DisplayData();
	}
	
	public void AggregateSum()
	{
		int iSum=0;
		
		for(Student sref:lobj)
		{
			iSum=iSum+sref.Salary;
		}
		System.out.println("Summation of salries is:"+iSum);
	}
	
	public void AggregateAvg()
	{
		int iSum=0;
		
		for(Student sref:lobj)
		{
			iSum=iSum+sref.Salary;
		}
		System.out.println("Average salary is:"+iSum/lobj.size());
	}
	
	public void AggregateCount()
	{
		System.out.println("Count is:"+lobj.size());
	}
}
class DataBaseStudent1
{
	public static void main(String arg[])
	{		
		DBMS dobj=new DBMS();
		dobj.StartDBMS();
		
		
	}
}
package com.entity;

import java.util.Date;
import java.util.Scanner;

public class App {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
	// senrio 1
		
		Date d1=new Date();
		System.out.println("---------------------Senario 1------------------------");
		Student s1=new Student(101, "Tejas Rote",d1.toLocaleString());
		Student s2=new Student(102, "Chetan Bhadhane",d1.toLocaleString());
		Student s3=new Student(103, "Dinesh Kadam",d1.toLocaleString());
		
		Info i=new Info();
		i.display(s1);
		i.display(s2);
		i.display(s3);
	int co;
			// senrio 2
			int lo=co=0;
				System.out.println("---------------------Senario 2------------------------");
				Student sarr[]=new Student[10];
				sarr[0]=s1;
				sarr[1]=s2;
				sarr[2]=s3;
				for (Student student : sarr) {
					lo++;
					if(student==null)
					{
						break;
					}
					else
						i.display(student);
				}
				
	// senrio 3
				int ch;
				Course c[]=new Course[10];
	System.out.println("---------------------Senario 3------------------------");
	do
	{
	
 System.out.println(" Say 1 To Enter Student Data  OR Say 2 To Display Data "
 		+ "\n OR \n Say 3 to Enter Course OR Say 4 To Display Courses :- ");
   ch=sc.nextInt();
   if(ch==1)
   {
	   sarr[lo-1]=i.Acceptdata();
		 lo++;
   	
   }
if(ch==2)
{
	for (Student student : sarr) {
		if(student==null)
		{
			break;
		}
		else
			i.display(student);
	}
}
if(ch==3)
{
	c[co]=i.AcceptCoursdata();
	co++;
}
if(ch==4)
{
	for (Course cr:c ) {
		if(cr==null)
		{
			break;
		}
		else
			i.display(cr);
	}
}
	}while(ch==1 || ch==2 || ch==3 || co==4);
	
	// senario 4
	
	

}
}

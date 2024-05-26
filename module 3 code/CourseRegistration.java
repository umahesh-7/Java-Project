import java.util.*;

import java.lang.*;

import java.io.*;


class CourseBasedRegistration
{
	
Scanner sc=new Scanner(System.in);
	
int course_id[]=new int[26];
	
String course_name[]=new String[26];
	
String faculty_name[]=new String[26];
	
String faculty_course[]=new String[26];
	
int student_id[]=new int[26];
	
String student_name[]=new String[26];
	
String course[]=new String[26];
	
void course(int no)
	
{
		
int n=no;
		
for(int i=0;i<n;i++)
		
{
			
System.out.println("Enter id and name of course"+(i+1)+":");
			
course_id[i]=sc.nextInt();
			
course_name[i]=sc.next();
		
}
		
for(int i=0;i<n;i++)
		
{
			
System.out.println("Course id="+course_id[i]);
			
System.out.println("course name is "+course_name[i]);
		
}
		
	
}
	
void faculty(int no)
	
{
		
int n=no;
		
for(int i=0;i<n;i++)
		
{
			
System.out.println("Enter faculty name and course");
faculty_name[i]=sc.next();
			
faculty_course[i]=sc.next();
		
}
		
for(int i=0;i<n;i++)
		
{
			
System.out.println("Faculty name is "+faculty_name[i]);
			
System.out.println("Course offered by "+faculty_name[i]+" : "+faculty_course[i]);
		
}
	
}
	
int num;
	
void student(int no)
	
{
		
num=no;
		
for(int i=0;i<num;i++)
		
{
			
System.out.println("Enter student id,name and course");
			
student_id[i]=sc.nextInt();
			
student_name[i]=sc.next();
			
course[i]=sc.next();
		
}
		
	
}
	
void list_of_students()
	{
		
for(int i=0;i<num;i++)
		
{
			
System.out.println(student_name[i]+" registered for the course "+course[i]);
		
}
	
}

}

class CourseRegistration
{
	
public static void main (String[] args) throws IOException{
		
CourseBasedRegistration ob=new CourseBasedRegistration();
		
ob.course(3);
		
ob.faculty(3);
		
ob.student(5);
		
ob.list_of_students();
	
}

}
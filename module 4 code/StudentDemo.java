import java.io.*;
class Student
{
int rollno;
String name;
int number_of_subjects;
int mark[];
Student(int roll,String stud_name, int noofsub)throws IOException
{
rollno=roll;
name=stud_name;
number_of_subjects= noofsub;
getMarks(noofsub);
}
public void getMarks(int nosub ) throws IOException
{
mark=new int[nosub];
BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
for (int i=0; i<nosub;i++)
{
System.out.println("Enter " +i+ "Subject Marks.: ");
mark[i]=Integer.parseInt(br.readLine());
}
}
public void calculateMarks()
{
double percentage=0;
String grade;
int tmarks=0;
for (int i=0;i<mark.length;i++)
{
tmarks+=mark[i];
}
percentage=tmarks/number_of_subjects;
System.out.println("Roll Number : "+rollno);
System.out.println("Name Of Student is : "+name);
System.out.println("Number Of Subject : "+number_of_subjects);
System.out.println("Percentage Is : "+percentage);
if (percentage>=85)
System.out.println("Grade Is  O");
else if(percentage>=80 && percentage<85)
System.out.println("Grade Is A+");
else if(percentage>=65 && percentage<80)
System.out.println("Grade Is A");
else if(percentage>=60 && percentage<65)
System.out.println("Grade Is B+");
else if(percentage>=50 && percentage<60)
System.out.println("Grade is B");
else if(percentage>=45 && percentage<50)
System.out.println("Grade is C");
else if(percentage>=40 && percentage<45)
System.out.println("Grade is P");
else
System.out.println("You Are Fail");
}
}
class StudentDemo
{
public static void main(String args[])throws IOException
{
int rno,no,nostud;
String name;
BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter How many Students: ");
nostud=Integer.parseInt(br.readLine());
Student s[]=new Student[nostud];
for(int i=0;i<nostud;i++)
{
System.out.println("Enter Roll Number:");
rno=Integer.parseInt(br.readLine());
System.out.println("Enter Name: ");
name=br.readLine();
System.out.println("Enter No of Subject: ");
no=Integer.parseInt(br.readLine());
s[i]=new Student(rno,name,no);
}
for(int i=0;i<nostud ;i++)
{
s[i].calculateMarks();
}
}
}
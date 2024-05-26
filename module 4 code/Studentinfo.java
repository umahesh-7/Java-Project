import java.util.*;     
import java.io.*; 
 
class Basicstudentdetails 
{ 
 int age,batchnofrom,year,id; 
 String name,branch,gmail; 
 void readStudentinfo(){ 
                try{ 
  Scanner s=new Scanner(System.in); 
  System.out.print("\n\n\t\tEnter NAME of the student: "); 
  name=s.next()+s.nextLine(); 
  System.out.print("\n\n\t\tEnter IDNO of the student: "); 
  id=s.nextInt(); 
  System.out.print("\n\n\t\tEnter BRANCH of the student: "); 
  branch=s.next(); 
  System.out.print("\n\n\t\tEnter SEMESTER NO of the student: "); 
  year=s.nextInt(); 
  System.out.print("\n\n\t\tEnter MAIL of the student: "); 
  gmail=s.next(); 
                } 
                catch(Exception a){ 
                    System.out.println("oops thats an:"+a+"error"); 
                } 
  } 
 

 
} 
  class Displaybasicinfo extends Basicstudentdetails 
 { 
  void displayInfo() 
  { 
   Basicstudentdetails o=new Basicstudentdetails(); 
   o.readStudentinfo(); 
   System.out.print("\n\n\t\t--------------------------------------------------------"); 
   System.out.print("\n\n\t\t\t\tSTUDENT BASIC INFORMATION "); 
   System.out.print("\n\n\t\t--------------------------------------------------------"); 
   System.out.print("\n\n\t\t\t\tNAME: "+o.name); 
   System.out.print("\n\n\t\t\t\tIDNO: "+o.id); 
   System.out.print("\n\n\t\t\t\tBRANCH: "+o.branch); 
   System.out.print("\n\n\t\t\t\tSEMESTER: "+o.year); 
   System.out.print("\n\n\t\t\t\tAGE: "+o.age); 
   System.out.print("\n\n\t\t\t\tGMAIL: "+o.gmail); 
  } 
 } 
class Internalmarks 
{ 
 Displaybasicinfo oo=new Displaybasicinfo(); 
 int Im[],Em[],Em1[],att[],n,Tm[],Am,count,Epm[],Total; 
 double per; 
 String s[],Es[],grade,Ep[],Ef[],Ir,Ir1; 
 Scanner S=new Scanner(System.in); 
 void Internalmarks() 
 { 
  System.out.print("\n\n\t\tEnter no of subjects :"); 
  n=S.nextInt(); 
  oo.year=3; 
  String[] s= new String[n]; 
  String[] Es=new String[n]; 
  String[] Ep=new String[n]; 
  String[] Ef=new String[n]; 
  String[] Ir=new String[n]; 
  String[] Ir1=new String[n]; 
  int[] Em=new int[n]; 
  int[] Tm=new int[n]; 
  int[] Epm=new int[n]; 
  System.out.print("\n\n\t\tEnter names of the subjects :"); 
  for(int i=0;i<n;i++) 
  { 
   System.out.printf("\n\n\t\ts[%d]:",i+1); 
   s[i]=S.next()+S.nextLine(); 
  } 
   System.out.print("\n\n\t\tEnter INTERNAL MARKS in each subject: "); 
  int[] Im=new int[n]; 
  for(int i=0;i<n;i++) 
  { 
   System.out.print("\n\n\t\t"+s[i]+":"); 
   Im[i]=S.nextInt(); 
  } 
   
  System.out.print("\n\n\t\tEnter ATTENDACE % in each subject"); 
  int[] att=new int[n];  
  for(int i=0;i<n;i++) 
  { 
   System.out.print("\n\n\t\t Attendance in "+s[i]+":"); 
   att[i]=S.nextInt(); 
  } 
  System.out.print("\n\n\t\t----------------------------------------"); 
  System.out.print("\n\n\t\t\tSTUDENT ACADEMIC RECORDS"); 
  System.out.print("\n\n\t\t----------------------------------------"); 
  for(int i=0;i<n;i++) 
  { 
   if((Im[i]<20&&att[i]<65)||(Im[i]>20&&att[i]<65)||(Im[i]<20&&att[i]>65)) 
   { 
    System.out.print("\n\n\t\tMarks in "+s[i]+":"+Im[i]+"\n\n\t\tAttendance in "+s[i]+":"+att[i]); 
    Ir[i]="DETAINED"; 
   } 
   if(att[i]>65&&att[i]<75&&Im[i]>20) 
   { 
    System.out.print("\n\n\t\tMarks in "+s[i]+":"+Im[i]+"\n\n\t\tAttendance in "+s[i]+":"+att[i]); 
    Ir[i]="ELIGIBLE WITH CONDONATION"; 
   } 
   if(Im[i]>20&&att[i]>75) 
   { 
    System.out.print("\n\n\t\tMarks in "+s[i]+":"+Im[i]+"\n\n\t\tAttendance in "+s[i]+":"+att[i]); 
    Ir[i]="ELIGIBLE";  
   } 
  } 
  System.out.print("\n\n\t\tSubjects eligible for External exam are :"); 
  for(int i=0;i<n;i++) 
  { 
   if((att[i]>65&&att[i]<75&&Im[i]>20)||(Im[i]>20&&att[i]>75)) 
   { 
    count=count+1; 
    Es[i]=s[i]; 
    System.out.print("\n\n\t\t"+Es[i]); 
   }  
  } 
  System.out.print("\n\n\t\tEnter marks in External exam:"); 
  for(int i=0;i<n;i++) 
  { 
    if((att[i]>65&&att[i]<75&&Im[i]>20)||(Im[i]>20&&att[i]>75)) 
   { 
    Es[i]=s[i]; 
    System.out.print("\n\n\t\t"+Es[i]+":"); 
    Em[i]=S.nextInt(); 
   } 
  } 
  for(int i=0;i<n;i++) 
  {    
   if(Em[i]<20&&Em[i]>=0) 
   { 
    Ef[i]=Es[i]; 
    System.out.print("\n\n\t\t "+Es[i]+":"+Em[i]+":FAIL"); 
    Ir1[i]="FAIL"; 
   } 
    else if(Em[i]>=21&&Em[i]<=50) 
   { 
    Ep[i]=Es[i]; 
    Epm[i]=Em[i]; 
    System.out.print("\n\n\t\t "+Ep[i]+":"+Em[i]+":PASS"); 
    Ir1[i]="PASS"; 
   }  
  } 
  System.out.print("\n\n\t\t--------------------------------------------------------"); 
  System.out.print("\n\n\t\t\t Subjects in "+oo.year+" Semester"); 
  System.out.print("\n\n\t\t--------------------------------------------------------"); 
  for(int i=0;i<n;i++) 
  { 
   System.out.print("\n\n\t\t"+s[i]); 
  } 
  System.out.print("\n\n\t\t\t\tINTERNAL MARKS REPORT "); 
  System.out.print("\n\n\t\t--------------------------------------------------------"); 
  System.out.print("\n\n\t\t\tMARKS\t  ATTENDANCE\t RESULT"); 
  System.out.print("\n\n\t\t--------------------------------------------------------"); 
  for(int i=0;i<n;i++) 
  { 
   System.out.print("\n\n\t\t"+s[i]+":\t"+Im[i]+"\t  "+att[i]+"\t     "+Ir[i]); 
  } 
  System.out.print("\n\n\t\t--------------------------------------------------------"); 
  System.out.print("\n\n\t\t\tSubjects ELIGIBLE for external"); 
  System.out.print("\n\n\t\t--------------------------------------------------------"); 
  for(int i=0;i<n;i++) 
  { 
   if((att[i]>65&&att[i]<75&&Im[i]>20)||(Im[i]>20&&att[i]>75)) 
   { 
    Es[i]=s[i]; 
    System.out.print("\t\t\t"+Es[i]); 
    } 
  } 
                System.out.print(" "); 
  System.out.print("\n\n\t\t\t\tEXTERNAL MARKS REPORT "); 
  System.out.print("\n\n\t\t--------------------------------------------------------"); 
  System.out.print("\n\n\t\t\t\tMARKS\t\tRESULT"); 
  System.out.print("\n\n\t\t--------------------------------------------------------"); 
  for(int i=0;i<n;i++) 
  { 
   if((att[i]>65&&att[i]<75&&Im[i]>20)||(Im[i]>20&&att[i]>75)) 
   { 
    Tm[i]=Em[i]+Im[i]; 
    System.out.print("\n\n\t\t"+Es[i]+":\t\t"+Tm[i]+"\t\t"+Ir1[i]); 
    Total=Total+Tm[i]; 
   } 
  }   
  per=Total/count; 
  System.out.print("\n\n\t\tPercentage in semester is:"+per);     
 } 
} 
interface Parentdetails 
 { 
   void address(); 
  void parentinfo(); 
  void display(); 
 } 
 class Personalinfo implements Parentdetails 
 { 
   int dno,dno1,dno2,pincode; 
   long fphno,sphno,mphno; 
   String streetname,district,country,city,mname,fname,mocc,focc; 
   Scanner s=new Scanner(System.in); 
  public void parentinfo() 
  { 
                    try{ 
    System.out.print("\n\n\t\tEnter STUDENT'S MOTHER NAME : "); 
   mname=s.next()+s.nextLine(); 
   System.out.print("\n\n\t\tEnter STUDENT'S FATHER NAME: "); 
   fname=s.next()+s.nextLine(); 
   System.out.print("\n\n\t\tEnter MOTHER'S OCCUPATION: "); 
   mocc=s.next()+s.nextLine(); 
   System.out.print("\n\n\t\tEnter FATHER'S OCCUPATION: "); 
   focc=s.next()+s.nextLine(); 
   System.out.print("\n\n\t\tEnter MOTHER'S PHONE NO: "); 
   mphno=s.nextLong(); 
   System.out.print("\n\n\t\tEnter FATHER'S PHONE NO: "); 
 
   fphno=s.nextLong(); 
   System.out.print("\n\n\t\tEnter STUDENT'S PHONE NO: "); 
   sphno=s.nextLong();  
  }  
                 
                catch(Exception d){ 
            System.out.println("Error:"+d); 
        } 
                } 
  public void address() 
  { 
                    try{ 
 
    System.out.print("\n\n\t\t\tEnter DOOR NO : "); 
    dno=s.nextInt(); 
    dno1=s.nextInt(); 
    dno1=s.nextInt(); 
    System.out.print("\n\n\t\t\tEnter STREET : "); 
    streetname=s.next()+s.nextLine(); 
    System.out.print("\n\n\t\t\tEnter CITY : "); 
    city=s.next()+s.nextLine(); 
    System.out.print("\n\n\t\t\tEnter PINCODE : "); 
    pincode=s.nextInt(); 
    System.out.print("\n\n\t\t\tEnter DISTRICT : "); 
    district=s.next()+s.nextLine(); 
    System.out.print("\n\n\t\t\tEnter COUNTRY : "); 
    country=s.next()+s.nextLine(); 
                    } 
                catch(Exception y){ 
                    System.out.println("error is"+y); 
                }} 
  public void display() 
  { 
   System.out.print("\n\n\t\t-------------------------------------------"); 
   System.out.print("\n\n\t\t\tSTUDENT PERSONAL INFORMATION"); 
   System.out.print("\n\n\t\t-------------------------------------------"); 
   System.out.print("\n\n\t\t\tMOTHER NAME: "+mname); 
   System.out.print("\n\n\t\t\tFATHER NAME: "+fname); 
   System.out.print("\n\n\t\t\tMOTHER OCCUPATION: "+mocc); 
   System.out.print("\n\n\t\t\tFATHER OCCUPATION: "+focc); 
   System.out.print("\n\n\t\t\tMOTHER PHONE NO: "+mphno); 
   System.out.print("\n\n\t\t\tFATHER PHONE NO: "+fphno); 
   System.out.print("\n\n\t\t\tSTUDENT PHONE NO: "+sphno); 
   System.out.print("\n\n\t\t\tDOOR NO: "+dno+"-"+dno1+"-"+dno2); 
   System.out.print("\n\n\t\t\tSTREET: "+streetname); 
   System.out.print("\n\n\t\t\tCITY: "+city); 
   System.out.print("\n\n\t\t\tPINCODE: "+pincode); 
   System.out.print("\n\n\t\t\tDISTRICT: "+district); 
   System.out.print("\n\n\t\t\tCOUNTRY: "+country); 
  } 
} 
final class Fee 
{ 
void stufee(){ 
final int c; 
System.out.println("  \n 1. residential \n 2.Non residential \n 3.scholarship"); 
System.out.println("  \n enter the choice"); 
 
Scanner in =new Scanner(System.in); 
c=in.nextInt(); 
 
if(c==1) 
{ 
System.out.println("\n you have to pay only the college fee \n\n college fee =80000"); 
} 
if(c==2){ 
System.out.println(" \n you have to pay both college as well as hostel fee\n \n total fee=1,90000"); 
} 
if(c==3) 
{ 
System.out.println("\n  \n As you belongs to scholarship you have to pay just 55,000\n total fee=55,000"); 
} 
} 
} 
class Attendance{ 
 
void attend(){ 
int cls; 
Scanner in=new Scanner(System.in); 
 
System.out.println("Total number of classes conducted=24"); 
 
System.out.println("\nenter the number of classes attended by the student"); 
cls=in.nextInt(); 
 
 
if(cls>10&&cls<16) 
 
{ 
System.out.println("The student have very less attendance condanation fee should be paid"); 
} 
 
if(cls<10) 
 
{ 
System.out.println("The student is detained!!!!!!!!!!!!!!!!!!!"); 
} 
 
if(cls>16) 
{ 
System.out.println("Student is promoted to the exam congrats and write well"); 
} 
} 
} 
 
public class Studentinfo 
 
{ 
 public static void main(String args[]) 
 { 
 Scanner s=new Scanner(System.in); 
 Fee f=new Fee(); 
        Attendance m= new Attendance(); 
 
  System.out.print("\n\n\t\t----------------------------------------------------"); 
  System.out.print("\n\n\t\t\tSTUDENT INFORMATION SYSTEM"); 
  System.out.print("\n\n\t\t----------------------------------------------------"); 
  System.out.print("\n\n\t\t1)STUDENT BASIC INFORMATION\n\n\t\t2)STUDENT ACADEMIC RECORDS\n\n\t\t3)STUDENT PERSONAL DETAILS\n\n\t\t4)FEE DETAILS\n\n\t\t5)ATTENDANCE RECORDS\n\n\t\t6)EXIT"); 
  System.out.print("\n\n\t\tEnter your option :"); 
  int a=s.nextInt(); 
  switch(a) 
  { 
   case 1: System.out.print("\n\n\t\tEnter the information required"); 
     Displaybasicinfo obj=new Displaybasicinfo(); 
     obj.displayInfo(); 
    break; 
   case 2: System.out.print("\n\n\t\t------------------------------------------"); 
    System.out.print("\n\n\t\t\tSTUDENT ACADEMIC RECORDS");  
    System.out.print("\n\n\t\t------------------------------------------"); 
     Internalmarks o=new Internalmarks(); 
     o.Internalmarks();  
    break; 
   case 3:System.out.println("STUDENT PERSONAL DETAILS"); 
                        Personalinfo obb=new Personalinfo(); 
    obb.parentinfo(); 
    obb.address(); 
    obb.display(); 
     break; 
  case 4:System.out.println("\n Student fee details"); 
   f.stufee(); 
   break; 
  case 5:System.out.println("\n Student Attendance Records"); 
   m.attend(); 
   break; 
  case 6:System.exit(0); 
   break; 
} 
} 
} 
import java.util.*;     
import java.io.*; 
class Internalmarks 
{ 
 Displaybasicinfo oo=new Displaybasicinfo(); 
 int Im[],Em[],Em1[],att[],n,Tm[],Am,count,Epm[],Total; 
 double percentage; 
 String s[],Es[],grade,Ep[],Ef[],Ir,Ir1; 
 Scanner S=new Scanner(System.in); 
 void Internalmarks() 
 { 
  System.out.print("\n\t\tEnter no of subjects :"); 
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
  System.out.print("\n\t\tEnter names of the subjects :"); 
  for(int i=0;i<n;i++) 
  { 
   System.out.printf("\n\t\ts[%d]:",i+1); 
   s[i]=S.next()+S.nextLine(); 
  } 
   System.out.print("\n\t\tEnter INTERNAL MARKS in each subject: "); 
  int[] Im=new int[n]; 
  for(int i=0;i<n;i++) 
  { 
   System.out.print("\n\t\t"+s[i]+":"); 
   Im[i]=S.nextInt(); 
  } 
   
  System.out.print("\n\t\tEnter ATTENDACE % in each subject"); 
  int[] att=new int[n];  
  for(int i=0;i<n;i++) 
  { 
   System.out.print("\n\t\t Attendance in "+s[i]+":"); 
   att[i]=S.nextInt(); 
  } 
  System.out.print("\n\t\t----------------------------------------"); 
  System.out.print("\n\t\t\tSTUDENT ACADEMIC RECORDS"); 
  System.out.print("\n\t\t----------------------------------------"); 
  for(int i=0;i<n;i++) 
  { 
   if((Im[i]<20&&att[i]<65)||(Im[i]>20&&att[i]<65)||(Im[i]<20&&att[i]>65)) 
   { 
    System.out.print("\n\t\tMarks in "+s[i]+":"+Im[i]+"\n\t\tAttendance in "+s[i]+":"+att[i]); 
    Ir[i]="DETAINED"; 
   } 
   if(att[i]>65&&att[i]<75&&Im[i]>20) 
   { 
    System.out.print("\n\t\tMarks in "+s[i]+":"+Im[i]+"\n\t\tAttendance in "+s[i]+":"+att[i]); 
    Ir[i]="ELIGIBLE WITH CONDONATION"; 
   } 
   if(Im[i]>20&&att[i]>75) 
   { 
    System.out.print("\n\t\tMarks in "+s[i]+":"+Im[i]+"\n\t\tAttendance in "+s[i]+":"+att[i]); 
    Ir[i]="ELIGIBLE";  
   } 
  } 
  System.out.print("\n\t\tSubjects eligible for External exam are :"); 
  for(int i=0;i<n;i++) 
  { 
   if((att[i]>65&&att[i]<75&&Im[i]>20)||(Im[i]>20&&att[i]>75)) 
   { 
    count=count+1; 
    Es[i]=s[i]; 
    System.out.print("\n\t\t"+Es[i]); 
   }  
  } 
  System.out.print("\n\t\tEnter marks in External exam:"); 
  for(int i=0;i<n;i++) 
  { 
    if((att[i]>65&&att[i]<75&&Im[i]>20)||(Im[i]>20&&att[i]>75)) 
   { 
    Es[i]=s[i]; 
    System.out.print("\n\t\t"+Es[i]+":"); 
    Em[i]=S.nextInt(); 
   } 
  } 
  for(int i=0;i<n;i++) 
  {    
   if(Em[i]<20&&Em[i]>=0) 
   { 
    Ef[i]=Es[i]; 
    System.out.print("\n\t\t "+Es[i]+":"+Em[i]+":FAIL"); 
    Ir1[i]="FAIL"; 
   } 
    else if(Em[i]>=21&&Em[i]<=50) 
   { 
    Ep[i]=Es[i]; 
    Epm[i]=Em[i]; 
    System.out.print("\n\t\t "+Ep[i]+":"+Em[i]+":PASS"); 
    Ir1[i]="PASS"; 
   }  
  } 
  System.out.print("\n\t\t--------------------------------------------------------"); 
  System.out.print("\n\t\t\t Subjects in "+oo.year+" Semester"); 
  System.out.print("\n\t\t--------------------------------------------------------"); 
  for(int i=0;i<n;i++) 
  { 
   System.out.print("\n\t\t"+s[i]); 
  } 
  System.out.print("\n\t\t\t\tINTERNAL MARKS REPORT "); 
  System.out.print("\n\t\t--------------------------------------------------------"); 
  System.out.print("\n\t\t\tMARKS\t  ATTENDANCE\t RESULT"); 
  System.out.print("\n\t\t--------------------------------------------------------"); 
  for(int i=0;i<n;i++) 
  { 
   System.out.print("\n\t\t"+s[i]+":\t"+Im[i]+"\t  "+att[i]+"\t     "+Ir[i]); 
  } 
  System.out.print("\n\t\t--------------------------------------------------------"); 
  System.out.print("\n\t\t\tSubjects ELIGIBLE for external"); 
  System.out.print("\n\t\t--------------------------------------------------------"); 
  for(int i=0;i<n;i++) 
  { 
   if((att[i]>65&&att[i]<75&&Im[i]>20)||(Im[i]>20&&att[i]>75)) 
   { 
    Es[i]=s[i]; 
    System.out.print("\t\t\t"+Es[i]); 
    } 
  } 
                System.out.print(" "); 
  System.out.print("\n\t\t\t\tEXTERNAL MARKS REPORT "); 
  System.out.print("\n\t\t--------------------------------------------------------"); 
  System.out.print("\n\t\t\t\tMARKS\t\tRESULT"); 
  System.out.print("\n\t\t--------------------------------------------------------"); 
  for(int i=0;i<n;i++) 
  { 
   if((att[i]>65&&att[i]<75&&Im[i]>20)||(Im[i]>20&&att[i]>75)) 
   { 
    Tm[i]=Em[i]+Im[i]; 
System.out.print("\n\t\t"+Es[i]+":\t\t"+Tm[i]+"\t\t"+Ir1[i]); 
Total=Total+Tm[i]; 
} 
}   
percentage=Total/count;
double CGPA=(percentage*9.5)/10; 
System.out.println("\n\t\tC.G.P.A : "+CGPA);
System.out.print("\n\t\tPercentage in semester is:"+percentage); 
System.out.println("\n\t\t\t\t\tGRADE POINT IS BASED ON PERCENTAGE OF ALL SUBJECTS");
if (percentage>=85){
System.out.println("\n\t\tGrade Is  O");
System.out.println("\n\t\tGrade Point Is  10");
}
else if(percentage>=80 && percentage<85){
System.out.println("\n\t\tGrade Is A+");
System.out.println("\n\t\tGrade Point Is  9");
}
else if(percentage>=65 && percentage<80){
System.out.println("\n\t\tGrade Is A");
System.out.println("\n\t\tGrade Point Is  8");
}
else if(percentage>=60 && percentage<65){
System.out.println("\n\t\tGrade Is B+");
System.out.println("\n\t\tGrade Point Is  7");
}
else if(percentage>=50 && percentage<60){
System.out.println("\n\t\tGrade is B");
System.out.println("\n\t\tGrade Point Is  6");
}
else if(percentage>=45 && percentage<50){
System.out.println("\n\t\tGrade is C");
System.out.println("\n\t\tGrade Point Is  5");
}
else if(percentage>=40 && percentage<45){
System.out.println("\n\t\tGrade is P");
System.out.println("\n\t\tGrade Point Is  4");
}
else{
System.out.println("\n\t\tYou Are Fail"); 
System.out.println("\n\t\tGrade Point Is  0");   
}
} 
} 
public class Grading
{ 
 public static void main(String args[]) 
 { 
System.out.println("\n\t\tSTUDENT GRADING SYSTEM");
System.out.println("\n\t\t\tSUBJECT WISE GRADING");
System.out.println("\n\t\t\t\tSEMESTER WISE GRADING");
     Internalmarks o=new Internalmarks(); 
     o.Internalmarks();  
}
}
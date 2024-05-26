import java.util.*;
import java.io.*;

class Module4{
	public static void main(String[] args) throws Exception{
Scanner sc=new Scanner(System.in);
		int n,t,m;
		while(1==1){
System.out.print("Functions are...............\n");						
System.out.print("====================================================\n");						
System.out.println("1.Report subject wise grading");						
System.out.println("2.Report semester  wise grading");						
System.out.println("3.Report cumulative Grading");						
System.out.println("4.Report list of grades along with weights");						
System.out.println("5.Display all grades of students");						
System.out.print("\n====================================================\n");						
System.out.print("Enter your choice:");						
int h=sc.nextInt();						
//System.out.println("");						
if(h==5)							
break;						
switch(h){							
case 1:{								
java.io.File file=new java.io.File("subject.txt");								
if(file.exists())								
{									
System.out.println("\n");								
}								
java.io.PrintWriter o=new java.io.PrintWriter(file);								
System.out.print("Enter the number of students:");								
n=sc.nextInt();								
System.out.print("\n");                                                                                                                                                     
System.out.print("Enter the number of subjects:");                                                                                                                                                      
m=sc.nextInt();								
int i,j;								
o.print("Name\t");								
o.print("\t");								
o.print("Subject\t");	
o.print("\t");
o.print("Marks");							
for(i=0;i<n;i++){									
j=i+1;									
System.out.println(j+" Student details:\n");									
System.out.print("Enter the  student name:");
 String s=sc.next();									
System.out.print("\n");                                                                                                                                                                  
for(int j1=1;j1<=m;j1++){									
System.out.print("Enter the Subject Name:");									
String s1=sc.next();									
System.out.print("\n");
System.out.print("Enter the subject marks:");
int s2=sc.nextInt();
int sum=0;
sum+=s2;
 int average;
average=sum/m;
o.println();																		
o.print(s+"\t\t");  
o.print(s1+"\t");    
o.print("\t"+s2);
}									
}								
System.out.println("Student subject  file is created\n");								
System.out.println("Go to \'function 2\' to know the semester wise grading\n");								
o.close();								
break;							
}						
case 2:{								
java.io.File file1=new java.io.File("semester.txt");								
if(file1.exists())								
{									
System.out.println("\n");								
}								
java.io.PrintWriter o= new java.io.PrintWriter(file1);	
o.print("Name\t");
o.print("Grade");
int percentage=0;							
System.out.println("Percentage Is : "+percentage);
if (percentage>=70)
System.out.println("Grade Is O");
else if(percentage>=60 && percentage<70)
System.out.println("Grade Is A+");
else if(percentage>=50 && percentage<60)
System.out.println("Grade Is A");
else if(percentage>=40 && percentage<50)
System.out.println("Grade Is P");
else
System.out.println("You Are Fail");
//o.print(s);
o.println();
o.print(percentage);								
System.out.println("semester.txt file is created\n");								
System.out.println("Go to \'function 3\' to know the cummulative grading\n");							
o.close();														
break;							
}
}
}
}
}

						/*case 3:								int c=0;
								BufferedReader br = new BufferedReader(new FileReader("student.txt"));
        							for (String line; (line = br.readLine()) != null;) {
            								System.out.println(line);
									c++;
        							}
								java.io.File file1=new java.io.File("day_wise_attendence.txt");
								if(file1.exists())
								{
									System.out.println("\n");
								}
								java.io.PrintWriter o=new java.io.PrintWriter(file1);
								System.out.print("\n");
								int i,j;
								n=c;
								o.print("Student\t");
								System.out.print("Enter the number of days:");
								int k=sc.nextInt();
								for(i=0;i<k;i++){
									j=i+1;
									o.print("Day"+j);
									o.print("\t");
								}
								o.println("\n");
								for(i=0;i<n;i++){
									System.out.println((i+1)+" Student Day Wise Attendence:\n");
									System.out.print("Enter the student name:");
									String s=sc.next();
									o.print(s+"\t");
									System.out.print("\n");
									for(j=1;j<=k;j++){
										System.out.print("Is Student present or absent on"+j+"day:");
										String s1=sc.next();
										System.out.println();
										o.print(s1+"\t");
									}
									o.println();
								}
								System.out.println("day_wise_attendence.txt file is created\n");
								System.out.println("Go to \'function 4\' to report below 75% Attendence\n");
								o.close();
								break;
							}
							case 4:{
								int c=0;
								BufferedReader br = new BufferedReader(new FileReader("student_attendence.txt"));
        							for (String line; (line = br.readLine()) != null;) {
            								System.out.println(line);
									c++;
        							}
								java.io.File file1=new java.io.File("detained_list.txt");
								if(file1.exists())
								{
									System.out.println("\n");
								}
								java.io.PrintWriter o = new java.io.PrintWriter(file1);
								o.print("Student\t");
								o.println("Pass or Fail\t");
								o.println();
								n=c;
								BufferedReader br1 = new BufferedReader(new FileReader("attendence.txt"));
        						for (String line; (line = br1.readLine()) != null;) {
        							System.out.print("Enter the student name:");
        							String s=sc.next();
        							System.out.println("\n");
        							o.print(s+"\t");
            						int tt=Integer.parseInt(line);
            						if(tt>=75){
            							System.out.println("Student Passed");
								System.out.println("\n");
            							o.println("Pass");
									}
									else if(tt<75){
										System.out.println("Student Failed\n");
            							o.println("Fail");
									}
            						
        						}
								System.out.println("Detained_list file is created\n");
								o.close();
								break;
							}
						}
					}
					System.out.println("*****************************************************");
					System.out.println("Students Attendence:");
					System.out.println("");
					BufferedReader br = new BufferedReader(new FileReader("student_attendence.txt"));
        			for (String line; (line = br.readLine()) != null;) {
            				 System.out.println(line);
        			}
        			System.out.println("*****************************************************");
        			System.out.println("Subject Wise Attendence:");
					System.out.println("");
					BufferedReader br1 = new BufferedReader(new FileReader("subject_wise_attendence.txt"));
        			for (String line; (line = br1.readLine()) !=null;) {
            			System.out.println(line);
        			}
        			System.out.println("*****************************************************");
        			System.out.println("Day Wise Attendence is:");
					System.out.println("");
					BufferedReader br2 = new BufferedReader(new FileReader("day_wise_attendence.txt"));
        			for (String line; (line = br2.readLine()) !=null;) {
            			System.out.println(line);
        			}
        			System.out.println("*****************************************************");
        			System.out.println("Detained List is:");
					System.out.println("");
					BufferedReader br3 = new BufferedReader(new FileReader("detained_list.txt"));
        			for (String line; (line = br3.readLine()) !=null;) {
            			System.out.println(line);
        			}
        			System.out.println("*****************************************************");
	}	
}*/
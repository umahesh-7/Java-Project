import java.util.*;
import java.io.*;

class Module2{
	public static void main(String[] args) throws Exception{
Scanner sc=new Scanner(System.in);
		int n,t;
		while(1==1){
						System.out.print("Functions are...............\n");
						System.out.print("====================================================\n");
						System.out.println("1.Capturing attendence for all students");
						System.out.println("2.Report subject  wise attendance for students");
						System.out.println("3.Report day wise attendance considering all the subjects");
						System.out.println("4.Report the students having less than 75% attendance");
						System.out.println("5.Display all Details of Attendence of students");
						System.out.print("\n====================================================\n");
						System.out.print("Enter your choice:");
						int h=sc.nextInt();
						System.out.println("");
						if(h==5)
							break;
						switch(h){
							case 1:{
								java.io.File file=new java.io.File("student_attendence.txt");
								java.io.File file1=new java.io.File("student.txt");
								java.io.File file2=new java.io.File("attendence.txt");
								if(file.exists())
								{
									System.out.println("\n");
								}
								java.io.PrintWriter o=new java.io.PrintWriter(file);
								java.io.PrintWriter o1=new java.io.PrintWriter(file1);
								java.io.PrintWriter o2=new java.io.PrintWriter(file2);
								System.out.print("Enter the number of students:");
								n=sc.nextInt();
								System.out.print("\n");
								int i,j;
								o.print("Name\t");
								o.print("\t");
								o.println("Attendence");
								for(i=0;i<n;i++){
									j=i+1;
									System.out.println(j+" Student details:\n");
									System.out.print("Enter the  student name:");
									String s=sc.next();
									System.out.print("\n");
									System.out.print("Enter the student Attendence:");
									String s1=sc.next();
									System.out.print("\n");
									o.print(s+"\t");
									o.println("\t"+s1);
									o1.println(j+"."+s);
									o2.println(s1);	
								}
								System.out.println("Student_Attendence file is created\n");
								System.out.println("Go to \'function 2\' to report Subject wise attendence\n");
								o.close();
								o1.close();
								o2.close();
								break;
							}
							case 2:{
								java.io.File file1=new java.io.File("subject_wise_attendence.txt");
								if(file1.exists())
								{
									System.out.println("\n");
								}
								java.io.PrintWriter o = new java.io.PrintWriter(file1);
								int c=0;
								System.out.println("Students are:\n");
								BufferedReader br = new BufferedReader(new FileReader("student.txt"));
        						for (String line; (line = br.readLine()) != null;) {
            						System.out.println(line);
									c++;
        						}	
								System.out.print("\n");
								int i,j;
								n=c;
								o.print("Student\t");
								o.print("Maths\t");
								o.print("Data Structers\t");
								o.println("OOPS\t");
								for(i=0;i<n;i++){
									j=i+1;
									System.out.println(j+" Student Subject Wise Attendence:\n");
									System.out.print("Enter the student name:");
									String s=sc.next();
									System.out.print("\n");
									System.out.print("Enter the  Maths Attendence:");
									String s1=sc.next();
									System.out.print("\n");
									System.out.print("Enter the Data Structures Attendence:");
									String s2=sc.next();
									System.out.print("\n");
									System.out.print("Enter the OOPS Attendence:");
									String s3=sc.next();
									System.out.print("\n");
									o.print(s+"\t");
									o.print(s1+"\t");
									o.print(s2+"\t");
									o.print("\t"+s3);
								}
								System.out.println("subject_wise_attendence.txt file is created\n");
								System.out.println("Go to \'function 3\' to report day wise attendence\n");
								o.close();
							
								break;
							}
							case 3:{
								int c=0;
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
}
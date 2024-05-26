import java.util.*;
import java.io.*;
class O
{
	public static void main(String[] args)throws IOException {
	int i,num;
	int choice=0,option;
	
	String name;
	boolean flag=true;
	boolean quit = false;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("\n\t\t\tStudent information system");
	while(flag)
	{
		System.out.println("\n   Menu");
		System.out.println("1. Create student File");
		System.out.println("2. Add a student to file");
		System.out.println("3. Modify a student ");
		System.out.println("4. Delete a student");
		System.out.println("5.Report ");
		System.out.print("Enter your choice: ");
		choice= Integer.parseInt(br.readLine());
		switch(choice)
		{
			case 1: 
			
			FileWriter fout = new FileWriter("student.txt");// Create a file.
			
			System.out.println("How many records? ");//Read data from Keyboard
			num= Integer.parseInt(br.readLine());
			for(i=0;i<num;i++)
			{
			
			System.out.println("ENTER STUDENT ID:");
			int Student_ID=Integer.parseInt(br.readLine());
			System.out.println("ENTER STUDENT NAME:");
			String Student_Name=br.readLine();
			System.out.println("ENTER STUDENT DATE OF BIRTH IN WORDS:");
			String DOB= br.readLine();
			System.out.println("ENTER STUDENT ADDRESS:");
			String Address= br.readLine();
			System.out.println("ENTER STUDENT AGE:");
			int age=Integer.parseInt(br.readLine());
			System.out.println("ENTER STUDENT STUDENT CGPA:");
			float cgpa=Float.parseFloat(br.readLine());
			System.out.println("\n");
			Formatter fmt1 = new Formatter();
			fmt1.format("%10d\n  %10s\n  %10s\n  %10s\n  %2d\n  %4f\n",Student_ID,Student_Name,DOB,Address,age,cgpa);
			fout.write(fmt1+"\r\012");
			}
			fout.close(); 
			System.out.println("File is created");  
			break;
			case 2:
			System.out.print("How many records? ");
			num= Integer.parseInt(br.readLine());
			if(num<=0)
			{System.out.print("invalid number");break;
			}
			// Append to the File.
			FileWriter fout1 = new FileWriter("student.txt",true);
			for(i=0;i<num;i++)
			{
			System.out.println("ENTER STUDENT ID:");
			int Student_ID=Integer.parseInt(br.readLine());
			System.out.println("ENTER STUDENT NAME:");
			String Student_Name=br.readLine();
			System.out.println("ENTER STUDENT DATE OF BIRTH IN WORDS:");
			String DOB= br.readLine();
			System.out.println("ENTER STUDENT ADDRESS:");
			String Address= br.readLine();
			System.out.println("ENTER STUDENT AGE:");
			int age=Integer.parseInt(br.readLine());
			System.out.println("ENTER STUDENT STUDENT CGPA:");
			float cgpa=Float.parseFloat(br.readLine());
			System.out.println("\n");
			Formatter fmt2 = new Formatter();
			fmt2.format("%10d\n  %10s\n  %10s\n  %10s\n  %2d\n  %4f\n   ",Student_ID,Student_Name,DOB,Address,age,cgpa);
			fout1.write(fmt2+"\r\012");
			}
			fout1.close(); 
			System.out.println("new records are added");  
			break;
			case 3:
			
			System.out.print("enter modify Id: ");
			int sid = Integer.parseInt(br.readLine());
			FileReader fin1 = new FileReader("student.txt");
			Scanner sc1 = new Scanner(fin1);	
			while(sc1.hasNextInt()) 
			{
			int Student_ID=sc1.nextInt();
			
			String Student_Name=sc1.next();
			String DOB= sc1.next();
			String Address= sc1.next();
			int age=sc1.nextInt();
			float cgpa=sc1.nextFloat();
			if(Student_ID==sid)
			{
				fin1.close();
				FileWriter fout3 = new FileWriter("student.txt");
				System.out.println("ENTER STUDENT ID:");
				 Student_ID=Integer.parseInt(br.readLine());
				System.out.println("ENTER STUDENT NAME:");
				 Student_Name=br.readLine();
				System.out.println("ENTER STUDENT DATE OF BIRTH IN WORDS:");
				 DOB= br.readLine();
				System.out.println("ENTER STUDENT ADDRESS:");
			 	Address= br.readLine();
				System.out.println("ENTER STUDENT AGE:");
				 age=Integer.parseInt(br.readLine());
				System.out.println("ENTER STUDENT STUDENT CGPA:");
				 cgpa=Float.parseFloat(br.readLine());
				System.out.println("\n");
				Formatter fmt3 = new Formatter();
				fmt3.format("%10d\n  %10s\n  %10s\n  %10s\n  %2d\n  %4f\n   ",Student_ID,Student_Name,DOB,Address,age,cgpa);
				fout3.write(fmt3+"\r\012");
				
				fout3.close();
			}
			else 
			{
				System.out.println("there is no student with that id number");
				
				
			}
}
			
			
			break; 
			case 4:
			System.out.print("enter delete Id: ");
			int sd = Integer.parseInt(br.readLine());
			File fin4 = new File("student.txt");
			FileReader fin = new FileReader("student.txt");
			FileWriter fd = new FileWriter("d.txt");
			File fd1 = new File("d.txt");
			
			int k;
			Scanner sc4 = new Scanner(fin);	
			while(sc4.hasNextInt()) 
			{
			int Student_ID=sc4.nextInt();
			String Student_Name=sc4.next();
			String DOB= sc4.next();
			String Address= sc4.next();
			int age=sc4.nextInt();
			float cgpa=sc4.nextFloat();
			if(Student_ID!=sd)
			{
				Formatter fmt4 = new Formatter();
				fmt4.format("%10d\n  %10s\n  %10s\n  %10s\n  %2d\n  %4f\n   ",Student_ID,Student_Name,DOB,Address,age,cgpa);
				fd.write(fmt4+"\r\012");
			}
			}
			System.out.println("Delete suceesfull");		
			fin4.delete();
			fd1.renameTo(fin4);
			fd.close();
			
			break;
			
			case 5:
			FileReader fin5 = new FileReader("student.txt");//Read data from file
			Scanner sc2 = new Scanner(fin5);	
			while(sc2.hasNextInt()) 
			{
			int Student_ID=sc2.nextInt();
			
			String Student_Name=sc2.next();
			String DOB= sc2.next();
			String Address= sc2.next();
			int age=sc2.nextInt();
			float cgpa=sc2.nextFloat();
			Formatter fmt5 = new Formatter();
			fmt5.format("id: %10d\n  Name: %10s\n  DOB: %10s\n  address: %10s\n  Age: %2d\n  CGPA: %4f\n   ",Student_ID,Student_Name,DOB,Address,age,cgpa);
			System.out.println(fmt5);
			}
			
			fin5.close(); 
			break;
			case 6:	
			flag=false;
			break;
			default:System.out.println("Wrong Choice!!");
		}
	}
}
}

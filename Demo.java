import java.util.*;
class Demo{
	static Scanner input = new Scanner(System.in);
	static int [][]marks = new int [0][2];//To store PRF & DBMS marks
	static String [][]stID = new String [0][2]; //To store student ID & student Name
	
	public static void main(String []args){
	while(true){
	System.out.println("*----------------------------------------------------------------------------------------------------------------*");	
	System.out.println("|					WELCOME TO GDSE MARKS MANANGEMENT SYSTEM"+"\t\t\t\t |");
	System.out.println("*----------------------------------------------------------------------------------------------------------------*");
	
	System.out.println("[1] Add New Student \t\t\t\t [2] Add New Student with Marks\n[3] Add Marks \t\t\t\t\t [4] Update Student Details \n[5] Update Marks \t\t\t\t [6] Delete Students \n[7] Print Student Details \t\t\t [8] Print Student Marks \n[9] Best in Programming Fundamentals \t\t [10] Best in Database Management System");	
	System.out.println();
	System.out.print("Enter an Option to continue > ");
	int option = input.nextInt();
	
	clearConsole(); 
	
	switch(option){
		case 1:
		AddNewStudent();
		break;
		
		case 2:
		AddNewStudentMarks();
		break;
		
		case 3:
		AddMarks();
		break;
		
		case 4:
		UpdateStudentDetails();
		break;
		
		case 5:
		UpdateMarks();
		break;
		
		case 6:
		DeleteStudent();
		break;
		
		case 7:
		PrintStudentDetails();
		break;
		
		case 8:
		PrintStudentMarks();
		break;
		
		case 9:
		BestInPRF();
		break;

		case 10:
		BestInDBMS();
		break;
		
		}
	  }
	}
	
	public static void AddNewStudent(){ //[1] Add New Student
		
		char option = 'y';
		while(option == 'y'){
			System.out.println("*----------------------------------------------------------------------------------------------------------------*");	
			System.out.println("|					ADD NEW STUDENT"+"\t\t\t\t 				 |");
			System.out.println("*----------------------------------------------------------------------------------------------------------------*");
	
			
			ExtendArray();
			
			while(true){
				System.out.print("Enter Student ID : ");
				stID [stID.length-1][0]=input.next();
				
				int count=0;
				for (int i = 0; i < stID.length-1; i++)
				{
					if(stID[stID.length-1][0] .equals (stID[i][0])){
					count++;
				}
				 
				}
				if(count==0){
					break;
					}
				else{
					System.out.println("The Student ID already Exists");
					}
			}
			
			System.out.print("Enter Student Name : ");
			stID[stID.length-1][1]=input.next();
			System.out.println();
			System.out.println("Student has been added Successfully.");
			System.out.println();
			
			while(true){
				System.out.print("Do you want to add a new Student (y/n) : ");
				option=input.next().charAt(0);
				
				if(option=='y' || option=='n'){
					break;
					}
				else{
					System.out.print("Invalid input. ");
					}
				}
			clearConsole();
			}
		}
		
	public static void AddNewStudentMarks(){// [2] Add New Student with Marks
		char option = 'y';
		while(option == 'y'){
			System.out.println("*----------------------------------------------------------------------------------------------------------------*");	
			System.out.println("|					ADD NEW STUDENT WITH MARKS"+"\t\t\t\t\t 	 |");
			System.out.println("*----------------------------------------------------------------------------------------------------------------*");
	
			
			ExtendArray();
			
			while(true){
				System.out.print("Enter Student ID : ");
				stID [stID.length-1][0]=input.next();
				
				int count=0;
				for (int i = 0; i < stID.length-1; i++)
				{
					if(stID[stID.length-1][0] .equals (stID[i][0])){
					count++;
					}
				 
				}
				if(count==0){
					break;
					}
				else{
					System.out.println("The Student ID already Exists");
					}
			}
			System.out.print("Enter Student Name : ");
			stID[stID.length-1][1]=input.next();
			System.out.println();
			while(true){
				System.out.print("Programming Fundamentals Marks : ");
				marks[marks.length-1][0]=input.nextInt();
				
				if(marks[marks.length-1][0]<0 || marks[marks.length-1][0]>100){
					System.out.println("Invalid marks, Please Enter correct Marks.");
					System.out.println();
					}
				else{
					break;
					}
				}
				
			while(true){
				System.out.print("Database Management System Marks : ");
				marks[marks.length-1][1]=input.nextInt();
				
				if(marks[marks.length-1][1]<0 || marks[marks.length-1][1]>100){
					System.out.println("Invalid marks, Please Enter correct Marks.");
					System.out.println();
					}
				else{
					break;
					}
				}
				
				
			System.out.print("Student has been added Succefully.");
			
			
			while(true){
				System.out.print(" Do you want to add new Student(y/n) : ");
				option=input.next().charAt(0);
				
				if(option=='y' || option=='n'){
					break;
					}
				else{
					System.out.print("Invalid input");
					}
				}
			clearConsole();
			}
		}
		
	public static void AddMarks(){// [3] To get Marks
		System.out.println("*------------------------------------------------------------------------------------------------*");	
		System.out.println("|					ADD MARKS"+"\t\t\t\t\t 	 |");
		System.out.println("*------------------------------------------------------------------------------------------------*");
	
		char option = 'y';
		while(option == 'y'){
			
			char optionNew ='y';
			int idNum = -1;
			while(true){
				System.out.println();
				System.out.print("Enter Student ID : ");
				String id = input.next();
				
				for (int i = 0; i < stID.length; i++)
				{
					if(id .equals (stID[i][0])){
						idNum = i;
						}
				}
				if(idNum==-1){
					System.out.print("Invalid Student ID : ");
					
					while(true){
						System.out.print("Do you want to search again?(y/n) : ");
						optionNew = input.next().charAt(0);
						
						if(optionNew =='y' || optionNew =='n'){
							break;
							}
							else{
								System.out.println("Invalid Option.");
								}
						}
					}
					else{
						System.out.println("Studnet Name : "+ stID[idNum][1]);
						break;
						}
						
					if(optionNew =='n'){
						break;
						}
				}
				if(optionNew =='n'){
					break;
					}
				else if(marks[idNum][0]!=0 && marks[idNum][1]!=0){
					System.out.println("This student's marks have been already added.\nIf you want to update the marks, please use [5] Update marks option.\n");

				while(true){
					System.out.print("Do you want to add marks for another student (y/n) : ");
					option=input.next().charAt(0);
					
					if(option=='y' || option=='n'){
					break;
					}
				else{
					System.out.print("Invalid Option");
					}
				}
				}else{
					
					while(true){
					System.out.println();
					System.out.print("Programming Fundamentals Marks : ");
					marks[idNum][0]=input.nextInt();
				
					if(marks[idNum][0]<0 || marks[idNum][0]>100){
					System.out.println();
					System.out.println("Invalid marks. Please Enter valid Marks.");
					}
				else{
					break;
					}
				}
				while(true){
				System.out.print("Database Management System Marks : ");
				marks[idNum][1]=input.nextInt();
				
				if(marks[idNum][1]<0 || marks[idNum][1]>100){
					System.out.println("Invalid marks, Please Enter correct Marks.");
					}
				else{
					break;
					}
				}
				
			System.out.print("Marks have been added.");
			
			while(true){
				System.out.print(" Do you want to add marks for another student? (y/n) : ");
				option = input.next().charAt(0);
				
				if(option=='y' || option=='n'){
					break;
					}
				else{
					System.out.print("Invalid option");
					}
				}
			
				}
			}
			clearConsole();
		}
	
	public static void UpdateStudentDetails(){ // [4] Update Student Details
		System.out.println("*--------------------------------------------------------------------------------------------------------*");	
		System.out.println("|					update student details"+"\t\t\t\t\t 	 |");
		System.out.println("*--------------------------------------------------------------------------------------------------------*");
		
		char option = 'y';
		while(option == 'y'){
			
			char optionNew ='y';
			int idNum = -1;
			while(optionNew=='y'){
				System.out.print("Enter Student ID : ");
				String id = input.next();
				
				for (int i = 0; i < stID.length; i++)
				{
					if(id .equals (stID[i][0])){
						idNum = i;
						}
				}
				if(idNum==-1){
					System.out.print("Invalid Student ID : ");
					
					while(true){
						System.out.print("Do you want to search again?(y/n) : ");
						optionNew = input.next().charAt(0);
						
						if(optionNew =='y' || optionNew =='n'){
							break;
							}
							else{
								System.out.println("Invalid Option.");
								}
						    }
					    }
						else{
						System.out.println("Studnet Name : "+ stID[idNum][1]);
						break;
						}
						
					if(optionNew =='n'){
						break;
						}
				}
				if(optionNew =='n'){
					break;
					}
				
				System.out.println();	
				System.out.print("Enter new Student Name : ");
				stID[idNum][1]=input.next();
				
				System.out.println();
				System.out.println("Student details has been Updatd Successfully.");
				
				while(true){
					System.out.print("Do you want to update another student details?(y/n) : ");
					option=input.next().charAt(0);
					
					if(option =='y'|| option =='n'){
						break;
						}
					else{
						System.out.print("Invalid Option.");
						}
					  }
					}
				clearConsole();
		}
		
	public static void UpdateMarks(){ // [5] Update Marks
		System.out.println("*------------------------------------------------------------------------------------------------*");	
		System.out.println("|					update Marks"+"\t\t\t\t\t 	 |");
		System.out.println("*------------------------------------------------------------------------------------------------*");
		
		char option = 'y';
		while(option == 'y'){
			
			char optionNew ='y';
			int idNum = -1;
			while(optionNew=='y'){
				System.out.println();
				System.out.print("Enter Student ID : ");
				String id = input.next();
				
				for (int i = 0; i < stID.length; i++)
				{
					if(id .equals (stID[i][0])){
						idNum = i;
						}
				}
				
				if(idNum==-1){
					System.out.print("Invalid Student ID : ");
					
					while(true){
						System.out.print("Do you want to search again?(y/n) : ");
						optionNew = input.next().charAt(0);
						
						if(optionNew =='y' || optionNew =='n'){
							break;
							}
							else{
								System.out.println("Invalid Option.");
								}
						    }
					    }
					else if(marks[idNum][0]==0 && marks[idNum][1]==0){
						System.out.print("This student marks yet to be added.");
						
						while(true){
							System.out.print("Do you want to search again?(y/n) : ");
							optionNew=input.next().charAt(0);
							
							if(optionNew == 'y' || optionNew =='n'){
								break;
								}
							else{
								System.out.print("Invalid Option.");
								}
							}
						}else{
							System.out.println("Student Name : "+stID[idNum][1]);
							System.out.println();
							System.out.println("Programmin Fundamentals Marks : "+marks[idNum][0]);
							System.out.println("Database Management System Marks : "+marks[idNum][1]);
							
							break;
							}
						}
						if(optionNew =='n'){
							break;
							}
							
						while(true){
							System.out.println();
							System.out.print("Enter new Programming Fundamentals Marks : ");
							marks[idNum][0]=input.nextInt();
							
							if(marks[idNum][1]<0 || marks[idNum][1]>100){
							System.out.println("Invalid marks. Please Enter valid Marks.");
							}
							else{
							break;
							}
						}
					
					while(true){
						System.out.print("Enter new Database Management System Marks : ");
						marks[idNum][1]=input.nextInt();
				
						if(marks[idNum][1]<0 || marks[idNum][1]>100){
						System.out.println("Invalid marks. Please Enter valid Marks.");
						}
					else{
					break;
					}
				}
				
				System.out.println("Marks have been updated Successfully.");
				
				while(true){
					System.out.print("Do you want to update marks for another student?(y/n) : ");
					option=input.next().charAt(0);
					
					if(option =='y' || option =='n'){
						break;
						}
					else{
						System.out.print("Invalid option.");
						}
					}
				}
					clearConsole();
		}
		
	public static void DeleteStudent(){ // [6] Delete Student
		System.out.println("*------------------------------------------------------------------------------------------------*");	
		System.out.println("|					Delete Student"+"\t\t\t\t\t 	 |");
		System.out.println("*------------------------------------------------------------------------------------------------*");
		
		char option='y';
		while(option == 'y'){
			
			int idNum=-1;
			System.out.println();
			System.out.print("Enter Student ID : ");
			String id = input.next();
			
			for (int i = 0; i < stID.length; i++)
			{
				if(id .equals (stID[i][0])){
					idNum=i;
					}
			}
			if(idNum==-1){
				System.out.print("Invalid Student ID.");
				
				while(true){
					System.out.print("Do you want to search again?(y/n) : ");
					option =input.next().charAt(0);
					
					if(option =='y' || option =='n'){
						break;
						}
					else{
						System.out.print("Invalid Option.");
						}
					}
				}
				else{
					String [][]tempStID = new String[stID.length][2];
					int[][] tempMarks = new int[stID.length][2];
					
					for (int i = 0; i < stID.length; i++)
					{
						for (int j = 0; j < stID[i].length; j++)
						{
							if(idNum!=i){
								tempStID[i][j]=stID[i][j];
								tempMarks[i][j]=marks[i][j];
								}
						}
						
					}
					stID=tempStID;
					marks=tempMarks;
					
					System.out.println("Student has been deleted successfully.");
					
					while(true){
						System.out.print("Do you want to delete another studdent(y/n)?");
						option=input.next().charAt(0);
						
						if(option =='y' || option =='n'){
							break;
							}
						else{
							System.out.print("Invalid option.");
							}
						}
					}
			}
			clearConsole();
		}
		
	public static void PrintStudentDetails(){ // [7] Print Student Details
		char option = 'y';
		while(option == 'y'){
			System.out.println("*--------------------------------------------------------------------------------------------------------*");	
			System.out.println("|					PRINT STUDENT DETAILS"+"\t\t\t\t\t 	 |");
			System.out.println("*--------------------------------------------------------------------------------------------------------*");
		
		int idNum=-1;
			
			System.out.print("Enter Student ID : ");
			String id = input.next();
			
			for (int i = 0; i < stID.length; i++)
			{
				if(id .equals (stID[i][0])){
					idNum=i;
					}
			}
			if(idNum==-1){
				System.out.print("Invalid Student ID.");
				
				while(true){
					System.out.print("Do you want to search again?(y/n) : ");
					option =input.next().charAt(0);
					
					if(option =='y' || option =='n'){
						break;
						}
					else{
						System.out.print("Invalid Option.");
						}
					}
				}
				else{
					System.out.println("Student Name : "+stID[idNum][1]);
						if(marks[idNum][0]==0 && marks[idNum][1]==0){
						System.out.println("Marks yet to be added.");
						}
					else{
					System.out.println("+---------------------------------------+----------------+");
					System.out.println("|Programming Fundamnetal Marks 		|              "+marks[idNum][0]+"|");
					System.out.println("|Database Management System Marks  	|              "+marks[idNum][1]+"|");
				
					int []total = total();
					System.out.println("|Total Marks                   		|             "+total[idNum]+"|");
					
					double []avg = avg();
					System.out.println("|Avg. Marks                    		|            "+avg[idNum]+"|");
					
					String rank = rankPosition(idNum);
					System.out.println("|Rank                          		|"+(rankPosition(idNum))+"|");
		
					System.out.println("+---------------------------------------+----------------+");
					System.out.println();
					}
					
					while(true){
					System.out.print("Do you want to search another student details?(y/n) : ");
					option=input.next().charAt (0);
							
					if(option =='y' ||option =='n'){
						break;
					}else{
						System.out.print("Invalid option.");
						}
					}
				}
				
			clearConsole();	
			}
		}
		
	public static void PrintStudentMarks(){ // [8] Print Student Ranks
		System.out.println("*--------------------------------------------------------------------------------------------------------*");	
		System.out.println("|					PRINT STUDENT'S RANKS"+"\t\t\t\t\t 	 |");
		System.out.println("*--------------------------------------------------------------------------------------------------------*");
		
		System.out.println();
		
		System.out.println("+--------+-----+------------------+--------------+-------------+");
		System.out.println("|Rank    |ID   |Name              |Total Marks   |Avg. Marks   |");
		System.out.println("+--------+-----+------------------+--------------+-------------+");
		
		double []desc = AvgDescending();
		int[] total =totalDesc();
		String[][] tempstID = stIDDescending();
		
		for (int i = 0; i < desc.length; i++){
			if(desc[i]!=0){
				System.out.println("|"+(i+1)+"       |"+tempstID[i][0]+" |"+tempstID[i][1]+"             |           "+total[i]+"|         "+desc[i]+"|");
				}
		}
				
				System.out.println("+--------+-----+------------------+--------------+-------------+");
				System.out.println();
	
	char option='y';
	while(true){
		System.out.print("Do you want to go back to main menu?(y/n) : ");
		option=input.next().charAt(0);
		
		if(option =='y'){
		break;
		}
		else if(option =='n'){
		System.out.println();
		}
		else{
		System.out.print("Invalid Option.");
		}
	}
	
	if(option =='y'){
			clearConsole();
			}
		
	}
	
	public static void BestInPRF(){ // [9] Best in Programming Fundamentals
		System.out.println("*----------------------------------------------------------------------------------------------------------------*");	
		System.out.println("|					BEST IN PROGRAMMING FUNDAMENTALS"+"\t\t\t\t	 |");
		System.out.println("*----------------------------------------------------------------------------------------------------------------*");
		
		System.out.println();
		
		System.out.println("+-----+------------------+--------------+-------------+");
		System.out.println("|ID   |Name              |PRF Marks     |DBMS Marks   |");
		System.out.println("+-----+------------------+--------------+-------------+");
		
		int [][] desc = prfDescending();
		String [][] tempstID = stIDDescending();
		
		for (int i = 0; i < desc.length; i++){
			if(desc[i][0]!=0 && desc[i][1]!=0){
				System.out.println("|"+tempstID[i][0]+" |"+tempstID[i][1]+"             |"+desc[i][0]+"            |"+desc[i][1]+"           |");
				}
		}
		System.out.println("+-----+------------------+--------------+-------------+");
		System.out.println();
		
		char option='y';
		while(true){
			System.out.print("Do you want to go back to main menu(y/n)?");
			option=input.next().charAt (0);
			
		if(option =='y'){
				break;
			}else if(option =='n'){
				System.out.println();
			}else{
				System.out.print("Invalid option.");
				}
			}
		
		if(option =='y'){
			clearConsole();
			}
		}
		
	public static void BestInDBMS(){// [10] Best in Database Management System
		System.out.println("*----------------------------------------------------------------------------------------------------------------*");	
		System.out.println("|					BEST IN DATABASE MANAGEMENT SYSTEM"+"\t\t\t\t 	 |");
		System.out.println("*----------------------------------------------------------------------------------------------------------------*");
		
		System.out.println();
		
		System.out.println("+-----+------------------+--------------+-------------+");
		System.out.println("|ID   |Name              |PRF Marks     |DBMS Marks   |");
		System.out.println("+-----+------------------+--------------+-------------+");
		
		int [][] desc = dbmsDescending();
		String [][] tempstID = stIDDescending();
		
		for (int i = 0; i < desc.length; i++){
			if(desc[i][0]!=0 && desc[i][1]!=0){
				System.out.println("|"+tempstID[i][0]+" |"+tempstID[i][1]+"             |"+desc[i][0]+"            |"+desc[i][1]+"           |");
				}
		}
		System.out.println("+-----+------------------+--------------+-------------+");
		System.out.println();
		
		char option='y';
		while(true){
			System.out.print("Do you want to go back to main menu(y/n)?");
			option=input.next().charAt (0);
			
		if(option =='y'){
				break;
			}else if(option =='n'){
				System.out.println();
			}else{
				System.out.print("Invalid option.");
				}
			}
		
		if(option =='y'){
			clearConsole();
			}
		}
	
		
	public static int[] total(){ // to get total
		int []total = new int[marks.length];
			for (int i = 0; i < total.length; i++)
				{
				total[i]=marks[i][0]+marks[i][1];
				}
			return total;
	}
	
	public static double[] avg(){ // to get average
		int []total = total();
		double []avg = new double[marks.length];
			for (int i = 0; i < avg.length; i++)
				{
				avg[i]=(double)total[i]/2;
				}
		return avg;	
	}
	
	public static double[] AvgDescending(){ // to get descending order of average
	double []desc = avg();
	
	for (int i = 0; i < desc.length-1; i++){
		for (int j = 0; j < desc.length-1; j++){
			if(desc[j]<desc[j+1]){
				double temp = desc[j];
				desc[j]=desc[j+1];
				desc[j+1]=temp;
				}
							
			}	
		}
		return desc;
	}
	
	public static int[] totalDesc(){ // to get descending order of total
		int total[] = total();
		
		for (int i = 0; i < total.length-1; i++){
			for (int j = 0; j < total.length-1; j++){
				if(total[j]<total[j+1]){
					int temp = total[j];
					total[j] = total[j+1];
					total[j+1]=temp;
					}
			}
			
		}
		return total;
		}
	
	public static String rankPosition(int index){ // to get Student ID's rank
		double []desc = AvgDescending();
		double []avg = avg();
		
		int rankNum=0;				 
		for (int i = 0; i < desc.length; i++){
			if(avg[index]==desc[i]){
				rankNum=i+1;
			}
		}
						
		String rank="null";
		if(desc[desc.length-1]==avg[index]){
		rank="         "+rankNum+"(Last)";
		}
			else{
				switch (rankNum){
				case 1:
				rank="        "+rankNum+"(First)";
				break;
				case 2:
				rank="       "+rankNum+"(Second)";
				break;
				case 3:
				rank="        "+rankNum+"(Third)";
				break;
							
				default :
				rank="      "+rankNum+"("+rankNum+"th)";
				}
			}
			return rank;
		}
	
	public static String[][] stIDDescending(){ // to get descending order of student ID acording to average
		double []desc = AvgDescending();
		double []avg = avg();
		String [][] tempstID = new String[desc.length][2];
		
		for (int i = 0; i < desc.length; i++){
			for (int j = 0; j < avg.length; j++){
				if(desc[i]==avg[j]){
					tempstID[i][0] = stID[j][0];
					tempstID[i][1] = stID[j][1];
					}
				}
			}
		return tempstID;
		}
		
	
	public static int[][] prfDescending(){ // to get descending order of PRF marks
		int [][]desc = new int[marks.length][2];
		
		for (int i = 0; i < desc.length; i++){
			desc[i][0]=marks[i][0];
		}
		
		for (int i = 0; i < desc.length-1; i++){
			for (int j = 0; j < desc.length-1; j++){
				if(desc[j][0]<desc[j+1][0]){
					int temp = desc[j][0];
					desc[j][0]=desc[j+1][0];
					desc[j+1][0]=temp;
				}
			}		
		}
		
		for (int i = 0; i < desc.length; i++){
			for (int j = 0; j < desc.length; j++){
				if(desc[i][0]==marks[j][0]){
					desc[i][1]=marks[j][1];
				}
			}
		}
		return desc;		
		}
		
	
	public static String[][] StIDDescendingPRF(){	//arrange SID descending order according to PRF marks
		int[][] desc=prfDescending();
		String[][] tempstID=new String[desc.length][2];
			
		for (int i = 0; i < desc.length; i++){
			for(int j = 0; j < desc.length; j++){
				if(desc[i][0]==marks[j][0]){
					tempstID[i][0]=stID[j][0];
					tempstID[i][1]=stID[j][1];
					}
					
				}
			}
			return tempstID;
		}
		
	public static int[][] dbmsDescending(){ // to get descending order of DBMS marks
		int [][]desc = new int[marks.length][2];
		
		for (int i = 0; i < desc.length; i++){
			desc[i][1]=marks[i][1];
		}
		
		for (int i = 0; i < desc.length-1; i++){
			for (int j = 0; j < desc.length-1; j++){
				if(desc[j][1]<desc[j+1][1]){
					int temp = desc[j][1];
					desc[j][1]=desc[j+1][1];
					desc[j+1][1]=temp;
				}
			}		
		}
		
		for (int i = 0; i < desc.length; i++){
			for (int j = 0; j < desc.length; j++){
				if(desc[i][1]==marks[j][1]){ 
					desc[i][0]=marks[j][0];
				}
			}
		}
		return desc;		
		}
		
	public static String[][] StIDDescendingDBMS(){	//arrange SID descending order according to DBMS marks
		int[][] desc=dbmsDescending();
		String[][] tempstID=new String[desc.length][2];
			
		for (int i = 0; i < desc.length; i++){
			for(int j = 0; j < desc.length; j++){
				if(desc[i][1]==marks[j][1]){
					tempstID[i][0]=stID[j][0];
					tempstID[i][1]=stID[j][1];
					}
					
				}
			}
			return tempstID;
		}
	
					
	public final static void clearConsole() { // method to clear diplaying iteams
		try {
			final String os = System.getProperty("os.name"); 
			if (os.contains("Windows")) {
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			} else {
				System.out.print("\033[H\033[2J"); 
				System.out.flush();
				}
			} catch (final Exception e) {
			e.printStackTrace();
			// Handle any exceptions.
			}
		}
		
	public static void ExtendArray(){ // to get Array increment
		String [][] tempstID = new String [stID.length+1][2];
		int [][] tempMarks = new int [stID.length+1][2];
		
		for (int i = 0; i < stID.length; i++)
		{
			for (int j = 0; j < stID[i].length; j++)
			{
				tempstID[i][j] = stID[i][j];
				tempMarks[i][j] = marks[i][j];
			}	
		}
		stID=tempstID;
		marks=tempMarks;
		}
	}
	
		
		


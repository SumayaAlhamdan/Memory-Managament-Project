package projectOS;

import java.util.Scanner;

public class ProjectMain {
	
	public static void main(String [] args) {
		
		Scanner read = new Scanner( System.in );
		int M;
		char alo;
		int Start ;
		int End ; 
		Process array[];
		
		System.out.println("Enter number of partitions: ");
		M = read.nextInt();
		array=new Process[M];

		int start=0; //50
		
		for( int i = 0 ; i < M ; i++) {
		System.out.println("Enter the size of partition " + (i+1) + " in KB: ");
		int s = read.nextInt(); //50
		int end= start+s-1; //49  74
		//set size of partition here
		array[i]=new Process(s,start,end);
		start=end+1; //75

		}
		
		System.out.println("Enter allocation strategy ( F:First-fit , B:Best-fit, W;Worst-fit ): ");
		alo = read.next().charAt(0);
		
		//create memory first 
		
		int x;
		do {
			System.out.println("How do you want to manage your memory?");
			System.out.println("(1) Allocate a block of memory.");
			System.out.println("(2) De-allocate a block of memory.");
			System.out.println("(3) Report detailed information about regions of free and allocated memory blocks.");
			System.out.println("(4) Exit.");
			x = read.nextInt();
			
			switch(x) {
			
			case 1:
				// input process ID 
				System.out.println("Enter ID of process: ");
				String PID = read.next();
				// input process size
				System.out.println("Enter the size of process: ");
				int SP = read.nextInt();
				// intialize process
				Process process = new Process(SP, /*start and end addresses*/  ) ; 
				//allocating method
				break;
			case 2:
				// input process ID to de allocate 
				System.out.println("Enter ID of process: ");
				String PID = read.next();
				//de-allocating method
				break;
			case 3:
				// display 
				//reporting method
				break;
			}//switch

		
		}while(x!=4);
		
	}//main

}//class
//test commit
//testttt 

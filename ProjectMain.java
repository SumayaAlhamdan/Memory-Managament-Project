package projectOS;

import java.util.Scanner;

public class ProjectMain {
	
	public static void main(String [] args) {
		
		Scanner read = new Scanner( System.in );
		int M;
		char alo;
		Process array[];
		
		System.out.println("Enter number of partitions: ");
		M = read.nextInt();
		array=new Process[M];

		int start=0;
		
		for( int i = 0 ; i < M ; i++) {
		System.out.println("Enter the size of partition " + (i+1) + " in KB: ");
		int s = read.nextInt();
		int end= start+s;
		//set size of partition here
		array[i]=new Process(s,start,end);
		start=end+1;

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
				//allocating method
				break;
			case 2:
				//de-allocating method
				break;
			case 3:
				//reporting method
				break;
			}//switch

		
		}while(x!=4);
		
	}//main

}//class
//test commit
//testttt

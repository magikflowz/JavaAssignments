/*	Programming Assignment 6. CSET 1200. 
*	University of Toledo.
*	Instructor: Jared Oluoch, Ph.D.
*	Due Date: Monday October 18, 2021 at 11:59 PM.
*	Total Points: 20
*

/*	Your program must compile and run to get credit. 
*	If your program does not compile, you may get 0. 
*	If you copy from your classmate, both of you get 0. 
*	If you copy from a website, you get 0.

*	Your program must have the following information at the top. 

# Name : Anthony Urbina

# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 5

# Date: 10/17/2021

# Summary: A brief description of what the program does

# The TA for this class is Bibek Poudel (bibek.poudel@rockets.utoledo.edu).
  Please reach out to him if you have questions about the assignment.
  
# You must put this line as a comment at the top of your Java source file. 
â€œThis code is my own work. I did not get any help from any online source 
such as chegg.com; from a classmate, or any other person other than the instructor 
or TA for this course. I understand that getting outside help from this course 
other than from the instructor or TA will result in a grade of 0 in this 
assignment and other disciplinary actions for academic dishonesty.â€  



import java.util.*;

public class assignment6 {
    public static void main(String[] args){
        
        Integer[] gas = new Integer[12];
        Integer[] internet = new Integer[12];

        Scanner keyboard = new Scanner(System.in);

        for (int i=0; i<12; i++){

            System.out.println("What is your gas bill for month " + (i+1) + ":");
            gas[i] = keyboard.nextInt();

        }
        
        System.out.println();
        System.out.println("The minimum for the gas bill was $" + getmin(gas));
        System.out.println("The maximum for the gas bill was $" + getmax(gas));
        System.out.println("The average for the gas bill was $" + getavg(gas));
        System.out.println("The amount of bills below the minimum was " + underavg(gas));
        System.out.println();
        
        for (int i=0; i<12; i++){

            System.out.println("What is your internet bill for month " + (i+1) + ":");
            internet[i] = keyboard.nextInt();
            
        }
        
        System.out.println();
        System.out.println("The minimum for the internet bill was $" + getmin(internet));
        System.out.println("The maximum for the internet was $" + getmax(internet));
        System.out.println("The average for the internet was $" + getavg(internet));
        System.out.println("The amount of bills below the minimum was " + underavg(internet));
        System.out.println();

    }

    public static int getmin(Integer[] bill){
        return Collections.min(Arrays.asList(bill));
    }
    public static int getmax(Integer[] bill){
        return Collections.max(Arrays.asList(bill));
    }
    
    public static int getavg(Integer[] bill) {
    	
    	int total = 0;
    	
    	for (int i = 0; i<12; i++) {
    		total += bill[i];
    	}
    	
    	int average = total / bill.length;
    	return average;
    }
    
    public static int underavg(Integer[] bill) {
    	int average = getavg(bill);
    	int count = 0;
    	
    	for (int i=0; i<12; i++) {
    		if(bill[i] < average) {
    			count++;
    		}
    	}
    	
    	return count;
    }
}
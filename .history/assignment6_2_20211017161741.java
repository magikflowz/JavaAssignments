/*	Programming Assignment 6. CSET 1200. 
*	University of Toledo.
*	Instructor: Jared Oluoch, Ph.D.
*	Due Date: Monday October 18, 2021 at 11:59 PM.
*	Total Points: 20
*

*	Your program must compile and run to get credit. 
*	If your program does not compile, you may get 0. 
*	If you copy from your classmate, both of you get 0. 
*	If you copy from a website, you get 0.

*	Your program must have the following information at the top. 

# Name : Anthony Urbina

# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 5

# Date: 10-17-2021

# Summary: A brief description of what the program does

# The TA for this class is Bibek Poudel (bibek.poudel@rockets.utoledo.edu).
  Please reach out to him if you have questions about the assignment.
  
# You must put this line as a comment at the top of your Java source file. 
â€œThis code is my own work. I did not get any help from any online source 
such as chegg.com; from a classmate, or any other person other than the instructor 
or TA for this course. I understand that getting outside help from this course 
other than from the instructor or TA will result in a grade of 0 in this 
assignment and other disciplinary actions for academic dishonesty.â€  

**/

import java.util.*;


public class assignment6_2 {


    void sort(int arr[])
    {
        int n = arr.length;
 
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
 
    // Prints the array
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
 
    // Driver code to test above
    public static void main(String args[]){
    	Random random = new Random();
    	int arr[]= {0, 0 ,0 ,0, 0, 0, 0, 0, 0, 0};
    	
    	for(int i=0; i<10; i++) {
    		arr[i] = random.nextInt((87-12) + 1) +12;
    	}

	System.out.println("Before selection sort: ")
	printArray(arr);
	
	sort(arr);
	System.out.println("After selection sort: ")
	printArray(arr);
}
}


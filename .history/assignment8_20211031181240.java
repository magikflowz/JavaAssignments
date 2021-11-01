/*	Programming Assignment 8. CSET 1200. 
*	University of Toledo.
*	Instructor: Jared Oluoch, Ph.D.
*	Due Date:  Sunday October 31, 2021 at 11:59 PM.
*	Total Points:20
*/

/*	Your program must compile and run to get credit. 
*	If your program does not compile, you may get 0. 
*	If you copy from your classmate, both of you get 0. 
*	If you copy from a website, you get 0.

*	Your program must have the following information at the top. 

# Name : Your First and Last Name

# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 8

# Date: MMDDYY

# Summary: A brief description of what the program does.

# You must put this line as a comment at the top of your Java source file. 
â€œThis code is my own work. I did not get any help from any online source 
such as chegg.com; from a classmate, or any other person other than the instructor 
or TA for this course. I understand that getting outside help from this course 
other than from the instructor or TA will result in a grade of 0 in this 
assignment and other disciplinary actions for academic dishonesty.â€  

*/

import java.util.*;

public class assignment8{
    public static  void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        String Name;
        int Income;
        String Status;
        taxFiling taxInfo = new taxFiling();

        System.out.print("What is your name: ");
        taxInfo.nametaxFiling = keyboard.next();
        System.out.println("What is annual income: ");
        taxInfo.IncometaxFiling = keyboard.nextInt();
        System.out.println("Enter 0 - Single, '\n' 2 - head of household '\n' 3 - married filling jointly '\n' 4 - married filling '\n' Enter your option: ");
        StatustaxFiling.Status = keyboard.next();

        




    }
}
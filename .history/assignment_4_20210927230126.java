/*	Programming Assignment 4. CSET 1200. 
*	University of Toledo.
*	Instructor: Jared Oluoch, Ph.D.
*	Due Date: Sunday October 3, 2021 at 11:59 PM.
*	Total Points: 20
*/

/*	Your program must compile and run to get credit. 
*	If your program does not compile, you may get 0. 
*	If you copy from your classmate, both of you get 0. 
*	If you copy from a website, you get 0.

*	Your program must have the following information at the top. 

# Name : Anthony Urbina

# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 4

# Date: 09/27/2021

# Summary: A brief description of what the program does

# The TA for this class is Bibek Poudel (bibek.poudel@rockets.utoledo.edu).
  Please reach out to him if you have questions about the assignment.
  
# You must put this line as a comment at the top of your Java source file. 
â€œThis code is my own work. I did not get any help from any online source 
such as chegg.com; from a classmate, or any other person other than the instructor 
or TA for this course. I understand that getting outside help from this course 
other than from the instructor or TA will result in a grade of 0 in this 
assignment and other disciplinary actions for academic dishonesty.â€  
*/

import java.util.*;

public class assignment_4 {
    
    public static void main(String[] args){
    
    Boolean counter;
    Scanner keyboardInput = new Scanner(System.in);
    String answer;
    int scoreAnswer;
    List<String> studentName = new ArrayList<>();
    int numberofStudents = studentName.size();
    List<Integer> studentScore = new ArrayList<>();
    List<Integer> failedStudents = new ArrayList<>();
    int failedTest = failedStudents.size();
    String choice = "yes";

    while(choice.equals("yes")){

        System.out.print("Enter your name: ");
        answer = keyboardInput.next();
        studentName.add(answer);
        System.out.print("Enter your score: ");
        scoreAnswer = keyboardInput.nextInt();
        studentScore.add(scoreAnswer);
        keyboardInput.nextLine();
        System.out.print("Do you want to add another student yes or no: ");
        choice = keyboardInput.next();

    }
    for(int x: studentScore){

        

    }
    }
    }


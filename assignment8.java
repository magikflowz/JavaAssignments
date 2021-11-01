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
import java.io.*;
import java.util.*;

public class assignment8{

    public static void Single(String Name, int Income){

        double tax = 0;

        if(Income >=0 && Income <= 9750){
            tax = .1;
        }
        if(Income >= 9701 && Income <=39475){
            tax = .12;
        }
        if(Income >= 39476 && Income <= 82200){
            tax = .22;
        }
        if(Income >= 82201 && Income <= 160725){
            tax = .24;
        }
        if(Income >= 160726 && Income <= 204100){
            tax = .32;
        }        
        if(Income >= 204101 && Income <= 510300){
            tax = .35;
        }        
        if(Income >= 510301){
            tax = .37;
        }   

        tax = (Income/100)*tax;
        System.out.print(Name +", the federal income tax for an annual salary of "+Income+" for single status "+tax);
    }

    public static void headofHousehold(String Name, int Income){
        

        double tax = 0;
        if(Income >= 0 && Income <= 13850){
            tax = .1;
        }
        if(Income >= 13851 && Income <= 52850){
            tax = .12;
        }
        if(Income >= 52851 && Income <= 84200){
            tax = .22;
        }
        if(Income >= 84201 && Income <= 160700){
            tax = .24;
        }
        if(Income >= 160701 && Income <= 204100){
            tax = .32;
        }        
        if(Income >= 204101 && Income <= 510300){
            tax = .35;
        }        
        if(Income >= 510301){
            tax = .37;
        }
        
        tax = (Income/100)*tax;
        System.out.print(Name +", the federal income tax for an annual salary of " +Income+" for head household status "+tax);
    }


    public static void marriedJointly(String Name, int Income){
       
        double tax = 0;
        if(Income >=0 && Income<=19400){
            tax = .1;
        }
        if(Income >= 19401 && Income <= 78950){
            tax = .12;
        }
        if(Income >= 78951 && Income <= 168400){
            tax = .22;
        }
        if(Income >= 168401 && Income <= 321450){
            tax = .24;
        }
    if(Income >= 321451 && Income<=408200){
            tax = .32;
    }        
    if(Income >= 408201 && Income<=612350){
            tax = .35;
    }        
    if(Income >= 612351){
            tax = .37;
    }        
    tax = (Income/100)*tax;
    System.out.print(Name +", the federal income tax for an annual salary of "+Income+" for married jontly status "+tax);
    }

    public static void marriedSeparately(String Name, int Income){ 
        double tax = 0;
        if(Income >=0 && Income <= 9700){
            tax = .1;
        }
        if(Income >= 9701 && Income <= 39475){
            tax = .12;
        }
        if(Income >= 39476 && Income <= 84200){
            tax = .22;
        }
        if(Income >= 84201 && Income <= 160725){
            tax = .24;
        }
        if(Income >= 160726 && Income <= 204100){
            tax = .32;
        }        
        if(Income >= 204101 && Income <= 306175){
            tax = .35;
        }        
        if(Income >= 306176){
            tax = .37;
        } 
        tax = (Income/100)*tax;
        System.out.println(Name+", the federal income tax for an annual salary of "+Income+" for a married separate status filer is "+tax);
}
    public static  void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        String Name;
        int Income;
        String Status;
        
        System.out.print("What is your name: ");
        Name = keyboard.next();
        System.out.print("What is annual income: ");
        Income = keyboard.nextInt();
        System.out.print("Enter 0 - Single, '\n' 2 - head of household '\n' 3 - married filling jointly '\n' 4 - married filling '\n' Enter your option: ");
        Status = keyboard.next();
        

        if(Status.equals("0")){
            System.out.println("test complete");
            Single(Name, Income);
        }

        else if (Status.equals("2")){
            headofHousehold(Name, Income);
        }

        else if(Status.equals("3")){
            marriedJointly(Name, Income);
        }

        else if(Status.equals("4")){
            marriedSeparately(Name, Income);
        }
    }
}
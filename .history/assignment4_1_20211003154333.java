/*  Programming Assignment 4. CSET 1200. 
*   University of Toledo.
*   Instructor: Jared Oluoch, Ph.D.
*   Due Date: Sunday October 3, 2021 at 11:59 PM.
*   Total Points: 20
*/

/*  Your program must compile and run to get credit. 
*   If your program does not compile, you may get 0. 
*   If you copy from your classmate, both of you get 0. 
*   If you copy from a website, you get 0.

*   Your program must have the following information at the top. 

# Name : Your First and Last Name

# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 4

# Date: MMDDYY

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

public class assignment4_1 {

    
    public static void main(String[] args){

        double strawberry = 5.25;
        double pineapple = 4.15;
        double mango = 6.12;
        double banana = 5.00;
        double spinach = 3.13;
        double kale = 4.33;

        String[] smoothies = new String[6];
        smoothies[0] = "Strawberry: $5.25";
        smoothies[1] = "Pineapple: $4.15";
        smoothies[2] = "Mango: $6.12";
        smoothies[3] = "Banana $5.00";
        smoothies[4] = "Spinach $3.13";
        smoothies[5] = "Kale: $4.33";

        ArrayList<Double> itemSelected = new ArrayList<>();

        ArrayList<String> itemNames = new ArrayList<>();

        Scanner keyboardInput = new Scanner(System.in);
        String name;
        String selected;

        for (String x: smoothies){

            System.out.println(x);
        }

        System.out.print("Please enter your name: ");
        name = keyboardInput.nextLine();
        
        while(true){
            System.out.println(itemSelected);
            System.out.print("Please, select a smoother from the list or enter 0 to stop: ");
            selected = keyboardInput.nextLine();
            selected.toLowerCase();

            if (selected.equals("strawberry")){
            itemNames.add("strawberry");
            itemSelected.add(strawberry);    
            }

            if (selected.equals("pineapple")){
            itemNames.add("pineapple");
            itemSelected.add(pineapple);    
            }

            if (selected.equals("mango")){
            itemNames.add("mango");
            itemSelected.add(mango);    
            }

            if (selected.equals("banana")){
            itemNames.add("banana");
            itemSelected.add(banana);    
            }

            if (selected.equals("spinach")){
            itemNames.add("spinach");
            itemSelected.add(spinach);    
            }

            if (selected.equals("kale")){
            itemNames.add("kale");
            itemSelected.add(kale);    
            }
        
            if (selected.equals("0")){
            break;
            }

        } 
        System.out.println("Dear "  + name + " you have selected: ");
        for (int i=0; i i<itemNames.size() && i<itemSelected.size(); i++){
            for (int x=i; x < itemSelected.size(); x++){
                System.out.println("Item: " + itemNames.get(x)+ "," + " $" + itemSelected.get(x));
                
        }   
        }
        double totalItemselected = itemSelected.stream().mapToDouble(f -> f.doubleValue()).sum();
        System.out.println("total: "+ totalItemselected);

    }
    
    
    
}
    
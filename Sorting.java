/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sorting;

import java.util.Scanner;
public class Sorting {

   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String[] studNo = { "cs6", "cs11", "cs1", "cs15", "cs20", "cs9", "cs8", "cs16", "cs10", "cs17", "cs2", "cs4", "cs14", "cs3", "cs13", "cs12", "cs5", "cs7", "cs19", "cs18"};
        String[] studName = {  "Emma Taylor", "Noah Johnson", "Olivia Brown", "Liam Wilson", "Ava Moore", "Mason Lee", "Isabella Clark", "Ethan Lewis", "Sophia Walker", "Jacob Hall", "Mia Allen", "Alexander Young", "Charlotte King", "James Scott", "Amelia Adams", "Benjamin Baker", "Harper Carter", "Elijah Mitchell", "Abigail Perez", "Daniel White"};
        String[] studCourse = { "course6", "course11", "course1", "course15", "course20", "course9", "course8", "course16", "course10", "course17", "course2", "course4", "course14", "course3", "course13", "course12", "course5", "course7", "course19", "course18"};
        
        
        System.out.println("DCIT 25 Activity 3 | Bubble sorting");
        System.out.println("==============================================================");
        System.out.println("Choose an option");
        System.out.println("[1] Display student record");
        System.out.println("[2] Sort student by name");
        System.out.println("[3] Exit");
        System.out.println("==============================================================");
        
        System.out.print("Enter choice: ");
        int menu_select = scan.nextInt();
        scan.nextLine();
        
        if (menu_select == 1) {
            displayTable(studNo, studName, studCourse);
           
        }
        
        else if (menu_select == 2) {
            
            sortTable(studNo, studName, studCourse);
            displayTable(studNo, studName, studCourse);
            
            
        }
        
        else if (menu_select == 3) {
            System.out.println("==============================================");
            System.out.println("Thank you for using!");
            System.out.println("==============================================");
        }
        
        else {
            System.out.println("Invalid input");
        }
    }
    
    //method to display table as is
    public static void displayTable (String[] studNo, String[] studName, String[] studCourse) {
        
         System.out.println("\n=======================================================================");
            System.out.printf("%-15s %-20s %-20s\n", "STUDENT NUMBER", "STUDENT NAME", "STUDENT COURSE");
            System.out.println("=======================================================================");
            
            for (int i = 0; i < studNo.length; i++) {
                
                System.out.printf("%-15s %-20s %-20s\n", studNo[i] , studName[i], studCourse[i]);
                System.out.println("=======================================================================");
            }

    }
    
    //method to sort table
    public static void sortTable (String[] studNo, String[] studName, String[] studCourse) {
        
        boolean swapped = true;
        String temp_studNo;
        String temp_studName;
        String temp_studCourse;
        
       
        while(swapped) {
            swapped = false;
            
            for (int i = 0; i < studName.length - 1; i++) {
                if (studName[i].compareToIgnoreCase(studName[i+1]) > 0) {
                    
                    
                    temp_studName = studName[i];
                    studName[i] = studName[i+1];
                    studName[i+1] = temp_studName;
                    
                    temp_studNo = studNo[i];
                    studNo[i] = studNo[i+1];
                    studNo[i+1] = temp_studNo;
                    
                    temp_studCourse = studCourse[i];
                    studCourse[i] = studCourse[i+1];
                    studCourse[i+1] = temp_studCourse;
                
                    swapped = true;
                }
            }
        }
        
    }
    
}




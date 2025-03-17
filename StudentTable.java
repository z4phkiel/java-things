
package studenttable;


import java.util.Scanner;
public class StudentTable {

   
  public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        
     
        int[] studentNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] studentName = {"Student 1", "Student 2", "Student 3" , "Student 4" , "Student 5", "Student 6" , "Student 7", "Student 8" , "Student 9" , "Student 10"};
        String[] studentCourse = {"Course 1", "Course 2" , "Course 3" , "Course 4" , "Course 5", "Course 6", "Course 7", "Course 8", "Course 9", "Course 10"};
        
        
        
        
        System.out.println("======================================================================");
        System.out.println("Select an option: ");
        System.out.println("MENU");
        System.out.println("[1]Display student record");
        System.out.println("[2]Search for a student record");
        System.out.println("[3]Exit");
        System.out.println("======================================================================");

        
        int selection = scan.nextInt();
        scan.nextLine();
        
             
        
        switch (selection) {
            case 1: 
                
                System.out.println("\n=============================================================");
                    System.out.printf("%-15s %-20s %-20s\n", "STUDENT NUMBER", "STUDENT NAME", "STUDENT COURSE");
                    System.out.println("=============================================================");
             
                for (int i = 0; i < studentNumber.length ; i++) {
                    
                    System.out.printf("%-15d %-20s %-20s\n", studentNumber[i], studentName[i] ,studentCourse[i]);
                    System.out.println("=========================================================================");
                    
                }
                
                System.out.println("Thanks for using! Have a great day.");
                
                scan.close();
                break;
                
                
            case 2: 
                System.out.println("=============================================================================");
                System.out.println("Search a student via student number");
                System.out.println("=============================================================================");
                System.out.print("Enter student number: ");
                int searchStudent = scan.nextInt();
                scan.nextLine();
                
                boolean isFound = false;
                
                for (int i = 0; i < studentNumber.length; i++) {
                    if (searchStudent == studentNumber[i]) {
                        System.out.println("Student with number " + searchStudent + " is listed");
                        System.out.println("Student Number: " + studentNumber[i]);
                        System.out.println("Student Name: " + studentName[i]);
                        System.out.println("Student Course: " + studentCourse[i]);
                        isFound = true;
                        break;
                        
                    } 
                }
                    
                    if (!isFound) {
                        System.out.println("The student with Student Number: " + searchStudent + " is not listed ");
                    }
                    scan.close();
                    break;
                    
                    
                
            case 3:
                System.out.println("Thanks for using!");
                break;
               
                
            default: 
                System.out.println("Entered value is not within range");
                System.out.println("Please enter a number with choices 1, 2 , 3");
        }
        
        
        
        
        
        
        
    }
}    
    


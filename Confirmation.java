/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.confirmation;

/**
 *
 * @author Vincent
 */
import java.util.Scanner;
public class Confirmation {

    private static String Name;
    private static int Age;
    private static String Course;
    
    public static void setName(String newName) {
        Name = newName;
    }
    
    public static void setAge(int newAge) {
        Age = newAge;
    }
    
    public static void setCourse(String newCourse) {
        Course = newCourse;
    }

    public static void main(String[] args) {
        
        String yes = "Yes";
        String no = "No";
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("=================================================================");
        System.out.println("Enter your information: ");
        
        System.out.print("Enter Name: ");
        Name = scan.nextLine();
        
        
        System.out.print("Enter Age: ");
        Age = scan.nextInt();
        scan.nextLine();
        
        System.out.print("Enter Course: ");
        Course = scan.nextLine();
        String courseUppercase = Course.toUpperCase();
        
        System.out.println("===================================================================");
        
        System.out.println(Name);
        System.out.println(Age);
        System.out.println(courseUppercase);
        
        System.out.println("===================================================================");
        
        System.out.println("Are the following information correct? Yes/No ");
        String confirm = scan.nextLine();
        
        if (confirm.equalsIgnoreCase(no)) {
            
            System.out.println("Select data to edit: ");
            System.out.println("1-Name");
            System.out.println("2-Age");
            System.out.println("3-Course");
            System.out.println("4-Edit all");
            int data = scan.nextInt();
            scan.nextLine();
            
            switch (data) {
                case 1: {
                    System.out.println("Old Name: " + Name.substring(0,1).toUpperCase() + Name.substring(1));
                    System.out.print("Enter new name: ");
                    String newName = scan.nextLine();
                    setName(newName);
                    System.out.println("Succesfully changed name to: " + Name);
                    
                    System.out.println("===================================================================");
        
            System.out.println(Name.substring(0,1).toUpperCase() + Name.substring(1));
            System.out.println(Age);
            System.out.println(Course.toUpperCase());
        
            System.out.println("===================================================================");
        
            System.out.println("Have a nice day :D");
            break;
                }
                
                case 2: {
                    System.out.println("Old Age: " + Age);
                    System.out.print("Enter new Age: ");
                    int newAge = scan.nextInt();
                    scan.nextLine();
                    setAge(newAge);
                    System.out.println("Succesfully changed age to: " + Age);
                    
                    System.out.println("===================================================================");
        
            System.out.println(Name.substring(0,1).toUpperCase() + Name.substring(1));
            System.out.println(Age);
            System.out.println(Course.toUpperCase());
        
            System.out.println("===================================================================");
        
            System.out.println("Have a nice day :D");
            break;
                    
                    
                }
                
                case 3: {
                    System.out.println("Old Course: " + Course);
                    System.out.print("Enter new Course: ");
                    String newCourse = scan.nextLine();
                    setCourse(newCourse);
                    
                    System.out.println("Succesfully changed course to: " + Course);
                    
                    System.out.println("===================================================================");
        
            System.out.println(Name);
            System.out.println(Age);
            System.out.println(Course.toUpperCase());
        
            System.out.println("===================================================================");
        
            System.out.println("Have a nice day :D");
            break;
                }
                
                case 4: {
                    System.out.println("===================================================================");
        
            System.out.println(Name.substring(0,1).toUpperCase() + Name.substring(1));
            System.out.println(Age);
            System.out.println(Course.toUpperCase());
        
            System.out.println("===================================================================");
        
            
                    System.out.print("Enter new name: ");
                    String newName = scan.nextLine();
                    setName(newName);
                    
                    System.out.print("Enter new Age: ");
                    int newAge = scan.nextInt();
                    scan.nextLine();
                    setAge(newAge);
                    
                    System.out.print("Enter new Course: ");
                    String newCourse = scan.nextLine();
                    setCourse(newCourse);
                    
                    System.out.println("===================================================================");

                    System.out.println("Successfully updated information.");
                    
                    System.out.println("===================================================================");
        
            System.out.println(Name.substring(0,1).toUpperCase() + Name.substring(1));
            System.out.println(Age);
            System.out.println(Course.toUpperCase());
        
            System.out.println("===================================================================");
        
            System.out.println("Have a nice day :D");
            break;
                    
           
                }
                default:
                    System.out.println("Please enter a valid number");
            }
            
        }
        
        else if (confirm.equalsIgnoreCase(yes)) {
            System.out.println("===================================================================");
        
            System.out.println(Name.substring(0,1).toUpperCase() + Name.substring(1));
            System.out.println(Age);
            System.out.println(Course.toUpperCase());
        
            System.out.println("===================================================================");
        
            System.out.println("Have a nice day :D");
        }

    }
}

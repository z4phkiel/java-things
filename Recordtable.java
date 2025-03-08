/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recordtable;

import java.util.Scanner;
public class Recordtable {

    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner(System.in);
        
        
        String[] student_name = new String[3];
        int[] student_id = new int[3];
        String[] student_course = new String[3];
        
        
        for(int i = 0; i<3;i++) {
            
            System.out.println("===========================================================");
            
            System.out.println("Enter Student " + (i+1) + " Info ");
            
            System.out.print("Enter name: ");
            student_name[i] = scan.nextLine();
            
            System.out.print("Enter student ID: ");
            student_id[i] = scan.nextInt();
            scan.nextLine();
            
            System.out.print("Enter student Course: ");
            student_course[i] = scan.nextLine();
            
            System.out.println("===========================================================");

        }
        
        
        System.out.println("\n========================================================================");
        System.out.printf(" | %-20s | %-15s | %-20s\n", "Name", "ID", "Course");
        System.out.println("==========================================================================");
        
        
        for(int i=0;i<3;i++) {
            
            System.out.printf(" | %-20s | %-15d | %-20s\n", student_name[i], student_id[i], student_course[i] );
            
            System.out.println("==========================================================================");
            
            scan.close();

            
        }
        
        
        
        
        
        
    }
}

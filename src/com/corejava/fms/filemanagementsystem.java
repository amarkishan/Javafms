package com.corejava.fms;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class filemanagementsystem {
    public static void main(String args[]) {
        Directory d = new Directory();
        
       

        while (true) 
        {	
        	Scanner sc = new Scanner(System.in);
            System.out.println("choose option");
            System.out.println("1.Create Directory");
            System.out.println("2.Remove Directory");
            System.out.println("3.Add file");
            System.out.println("4.Remove File");
            System.out.println("5.Display Files");
            System.out.println("6.Exit");

           
            int choice = sc.nextInt();
            

            switch (choice) 
            {
                
                case 1:
                	
                    d.createDirectory();
                    sc.nextLine();
                    break;
                case 2:
                    d.removeDirectory();
                    sc.nextLine();
                    break;
                case 3:
                	sc.nextLine();
                    d.addFile();
                    break;
                case 4:
                    d.removeFile();
                    sc.nextLine();
                    break;
                case 5:
                    d.display();
                    sc.nextLine();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again");
            }
        
        }
    }
}

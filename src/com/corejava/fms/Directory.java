package com.corejava.fms;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Directory {

    private String name;
    private String fullpath;

    public void createDirectory() {
        System.out.println("Enter the path where you want to create a folder");
        Scanner sc = new Scanner(System.in);
        String path = sc.next();
        System.out.println("Enter the name of the desired directory");
        name = sc.next();
        fullpath = path + File.separator + name;
        File f1 = new File(fullpath);

        if (f1.mkdir())
            System.out.println("Folder is created successfully");
        else
            System.out.println("Error: Folder cannot be created");

        sc.close();
    }

    public void removeDirectory() {
        System.out.println("Enter the full path to remove folder");
        Scanner sc = new Scanner(System.in);
        fullpath = sc.next();
        File directory = new File(fullpath);

        if (directory.exists()) {
            directory.delete();
            System.out.println("Directory is deleted successfully");
        } else
            System.out.println("Directory does not exist");

        sc.close();
    }

    public void addFile() {
        System.out.println("Enter the folder path");
        Scanner sc = new Scanner(System.in);
        fullpath = sc.next();
        System.out.println("Enter the file name");
        name = sc.next();
        fullpath = fullpath + File.separator + name;

        File file = new File(fullpath);

        try {
            if (file.createNewFile())
                System.out.println("File created successfully");
            else
                System.out.println("File already exists");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    public void removeFile() {
        System.out.println("Enter the folder path");
        Scanner sc = new Scanner(System.in);
        fullpath = sc.next();
        System.out.println("Enter the file name");
        name = sc.next();
        fullpath = fullpath + File.separator + name;

        File file = new File(fullpath);

        if (file.exists() && file.isFile()) {
            if (file.delete())
                System.out.println("File is deleted successfully: " + name);
            else
                System.out.println("Failed to delete file");
        } else {
            System.out.println("File does not exist");
        }

        sc.close();
    }

    public void display() {
        System.out.println("Enter the folder path");
        Scanner sc = new Scanner(System.in);
        fullpath = sc.next();
        File file = new File(fullpath);
        File[] listoffiles = file.listFiles();

        if (listoffiles != null) {
            for (File f : listoffiles) {
                System.out.println(f.getName());
            }
        } else {
            System.out.println("No files found in the directory.");
        }

        sc.close();
    }

    public void subdirectories() {
        createDirectory(); // Example implementation, you can modify as needed
    }

    public void removeSubdirectory() {
        removeDirectory(); // Example implementation, you can modify as needed
    }

   
}

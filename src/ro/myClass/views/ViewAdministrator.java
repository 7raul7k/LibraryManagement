package ro.myClass.views;

import ro.myClass.controllers.*;
import ro.myClass.models.*;

import java.util.Scanner;

public class ViewAdministrator {

    private ControllerBooks controllerBooks;

    private ControllerUser controllerUser;

    Scanner scanner = new Scanner(System.in);

    public ViewAdministrator(Administrator admin){
        this.controllerBooks = new ControllerBooks();
        this.controllerUser = new ControllerUser();
    }

    public void show(){
        System.out.println("Press 1 to show books");
        System.out.println("Press 2 to add user");
        System.out.println("Press 3 to remove users");
        System.out.println("Press 4 to find a user");
    }

    public void play(){
        boolean running = true;

        while (running){
            this.show();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1 : this.controllerBooks.showBooks();
                break;
                case 2 : this.addUser();
                break;
                case 3 : this.removeUser();
                break;
                case 4 : this.findUser();
                break;

            }
        }
    }
    public void addUser(){
        System.out.println("Input type of user");
        String type = scanner.nextLine();
        System.out.println("Input first name");
        String fName = scanner.nextLine();
        System.out.println("Input last name");
        String lName = scanner.nextLine();
        System.out.println("Input email");
        String email = scanner.nextLine();
        System.out.println("Input password");
        String password = scanner.nextLine();

        if(type.equals("student")){
            System.out.println("Input year of studying");
            int year = Integer.parseInt(scanner.nextLine());
            System.out.println("Input your age");
            int age = Integer.parseInt(scanner.nextLine());
            Student student = new Student(fName,lName,email,password,year,age);
            this.controllerUser.addUser(student);
        }else if(type.equals("administrator")){
            System.out.println("Input department");
            String department = scanner.nextLine();
            Administrator admin = new Administrator(fName,lName,email,password,department);
        }


    }
    public void removeUser(){
        System.out.println("Input firstname");
        String fName = scanner.nextLine();

        this.controllerUser.removeUser(fName);

    }

    public void findUser(){
        System.out.println("Input firstname");
        String fName = scanner.nextLine();
        int pos = this.controllerUser.find(fName);
        if(pos != -1){
            this.controllerUser.getUser(fName);
        }else{
            System.out.println("User doesn't exist");
        }
    }
}

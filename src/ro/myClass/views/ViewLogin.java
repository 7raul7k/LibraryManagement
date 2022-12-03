package ro.myClass.views;

import ro.myClass.controllers.ControllerUser;
import ro.myClass.models.Administrator;
import ro.myClass.models.Book;
import ro.myClass.models.Student;
import ro.myClass.models.User;

import java.util.Scanner;

public class ViewLogin {

    private ControllerUser controllerUser;

    Scanner scanner = new Scanner(System.in);
    public ViewLogin(){
        this.controllerUser = new ControllerUser();
    }

    public void show(){
        System.out.println("Press 1 to register");
        System.out.println("Press 2 to login");
    }

    public void play(){
        boolean running = true;

        while (running){
            show();
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1: this.register();
                break;
                case 2 : this.login();
                break;
            }
        }
    }
    public void register(){
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
            this.controllerUser.addUser(admin);
        }

    }
    public void login(){
        System.out.println("Input email");
        String email = scanner.nextLine();
        System.out.println("Input password");
        String pass = scanner.nextLine();

        System.out.println("Input firstname");
        String fName = scanner.nextLine();
        User user = this.controllerUser.getUser(fName);
        if(user.getType().equals("admin")){
            ViewAdministrator viewAdministrator = new ViewAdministrator((Administrator) user);
            viewAdministrator.play();
        }else{
            ViewStudent student = new ViewStudent((Student) user);
            student.play();
        }


    }
}

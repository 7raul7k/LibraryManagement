package ro.myClass.views;

import ro.myClass.controllers.*;
import ro.myClass.models.*;

import java.util.Scanner;

public class ViewStudent {

    private ControllerOrder controllerOrder;
    private ControllerBooks controllerBooks;

    private User user;

    Scanner scanner = new Scanner(System.in);

    public ViewStudent(Student student){
        this.controllerOrder = new ControllerOrder();
        this.controllerBooks = new ControllerBooks();
        this.user = student;
    }

    public void show(){}

    public void play(){
        boolean running = true;
        while(running){
            this.show();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1: this.controllerBooks.showBooks();
                break;
                case 2: this.controllerOrder.show();
                break;
                case 3 : this.addOrder();
                break;
                case 4 : this.addBook();
                break;
                case 5 : this.controllerOrder.removeLastOrder();
                break;

            }
        }
    }


    public void addOrder(){
        System.out.println("Input book name");
        String name = scanner.nextLine();
        System.out.println("Input quantity");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.println("Input order date");
        String date = scanner.nextLine();

        Order order = new Order(user.getFirstName(),name,quantity,date);

        this.controllerOrder.addOrder(order);
    }

    public void addBook(){


    }
}

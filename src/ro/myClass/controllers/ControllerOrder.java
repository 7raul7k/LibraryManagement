package ro.myClass.controllers;

import ro.myClass.dictionary.Queue;
import ro.myClass.models.Order;

import java.io.File;
import java.util.Scanner;

public class ControllerOrder {
    private Queue<Order> orderList;

    public ControllerOrder(){
        this.orderList = new Queue<Order>();
        this.load();
    }

    public void load(){
        try{
            File file = new File("C:\\mycode\\JavaBasics\\Collections\\LibraryManagementSystem\\src\\ro\\myClass\\resources\\orders.txt");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                this.orderList.enQueue(new Order(scanner.nextLine()));
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void addOrder(Order order){
        this.orderList.enQueue(order);
    }
    public void removeLastOrder(){
        this.orderList.deQueue();
    }
    public Order getFirstOrder(){
        return this.orderList.getHead().getData();
    }
    public Order getLastOrder(){
        return this.orderList.getQueue().getData();
    }
    public boolean ordersEmpty(){
        return this.orderList.isEmpty();

    }

    public void show(){
        this.orderList.show();
    }


}

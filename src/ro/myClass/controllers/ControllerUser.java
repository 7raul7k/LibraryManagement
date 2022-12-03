package ro.myClass.controllers;

import ro.myClass.dictionary.ChainedHashTable;
import ro.myClass.models.Administrator;
import ro.myClass.models.Student;
import ro.myClass.models.User;

import java.io.File;
import java.util.Scanner;

public class ControllerUser {

    private ChainedHashTable<String, User> userList;

    public ControllerUser(){
        this.userList = new ChainedHashTable<String,User>();
        this.load();

    }

    public void load(){
        try{
            File file = new File("C:\\mycode\\JavaBasics\\Collections\\LibraryManagementSystem\\src\\ro\\myClass\\resources\\users.txt");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String text = scanner.nextLine();
                String key = text.split(",")[2];
                switch (text.split(",")[0]){
                    case "student":
                        this.userList.put(key,new Student(scanner.nextLine()));
                        break;
                    case "administrator":
                        this.userList.put(key,new Administrator(scanner.nextLine()));
                        break;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public boolean addUser(User user){
        int pos = userList.find(user.getFirstName());
        if(pos == -1 ){
            this.userList.put(user.getFirstName(),user);
            return true;
        }
        return false;

    }

    public boolean removeUser(String firstName){
        int pos = userList.find(firstName);
        if(pos != -1){
            this.userList.remove(firstName);
            return true;
        }
        return false;
    }

    public User getUser(String firstName){
        return this.userList.get(firstName);
    }

    public int find(String firstName){
        return this.userList.find(firstName);
    }




}

package ro.myClass.controllers;

import ro.myClass.dictionary.ChainedHashTable;
import ro.myClass.dictionary.GenericList;
import ro.myClass.dictionary.Node;
import ro.myClass.dictionary.SimpleHashTable;
import ro.myClass.models.Book;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerBooks<K,V> {

    private GenericList<Book> list;

    public ControllerBooks(){
        this.list = new GenericList<>();
        this.load();
    }
    public void load(){
        try{
        File file = new File("C:\\mycode\\JavaBasics\\Collections\\LibraryManagementSystem\\src\\ro\\myClass\\resources\\books.txt");
        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine()){
           this.list.addStart(new Book(scanner.nextLine()));

        }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public boolean addBook(Book book){
       boolean flag = this.list.contains(book);
       if(flag == false){
           this.list.addStart(book);
           flag = true;
       }
       return flag;
    }
    public boolean removeBook(Book book){
        boolean flag = this.list.contains(book);
        if(flag == true){
            int pos = this.list.get(book);
            this.list.stergereNodAnumitaPozitie(pos);
            return flag;
        }
        return flag;

    }

    public void showBooks(){
        this.list.afisare();
    }

    public void addBookOnLastPos(Book book){
        boolean flag = this.list.contains(book);
        if(flag == false){
            this.list.addNodSfarsit(book);
        }
    }

    public void addBookonFirstPos(Book book){
        boolean flag = this.list.contains(book);
        if(flag == false){
            this.list.addPrimaPozitie(book);
        }
    }
    public Node getHead(){
        return this.list.getHead();
    }
    public void removeLastBook(){
        this.list.stergereUltimaPozitie();
    }
    public void removeBookfromSpecificPosition(int pos){
        this.list.stergereNodAnumitaPozitie(pos);
    }
    public boolean contains(Book book){
        return this.list.contains(book);
    }
    public boolean isEmpty(){
        return this.list.isEmpty();
    }
    public Book get(int pos){
        return this.list.get(pos);
    }
    public void set(Book book,int pos){
        this.list.set(book,pos);
    }
    public Book highestBook(){
        return this.list.celMaiMareElement();
    }

    public void save(){
        try{
            File file = new File("C:\\mycode\\JavaBasics\\Collections\\LibraryManagementSystem\\src\\ro\\myClass\\resources\\users.txt");
            FileWriter fileWriter = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print(this);
            printWriter.flush();
            printWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}

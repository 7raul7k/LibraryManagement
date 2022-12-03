package ro.myClass;

import org.junit.Test;
import ro.myClass.dictionary.Stack;
import ro.myClass.models.Book;

import static org.junit.Assert.assertEquals;

public class StackTest {
    @Test
    public void push(){
       Stack<Book> stack = new Stack<>();
        Book book = new Book("Ugly love","Romance","Drama",200,true,100);
        Book book1 = new Book("Java collection","Computer Science","Programare",500,true,2);
        Book book2 = new Book("Blestemul marii","Aventura","Aventura",99,true,200);
        stack.push(book);
       stack.push(book1);
       stack.push(book2);
    }

    @Test
    public void peek(){
        Stack<Book> stack = new Stack<>();
        Book book = new Book("Ugly love","Romance","Drama",200,true,100);
        Book book1 = new Book("Java collection","Computer Science","Programare",500,true,2);
        Book book2 = new Book("Blestemul marii","Aventura","Aventura",99,true,200);
        stack.push(book1);
        stack.push(book2);
        assertEquals(book2,stack.peek().getData());
    }

    @Test
    public void isEmpty(){
        Stack<Book> stack = new Stack<>();
        Book book = new Book("Ugly love","Romance","Drama",200,true,100);
        Book book1 = new Book("Java collection","Computer Science","Programare",500,true,2);
        Book book2 = new Book("Blestemul marii","Aventura","Aventura",99,true,200);
        stack.push(book1);
        stack.push(book2);
        assertEquals(false,stack.isEmpty());
    }

}

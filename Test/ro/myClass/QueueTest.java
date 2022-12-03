package ro.myClass;

import org.junit.Test;
import ro.myClass.dictionary.Queue;
import ro.myClass.models.Book;

public class QueueTest {

    @Test
    public void enQueue(){
        Queue<Book> queue = new Queue<>();
        Book book = new Book("Ugly love","Romance","Drama",200,true,100);
        Book book1 = new Book("Java collection","Computer Science","Programare",500,true,2);
        Book book2 = new Book("Blestemul marii","Aventura","Aventura",99,true,200);
        Book book3 = new Book("Learn JavaScript","Computer Science","Programare",300,true,2);
        Book book4 = new Book("Learn CSS/HTML","Computer Science","Programare",200,true,1);
        queue.enQueue(book);
        queue.enQueue(book1);
        queue.enQueue(book2);
        queue.enQueue(book3);
        queue.enQueue(book4);
    }
    @Test
    public void deQueue(){
        Queue<Book> queue = new Queue<>();
        Book book = new Book("Ugly love","Romance","Drama",200,true,100);
        Book book1 = new Book("Java collection","Computer Science","Programare",500,true,2);
        Book book2 = new Book("Blestemul marii","Aventura","Aventura",99,true,200);
        Book book3 = new Book("Learn JavaScript","Computer Science","Programare",300,true,2);
        Book book4 = new Book("Learn CSS/HTML","Computer Science","Programare",200,true,1);
        queue.enQueue(book);
        queue.enQueue(book1);
        queue.enQueue(book2);
        queue.enQueue(book3);
        queue.enQueue(book4);

        queue.deQueue();
    }

    @Test
    public void peek(){
        Queue<Book> queue = new Queue<>();
        Book book = new Book("Ugly love","Romance","Drama",200,true,100);
        Book book1 = new Book("Java collection","Computer Science","Programare",500,true,2);
        Book book2 = new Book("Blestemul marii","Aventura","Aventura",99,true,200);
        Book book3 = new Book("Learn JavaScript","Computer Science","Programare",300,true,2);
        Book book4 = new Book("Learn CSS/HTML","Computer Science","Programare",200,true,1);
        queue.enQueue(book);
        queue.enQueue(book1);
        queue.enQueue(book2);
        queue.enQueue(book3);
        queue.enQueue(book4);

        System.out.println(queue.peek().getData());
    }
}

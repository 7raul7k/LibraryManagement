package ro.myClass;

import org.junit.Test;
import ro.myClass.dictionary.Queue;
import ro.myClass.dictionary.Set;
import ro.myClass.models.Book;

import static org.junit.Assert.assertEquals;

public class SetTest {
    @Test
    public void add(){
        Set<Book> set = new Set<>();

        Book book = new Book("Ugly love","Romance","Drama",200,true,100);
        Book book1 = new Book("Java collection","Computer Science","Programare",500,true,2);
        Book book2 = new Book("Blestemul marii","Aventura","Aventura",99,true,200);
        Book book3 = new Book("Learn JavaScript","Computer Science","Programare",300,true,2);
        Book book4 = new Book("Learn CSS/HTML","Computer Science","Programare",200,true,1);
        set.add(book);
        set.add(book1);
        set.add(book2);
        set.add(book3);
        set.add(book4);

        set.show();
    }

    @Test
    public void delete(){
        Set<Book> set = new Set<>();

        Book book = new Book("Ugly love","Romance","Drama",200,true,100);
        Book book1 = new Book("Java collection","Computer Science","Programare",500,true,2);
        Book book2 = new Book("Blestemul marii","Aventura","Aventura",99,true,200);
        Book book3 = new Book("Learn JavaScript","Computer Science","Programare",300,true,2);
        Book book4 = new Book("Learn CSS/HTML","Computer Science","Programare",200,true,1);
        set.add(book);
        set.add(book1);
        set.add(book2);
        set.add(book3);
        set.add(book4);

        set.delete(3);

        set.show();

    }

    @Test
    public void isEmpty(){
        Set<Book> set = new Set<>();

        Book book = new Book("Ugly love","Romance","Drama",200,true,100);
        Book book1 = new Book("Java collection","Computer Science","Programare",500,true,2);
        Book book2 = new Book("Blestemul marii","Aventura","Aventura",99,true,200);
        Book book3 = new Book("Learn JavaScript","Computer Science","Programare",300,true,2);
        Book book4 = new Book("Learn CSS/HTML","Computer Science","Programare",200,true,1);
        set.add(book);
        set.add(book1);
        set.add(book2);
        set.add(book3);
        set.add(book4);
        Set<Book> set2 = new Set<>();
        assertEquals(false,set.isEmpty());
        assertEquals(true,set2.isEmpty());
    }

    @Test
    public void size(){
        Set<Book> set = new Set<>();

        Book book = new Book("Ugly love","Romance","Drama",200,true,100);
        Book book1 = new Book("Java collection","Computer Science","Programare",500,true,2);
        Book book2 = new Book("Blestemul marii","Aventura","Aventura",99,true,200);
        Book book3 = new Book("Learn JavaScript","Computer Science","Programare",300,true,2);
        Book book4 = new Book("Learn CSS/HTML","Computer Science","Programare",200,true,1);
        set.add(book);
        set.add(book1);
        set.add(book2);
        set.add(book3);
        int size = set.size();
        set.add(book4);
        assertEquals(size+1,set.size());
    }

    @Test
    public void contains(){
        Set<Book> set = new Set<>();

        Book book = new Book("Ugly love","Romance","Drama",200,true,100);
        Book book1 = new Book("Java collection","Computer Science","Programare",500,true,2);
        Book book2 = new Book("Blestemul marii","Aventura","Aventura",99,true,200);
        Book book3 = new Book("Learn JavaScript","Computer Science","Programare",300,true,2);
        Book book4 = new Book("Learn CSS/HTML","Computer Science","Programare",200,true,1);
        set.add(book);
        set.add(book1);
        set.add(book2);
        set.add(book3);
        set.add(book4);

        assertEquals(true,set.contains(book1));
    }

    @Test
    public void show(){
        Set<Book> set = new Set<>();

        Book book = new Book("Ugly love","Romance","Drama",200,true,100);
        Book book1 = new Book("Java collection","Computer Science","Programare",500,true,2);
        Book book2 = new Book("Blestemul marii","Aventura","Aventura",99,true,200);
        Book book3 = new Book("Learn JavaScript","Computer Science","Programare",300,true,2);
        Book book4 = new Book("Learn CSS/HTML","Computer Science","Programare",200,true,1);
        set.add(book);
        set.add(book1);
        set.add(book2);
        set.add(book3);
        set.add(book4);

        set.show();
    }


}

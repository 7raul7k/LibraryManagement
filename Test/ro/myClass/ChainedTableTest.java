package ro.myClass;

import org.junit.Test;
import ro.myClass.dictionary.ChainedHashTable;
import ro.myClass.models.Book;

import static org.junit.Assert.assertEquals;

public class ChainedTableTest {

    @Test
    public void put(){
        ChainedHashTable<String, Book> chainedHashTable = new ChainedHashTable<>();
        Book book = new Book("Ugly love","Romance","Drama",200,true,100);
        Book book1 = new Book("Java","Computer Science","Programare",500,true,2);
        Book book2 = new Book("Blestemul marii","Aventura","Aventura",99,true,200);
        Book book3 = new Book("JavaScript","Computer Science","Programare",300,true,2);
        Book book4 = new Book("CSS","Computer Science","Programare",200,true,1);

        chainedHashTable.put("Ugly love",book);
        chainedHashTable.put("Java",book1);
        chainedHashTable.put("Blestemul marii",book2);
        chainedHashTable.put("Javascript",book3);
        chainedHashTable.put("CSS",book4);
    }

    @Test
    public void get(){
        ChainedHashTable<String, Book> chainedHashTable = new ChainedHashTable<>();
        Book book = new Book("Ugly love","Romance","Drama",200,true,100);
        Book book1 = new Book("Java","Computer Science","Programare",500,true,2);
        Book book2 = new Book("Blestemul marii","Aventura","Aventura",99,true,200);
        Book book3 = new Book("JavaScript","Computer Science","Programare",300,true,2);
        Book book4 = new Book("CSS","Computer Science","Programare",200,true,1);

        chainedHashTable.put("Ugly love",book);
        chainedHashTable.put("Java",book1);
        chainedHashTable.put("Blestemul marii",book2);
        chainedHashTable.put("Javascript",book3);
        chainedHashTable.put("CSS",book4);

        assertEquals(book,chainedHashTable.get("Ugly love"));
        assertEquals(book1,chainedHashTable.get("Java"));
        assertEquals(book2,chainedHashTable.get("Blestemul marii"));
        assertEquals(book3,chainedHashTable.get("JavaScript"));
        assertEquals(book4,chainedHashTable.get("CSS"));
    }

    @Test
    public void remove(){
        ChainedHashTable<String, Book> chainedHashTable = new ChainedHashTable<>();
        Book book = new Book("Ugly love","Romance","Drama",200,true,100);
        Book book1 = new Book("Java","Computer Science","Programare",500,true,2);
        Book book2 = new Book("Blestemul marii","Aventura","Aventura",99,true,200);
        Book book3 = new Book("JavaScript","Computer Science","Programare",300,true,2);
        Book book4 = new Book("CSS","Computer Science","Programare",200,true,1);

        chainedHashTable.put("Ugly love",book);
        chainedHashTable.put("Java",book1);
        chainedHashTable.put("Blestemul marii",book2);
        chainedHashTable.put("Javascript",book3);
        chainedHashTable.put("CSS",book4);

        assertEquals(true,chainedHashTable.remove("1"));
    }


}

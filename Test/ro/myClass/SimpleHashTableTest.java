package ro.myClass;

import org.junit.Test;
import ro.myClass.dictionary.SimpleHashTable;
import ro.myClass.models.Book;

import static org.junit.Assert.assertEquals;

public class SimpleHashTableTest {
    @Test
    public void put(){
        SimpleHashTable<String,Book> simpleHashTable = new SimpleHashTable<>();
        Book book = new Book("Ugly love","Romance","Drama",200,true,100);
        Book book1 = new Book("Java collection","Computer Science","Programare",500,true,2);
        Book book2 = new Book("Blestemul marii","Aventura","Aventura",99,true,200);
        Book book3 = new Book("Learn JavaScript","Computer Science","Programare",300,true,2);
        Book book4 = new Book("Learn CSS/HTML","Computer Science","Programare",200,true,1);
        simpleHashTable.put("Javascript",book3);
        simpleHashTable.put("CSS",book4);
        simpleHashTable.put("Ugly love",book);
        simpleHashTable.put("Java",book1);
        simpleHashTable.put("Blestemul marii",book2);

        assertEquals(3,simpleHashTable.find("CSS"));
        assertEquals(4,simpleHashTable.find("Java"));
        assertEquals(0,simpleHashTable.find("Javascript"));
        assertEquals(5,simpleHashTable.find("Blestemul marii"));
        assertEquals(9,simpleHashTable.find("Ugly love"));
    }

    @Test
    public void get(){
        SimpleHashTable<String,Book> simpleHashTable = new SimpleHashTable<>();
        Book book = new Book("Ugly love","Romance","Drama",200,true,100);
        Book book1 = new Book("Java collection","Computer Science","Programare",500,true,2);
        Book book2 = new Book("Blestemul marii","Aventura","Aventura",99,true,200);
        Book book3 = new Book("Learn JavaScript","Computer Science","Programare",300,true,2);
        Book book4 = new Book("Learn CSS/HTML","Computer Science","Programare",200,true,1);

        simpleHashTable.put("Javascript",book3);
        simpleHashTable.put("CSS",book4);
        simpleHashTable.put("Ugly love",book);
        simpleHashTable.put("Java",book1);
        simpleHashTable.put("Blestemul marii",book2);

        assertEquals(book,simpleHashTable.get("Ugly love"));
        assertEquals(book1,simpleHashTable.get("Java"));
        assertEquals(book2,simpleHashTable.get("Blestemul marii"));
        assertEquals(book3,simpleHashTable.get("Javascript"));
        assertEquals(book4,simpleHashTable.get("CSS"));


    }

    @Test
    public void remove(){
        SimpleHashTable<String,Book> simpleHashTable = new SimpleHashTable<>();
        Book book = new Book("Ugly love","Romance","Drama",200,true,100);
        Book book1 = new Book("Java collection","Computer Science","Programare",500,true,2);
        Book book2 = new Book("Blestemul marii","Aventura","Aventura",99,true,200);
        Book book3 = new Book("Learn JavaScript","Computer Science","Programare",300,true,2);
        Book book4 = new Book("Learn CSS/HTML","Computer Science","Programare",200,true,1);
        simpleHashTable.put("Javascript",book3);
        simpleHashTable.put("CSS",book4);
        simpleHashTable.put("Ugly love",book);
        simpleHashTable.put("Java",book1);
        simpleHashTable.put("Blestemul marii",book2);

        assertEquals(book,simpleHashTable.remove("Ugly love"));
        assertEquals(book1,simpleHashTable.remove("Java"));
        assertEquals(book2,simpleHashTable.remove("Blestemul marii"));
        assertEquals(book3,simpleHashTable.remove("JavaScript"));
        assertEquals(book4,simpleHashTable.remove("CSS"));
    }
}

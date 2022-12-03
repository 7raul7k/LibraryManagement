package ro.myClass;

import org.junit.Test;
import ro.myClass.dictionary.GenericList;
import ro.myClass.models.Book;

import static org.junit.Assert.assertEquals;

public class GenericListTest {

    @Test
    public void addStart(){
        GenericList<Book> genericList = new GenericList<>();
        Book book = new Book("Ugly love","Romance","Drama",200,true,100);
        Book book1 = new Book("Java","Computer Science","Programare",500,true,2);
        Book book2 = new Book("Blestemul marii","Aventura","Aventura",99,true,200);
        Book book3 = new Book("JavaScript","Computer Science","Programare",300,true,2);
        Book book4 = new Book("CSS","Computer Science","Programare",200,true,1);

        genericList.addStart(book);
        genericList.addStart(book1);
        genericList.addStart(book2);
        genericList.addStart(book3);
        genericList.addStart(book4);

        assertEquals(true,genericList.contains(book));
        assertEquals(true,genericList.contains(book1));
        assertEquals(true,genericList.contains(book2));
        assertEquals(true,genericList.contains(book3));
        assertEquals(true,genericList.contains(book4));

    }

    @Test
    public void show(){
        GenericList<Book> genericList = new GenericList<>();
        Book book = new Book("Ugly love","Romance","Drama",200,true,100);
        Book book1 = new Book("Java","Computer Science","Programare",500,true,2);
        Book book2 = new Book("Blestemul marii","Aventura","Aventura",99,true,200);
        Book book3 = new Book("JavaScript","Computer Science","Programare",300,true,2);
        Book book4 = new Book("CSS","Computer Science","Programare",200,true,1);

        genericList.addStart(book);
        genericList.addStart(book1);
        genericList.addStart(book2);
        genericList.addStart(book3);
        genericList.addStart(book4);

        assertEquals(true,genericList.contains(book));

        genericList.afisare();
    }

    @Test
    public void addNodSfarsit() {
        GenericList<Book> genericList = new GenericList<>();
        Book book = new Book( "Ugly love", "Romance", "Drama", 200, true, 100);
        Book book1 = new Book( "Java", "Computer Science", "Programare", 500, true, 2);
        Book book2 = new Book( "Blestemul marii", "Aventura", "Aventura", 99, true, 200);
        Book book3 = new Book( "JavaScript", "Computer Science", "Programare", 300, true, 2);
        Book book4 = new Book( "CSS", "Computer Science", "Programare", 200, true, 1);

        genericList.addStart(book);
        genericList.addStart(book1);
        genericList.addStart(book2);
        genericList.addStart(book3);
        genericList.addNodSfarsit(book4);

        assertEquals(true,genericList.contains(book4));
    }

    @Test
    public void addNodeonPosition(){
        GenericList<Book> genericList = new GenericList<>();
        Book book = new Book("Ugly love","Romance","Drama",200,true,100);
        Book book1 = new Book("Java","Computer Science","Programare",500,true,2);
        Book book2 = new Book("Blestemul marii","Aventura","Aventura",99,true,200);
        Book book3 = new Book("JavaScript","Computer Science","Programare",300,true,2);
        Book book4 = new Book("CSS","Computer Science","Programare",200,true,1);

        genericList.addStart(book);
        genericList.addStart(book1);
        genericList.addStart(book2);
        genericList.addStart(book3);
        genericList.addNodeonPosition(book4,2);
        assertEquals(true,genericList.contains(book4));
        assertEquals(false,genericList.contains(book));
    }

    @Test
    public void addPrimaPozitie(){
        GenericList<Book> genericList = new GenericList<>();
        Book book = new Book("Ugly love","Romance","Drama",200,true,100);
        Book book1 = new Book("Java","Computer Science","Programare",500,true,2);
        Book book2 = new Book("Blestemul marii","Aventura","Aventura",99,true,200);
        Book book3 = new Book("JavaScript","Computer Science","Programare",300,true,2);
        Book book4 = new Book("CSS","Computer Science","Programare",200,true,1);

        genericList.addStart(book);
        genericList.addStart(book1);
        genericList.addStart(book2);
        genericList.addStart(book3);
        genericList.addPrimaPozitie(book4);
        assertEquals(true,genericList.contains(book4));
        assertEquals(false,genericList.contains(book3));

    }

    @Test
    public void getHead(){
        GenericList<Book> genericList = new GenericList<>();
        Book book = new Book("Ugly love","Romance","Drama",200,true,100);
        Book book1 = new Book("Java","Computer Science","Programare",500,true,2);
        Book book2 = new Book("Blestemul marii","Aventura","Aventura",99,true,200);
        Book book3 = new Book("JavaScript","Computer Science","Programare",300,true,2);
        Book book4 = new Book("CSS","Computer Science","Programare",200,true,1);

        genericList.addStart(book);
        genericList.addStart(book1);
        genericList.addStart(book2);
        genericList.addStart(book3);
        genericList.addStart(book4);

        assertEquals(book4,genericList.getHead().getData());
    }

    @Test
    public void deleteLastPos(){
        GenericList<Book> genericList = new GenericList<>();
        Book book = new Book("Ugly love","Romance","Drama",200,true,100);
        Book book1 = new Book("Java","Computer Science","Programare",500,true,2);
        Book book2 = new Book("Blestemul marii","Aventura","Aventura",99,true,200);
        Book book3 = new Book("JavaScript","Computer Science","Programare",300,true,2);
        Book book4 = new Book("CSS","Computer Science","Programare",200,true,1);

        genericList.addStart(book);
        genericList.addStart(book1);
        genericList.addStart(book2);
        genericList.addStart(book3);
        genericList.addStart(book4);

        genericList.stergereUltimaPozitie();

        assertEquals(false,genericList.contains(book));
    }

    @Test
    public void contains(){
        GenericList<Book> genericList = new GenericList<>();
        Book book = new Book("Ugly love","Romance","Drama",200,true,100);
        Book book1 = new Book("Java","Computer Science","Programare",500,true,2);
        Book book2 = new Book("Blestemul marii","Aventura","Aventura",99,true,200);
        Book book3 = new Book("JavaScript","Computer Science","Programare",300,true,2);
        Book book4 = new Book("CSS","Computer Science","Programare",200,true,1);

        genericList.addStart(book);
        genericList.addStart(book1);
        genericList.addStart(book2);
        genericList.addStart(book3);
        genericList.addStart(book4);

        assertEquals(true,genericList.contains(book));

    }

    @Test
    public void isEmpty(){
        GenericList<Book> genericList = new GenericList<>();
        Book book = new Book("Ugly love","Romance","Drama",200,true,100);
        Book book1 = new Book("Java","Computer Science","Programare",500,true,2);
        Book book2 = new Book("Blestemul marii","Aventura","Aventura",99,true,200);
        Book book3 = new Book("JavaScript","Computer Science","Programare",300,true,2);
        Book book4 = new Book("CSS","Computer Science","Programare",200,true,1);

        genericList.addStart(book);
        genericList.addStart(book1);
        genericList.addStart(book2);
        genericList.addStart(book3);
        genericList.addStart(book4);

        GenericList<Book> genericList1 = new GenericList<>();

        assertEquals(false,genericList.isEmpty());
        assertEquals(true,genericList1.isEmpty());
    }

    @Test
    public void size(){
        GenericList<Book> genericList = new GenericList<>();
        Book book = new Book("Ugly love","Romance","Drama",200,true,100);
        Book book1 = new Book("Java","Computer Science","Programare",500,true,2);
        Book book2 = new Book("Blestemul marii","Aventura","Aventura",99,true,200);
        Book book3 = new Book("JavaScript","Computer Science","Programare",300,true,2);
        Book book4 = new Book("CSS","Computer Science","Programare",200,true,1);

        genericList.addStart(book);
        genericList.addStart(book1);
        genericList.addStart(book2);
        genericList.addStart(book3);
        int size = genericList.size();
        genericList.addStart(book4);
        assertEquals(size+1,genericList.size());
    }

    @Test
    public void getPos(){
        GenericList<Book> genericList = new GenericList<>();
        Book book = new Book("Ugly love","Romance","Drama",200,true,100);
        Book book1 = new Book("Java","Computer Science","Programare",500,true,2);
        Book book2 = new Book("Blestemul marii","Aventura","Aventura",99,true,200);
        Book book3 = new Book("JavaScript","Computer Science","Programare",300,true,2);
        Book book4 = new Book("CSS","Computer Science","Programare",200,true,1);

        genericList.addStart(book);
        genericList.addStart(book1);
        genericList.addStart(book2);
        genericList.addStart(book3);
        genericList.addStart(book4);

        assertEquals(0,genericList.get(book4));
    }

    @Test
    public void get(){
        GenericList<Book> genericList = new GenericList<>();
        Book book = new Book("Ugly love","Romance","Drama",200,true,100);
        Book book1 = new Book("Java","Computer Science","Programare",500,true,2);
        Book book2 = new Book("Blestemul marii","Aventura","Aventura",99,true,200);
        Book book3 = new Book("JavaScript","Computer Science","Programare",300,true,2);
        Book book4 = new Book("CSS","Computer Science","Programare",200,true,1);

        genericList.addStart(book);
        genericList.addStart(book1);
        genericList.addStart(book2);
        genericList.addStart(book3);
        genericList.addStart(book4);

        assertEquals(book,genericList.get(4));
    }

    @Test
    public void set(){
        GenericList<Book> genericList = new GenericList<>();
        Book book = new Book("Ugly love","Romance","Drama",200,true,100);
        Book book1 = new Book("Java","Computer Science","Programare",500,true,2);
        Book book2 = new Book("Blestemul marii","Aventura","Aventura",99,true,200);
        Book book3 = new Book("JavaScript","Computer Science","Programare",300,true,2);
        Book book4 = new Book("CSS","Computer Science","Programare",200,true,1);

        genericList.addStart(book);
        genericList.addStart(book1);
        genericList.addStart(book2);
        genericList.addStart(book3);

        genericList.set(book4,0);

        assertEquals(true,genericList.contains(book4));
        assertEquals(false,genericList.contains(book3));
    }

    @Test
    public void sort(){
        GenericList<Book> genericList = new GenericList<>();
        Book book = new Book("Ugly love","Romance","Drama",200,true,100);
        Book book1 = new Book("Java","Computer Science","Programare",500,true,2);
        Book book2 = new Book("Blestemul marii","Aventura","Aventura",99,true,200);
        Book book3 = new Book("JavaScript","Computer Science","Programare",300,true,2);
        Book book4 = new Book("CSS","Computer Science","Programare",200,true,1);

        genericList.addStart(book);
        genericList.addStart(book1);
        genericList.addStart(book2);
        genericList.addStart(book3);
        genericList.addStart(book4);

        assertEquals(true,genericList.sortare());
    }

    @Test
    public void highElement(){
        GenericList<Book> genericList = new GenericList<>();
        Book book = new Book("Ugly love","Romance","Drama",200,true,100);
        Book book1 = new Book("Java","Computer Science","Programare",500,true,2);
        Book book2 = new Book("Blestemul marii","Aventura","Aventura",99,true,200);
        Book book3 = new Book("JavaScript","Computer Science","Programare",300,true,2);
        Book book4 = new Book("CSS","Computer Science","Programare",200,true,1);

        genericList.addStart(book);
        genericList.addStart(book1);
        genericList.addStart(book2);
        genericList.addStart(book3);
        genericList.addStart(book4);

        assertEquals(book2,genericList.celMaiMareElement());
    }
}

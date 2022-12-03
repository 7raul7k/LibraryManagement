package ro.myClass;

import org.junit.Test;
import ro.myClass.dictionary.GenericList;
import ro.myClass.models.Book;

import static org.junit.Assert.assertEquals;

public class NodeTest {

    @Test
    public void set(){
        GenericList<Book> list = new GenericList();
        Book book = new Book("Ugly love","Romance","Drama",200,true,100);
        Book book1 = new Book("Java collection","Computer Science","Programare",500,true,2);
        Book book2 = new Book("Blestemul marii","Aventura","Aventura",99,true,200);
        Book book3 = new Book("Learn JavaScript","Computer Science","Programare",300,true,2);
        Book book4 = new Book("Learn CSS/HTML","Computer Science","Programare",200,true,1);
        list.addStart(book);
        list.addStart(book1);
        list.addStart(book2);
        list.addStart(book3);
        list.set(book4,1);
        assertEquals(book4,list.get(1));
    }

    @Test
    public void get(){
        GenericList<Book> list = new GenericList();
        Book book = new Book("Ugly love","Romance","Drama",200,true,100);
        Book book1 = new Book("Java collection","Computer Science","Programare",500,true,2);
        Book book2 = new Book("Blestemul marii","Aventura","Aventura",99,true,200);
        Book book3 = new Book("Learn JavaScript","Computer Science","Programare",300,true,2);
        Book book4 = new Book("Learn CSS/HTML","Computer Science","Programare",200,true,1);
        list.addStart(book);
        list.addStart(book1);
        list.addStart(book2);
        list.addStart(book3);
        list.addStart(book4);

        assertEquals(book1,list.get(3));
    }

    @Test
    public void addPosition(){
        GenericList<Book> list = new GenericList();
        Book book = new Book("Ugly love","Romance","Drama",200,true,100);
        Book book1 = new Book("Java collection","Computer Science","Programare",500,true,2);
        Book book2 = new Book("Blestemul marii","Aventura","Aventura",99,true,200);
        Book book3 = new Book("Learn JavaScript","Computer Science","Programare",300,true,2);
        Book book4 = new Book("Learn CSS/HTML","Computer Science","Programare",200,true,1);
        list.addStart(book);
        list.addStart(book1);
        list.addStart(book2);
        list.addStart(book3);
        list.addNodeonPosition(book4,2);

        assertEquals(true,list.contains(book4));

    }

    @Test
    public void addNodSfarsit(){
        GenericList<Book> list = new GenericList<>();
        Book book = new Book("Ugly love","Romance","Drama",200,true,100);
        Book book1 = new Book("Java collection","Computer Science","Programare",500,true,2);
        Book book2 = new Book("Blestemul marii","Aventura","Aventura",99,true,200);
        Book book3 = new Book("Learn JavaScript","Computer Science","Programare",300,true,2);
        Book book4 = new Book("Learn CSS/HTML","Computer Science","Programare",200,true,1);
        list.addStart(book);
        list.addStart(book1);
        list.addStart(book2);
        list.addStart(book3);
        list.addNodSfarsit(book4);
        assertEquals(true,list.contains(book4));
    }

    @Test
    public void stergerePrimulNod(){
        GenericList<Book> list = new GenericList();
        Book book = new Book("Ugly love","Romance","Drama",200,true,100);
        Book book1 = new Book("Java collection","Computer Science","Programare",500,true,2);
        Book book2 = new Book("Blestemul marii","Aventura","Aventura",99,true,200);
        Book book3 = new Book("Learn JavaScript","Computer Science","Programare",300,true,2);
        Book book4 = new Book("Learn CSS/HTML","Computer Science","Programare",200,true,1);
        list.addStart(book);
        list.addStart(book1);
        list.addStart(book2);
        list.addStart(book3);
        list.addNodSfarsit(book4);

        list.stergereUltimaPozitie();

        assertEquals(false,list.contains(book));

    }

    @Test
    public void stergereAnumitaPozitie(){
        GenericList<Book> list = new GenericList();
        Book book = new Book("Ugly love","Romance","Drama",200,true,100);
        Book book1 = new Book("Java collection","Computer Science","Programare",500,true,2);
        Book book2 = new Book("Blestemul marii","Aventura","Aventura",99,true,200);
        Book book3 = new Book("Learn JavaScript","Computer Science","Programare",300,true,2);
        Book book4 = new Book("Learn CSS/HTML","Computer Science","Programare",200,true,1);
        list.addStart(book);
        list.addStart(book1);
        list.addStart(book2);
        list.addStart(book3);
        list.addNodSfarsit(book4);
        int size = list.size();
        list.stergereNodAnumitaPozitie(2);

        assertEquals(size-1,list.size());
    }

    @Test
    public void isEmpty(){
        GenericList<Book> list = new GenericList<>();

        assertEquals(true,list.isEmpty());
    }

    @Test
    public void size(){
        GenericList<Book> list = new GenericList();
        Book book = new Book("Ugly love","Romance","Drama",200,true,100);
        Book book1 = new Book("Java collection","Computer Science","Programare",500,true,2);
        Book book2 = new Book("Blestemul marii","Aventura","Aventura",99,true,200);
        Book book3 = new Book("Learn JavaScript","Computer Science","Programare",300,true,2);
        Book book4 = new Book("Learn CSS/HTML","Computer Science","Programare",200,true,1);
        list.addStart(book);
        list.addStart(book1);
        list.addStart(book2);
        list.addStart(book3);
        list.addStart(book4);

        assertEquals(5,list.size());
    }

    @Test
    public void sortare(){
        GenericList<Book> list = new GenericList();
        Book book = new Book("Ugly love","Romance","Drama",200,true,100);
        Book book1 = new Book("Java collection","Computer Science","Programare",500,true,2);
        Book book2 = new Book("Blestemul marii","Aventura","Aventura",99,true,200);
        Book book3 = new Book("Learn JavaScript","Computer Science","Programare",300,true,2);
        Book book4 = new Book("Learn CSS/HTML","Computer Science","Programare",200,true,1);
        list.addStart(book);
        list.addStart(book1);
        list.addStart(book2);
        list.addStart(book3);
        list.addStart(book4);
        list.sortare();
        list.afisare();

        assertEquals(true,list.sortare());
    }

    @Test
    public void contains(){
        GenericList<Book> list = new GenericList();
        Book book = new Book("Ugly love","Romance","Drama",200,true,100);
        Book book1 = new Book("Java collection","Computer Science","Programare",500,true,2);
        Book book2 = new Book("Blestemul marii","Aventura","Aventura",99,true,200);
        Book book3 = new Book("Learn JavaScript","Computer Science","Programare",300,true,2);
        Book book4 = new Book("Learn CSS/HTML","Computer Science","Programare",200,true,1);
        list.addStart(book);
        list.addStart(book1);
        list.addStart(book2);
        list.addStart(book3);
        list.addStart(book4);

        assertEquals(true,list.contains(book1));
    }

    @Test
    public void addPrimaPozitie(){
        GenericList<Book> list = new GenericList();
        Book book = new Book("Ugly love","Romance","Drama",200,true,100);
        Book book1 = new Book("Java collection","Computer Science","Programare",500,true,2);
        Book book2 = new Book("Blestemul marii","Aventura","Aventura",99,true,200);
        Book book3 = new Book("Learn JavaScript","Computer Science","Programare",300,true,2);
        Book book4 = new Book("Learn CSS/HTML","Computer Science","Programare",200,true,1);
        list.addStart(book);
        list.addStart(book1);
        list.addStart(book2);
        list.addStart(book3);
        int size = list.size();
        list.addPrimaPozitie(book4);

        assertEquals(size,list.size());
    }

    @Test
    public void getHead(){
        GenericList<Book> list = new GenericList();
        Book book = new Book("Ugly love","Romance","Drama",200,true,100);
        Book book1 = new Book("Java collection","Computer Science","Programare",500,true,2);
        Book book2 = new Book("Blestemul marii","Aventura","Aventura",99,true,200);
        Book book3 = new Book("Learn JavaScript","Computer Science","Programare",300,true,2);
        Book book4 = new Book("Learn CSS/HTML","Computer Science","Programare",200,true,1);
        list.addStart(book);
        list.addStart(book1);
        list.addStart(book2);
        list.addStart(book3);
        list.addStart(book4);

        assertEquals(list.getHead(),list.getHead());
    }

    @Test
    public void celMaiMareElement(){
        GenericList<Book> list = new GenericList();
        Book book = new Book("Ugly love","Romance","Drama",200,true,100);
        Book book1 = new Book("Java collection","Computer Science","Programare",500,true,2);
        Book book2 = new Book("Blestemul marii","Aventura","Aventura",99,true,200);
        Book book3 = new Book("Learn JavaScript","Computer Science","Programare",300,true,2);
        Book book4 = new Book("Learn CSS/HTML","Computer Science","Programare",200,true,1);
        list.addStart(book);
        list.addStart(book1);
        list.addStart(book2);
        list.addStart(book3);
        list.addStart(book4);
        list.sortare();

        System.out.println(list.celMaiMareElement());
    }
}

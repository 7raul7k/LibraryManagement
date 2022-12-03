package ro.myClass.models;

public class Book implements Comparable<Book> {
    private String title;
    private String category;
    private String genre;
    private boolean availability;

    private int price;

    private int quantity;

    public Book(String title, String category, String genre,int price, boolean availability,int quantity) {
        this.title = title;
        this.category = category;
        this.genre = genre;
        this.price = price;
        this.availability = availability;
        this.quantity = quantity;
    }

    public Book(String text){
        String[] proprietes = text.split(",");
        this.title = proprietes[0];
        this.category = proprietes[1];
        this.genre = proprietes[2];
        this.price = Integer.parseInt(proprietes[3]);
        this.availability = Boolean.getBoolean(proprietes[4]);
        this.quantity = Integer.parseInt(proprietes[5]);
    }
    public String description(){
        String text = "";
        text += "Title: " + title;
        text += "\n Category: " + category;
        text += "\n Genre: " + genre;
        text += "\n Price per book : " + price;
        text += "\n Availability: " + availability;
        text += "\n Quantity: " + quantity;
        text += "\n Total price: " + price * quantity;
        text += "\n==========================\n";
        return text;
    }
    @Override
    public String toString(){
        return title+","+category+","+genre+","+availability;
    }
    @Override
    public boolean equals(Object o){
        Book book = (Book) o;
        if(this.title.equals(book.getTitle())&&this.genre.equals(book.getGenre())){
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Book o) {
        if(this.price > o.price){
            return -1;
        }else if(this.price < o.price){
            return 1;
        }else{
            return 0;
        }
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

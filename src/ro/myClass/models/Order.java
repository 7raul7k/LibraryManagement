package ro.myClass.models;

public class Order implements Comparable<Order> {
    private String firstName;
    private float quantity;
    private String orderDate;

    private String bookName;

    public Order(String firstName, String bookName, float quantity, String orderDate) {
        this.firstName = firstName;

        this.quantity = quantity;
        this.orderDate = orderDate;
        this.bookName = bookName;
    }
    public Order(String text){
        String[] proprietes = text.split(",");
        this.firstName = proprietes[0];
        this.bookName = proprietes[1];
        this.quantity = Float.parseFloat(proprietes[2]);
        this.orderDate = proprietes[3];
    }

    @Override
    public String toString(){
        return firstName+","+bookName+","+quantity+","+orderDate;
    }

    @Override
    public int compareTo(Order o) {
        if(this.quantity > o.quantity){
            return 1;
        }else if(this.quantity < o.quantity){
            return -1;
        }
        return 0;
    }


    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}

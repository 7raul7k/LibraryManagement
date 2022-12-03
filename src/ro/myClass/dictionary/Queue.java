package ro.myClass.dictionary;

public class Queue <U extends Comparable<U>> {

    Node<U> queue = null;
    Node<U> head =  null;

    public boolean enQueue(U obj){
        if(head == null){
            head = new Node<>();
            head.setNext(null);
            head.setData(obj);
        }else{
            Node<U> aux = new Node<>();
            aux.setData(obj);
            aux.setNext(head);
            head = aux;
            queue = aux;
            return true;
        }
        return false;

    }
    public  Node<U> deQueue(){
        if(head == null){
            return null;
        }else{
            Node<U>aux=head;
            head=head.getNext();
            return aux;
        }


    }
    public  Node<U> peek(){
        Node<U> aux = head;
        while(aux!= null && aux.getNext()!=null){
            aux = aux.getNext();
        }
        return aux;
    }
    public Node<U> getQueue(){

        return queue;
    }
    public Node<U> getHead(){
        return head;
    }
    public boolean isEmpty(){
        return head==null;
    }


    public void show() {
        Node aux = head;
        while(aux!= null) {
            System.out.println(aux.getData());
            aux = aux.getNext();
        }

        }

}

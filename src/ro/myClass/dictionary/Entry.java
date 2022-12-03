package ro.myClass.dictionary;

import java.util.Objects;

public class Entry<K,V> implements Comparable<Entry<K,V>> {

    private K key;
    private V value;

    public Entry(K key,V value){
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public int compareTo(Entry<K,V> o){return 0;}

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }
}

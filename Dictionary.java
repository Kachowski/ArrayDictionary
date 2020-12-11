import java.util.*;

public class Dictionary<E, T> {
    private ArrayList<E> key = new ArrayList<E>();
    private ArrayList<T> value = new ArrayList<T>();
    private int size = 0;

    public Dictionary(){}

    void put(E Key, T Value){
        this.key.add(Key);
        this.value.add(Value);
        size++;
    }

    T get(E Key){
        return value.get(key.indexOf(Key));
    }

    T remove(E Key){
        T temp = value.get(key.indexOf(Key));
        value.remove(key.indexOf(Key));
        key.remove(Key);
        size--;
        return temp;
    }

    boolean contains(E Key){
        return key.contains(Key);
    }

    boolean isEmpty(){
        if(size == 0){
            return true;
        }
        else{
            return false;
        }
    }

    int size(){
        return size;
    }

    Collection<E> Keys(){
        Collection<E> temp = key;
        return temp;
    }

    Collection<T> Values(){
        Collection<T> temp = value;
        return temp;
    }
}

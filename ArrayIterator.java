package Colecciones;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayIterator<T> implements Iterator<T> {
    private int count; //numero de elementos del conjunto
    private int current; //posicion del iterator
    private T[] items;

    public ArrayIterator(int size, T[]collection){
        this.count = size;
        this.items = collection;
        current=0;
    }

    public boolean hasNext(){
        return (current<count);
    }

    public T next(){
        if(!hasNext()){
            throw new NoSuchElementException();
        }
        current++;
        return items[current-1];
    }
}

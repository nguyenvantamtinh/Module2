package ss8_arraylist_linkedlist.exercise;

import java.util.Arrays;

public class CustomArrayList <E>{
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private E[] elements;

    public CustomArrayList(){
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }
    public CustomArrayList(int capacity){
        elements = (E[]) new Object[capacity];
    }

    private void ensureCapacity() {
        if (size >= elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 3 / 2);
        }
    }

    // add theo index
    public void add(int index , E element){
        if(index<0 || index>size){
            throw new IndexOutOfBoundsException();
        }

        ensureCapacity();

        for (int i = size; i >index; i--){
            elements[i] = elements[i-1];
        }
        elements[index] = element;
        size++;
    }

    // add
    public void add(E e){
        ensureCapacity();
        elements[size] = e;
        size++;
    }

    // xoa
     E remove(int index) {
         if (index >= size) {
             throw new IndexOutOfBoundsException();
         }
         E res = elements[index];
         if (size>1) {
             E[] tmp = (E[]) new Object[size-1];

             for (int i =0 , j=0; i <size; i++){
                 if(i != index){
                     tmp[j++] = elements[i];
                 }
             }
             elements = tmp;
             size--;
         }
         return res;

     }

     // tra ve so luong phan tu
     public int size(){
        return size;
     }

     //check element of array
    public boolean contains(E e){
        for (int i=0; i<size; i++){
            if(elements[i].equals(e)){
                return true;
            }
        }
        return false;
    }

    // check index element

    public int indexOf(E e){
        for (int i =0; i<size; i++){
            if(elements[i].equals(e)){
                return i;
            }
        }
        return -1;
    }

    //get element
    public  E get(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        return elements[index];
    }

    // delete all
    public void clear(){
        size = 0;
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }





}




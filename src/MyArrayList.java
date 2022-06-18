/*+
    Задание 1 - ArrayList#
    Написать свой класс MyArrayList как аналог классу ArrayList.
    Можно использовать 1 массив для хранения данных.
    Методы
    +add(Object value) добавляет элемент в конец
    +remove(int index) удаляет элемент под индексом
    +clear() очищает коллекцию
    +size() возвращает размер коллекции
    +get(int index) возвращает элемент под индексом
*/

import java.util.Objects;

public class MyArrayList<T>  {
    private T[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public MyArrayList() {
        this.elements = (T[]) new Object[DEFAULT_CAPACITY];
    }


    //add Object at the end
    public void add(T element) {
        if (size == elements.length) {
            elements = grow();//increase array capacity
        }
        elements[size] = element;
        size++;
    }

    //remove element by index
    public void remove(int index) {
        Objects.checkIndex(index, size);//check IndexOutOfBoundsException
        T[] temp = elements;
        elements = (T[]) new Object[temp.length - 1];
        System.arraycopy(temp, 0, elements, 0, index);
        System.arraycopy(temp, index + 1, elements, index, temp.length - index - 1);
        size--;
    }

    //clear collection
    public void clear() {
        final T[] t = elements;
        for (int i = 0; i < size; i++) {
            t[i] = null;
        }
        size = 0;
    }

    //return collection size
    public int size() {
        return size;
    }

    //return element by index
    public T get(int index) {
        Objects.checkIndex(index, size);//check IndexOutOfBoundsException
        return elements[index];
    }

    //increase collection capacity
    private T[] grow() {
        T[] temp = (T[]) new Object[(elements.length * 2)];
        System.arraycopy(elements, 0, temp, 0, elements.length);
        return temp;
    }
}

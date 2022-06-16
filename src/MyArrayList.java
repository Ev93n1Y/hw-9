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

public class MyArrayList {
    private Object[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public MyArrayList() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int initialCapacity) {
        if (initialCapacity > 0) {
            this.elements = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.elements = new Object[]{};
        } else {
            throw new IllegalStateException("Illegal Capacity: " + initialCapacity);
        }
    }

    //add Object at the end
    public void add(Object element) {
        if (size == elements.length) {
            elements = grow();//increase array capacity
        }
        elements[size] = element;
        size++;
    }

    //remove element by index
    public void remove(int index) {
        Objects.checkIndex(index, size);//check IndexOutOfBoundsException
        Object[] temp = elements;
        elements = new Object[temp.length - 1];
        //Object value = temp[index];
        System.arraycopy(temp, 0, elements, 0, index);
        System.arraycopy(temp, index + 1, elements, index, temp.length - index - 1);
        size--;
    }

    //clear collection
    public void clear() {
        final Object[] obj = elements;
        for (int i = 0; i < size; i++) {
            obj[i] = null;
        }
        size = 0;
    }

    //return collection size
    public int size() {
        return size;
    }

    //return element by index
    public Object get(int index) {
        Objects.checkIndex(index, size);//check IndexOutOfBoundsException
        return elements[index];
    }

    //increase collection capacity
    private Object[] grow() {
        Object[] temp = new Object[(elements.length * 2)];
        System.arraycopy(elements, 0, temp, 0, elements.length);
        return temp;
    }
}

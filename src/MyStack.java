/*
Задание 4 - Stack#
        Написать свой класс MyStack как аналог классу Stack, который работает по принципу LIFO (last-in-first-out).
        Можно делать либо с помощью Node либо с помощью массива.
        Методы
        +push(Object value) добавляет элемент в конец
        +remove(int index) удаляет элемент под индексом
        +clear() очищает коллекцию
        +size() возвращает размер коллекции
        +peek() возвращает первый элемент в стеке (LIFO)
        +pop() возвращает первый элемент в стеке и удаляет его из коллекции
*/


public class MyStack {
    private final Object[] array;
    private int top;
    private final int size;

    public MyStack(int size) {
        array = new Object[size];
        this.size = size;
        top = -1;
    }

    //add element at the end
    public void push(Object value) {
        if (!isFull()) {
            array[++top] = value;
        } else {
            throw new IndexOutOfBoundsException("Collection is full, can't add new element");
        }
    }

    //remove element by index
    public void remove(int index) {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Collection is empty, there is nothing to remove");
        } else {
            System.arraycopy(array, index + 1, array, index, top - index);
            array[top] = null;
            top--;
        }
    }

    //clear all elements in collection
    public void clear() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Collection is empty, there is nothing to clear");
        } else {
            for (int i = top; i > -1; i--) {
                array[i] = null;
                top--;
            }
        }
    }

    //return number of elements in collection
    public int size() {
        return top + 1;
    }

    //return first element in stack (LIFO)
    public Object peek() {
        return array[top];
    }

    //return first element in stack and remove it from collection
    public Object pop() {
        Object obj = peek();
        remove(top);
        return obj;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

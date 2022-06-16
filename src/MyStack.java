/*
Задание 4 - Stack#
        Написать свой класс MyStack как аналог классу Stack, который работает по принципу LIFO (last-in-first-out).
        Можно делать либо с помощью Node либо с помощью массива.
        Методы
        push(Object value) добавляет элемент в конец
        remove(int index) удаляет элемент под индексом
        clear() очищает коллекцию
        +size() возвращает размер коллекции
        peek() возвращает первый элемент в стеке (LIFO)
        pop() возвращает первый элемент в стеке и удаляет его из коллекции
*/


public class MyStack {
    private Object[] arr;
    private int top;
    private int size;

    public MyStack(int size) {
        arr = new Object[size];
        this.size = size;
        top = -1;
    }

    public void push(Object value) {
        arr[++top] = value;
    }

    public void remove(int index) {
        arr[index] = null;

    }

    public boolean isFull() {
        return true;
    }

    public boolean isEmpty() {
        return true;
    }

    public int size() {
        return size;
    }
}

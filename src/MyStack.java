/*
Задание 4 - Stack#
        Написать свой класс MyStack как аналог классу Stack, который работает по принципу LIFO (last-in-first-out).
        Можно делать либо с помощью Node либо с помощью массива.
        Методы
        +push(Object value) добавляет элемент в конец
        +remove(int index) удаляет элемент под индексом
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
    //добавляет элемент в конец
    public void push(Object value) {
        arr[++top] = value;
    }

    //удаляет элемент под индексом
    public void remove(int index) {
        arr[index] = null;

    }

    //очищает коллекцию
    public void clear() {
        if(!isEmpty()){
            for (int i = top; i > 0; i--) {
                arr[i] = null;
                top--;
            }
        }
    }

    //возвращает размер коллекции
    public int size() {
        return top+1;
    }

    //возвращает первый элемент в стеке (LIFO)
    public Object peek() {
        return arr[top];
    }

    // возвращает первый элемент в стеке и удаляет его из коллекции
    public Object pop() {
        Object obj = peek();
        arr[top] = null;
        return obj;
    }

    public boolean isFull() {
        return top==size-1;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

public class Main {
    public static void main(String[] args) {
        //+Задание 1 - ArrayList#
        MyArrayList myArrayList = new MyArrayList(15);
        myArrayList.add(new Object());
        System.out.println(myArrayList.size());
        myArrayList.add(new Object());
        System.out.println(myArrayList.size());
        System.out.println(myArrayList.get(0));
        myArrayList.remove(1);
        System.out.println(myArrayList.size());
        myArrayList.clear();
        System.out.println(myArrayList.size());

        //+Задание 2 - LinkedList#
        MyLinkedList myLinkedList = new MyLinkedList();
        System.out.println("size: " + myLinkedList.size());
        myLinkedList.add(8);
        myLinkedList.add(7);
        myLinkedList.add(6);
        myLinkedList.add(5);
        System.out.println("size: " + myLinkedList.size());
        System.out.println("get: " + myLinkedList.get(2));
        myLinkedList.remove(0);
        System.out.println("get: " + myLinkedList.get(2));
        System.out.println("size: " + myLinkedList.size());
        myLinkedList.clear();
        System.out.println("size: " + myLinkedList.size());

        //Задание 3 - Queue#
        MyQueue myQueue = new MyQueue();
        System.out.println("size " + myQueue.size());
        myQueue.add(100);
        myQueue.add(101);
        myQueue.add(102);
        myQueue.add(103);
        myQueue.add(104);
        System.out.println("size " + myQueue.size());
        System.out.println("peek " + myQueue.peek());
        myQueue.remove(4);
        System.out.println("size " + myQueue.size());
        System.out.println("poll " + myQueue.poll());
        System.out.println("peek " + myQueue.peek());
        System.out.println("size " + myQueue.size());
        myQueue.clear();
        System.out.println("size " + myQueue.size());

        //Задание 4 - Stack#

    }
}
/*
 +Задание 1 - ArrayList#
        Написать свой класс MyArrayList как аналог классу ArrayList.
        Можно использовать 1 массив для хранения данных.
        Методы
        +add(Object value) добавляет элемент в конец
        +remove(int index) удаляет элемент под индексом
        +clear() очищает коллекцию
        +size() возвращает размер коллекции
        +get(int index) возвращает элемент под индексом

+Задание 2 - LinkedList#
        Написать свой класс MyLinkedList как аналог классу LinkedList.
        Нельзя использовать массив. Каждый элемент должен быть отдельным объектом-посредником(Node - нода) который хранит ссылку на предыдущий и следующий элемент коллекции (двусвязный список).
        Методы
        add(Object value) добавляет элемент в конец
        remove(int index) удаляет элемент под индексом
        clear() очищает коллекцию
        size() возвращает размер коллекции
        get(int index) возвращает элемент под индексом

+Задание 3 - Queue#
        Написать свой класс MyQueue как аналог классу Queue, который будет работать по принципу FIFO (first-in-first-out).
        Можно делать либо с помощью Node либо с помощью массива.
        Методы
        add(Object value) добавляет элемент в конец
        remove(int index) удаляет элемент под индексом
        clear() очищает коллекцию
        size() возвращает размер коллекции
        peek() возвращает первый элемент в очереди (FIFO)
        poll() возвращает первый элемент в очереди и удаляет его из коллекции


Задание 4 - Stack#
        Написать свой класс MyStack как аналог классу Stack, который работает по принципу LIFO (last-in-first-out).
        Можно делать либо с помощью Node либо с помощью массива.
        Методы
        push(Object value) добавляет элемент в конец
        remove(int index) удаляет элемент под индексом
        clear() очищает коллекцию
        size() возвращает размер коллекции
        peek() возвращает первый элемент в стеке (LIFO)
        pop() возвращает первый элемент в стеке и удаляет его из коллекции


        Задание 5 - HashMap#
        Написать свой класс MyHashMap как аналог классу HashMap.
        Нужно делать с помощью односвязной Node.
        Не может хранить две ноды с одинаковых ключами одновременно.
        Методы
        put(Object key, Object value) добавляет пару ключ + значение
        remove(Object key) удаляет пару по ключу
        clear() очищает коллекцию
        size() возвращает размер коллекции
        get(Object key) возвращает значение(Object value) по ключу
 */
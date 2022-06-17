/*Задание 3 - Queue#
        Написать свой класс MyQueue как аналог классу Queue, который будет работать по принципу FIFO (first-in-first-out).
        Можно делать либо с помощью Node либо с помощью массива.
        Методы
        +add(Object value) добавляет элемент в конец
        +remove(int index) удаляет элемент под индексом
        +clear() очищает коллекцию
        +size() возвращает размер коллекции
        +peek() возвращает первый элемент в очереди (FIFO)
        +poll() возвращает первый элемент в очереди и удаляет его из коллекции
*/


import java.util.Objects;

public class MyQueue {
    private int size;
    private Node head; //first
    private Node tail; //last

    private static class Node {
        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
        }

        public static void cleanNode(Node node) {
            node.data = null;
            node.next = null;
        }
    }

    //add element at the end
    public void add(Object value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = head;
            tail.next = newNode;
        } else {
            Node temp = tail;
            tail = newNode;
            tail.next = temp;
        }
        size++;
    }

    //return 1st element in queue (FIFO)
    public Object peek() {
        if (size == 0) {
            return null;
        }
        return head.data;
    }

    //return 1st element in queue and remove it from collection
    public Object poll() {
        if (head == null) {
            tail = null;
            return null;
        }
        Object obj = peek();
        Node last = tail;
        while (head != last.next) {
            last = last.next;
        }
        head = last;//next element become head
        System.out.println("yyyyyyyy" + head.data + " " + obj);
        size--;
        return obj;
    }

    //remove element by index
    public void remove(int index) {
        Node currentNode = tail;
        Node prevNode = currentNode;
        Objects.checkIndex(index, size);//throw index out of bound error
        //find currentNode
        for (int i = size - 1; i > index; i--) {
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
        if (index == 0) {
            head = prevNode;
            head.next = null;
        } else if (index == size - 1) {
            tail = tail.next;
        } else {
            prevNode.next = currentNode.next;
        }
        Node.cleanNode(currentNode);
        size--;
    }

    //clear collection
    public void clear() {
        for (int i = size - 1; i > -1; i--) {
            remove(i);
        }
    }

    //return collection size
    public int size() {
        return size;
    }
}


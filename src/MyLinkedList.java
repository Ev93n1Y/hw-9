/*
Задание 2 - LinkedList#
        Написать свой класс MyLinkedList как аналог классу LinkedList.
        Нельзя использовать массив. Каждый элемент должен быть отдельным объектом-посредником(Node - нода) который хранит ссылку на предыдущий и следующий элемент коллекции (двусвязный список).
        Методы
        +add(Object value) добавляет элемент в конец
        +remove(int index) удаляет элемент под индексом
        +clear() очищает коллекцию
        +size() возвращает размер коллекции
        +get(int index) возвращает элемент под индексом
*/

import java.util.Objects;

public class MyLinkedList<T> {
    public MyLinkedList() {
    }

    private Node head;
    private Node tail;
    private int size = 0;

    private class Node {
        private Node prev;
        private Node next;
        private T data;

        public Node(Node prev, T data, Node next) {
            this.prev = prev;
            this.data = data;
            this.next = next;
        }
    }

    //add Object at the end
    public void add(T value) {
        Node prevNode = this.tail;
        Node newNode = new Node(prevNode, value, null);
        this.tail = newNode;
        if (head == null) {
            this.head = newNode;
        } else {
            prevNode.next = newNode;
        }
        this.size++;
    }

    //get Object by index
    public T get(int index) {
        return nodeByIndex(index).data;
    }

    //remove Object by index
    public void remove(int index) {
        Objects.checkIndex(index, size);
        Node toRemove = nodeByIndex(index);
        toRemove.data = null;
        if (index == 0) {
            toRemove.next.prev = null;
            this.head = toRemove.next;
            toRemove.next = null;
        } else if (index == size - 1) {
            toRemove.prev.next = null;
            this.tail = toRemove.prev;
            toRemove.prev = null;
        } else {
            toRemove.prev.next = toRemove.next;
            toRemove.next.prev = toRemove.prev;
        }
        size--;
    }

    //clear collection
    public void clear() {
        Node toClean = this.tail;
        while (size != 0) {
            toClean.data = null;
            if (size > 1) {
                toClean = toClean.prev;
                toClean.next.prev = null;
                toClean.next = null;
            }
            size--;
        }
    }

    //return collection size
    public int size() {
        return this.size;
    }

    //return node by index
    private Node nodeByIndex(int index) {
        Objects.checkIndex(index, size);
        Node node = this.head;
        if (index == 0) {
            return node;
        }
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
}

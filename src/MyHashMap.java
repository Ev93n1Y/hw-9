/*
Задание 5 - HashMap#
        Написать свой класс MyHashMap как аналог классу HashMap.
        Нужно делать с помощью односвязной Node.
        Не может хранить две ноды с одинаковых ключами одновременно.
        Методы
        +put(Object key, Object value) добавляет пару ключ + значение
        remove(Object key) удаляет пару по ключу
        +clear() очищает коллекцию
        +size() возвращает размер коллекции
        +get(Object key) возвращает значение(Object value) по ключу*/


import java.util.Objects;

public class MyHashMap {
    private int size;
    private Node last;

    private static class Node {
        Object key;
        Object value;
        Node next;

        public Node(Object key, Object value, Node next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    //add new Node key + value
    public void put(Object key, Object value) {
        if (noCollision(key)) {
            last = new Node(key, value, last);
            size++;
        } else {
            throw new IndexOutOfBoundsException("Hashcode collision!");
        }
    }

    //remove Node by key
    public void remove(Object key) {
        findObject(key);
        //записать в пред ноде следующей ноду что после текущей(удляемой)
        //текущую ноду удаляем, походу нужно унифицировать метод клир и ремув
    }

    //clear collection
    public void clear() {
        Node prev;
        while (size != 0) {//or last!=null
            last.key = null;
            last.value = null;
            prev = last.next;
            last.next = null;
            last = prev;
            size--;
        }
    }

    //return collection size
    public int size() {
        return size;
    }

    // return Object value by key
    public Object get(Object key) {
        return Objects.requireNonNull(findObject(key)).value;
    }

    //return no collision of key
    private boolean noCollision(Object keyObj) {
        return findObject(keyObj) == null;
    }

    //return Node with Object by key
    private Node findObject(Object keyObj) {
        Node temp = last;
        while (size > 0) {
            if (temp.key.equals(keyObj)) {
                return temp;
            }
            temp = temp.next;
            size--;
        }
        return null;
    }
}

/*
Задание 5 - HashMap#
        Написать свой класс MyHashMap как аналог классу HashMap.
        Нужно делать с помощью односвязной Node.
        Не может хранить две ноды с одинаковых ключами одновременно.
        Методы
        +put(Object key, Object value) добавляет пару ключ + значение
        +remove(Object key) удаляет пару по ключу
        +clear() очищает коллекцию
        +size() возвращает размер коллекции
        +get(Object key) возвращает значение(Object value) по ключу*/


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
        Node prevNode = findPrevObject(key);
        if (prevNode != null) {
            prevNode.next = deleteObject(prevNode.next);//delete and prev node gets right next link
        } else {
            throw new IndexOutOfBoundsException("Key doesn't exist");
        }
    }

    //clear collection
    public void clear() {
        Node last = this.last;
        while (size != 0) {
            last = deleteObject(last);
        }
    }

    //delete Node and return next Node link
    private Node deleteObject(Node node) {
        Node nextNode;
        node.key = null;//delete last key
        node.value = null;//delete last value
        nextNode = node.next;//temporary keep link to next element
        node.next = null;//delete link to next element
        size--;
        return nextNode;
    }

    //return collection size
    public int size() {
        return size;
    }

    // return Object value by key or null
    public Object get(Object key) {
        Node element = findObject(key);
        return element != null ? element.value : null;
    }

    //return no collision of key
    private boolean noCollision(Object keyObj) {
        return findObject(keyObj) == null;
    }

    //return Node by key or null
    private Node findObject(Object keyObj) {

        Node prevObj = findPrevObject(keyObj);
        return prevObj != null ? size==1?prevObj:prevObj.next : null;
    }

    //return prevNode  by key or null
    private Node findPrevObject(Object keyObj) {
        Node currentNode = last;
        Node prevNode = currentNode;//keep prev Node
        int numToFind = size;
        while (numToFind != 0) {

            if (currentNode.key.equals(keyObj)) {
                return prevNode;
            }
            prevNode = currentNode;
            currentNode = currentNode.next;
            numToFind--;
        }

        return null;
    }
}

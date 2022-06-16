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
        get(Object key) возвращает значение(Object value) по ключу*/


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

    //добавляет пару ключ + значение
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
        //использовать метод get(унифицировать)
        //записать в пред ноде следующей ноду что после текущей(удляемой)
        //текущую ноду удаляем, походу нужно унифицировать метод клир и ремув
    }

    //оclear collection
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

    // возвращает значение(Object value) по ключу
    public void get(Object key) {
        //тут прописать поиск ноды по ключу листая от последней ноды
        //equals
    }


    private boolean noCollision(Object keyObj) {
        while (size > 0) {//last!=0
            if (last.key.equals(keyObj)) {
                return false;
            }
            last = last.next;
            size--;
        }
        return true;
    }

    private boolean isEmpty() {
        return size <= 0;
    }
}

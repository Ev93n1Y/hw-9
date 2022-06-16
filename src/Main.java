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
        MyStack myStack = new MyStack(20);

        //Задание 5 - HashMap#

    }
}
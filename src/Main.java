public class Main {
    public static void main(String[] args) {
        //+Задание 1 - ArrayList#
        System.out.println("ArrayList***************");
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
        System.out.println("myLinkedList************");
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
        System.out.println("myQueue*****************");
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
        System.out.println("myStack*****************");
        MyStack myStack = new MyStack(10);
        System.out.println("size " + myStack.size());
        myStack.push("9");
        myStack.push("8");
        myStack.push("7");
        myStack.push("6");
        myStack.push("5");
        myStack.push("4");
        myStack.push("3");
        myStack.push("2");
        myStack.push("1");
        myStack.push("0");
        System.out.println("size " + myStack.size());
        myStack.remove(1);
        System.out.println("pop "+myStack.pop());
        System.out.println("peek "+myStack.peek());
        System.out.println("size " + myStack.size());
        myStack.clear();
        System.out.println("size " + myStack.size());

        //Задание 5 - HashMap#

    }
}
public class Main {
    public static void main(String[] args) {

        //+Задание 1 - ArrayList#
        System.out.println("myArrayList***************");
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(1);
        System.out.println("size: " + myArrayList.size());
        myArrayList.add(2);
        System.out.println("size: " + myArrayList.size());
        System.out.println("get: " + myArrayList.get(0));
        myArrayList.remove(1);
        System.out.println("size: " + myArrayList.size());
        myArrayList.clear();
        System.out.println("size: " + myArrayList.size());
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);
        System.out.println("get: " + myArrayList.get(2));


        //+Задание 2 - LinkedList#
        System.out.println("myLinkedList************");
        MyLinkedList<Double> myLinkedList = new MyLinkedList<>();
        System.out.println("size: " + myLinkedList.size());
        myLinkedList.add(8.01);
        myLinkedList.add(7.02);
        myLinkedList.add(6.03);
        myLinkedList.add(5.04);
        System.out.println("size: " + myLinkedList.size());
        System.out.println("get: " + myLinkedList.get(2));
        myLinkedList.remove(0);
        System.out.println("get: " + myLinkedList.get(2));
        System.out.println("size: " + myLinkedList.size());
        myLinkedList.clear();
        System.out.println("size: " + myLinkedList.size());
        //System.out.println("get: " + myLinkedList.get(0));//compilation err

        //Задание 3 - Queue#
        System.out.println("myQueue*****************");
        MyQueue<Character> myQueue = new MyQueue<>();
        System.out.println("size " + myQueue.size());
        myQueue.add('A');
        myQueue.add('B');
        myQueue.add('C');
        myQueue.add('D');
        myQueue.add('E');
        System.out.println("size " + myQueue.size());
        System.out.println("peek " + myQueue.peek());
        myQueue.remove(4);
        System.out.println("size " + myQueue.size());
        System.out.println("poll " + myQueue.poll());
        System.out.println("peek " + myQueue.peek());
        System.out.println("poll " + myQueue.poll());
        System.out.println("peek " + myQueue.peek());
        System.out.println("size " + myQueue.size());
        myQueue.clear();
        System.out.println("size " + myQueue.size());

        //Задание 4 - Stack#
        System.out.println("myStack*****************");
        MyStack<String> stringStack = new MyStack<>();
        System.out.println("size " + stringStack.size());
        stringStack.push("9");
        stringStack.push("8");
        stringStack.push("7");
        stringStack.push("6");
        stringStack.push("5");
        stringStack.push("4");
        stringStack.push("3");
        stringStack.push("2");
        stringStack.push("1");
        stringStack.push("0");
        System.out.println("size " + stringStack.size());
        stringStack.remove(1);
        System.out.println("pop " + stringStack.pop());
        System.out.println("peek " + stringStack.peek());
        System.out.println("size " + stringStack.size());
        stringStack.clear();
        System.out.println("size " + stringStack.size());

        //Задание 5 - HashMap#
        MyHashMap<Integer,String> myHashMap = new MyHashMap<>();
        System.out.println("myHashMap***************");
        myHashMap.put("data1".hashCode(), "data1");
        myHashMap.put("data2".hashCode(), "data2");
        myHashMap.put("data3".hashCode(), "data3");
        myHashMap.put("data4".hashCode(), "data4");
        myHashMap.put("data5".hashCode(), "data5");
        System.out.println("size " + myHashMap.size());
        myHashMap.remove("data2".hashCode());
        System.out.println("get " + myHashMap.get("data2".hashCode()));
        System.out.println("get " + myHashMap.get("data3".hashCode()));
        System.out.println("get " + myHashMap.get("data4".hashCode()));
        System.out.println("size " + myHashMap.size());
        myHashMap.clear();
        System.out.println("size " + myHashMap.size());
        System.out.println("get " + myHashMap.get("data4".hashCode()));
        myHashMap.clear();
        System.out.println("size " + myHashMap.size());
        myHashMap.put("data8".hashCode(), "data8");
        //myHashMap.put("data9".hashCode(), "data9");
        System.out.println("get " + myHashMap.get("data8".hashCode()));
        //System.out.println("get " + myHashMap.get("data9".hashCode()));
        myHashMap.clear();
        myHashMap.put("qwerty".hashCode(), "qwerty");
        System.out.println("get " + myHashMap.get("qwerty".hashCode()));



    }
}
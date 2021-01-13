//package datastructure;
//
//class CircularQueue {
//    private int capacity;
//    private int front;
//    private int rear;
//    private int[] array;
//    private boolean isFull;
//
//    public CircularQueue(int capacity) {
//        this.capacity = capacity;
//        this.front = 0;
//        this.rear = 0;
//        this.array = new int[capacity];
//        this.isFull = false;
//    }
//
//    public boolean put(int value) {
//        if (rear >= front &&  rear < capacity ) {
//            array[rear++] = value;
//        } else if (rear == capacity) {
//            if(front > 0) {
//                array[0] = value;
//                rear = 0;
//                return true;
//            }
//        } else if (rear < front && rear <capacity) {
//            if( rear+1 != front) {
//                array[rear++] = value;
//                return true;
//            }
//        }
//        return isFull;
//    }
//
//    public int get() {
//        if
//    }
//
////    public int peek() {
////
////    }
//
//    public String toString() {
//
//        StringBuilder str = new StringBuilder();
//        if(array.length ==0) {
//            str = new StringBuilder("[ ]");
//        }else {
//            str.append("[ ");
//
//            for (int i = front; i < rear; i++) {
//                str.append(array[i]).append(" ");
//            }
//
//
//            str.append(" ]");
//        }
//
//        return str.toString();
//
//    }
//}
//
//class CircularQueueTest {
//    public static void main(String[] args) {
//        CircularQueue queue = new CircularQueue(5);
//        System.out.println(queue);
//
//        queue.put(1);
//        queue.put(2);
//        queue.put(3);
//        queue.put(4);
//        queue.put(5);
//        queue.put(6);
//        System.out.println(queue);
//
////        System.out.println((queue.get()));
////        System.out.println((queue.get()));
////        System.out.println((queue.get()));
////        System.out.println((queue.get()));
////        System.out.println(queue);
////
////        queue.put(4);
////        queue.put(5);
////        queue.put(6);
////        System.out.println(queue);
////
////        System.out.println((queue.get()));
////        System.out.println((queue.get()));
////        System.out.println((queue.peek()));
////        System.out.println((queue.peek()));
////        System.out.println((queue.get()));
////        System.out.println(queue);
//    }
//}
package datastructure;

class LinearQueue {
    private int capacity;
    private int front;
    private int rear;
    private int[] array;

    public LinearQueue(int capacity) {
        this.capacity = capacity;
        this.front = 0;
        this.rear = 0;
        this.array = new int[capacity];
    }

    public boolean put(int value) {
        if (rear < capacity){
            array[rear++] = value;
            return  true;
        }
        return false;

    }

    public int get() {
        int value;
        if(array.length == 0 || front >= rear) {
            return -1;
        } else {
            value = array[front++];
            return value;
        }
    }

    public int peek() {

        if(array.length == 0 || front >= rear) {
            return -1;
        } else {
            return array[front];

        }

    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        if(array.length ==0) {
            str = new StringBuilder("[ ]");
        }else {
            str.append("[ ");

            for (int i = front; i < rear; i++) {
                str.append(array[i]).append(" ");
            }


            str.append(" ]");
        }

        return str.toString();
    }
}

class LinearQueueTest {
    public static void main(String[] args) {
        LinearQueue queue = new LinearQueue(5);
        System.out.println(queue);

        queue.put(1);
        queue.put(2);
        queue.put(3);
        System.out.println(queue);

        System.out.println((queue.get()));
        System.out.println((queue.get()));
        System.out.println((queue.get()));
        System.out.println((queue.get()));
        System.out.println(queue);

        queue.put(4);
        queue.put(5);
        queue.put(6);
        System.out.println(queue);

        System.out.println((queue.get()));
        System.out.println((queue.get()));
        System.out.println((queue.peek()));
        System.out.println((queue.peek()));
        System.out.println((queue.get()));
        System.out.println(queue);
    }
}
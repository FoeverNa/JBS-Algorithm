package datastructure;

class Node {
    public int value;
    public Node next;
    public Node prev;

    public Node(int value, Node next, Node prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }
}

class DoublyLinkedList {
    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {

        return head == null;

    }

    public boolean prepend(int value) {

        if (head == null) {
            head = new Node(value, null, null);
            tail = head;
        } else {
            Node curr = head;
            head = new Node(value, curr, null);
            curr.prev = head;
        }
        return true;

    }

    public boolean append(int value) {
        if (head == null) {
            head = new Node(value, null, null);
            tail = head;
        } else {
            Node prev = null;
            Node curr = head;

            while (curr != null) {
                prev = curr;
                curr = curr.next;

            }
            prev.next = new Node(value, null, prev.prev);
            tail = prev.next;
        }
        return true;
    }

    public boolean setHead(int index) {

        if (head == null) {
            return false;
        } else {
            Node curr = head;
            for (int i = 0; i < index; i++) {
                if (curr.next == null) {
                    return false;
                } else {
                    curr = curr.next;
                }
            }
            head = curr;
            return true;
        }
    }

    public int access(int index) {
        if (head == null) {
            return -1;
        } else {
            Node curr = head;
            for (int i = 0; i < index; i++) {
                if (curr.next == null) {
                    return -1;
                } else {
                    curr = curr.next;
                }
            }
            head = curr;
            return curr.value;
        }
    }

    public boolean insert(int index, int value) {
        if (head == null) {
            head = new Node(value, null, null);
            tail = head;
            return true;
        } else {
            Node prev = null;
            Node curr = head;
            for (int i = 0; i < index; i++) {
                if (curr == null) {
                    return false;
                } else {
                    prev = curr;
                    curr = curr.next;
                }
            }
            prev.next = new Node(value, curr, prev);
            curr.prev = prev.next;
            return true;
        }
    }

    public boolean remove(int index) {
        if (head == null) {
            return false;
        } else {
            if (index == 0) {
                if(head.next == null){
                    head = null;
                } else {
                    head = head.next;
                }
            } else {
                Node prev = null;
                Node curr = head;

                for (int i = 0; i < index ; i++) {
                    if (curr == null) {
                        return false;
                    } else {
                        prev = curr;
                        curr = curr.next;
                    }
                }
                if (curr.next != null) {
                    prev.next = curr.next;
                    curr.next.prev = prev;
                } else {
                    prev.next = null;
                    tail = prev;
                }
            }
            }

        return true;

    }

    public String toString() {
        StringBuilder str = new StringBuilder();

        Node curr = head;

        while (curr != null) {
            str.append(curr.value).append(",");
            curr = curr.next;
        }

        return str.toString();

    }

    public String toStringInv() {
        String  str = "";

        Node curr = tail;

        while (curr != null) {
            str += curr.value +",";
            curr = curr.prev;
        }
        str = str.substring(str.length()-1);


        return str;
    }
}


class DoublyLinkedListTest {
    public static void main(String[] args) {
        DoublyLinkedList myList = new DoublyLinkedList();
        System.out.println(myList);

        for (int i = 0; i < 10; i++) {
            myList.append(i + 1);
        }
        System.out.println(myList);

        for (int i = 0; i < 10; i++) {
            myList.prepend(i + 1);
        }
        System.out.println(myList);

        int value = myList.access(3);
        System.out.println("myList.access(3) = " + value);

        myList.insert(8, 128);
        System.out.println(myList);

        myList.remove(17);
        System.out.println(myList);

        myList.setHead(10);
        System.out.println(myList);
    }
}
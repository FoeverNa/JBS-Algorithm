package datastructure.linkedlist;

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

        if(this.head == null) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean prepend(int value) {

        if (head == null) {
            head = new Node(value, null, null);
            tail = head;
        } else {
            Node node = new Node(value, this.head, null);
            this.head.prev = node;
            this.head = node;
            }
        return true;
    }

    public boolean append(int value) {
        if (head == null) {
            head = new Node(value, null, null);
            tail = head;
        } else {
            Node node = new Node(value, null, tail);
            tail.next = node;
            tail = node;
        }
        return true;
    }

    public boolean setHead(int index) {

        if (head == null) {
            return false;
        } else {
            Node curr = head;
            for (int i = 0; i < index; i++) {
                curr = curr.next;
                if (curr == null) {
                    return false;
                }
            }
            curr.prev = null;
            head = curr;
            if (head.next == null ) {
                tail = head;
            }
            return true;
        }
    }

    public int access(int index) {
        if (head == null) {
            return -1;
        } else {
            Node curr = head;
            for (int i = 0; i < index; i++) {
              curr = curr.next;
              if (curr == null) {
                  return -1;
              }
            }
            return curr.value;
        }
    }

    public boolean insert(int index, int value) {
        if (head == null && index > 0) {
            return false;
        }
        if (index ==0) {
            this.prepend((value));
            return true;
        }
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
            Node node = new Node(value, curr, prev);
            prev.next = node;
            curr.prev = node;

            return true;

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
                    head.prev = null;
                }
            } else {

                Node curr = head;

                for (int i = 0; i < index ; i++) {
                    if (curr == null) {
                        return false;
                    } else {
                        curr = curr.next;
                    }
                }
                if (curr.next != null) {
                    curr.prev.next = curr.next;
                    curr.next.prev = curr.prev;
                } else {
                    curr.prev.next = null;
                    tail = curr.prev;
                }
            }
            }

        return true;

    }

    public String toString() {
        StringBuilder str = new StringBuilder();

        Node curr = head;
        if (curr == null){
            return "[]";
        }

        while (curr != null) {
            str.append(curr.value).append(" ");
            curr = curr.next;
        }

        return str.toString();

    }

    public String toStringInv() {
        StringBuilder str = new StringBuilder();

        Node curr = tail;
        if (curr == null){
            return "[]";
        }

        while (curr != null) {
            str.append(curr.value).append(" ");
            curr = curr.prev;
        }

        return str.toString();
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
        System.out.println(myList.toStringInv());

        for (int i = 0; i < 10; i++) {
            myList.prepend(i + 1);
        }
        System.out.println(myList);
        System.out.println(myList.toStringInv());

        int value = myList.access(3);
        System.out.println("myList.access(3) = " + value);

        myList.insert(8, 128);
        System.out.println(myList);
        System.out.println(myList.toStringInv());

        myList.remove(4);
        System.out.println(myList);
        System.out.println(myList.toStringInv());

        myList.setHead(10);
        System.out.println(myList);
        System.out.println(myList.toStringInv());
    }
}
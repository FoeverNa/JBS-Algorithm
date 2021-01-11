//package datastructure;
//
//class Node {
//    public int value;
//    public Node next;
//
//    public Node(int value, Node next) {
//        this.value = value;
//        this.next = next;
//    }
//}
//
//class SinglyLinkedList {
//    private Node head;
//
//    public SinglyLinkedList() {
//        this.head = null;
//    }
//
//    public boolean isEmpty() {
//        return head == null;
//    }
//
//    public boolean prepend(int value) {
//        if(head == null){
//            head = new Node(0, null);
//            head.next = new Node(value, null); // head를 비워두는게아니라 head가 첫번째 noe가된다다        } else {
//            head.next = new Node(value,head.next);
//        }
//        //한줄로 고쳐야함
//
//        return true;
//    }
//
//    public boolean append(int value) { // 헤드빈경우만 따로처리하기
//        if(head == null){
//            head = new Node(0, null);
//            head.next = new Node(value, null);
//        } else {
//            Node searchNode = head.next;
//            while (searchNode.next != null){
//                searchNode = head.next;
//            }
//            searchNode.next = new Node(value, null);
//        }
//
//        return true;
//    }
//
//    public boolean setHead(int index) { //index 크면 false하기
//        Node searchNode = head;
//
//        if(head != null){
//            for (int i = 0; i <= index ; i++) {
//                searchNode = searchNode.next;
//            }
//            head.next = searchNode;
//        }
//
//        return true;
//
//    }
//
//    public int access(int index) {
//        Node searchNode = head;
//
//        if(head != null){
//            for (int i = 0; i <= index ; i++) {
//                searchNode = searchNode.next;
//            }
//            return searchNode.value;
//        }
//
//        return -1;
//    }
//
//    public boolean insert(int index, int  value) { //0일때 prepend
//        Node searchNode = head;
//        Node previousNode= null;
//
//        if(head == null) {
//            head = new Node(0, null);
//            head.next = new Node(value, null);
//        } else {
//            for (int i = 0; i <= index ; i++) {
//                previousNode = searchNode;
//                searchNode = searchNode.next;
//            }
//            previousNode.next = new Node(value, searchNode);
//        }
//
//        return true;
//
//    }
//
//    public boolean remove(int index) { //index 에다라 오류처리
//
//
//
//    }
//
//    public String toString() { // null일때 처리
//
//    }
//}
//
//
//class SinglyLinkedListTest {
//    public static void main(String[] args) {
//        SinglyLinkedList myList = new SinglyLinkedList();
//        System.out.println(myList);
//
//        for (int i = 0; i < 10; i++) {
//            myList.append(i + 1);
//        }
//        System.out.println(myList);
//
//        for (int i = 0; i < 10; i++) {
//            myList.prepend(i + 1);
//        }
//        System.out.println(myList);
//
//        int value = myList.access(3);
//        System.out.println("myList.access(3) = " + value);
//
//        myList.insert(8, 128);
//        System.out.println(myList);
//
//        myList.remove(4);
//        System.out.println(myList);
//
//        myList.setHead(10);
//        System.out.println(myList);
//    }
//}
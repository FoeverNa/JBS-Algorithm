package datastructure;

class MyArrayList {
    private int capacity;
    private int length;
    private int[] array;

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        length = 0;
        array = new int[capacity];
    }

    public boolean isEmpty() {
        return length == 0; // 삼항연산자 꼭써야되나?

    }

    public boolean prepend(int value) {
        int[] newArray;
        if (length == capacity) {
            capacity *=2;
        }
        newArray = new int[capacity];
        System.arraycopy(array, 0, newArray, 1, array.length);
        newArray[0] = value;
        array = newArray;
        length++;
        return true;
    }

    public boolean append(int value) { // 더구현 해야된다
        int[] newArray;
        if (length == capacity) {
            capacity *=2;
        }
        array[length] = value; // length++였음
        length++;

        return true;
    }

    public boolean setHead(int index) { //원래는 메모리를 자르는 형태로 가는게 베스티인데 구현 java에서는못하는건가
        //방어코드 만들기 => index가 cpacity보다 index가 커버리면 터지니까

        //새로 배여만들어서 index만큼 줄어든애로 만들어서 옮기기
        System.arraycopy(array, index, array, 0, length-index);
        //capcity 감소, legnth 감소소
       return true;
    }

    public int access(int index) {
        //방어코드필요
        //capacity밖으로나가면 에러나니까 ok but capa안에 length는 원하지않는 값에 접근하게됨
        // new ValueException을 띄워준다
        return array[index];
    }

    public boolean insert(int index, int value) {
        int[] newArray;
        if (length == capacity) {
            capacity *=2;
        }
        newArray = new int[capacity];
        System.arraycopy(array, 0, newArray, 0, index-1);
        newArray[index]= value;
        //cpa넌믄경우와 아닌경우로 구분해서 구현
        // ==>>>>>>>>>>>>>>거꾸로해야하는거 다시 듣기
        // apend prepend insert로 대체하기
        return true;
    }

    public boolean remove(int index) {
        //방어코드
        //땡겨주기

        length--;
        return true;
    }

    public String toString() {
       String s= "";
       // isempty
        //string builder사용해서 구현

        return "ㄷㄷㄷ";
    }
}

class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList(8);
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

        myList.remove(4);
        System.out.println(myList);

        myList.setHead(10);
        System.out.println(myList);
    }
}
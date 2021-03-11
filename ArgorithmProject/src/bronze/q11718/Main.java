package bronze.q11718;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        while (sc.hasNextLine()){
            list.add(sc.nextLine());
        }
        sc.close();
        for (String s : list) {
            System.out.println(s);
        }
    }
}

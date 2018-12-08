package 프로그래머스_같은숫자는싫어;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(4);
        list.add(5);
        int temp = 0;
        for (int s : list) {
            if (temp == s) {
            } else {
                System.out.println(s);
                temp = s;
            }
        }

    }
}

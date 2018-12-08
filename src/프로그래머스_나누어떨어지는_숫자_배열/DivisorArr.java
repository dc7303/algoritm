package ���α׷��ӽ�_�����������_����_�迭;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * array�� �� element �� divisor�� ������ �������� ���� ������������ ������ �迭�� ��ȯ�ϴ� �Լ�, solution�� �ۼ����ּ���.
divisor�� ������ �������� element�� �ϳ��� ���ٸ� �迭�� -1�� ��� ��ȯ�ϼ���.

���ѻ���
arr�� �ڿ����� ���� �迭�Դϴ�.
���� i, j�� ���� i �� j �̸� arr[i] �� arr[j] �Դϴ�.
divisor�� �ڿ����Դϴ�.
array�� ���� 1 �̻��� �迭�Դϴ�.
����� ��
arr         divisor return
[5, 9, 7, 10]   5   [5, 10]
[2, 36, 1, 3]   1   [1, 2, 3, 36]
[3,2,6] 10  [-1]
����� �� ����
����� ��#1
arr�� ���� �� 5�� ������ �������� ���Ҵ� 5�� 10�Դϴ�. ���� [5, 10]�� �����մϴ�.

����� ��#2
arr�� ��� ���Ҵ� 1���� ������ �������ϴ�. ���Ҹ� ������������ ������ [1, 2, 3, 36]�� �����մϴ�.

����� ��#3
3, 2, 6�� 10���� ������ �������� �ʽ��ϴ�. ������ �������� ���Ұ� �����Ƿ� [-1]�� �����մϴ�.
 * @author mark
 *
 */
public class DivisorArr {

/*    public static void main(String[] args) {
        DivisorArr d = new DivisorArr();
        int arr[] = {5, 9, 7, 10};
        int divisor = 5;
        int [] result = d.solution(arr, divisor);
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        if(list.size() == 0) {
            list.add(-1);
        }
       
        int[] answer = new int[list.size()];
       
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }*/
    
    public int[] divisible(int[] array, int divisor) {
        //ret�� array�� ���Ե� ������, divisor�� ������ �������� ���ڸ� ������� ��������.
        return Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray();
    }
    // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
    public static void main(String[] args) {
        DivisorArr div = new DivisorArr();
        int[] array = {5, 9, 7, 10};
        System.out.println( Arrays.toString( div.divisible(array, 5) ));
        System.out.println(Arrays.toString(array));
    }
}

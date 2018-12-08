package ���α׷��ӽ�_�������ڴ½Ⱦ�;

import java.util.ArrayList;
import java.util.List;

/**
 * �迭 arr�� �־����ϴ�. �迭 arr�� �� ���Ҵ� ���� 0���� 9������ �̷���� �ֽ��ϴ�. 
 * �̶�, �迭 arr���� ���������� ��Ÿ���� ���ڴ� �ϳ��� ����� ���� �����Ϸ��� �մϴ�. 
 * �迭 arr���� ���� �ǰ� ���� ������ return �ϴ� solution �Լ��� �ϼ��� �ּ���. 
 * ��, ���ŵ� �� ���� ������ ��ȯ�� ���� �迭 arr�� ���ҵ��� ������ �����ؾ� �մϴ�.

�������

arr = [1, 1, 3, 3, 0, 1, 1] �̸� [1, 3, 0, 1] �� return �մϴ�.
arr = [4, 4, 4, 3, 3] �̸� [4, 3] �� return �մϴ�.
�迭 arr���� ���������� ��Ÿ���� ���ڴ� �����ϰ� ���� ������ return �ϴ� solution �Լ��� �ϼ��� �ּ���.

���ѻ���
�迭 arr�� ũ�� : 1,000,000 ������ �ڿ���
�迭 arr�� ������ ũ�� : 0���� ũ�ų� ���� 9���� �۰ų� ���� ����
 * @author mark
 *
 */
public class NotEqualsNumber {
    
    public static void main(String[] args) {
        NotEqualsNumber not = new NotEqualsNumber();
        int[] arr = {1,1,3,3,0,1,1};
        int[] result = not.solution(arr);
        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        
    }
    
/*    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList();
        for(int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        
        for(int i = 0; i < list.size()-1; i++) {
            for(int j = i+1; j < list.size(); j++) {
                if(list.get(i) == list.get(j)) {
                    list.remove(j);
                    j--;
                }else if(list.get(i) != list.get(j)) {
                    break;
                }
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        System.out.println("Hello Java");

        return answer;
      
    }*/
    
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int temp = -1;
        for(int i : arr) {
            if(temp == i) {}
            else {
                list.add(i);
                temp = i;
            }
        }
        
        int[]result = new int[list.size()];
        for(int i =0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}

package 프로그래머스_같은숫자는싫어;

import java.util.ArrayList;
import java.util.List;

/**
 * 배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 
 * 이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다. 
 * 배열 arr에서 제거 되고 남은 수들을 return 하는 solution 함수를 완성해 주세요. 
 * 단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다.

예를들면

arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.

제한사항
배열 arr의 크기 : 1,000,000 이하의 자연수
배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수
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

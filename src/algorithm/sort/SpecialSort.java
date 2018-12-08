package algorithm.sort;
/**
 * ���� ��ȭ���� ����
 * 
 * n���� ������ ���� �迭�� �ִ�. �� �迭�� ���������� ���� ������ ��� ������ �ִ�. ���� ����� �� �迭�� �� Ư���� ������� �����ؾ� �Ѵ�.
 * ������ �ǰ� �� ��, ���� ������ ���ʿ� ���������� ���ʿ� �־�� �Ѵ�. ���� ���������� ���������� �������� ������ ����� �Ѵ�.
 * ��. -1 1 3 -2 2 ��� : -1 -2 1 3 2.
 * @author mark
 *
 */
public class SpecialSort {
    
    public static void main(String[] args) {
        int[] arr = {-1, 1, 3, -2, 2, -3, 5, -7};
        
        int result[] = SpecialSort.arrSort(arr);
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    
    public static int[] arrSort(int[] arr) {
        int temp = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length-1; j++) {
                if(arr[j] > 0 && arr[j+1] < 0) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
        return arr;
    }
}

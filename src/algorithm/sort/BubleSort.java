package algorithm.sort;

public class BubleSort {

	public static void main(String[] args) {
		int [] num = {10, 5, 8, 4, 2, 7, 1, 3, 6, 9};
		
		int temp;
		//���� ���� ����
		
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < num.length-1; j++) {
				if(num[j] > num[j+1]) {
					temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
		}
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] +"\t");
		}
		System.out.println();
		//���� ���� ����
		
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < num.length-1; j++) {
				if(num[j] < num[j+1]) {
					temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
		}
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] +"\t");
		}
	}
	

}

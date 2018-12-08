package algorithm.sort;

public class SelectSort {

	public static void main(String[] args) {
		int [] num = {10, 5, 8, 4, 2, 7, 1, 3, 6, 9};
		
		int temp;
		//오름차순
		for(int i = 0; i < num.length; i++) {
			for(int j = i; j < num.length; j++) {
				if(num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];;
					num[j] = temp;
				}
			}
		}
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t");
		}
		
		System.out.println();
		
		//내림차순
		for(int i = 0; i < num.length; i++) {
			for(int j = i; j < num.length; j++) {
				if(num[i] < num[j]) {
					temp = num[i];
					num[i] = num[j];;
					num[j] = temp;
				}
			}
		}
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t");
		}
	}

}

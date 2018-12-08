package algorithm.binarySeach;

public class binarySeach {

	public static void main(String[] args) {
		int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		int i = 0;
		int j = num.length;
		int temp;
		
		//7을 이진탐색을 이용해서 찾아보자
		while(true) {
			temp = (i + j) / 2;
			if(num[temp] > 7) {
				j = temp -1;
			}else if(num[temp] < 7){
				i = temp + 1;
			}else {
				System.out.println(num[temp]);
				break;
			}
		}

	}

}

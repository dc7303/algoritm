package ���ϴ°Խ����Ǽ�;

import java.util.Scanner;

public class BoardPage {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        System.out.println("�� �Խù� ���� �Է��Ͻÿ�.");
        int m = sc.nextInt();  //�� �Խù� ��
        System.out.println("�� �������� ������ �Խù� ���� �Է��Ͻÿ�");
        int n = sc.nextInt();  //�� �������� ������ �Խù� ��
        
        if(m%n==0) {
            result = (m/n);
        }else if(m > n) {
            result = (m/n)+1;
        }else {
            result = (m/n);
        }
        System.out.println(result);
        
        
    }
}

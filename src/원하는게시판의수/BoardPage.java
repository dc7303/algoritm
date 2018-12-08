package 원하는게시판의수;

import java.util.Scanner;

public class BoardPage {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        System.out.println("총 게시물 수를 입력하시오.");
        int m = sc.nextInt();  //총 게시물 수
        System.out.println("한 페이지에 보여줄 게시물 수를 입력하시오");
        int n = sc.nextInt();  //한 페이지에 보여줄 게시물 수
        
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

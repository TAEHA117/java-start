package scanner;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        /* 문제 : 홀수 짝수
        * 사용자로부터 하나의 정수를 입력받고, 이 정수가 홀수인지 짝수인지 판별하기
        *
        * 실행 결과 예시:
        * 하나의 정수를 입력하세요 : 1
        * 입력한 숫자 1은 홀수입니다.
        *
        * 하나의 정수를 입력하세요 : 4
        * 입력한 숫자 4는 짝수입니다.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("하나의 정수를 입력하세요");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("입력한 숫자 " + num + "은 짝수입니다.");
        } else if (num % 2 == 1) {
            System.out.println("입력한 숫자 " + num + "은 홀수입니다.");
        }

    }
}

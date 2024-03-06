package scanner;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        /* 문제 : 구구단 출력
        * 사용자로부터 하나의 정수 n을 입력받고,
        * 입력받은 정수 n의 구구단을 출력하는 프로그램 작성
        *
        * 예시
        * 구구단의 단 수를 입력해주세요 : 8
        * 8단의 구구단 :
        * 8x 1 = 8.....*/

        Scanner sc = new Scanner(System.in);

        System.out.println("구구단의 단 수를 입력해주세요");
        int dan = sc.nextInt();
        System.out.println(dan + "단의 구구단");

        for(int i=1; i <= 9; i++) {
                System.out.println(dan + "x" + i + "=" + dan*i);
            }
        }
    }


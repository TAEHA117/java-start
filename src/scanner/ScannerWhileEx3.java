package scanner;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        /* 문제 : 입력한 숫자의 합계와 평균
        * 사용자로부터 여러 개의 숫자를 입력받고, 그 숫자들의 합계와
        * 평균을 계산하는 프로그램을 작성하시오
        * 사용자는 숫자를 입력하고, 마지막에는 -1을 입력하여 숫자 입력을 종료한다고 가정하자
        * 모든 숫자의 입력이 끝난 후에는, 숫자들의 합계 sum과평균 average를 출력하시오
        * 평균은 소수점 아래까지 계산하시오
        *
        * 예시
        *
        * 숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요
        *
        * 1
        * 2
        * 3
        * 4
        * -1
        * 입력한 숫자들의 합계 : 10
        * 입력한 숫자들의 평균 : 2.5*/

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int input = 0;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요");

        while (true) {
            input = sc.nextInt();
            if(input == -1) {
                System.out.println("계산을 마칩니다.");
                break;
            }
            sum += input;
            count++;
        }
        double average = (double)sum / count;
        System.out.println("입력한 숫자들의 합계 : " + sum);
        System.out.println("입력한 숫자들의 평균 : " + average);
    }

}

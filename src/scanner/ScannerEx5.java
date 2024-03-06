package scanner;

import java.util.Scanner;

public class ScannerEx5 {
    public static void main(String[] args) {
        /* 문제 : 사이 숫자
        * 사용자로부터 두 개의 정수를 입력받고, 이 두 정수 사이의 모든 정수를 출력하는 프로그램을 작성하시오
        * 사용자에게 첫 번째 숫자를 입력받으세요. num1
        * 사용자에게 두 번째 숫자를 입력받으세요. num2
        * 만약 첫 번째 숫자 num1이 두 번째 숫자 num2보다 크다면, 두 숫자를 교환하시오
        *
        * 참고 : 교환을 위해 임시 변수 사용을 고려하시오
        *
        * num1부터 num2까지의 각 숫자를 출력하시오
        * 출력 결과의 유의하시오. 다음 예시와 같이 2,3,4,5처럼 ,로 구분해서 출력해야 한다.
        *
        * 예시
        * 첫 번째 숫자를 입력하세요 : 2
        * 두 번째 숫자를 입력하세요 : 5
        * 두 숫자 사이의 모든 정수 : 2,3,4,5*/

        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요");
        int num1 = sc.nextInt();

        System.out.println("두 번째 숫자를 입력하세요");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.println("두 숫자 사이의 모든 정수 : ");
        for(int i=num1; i<=num2; i++) {
            System.out.print(i);
            if(i != num2) { // 현재 출력중인 정수가 num2와 같지 않을 때만 콤마를 출력한다.
                System.out.print(",");
            }
        }
    }
}

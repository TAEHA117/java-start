package scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {

        /* 예제3
        * 사용자로부터 두 개의 정수를 입력 받고, 더 큰 수를 출력하는 프로그램 작성
        * 두 숫자가 같은 경우 두 숫자는 같다고 출력하면 된다.
        * */

        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요 : ");
        int num1 = sc.nextInt();

        System.out.println("두 번째 숫자를 입력하세요 : ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("더 큰 숫자 " + num1);
        } else if(num1 < num2) {
            System.out.println("더 큰 숫자 " + num2);
        } else {
            System.out.println("두 숫자는 같다.");
        }


    }
}

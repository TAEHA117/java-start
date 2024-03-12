package array;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        /* 문제 : 배열과 역순 출력
        * 사용자에게 5개의 정수를 입력받아서 배열에 저장하고, 입력받은 순서의 반대인 역순으로 출력하기
        * 출력 포멧은 5,4,3,2,1과 같이 ,쉼표를 사용해서 구분하며 마지막에는 쉼표를 넣지 않아야 한다.
        *
        * 예시
        * 5개의 정수를 입력하세요 :
        * 1
        * 2
        * 3
        * 4
        * 5
        * 입력한 정수를 역순으로 출력 : */

        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5]; // 10개로 잡아놓는다면 당연히 10개의 정수 입력가능

        System.out.println("5개의 정수를 입력하세요 : ");
        for (int i=0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("출력");
        for (int i=4; i >= 0; i--) { // 1,2,3,4,5 -> 5,4,3,2,1 i의 값을 4로 설정
            System.out.print(numbers[i]);
            if (i > 0) { // 마지막 콤마 없애는 조건 - i가 0보다 크면
                System.out.print(", ");
            }
        }
    }
}

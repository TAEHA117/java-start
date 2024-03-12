package array;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {

        /* 문제 : 합계와 평균
        * 사용자에게 5개의 정수를 입력받아 이들 정수의 합계와 평균을 계산하는 프로그램을 작성
        *
        * 예시
        * 1
        * 2
        * 3
        * 4
        * 5
        * 입력한 정수의 합계 : 15
        * 입력한 정수의 평균 : 3.0*/

        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;
        double average;

        System.out.println("5개의 정수를 입력하세요 : ");

        for (int i=0; i < 5; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }
        average = (double) sum / 5;
        System.out.println("입력한 정수의 합계 : " + sum);
        System.out.println("입력한 정수의 평균 : " + average);
    }
}

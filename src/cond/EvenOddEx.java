package cond;

public class EvenOddEx {
    public static void main(String[] args) {
        /* 문제 : 홀수 짝수 찾기
        * 정수 x가 주어지면 x가 짝수이면 "짝수"를, x가 홀수이면 "홀수"를 출력하는 프로그램을 작성하자
        * 삼항 연산자를 사용해야 한다.
        *
        * 참고로 x % 2를 사용하면 홀수, 짝수를 쉽게 계산할 수 있다.
        *
        * 출력 예시
        * x: 2
        * 출력: x = 2, 짝수
        * 출력: x = 3, 홀수*/

        int x = 2;

        String result = (x % 2 == 0? "짝수" : "홀수");
        System.out.println("x = " + x + ", " + result);

        /* 간단한 풀이
        * x의 값은 2
        * x % 2 == 0 으로 계산
        * 2 % 2의 나머지는 당연히 0이기 때문에 짝수
        * 답은 짝수
        * 만약 3 % 2으로 나눈 나머지는 1이므로 홀수이기 때문에 x를 3으로 대입했다면 홀수이다. */


    }
}

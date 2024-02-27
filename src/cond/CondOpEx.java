package cond;

public class CondOpEx {
    public static void main(String[] args) {
        /* 문제 : 더 큰 숫자 찾기
        * 두 개의 정수 변수 a와 b를 가지고 있다.
        * a의 값은 10이고, b의 값은 20이다.
        * 삼항 연산자를 사용하여 두 숫자 중 더 큰 숫자를 출력하는 코드를 작성하자
        *
        * 출력 예시
        * 출력 : 더 큰 숫자는 20입니다. */

        int a = 10;
        int b = 20;

        int max = (a > b) ? a : b;
        System.out.println(" 더 큰 숫자는" + max + " 입니다.");

        /* 간단한 풀이
         * 여기서 (a > b)는 조건식이다.
         * 만약 이 조건이 참이면 a의 값을 반환하고 거짓이면 b의 값을 반환한다.
         * 따라서 a가 10이고 b가 20이므로 (a > b)는 거짓이다.
         * 출력 결과는 b의 값인 " 더 큰 숫자는 20입니다." 가 나오는 것 */

        int c = 10;
        int d = 20;

        String result = (a > b) ? "더 큰 숫자는 a입니다." : "더 큰 숫자는 b입니다.";
        System.out.println(result);
        // 이렇게도 풀이할 수 있다. 결과적으로는 같은 메커니즘
        // 방식이 다를 뿐이다.
    }
}

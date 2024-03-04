package loop;

public class ForEx2 {
    public static void main(String[] args) {
        /* 문제 : 짝수 출력
         * 반복문을 사용하여 처음 10개의 짝수를 출력하는 프로그램을 작성
         * 이때, num 이라는 변수를 사용하여 수를 표현할 것
         * while, for 2가지 버전의 정답을 만드시오 */

        /*for (int num = 2, count =1; count <= 10; num+=2, count++) {
            System.out.println(num);
        }*/

        /* for 안에 여러개를 설정할 수 있음
        * 하지만 좋은 코드는 아니다. */

        int num = 2;
        for (int i=1; i<=10; i++) {
            System.out.println(num);
            num += 2;
        }

    }
}

package loop;

public class WhileEx2 {
    /* 문제 : 짝수 출력
    * 반복문을 사용하여 처음 10개의 짝수를 출력하는 프로그램을 작성
    * 이때, num 이라는 변수를 사용하여 수를 표현할 것
    * while, for 2가지 버전의 정답을 만드시오 */
    public static void main(String[] args) {
        int num = 2;
        int count = 1;

        while(count <= 10) {
            System.out.println("10개의 짝수 출력 : " + num);
            num += 2;
            count++;
        }
    }
}

package loop;

public class WhileEx1 {
    /* 문제 : 자연수 출력
    * 처음 10개의 자연수를 출력하는 프로그램을 작성해 보시오
    * 이때, count라는 변수를 사용하시오
    * while, for 2가지 버전의 정답을 만드시오 */
    public static void main(String[] args) {
        int count = 1;
        while (count <= 10) {
            System.out.println("자연수 출력 : " + count);
            count++;
        }
    }
}

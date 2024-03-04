package loop;

public class WhileEx3 {
    /* 문제: 누적 합 계산
    * 반복문을 사용하여 1부터 max까지의 합을 계산하고 출력하는 프로그램을 작성하시오
    * sum이라는 변수를 사용하여 누적합을 표현하고,
    * i라는 변수를 사용하여 카운트(1부터 max까지 증가하는 변수)를 수행할 것
    * while, for 2가지 버전의 정답을 만드시오 */
    public static void main(String[] args) {
        int max = 100;

        int sum = 0;
        int i = 1;
        while (i <= max) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}

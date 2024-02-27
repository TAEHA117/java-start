package loop;

public class While_2 {
    public static void main(String[] args) {
        /* while문
        * 조건에 따라 코드를 반복해서 실행할 때 사용한다.
        * 조건식을 확인한다. 참이면 코드 블럭을 실행하고, 거짓이면 while문을 벗어난다.
        * 조건식이 참이면 코드 블럭을 실행한다.
        * 이후에 코드 블럭이 끝나면 다시 조건식 검사로 돌아가서 조건식을 검사한다 (무한 반복)*/

        int count = 0;

        while (count < 3) {
            // count = count + 1;
            count++;
            System.out.println("현재 숫자는: " + count);
        }
            /* while (count < 3) : 3보다 작을때까지 진행
            * count++; 증감
            * 현재 숫자는: 1~3까지 출력
            * 가장 기본적인 반복문이다. */
    }
}

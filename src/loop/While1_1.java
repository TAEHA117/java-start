package loop;

public class While1_1 {
    public static void main(String[] args) {
        /* 반복문 시작
        * 반복문은 이름 그대로 특정 코드를 반복해서 실행할 때 사용한다.
        * 자바는 다음 3가지 종류의 반복문을 제공한다.
        *
        * while, do-while, for
        *
        * 먼저 간단한 예제를 통해 반복문이 왜 필요한지 이유를 알아보자
        * 1을 한 번씩 더해서 총 3번 더하는 간단한 코드를 만들어보자.*/

        int count = 0;

        count = count + 1;
        System.out.println("현재 숫자는: " + count);
        count = count + 1;
        System.out.println("현재 숫자는: " + count);
        count = count + 1;
        System.out.println("현재 숫자는: " + count);

        /* 같은 코드가 3번 반복되고 있는 것.
        * 이번에는 1을 한 번씩 더해서 총 100번 더하는 코드를 만들어보자
        * 직접 작성한다면 같은 코드가 100번 반복되는 것이다.
        * 이렇게 특정 코드를 반복해서 실행할 때 사용하는 것이 반복문이다.
        * */

        /* while문
        * 조건에 따라 코드를 반복해서 실행할 때 사용한다.
        * 조건식을 확인한다. 참이면 코드 블럭을 실행하고, 거짓이면 while문을 벗어난다.
        * 조건식이 참이면 코드 블럭을 실행한다.
        * 이후에 코드 블럭이 끝나면 다시 조건식 검사로 돌아가서 조건식을 검사한다 (무한 반복)*/






    }
}

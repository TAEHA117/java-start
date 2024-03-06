package scanner;

public class ChangeVarEx {
    public static void main(String[] args) {
        /* 문제 : 변수 값 교환
        * 변수 a=10이 들어있고, b=20 이 들어있다.
        * 변수 a의 값과 변수 b의 값을 서로 바꾸어라
        * 다음 코드에서 시작과 종료 부분 사이에 변수의 값을 교환하는 코드를 작성하면 된다.
        * 힌트: temp 변수를 활용해야 한다.*/

        int a = 10;
        int b = 20;
        int temp; // a든 b든 값을 담아둘 수 있는 변수 생성
        

        temp = a; // temp 에 a의 값을 담아둔다.
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}

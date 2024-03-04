package casting;

public class Casting2 {
    public static void main(String[] args) {
        /* 명시적 형변환
        * 큰 범위에서 작은 범위로 대입해보자
        * 큰 범위에서 작은 범위 대입은 명시적 형변환이 필요하다
        *
        * double은 실수로 표현할 수 있다. 따라서 1.5가 가능하다.
        * 그런데 int는 실수를 표현할 수 없다.
        * 이 경우 double -> int로 대입하면 어떻게 될까? */

        double doubleValue = 1.5;
        int intValue = 0;

        // intValue = doubleValue; // 컴파일 오류 발생
        intValue = (int) doubleValue; // 형변환
        System.out.println(intValue); // 출력 : 1
    }
}

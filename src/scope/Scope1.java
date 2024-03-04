package scope;

public class Scope1 {
    public static void main(String[] args) {
        /* 스코프1 - 지역 변수와 스코프
         변수는 선언한 위치에 따라 지역 변수, 멤버 변수(클래스 변수, 인스턴스 변수)와 같이 분류된다.
         지금까지 학습한 변수들은 모두 영어로 로컬 변수(Local Variable) 한글로 지역 변수라 한다.
         지역 변수는 이름 그대로 특정 지역에서만 사용할 수 있는 변수라는 뜻이다. 그 특정 지역을 벗어나면 사용할 수 없다.
         여기서 말하는 지역이 바로 변수가 선언된 코드 블록( {} )이다. 지역 변수는 자신이 선언된 코드 블록( {} ) 안에서만 생
         존하고, 자신이 선언된 코드 블록을 벗어나면 제거된다. 따라서 이후에는 접근할 수 없다.

         참고) 나머지 변수(멤버변수)들은 뒤에서 학습한다 지금은 지역 변수만 기억하자.*/
        
        int m = 10; // m 생존 시작
        if (true) {
            int x = 20; // x 생존 시작
            System.out.println("if m = " + m); // 블록 내부에서 블록 외부는 접근 가능
            System.out.println("if x = " + x);
        } // x 생존 종료

//        System.out.println("main x = " + x); // 오류, 변수 x에 접근 불가
        System.out.println("main m = " + m);
    } // m 생존 종료
}

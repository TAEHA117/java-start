package cond;

public class CondOp2 {
    public static void main(String[] args) {
        // 이 예제는 참과 거짓에 따라 status 변수의 값이 달라짐
        // 참과 거짓에 따라서 특정 값을 구하는 경우 "삼항 연산자" 또는 "조건 연산자"라고 불리는
        // ?: 연산자를 사용할 수 있음.
        // 이 연산자를 사용하면 if문과 비교해서 코드를 단순화 할 수 있다.

        int age = 18;
        String status = (age >= 18) ? "성인" : "미성년자";
        System.out.println("age = " + age + " status = " + status);


    }
}

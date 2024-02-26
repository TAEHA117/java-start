package operator;

public class Operator3_1 {
    public static void main(String[] args) {
        int sum3 = 2 * 2 + 3 * 3; // (2 * 2) + (3 * 3)
        int sum4 = (2 * 2) + (3 * 3); // sum3과 동일하다.
        System.out.println("sum3 = " + sum3); // 13
        System.out.println("sum4 = " + sum4); // 13

        // 연산자 우선순위가 애매하거나 조금이라도 복잡하면 괄호를 사용해보자
    }
}

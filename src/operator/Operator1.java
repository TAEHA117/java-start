package operator;

public class Operator1 {
    public static void main(String[] args) {

        // 변수 초기화
        int a = 5;
        int b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum); // 7

        // 뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff); // 3

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi); // 10

        // 나눗셈
        int div = a / b; // 5 / 2 -> int형끼리의 나눗셈이기 때문에 소수점 제외
        System.out.println("a / b = " + div); // 2

        // 나머지
        int mod = a % b;
        System.out.println("a % b = " + mod); // 1

        int z = 10 / 0; // 예외발생 - 숫자는 0으로 나눌수 없기 때문


    }
}

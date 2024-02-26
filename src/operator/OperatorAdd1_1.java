package operator;

public class OperatorAdd1_1 {
    public static void main(String[] args) {
         /* 증감 연산자가 변수 앞에 오는 경우를 전위 증감 연산자라고 하며,
         이 경우에는 증감 연산이 먼저 수행된 후 나머지 연산이 수행된다. */
        // 전위 증감 연산자 사용 예) ++a;
        int a = 1;
        int b = 0;

        b = ++a; // a의 값을 먼저 증가시키고, 그 결과를 b에 대입
        System.out.println("a = " + a + ", b = " + b);

        /* 증감 연산자가 변수 뒤에 오는 경우를 후위 증감 연산자라고 하며,
         이 경우에는 다른 연산이 먼저 수행된 후 증감 연산이 수행된다. */
        // 후위 증감 연산자 사용 예) a++;
        a = 1; // a 값을 다시 1로 지정
        b = 0; // b의 값을 다시 0으로 지정

        b = a++; // a의 현재 값을 b에 먼저 대입하고, 그 후 a 값을 증가시킴.
        System.out.println("a = " + a + ", b = " + b); // 결과 : a = 2, b = 1;


        /* 참고로 다음과 같이 증감 연산자를 단독으로 사용하는 경우에는
           다른 연산이 없기 때문에, 본인의 값만 증가한다.
           따라서 전위이든 후위이든 둘다 결과가 같다.*/
        ++a;
        System.out.println("a = " + a);
        a++;
        System.out.println("a = " + a);

    }
}

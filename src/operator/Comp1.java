package operator;

public class Comp1 {
    public static void main(String[] args) {
/*        비교 연산자
        비교 연산자는 두 값을 비교하는 데 사용한다. 비교 연산자는 주로 뒤에서 설명하는 조건문과 함께 사용한다.
        비교 연산자
== : 동등성 (equal to)
                != : 불일치 (not equal to)
                > : 크다 (greater than)
                < : 작다 (less than)
                >= : 크거나 같다 (greater than or equal to)
                <= : 작거나 같다 (less than or equal to)
                    * 비교 연산자를 사용하면 참( true ) 또는 거짓( false )이라는 결과가 나온다. 참 거짓은 boolean 형을 사용한다.
                    * 여기서 주의할 점은 = 와 == ( = x2)이 다르다는 점이다.
                = : 대입 연산자, 변수에 값을 대입한다.
                == : 동등한지 확인하는 비교 연산자
                    * 불일치 연산자는 != 를 사용한다. ! 는 반대라는 뜻이다. */

        int a = 2;
        int b = 3;
        System.out.println(a == b); // false
        System.out.println(a != b); // true
        System.out.println(a > b); // false
        System.out.println(a < b); // true
        System.out.println(a >= b); // false
        System.out.println(a <= b); // true
        
        // 결과를 boolean 변수에 담을 수 있음
        boolean result = a == b;
        System.out.println(result);
    }
}

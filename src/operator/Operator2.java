package operator;

public class Operator2 {
    public static void main(String[] args) {
        // 문자열과 문자열 더하기 1
        String result1 = "Hello " + "World";
        System.out.println(result1);

        // 문자열과 문자열 더하기 2
        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1 + s2;
        System.out.println(result2);

        // 문자열과 숫자 더하기1
        // 자바에서 문자와 숫자를 더하면 숫자를 문자열로 변경한 다음에 서로 더한다.
        String result3 = "a + b = " + 10;  // "a + b = 10"이 되는것 (문자열)
        System.out.println(result3);

        // 문자열과 숫자 더하기2
        // 변수에 담겨 있어도 문자와 숫자를 더하면 문자가 된다
        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println(result4); // "a + b = 20"이 되는것 (문자열)

    }
}

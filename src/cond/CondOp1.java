package cond;

public class CondOp1 {
    public static void main(String[] args) {
//        if 문을 사용할 때 다음과 같이 단순히 참과 거짓에 따라 특정 값을 구하는 경우가 있다

        int age = 18;
        String status;
        if (age >= 18) {
            status = "성인";
        } else {
            status = "미성년자";
        }
        System.out.println("age = " + age + " status = " + status);
    }
}

package cond;

public class If1 {
    /* 조건문 if, else*/
    public static void main(String[] args) {
        /* if문
        * 특정 조건에 따라서 다른 코드를 실행하는 것을 조건문이라 한다.
        * 조건문에는 if문, switch문이 있다 둘다 특정 조건에 따라서 다른 코드를 실행하는 것이라 생각하면 된다.*/

        int age = 20; // 사용자 나이

        if (age >= 18) {
            System.out.println("성인입니다.");
        }

        if (age < 18) {
            System.out.println("미성년자 입니다");
        }
    }
}

package scanner;

import java.util.Scanner;

public class ScaneerEx1 {
    public static void main(String[] args) {
        /* 문제 : 이름 나이 입력받고 출력하기
        * 사용자로부터 입력받은 이름과 나이를 출력하세요.
        * 출력 형태는 "당신의 이름은 [이름]이고, 나이는 [나이]살입니다." 이어야 한다
        *
        * 실행 결과 예시
        * 당신의 이름을 입력하세요 : 자바
        * 당신의 나이를 입력하세요 : 30
        * 당신의 이름은 자바이고, 나이는 30살입니다.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("당신의 이름을 입력하세요.");
        String str = sc.nextLine();

        System.out.println("당신의 나이를 입력하세요.");
        int age = sc.nextInt();

        System.out.println("당신의 이름은 " + str + "이고, 나이는 " + age + "살입니다.");
    }
}

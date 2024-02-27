package cond;

public class GradeSwitchEx {
    public static void main(String[] args) {
        /* 문제 : 학점에 따른 성취도 출력하기
        * String grade라는 문자열을 만들고, 학점에 따라 성취도를 출력하는 프로그램을 작성하자
        * 각 학점은 다음과 같은 성취도를 나타낸다.
        *
        * "A": "탁월한 성과입니다."
        * "B": "좋은 성과입니다"
        * "C": "준수한 성과입니다"
        * "D": "향상이 필요합니다"
        * "F": "불합격입니다"
        * 나머지: "잘못된 학점입니다"
        *
        * switch문을 사용해서 문제를 풀어보자.
        *
        * 출력 예시
        * grade: "B"
        * 출력: "좋은 성과입니다!" */

        String grade = "D";

        switch (grade) {
            case "A":
                System.out.println("탁월한 성과입니다.");
                break;
            case "B":
                System.out.println("좋은 성과입니다.");
                break;
            case "C":
                System.out.println("준수한 성과입니다.");
                break;
            case "D":
                System.out.println("향상이 필요합니다.");
                break;
            case "F":
                System.out.println("불합격입니다.");
                break;
            default:
                System.out.println("잘못된 학점입니다.");
                
                /* 간단한 풀이
                * String grade라는 문자열 변수 생성 및 "D" 대입 
                * A~F학점까지 case로 적용 및 break;
                * switch (grade)를 적용했기 때문에 기존에 선언했던 "D"가 적용
                * sout => 향상이 필요합니다 문구 출력
                * switch는 정말.. 가끔 잊어버린다
                * 엄청 자주 자주 쓰이지는 않겠지만 그래도 기억하고 있자. */

        }
    }
}

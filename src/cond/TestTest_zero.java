package cond;

public class TestTest_zero {
    public static void main(String[] args) {
        /*int age = 20;

        String status = (age >= 20) ? "성인" : "미성년자";
        System.out.println("age = " + age + " status = " + status);
        
        int age1 = 38;
        String status1 = (age1 <= 20) ? "성인" : "미성년자";
        System.out.println("age = " + age1 + " status = " + status1);*/

        /* 문제: 환율 계산하기
         * 특정 금액을 미국 달러에서 한국 원으로 변환하는 프로그램을 작성하자.
         * 환율은 1달러당 1300원이라고 가정하자.
         * 다음과 같은 기준을 따른다.
         *
         * 달러가 0미만이면 : "잘못된 금액입니다."
         * 달러가 0일 때 : "환전할 금액이 없습니다."
         * 달러가 0 초과일 때 : "환전 금액은 (계산된 원화 금액)원입니다.
         *
         * 금액은 변수(int dollar)로 지정하고, 해당 변수를 기반으로 한국 원으로의 환전 금액을 출력하자.
         *
         * 출력 예시
         * dollar: -5
         * 출력: 잘못된 금액입니다. */

        /*int dollar = 100;

        if (dollar < 0) {
            System.out.println("잘못된 금액입니다.");
        } else if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else {
            int won = dollar * 1300;
            System.out.println("환전 금액 : " + won + "원 입니다.");

        }*/


        /* 문제 : 평점에 따른 영화 추천하기
         * 요청한 평점 이상의 영화를 찾아서 추천하는 프로그램을 작성
         *
         * 어바웃타임 - 평점9
         * 토이 스토리 - 평점8
         * 고질라 - 평점7
         *
         * 평점 변수는 double rating을 사용하시오.
         *
         * 출력 예시
         * rating : 9
         * 출력 : '어바웃타임'을 추천합니다. */

        /*double rating = 7.1;
        
        if (rating <= 9) {
            System.out.println("'어바웃타임'을 추천합니다.");
        }

        if (rating <= 8) {
            System.out.println("'토이스토리'를 추천합니다");
        }

        if (rating <= 7) {
            System.out.println("'고질라...'를 추천합니다");
        }*/

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

        /*String grade = "D";

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

        }*/

        /* 문제 : 더 큰 숫자 찾기
         * 두 개의 정수 변수 a와 b를 가지고 있다.
         * a의 값은 10이고, b의 값은 20이다.
         * 삼항 연산자를 사용하여 두 숫자 중 더 큰 숫자를 출력하는 코드를 작성하자
         *
         * 출력 예시
         * 출력 : 더 큰 숫자는 20입니다.
         *
         * 삼항 연산자
            (조건) ? 참_표현식 : 거짓_표현식 */

        int a = 10;
        int b = 20;

        int max = (a > b) ? a : b;
        System.out.println(" 더 큰 숫자는" + max + " 입니다.");

        /* 간단한 풀이
        * 여기서 (a > b)는 조건식이다.
        * 만약 이 조건이 참이면 a의 값을 반환하고 거짓이면 b의 값을 반환한다.
        * 따라서 a가 10이고 b가 20이므로 (a > b)는 거짓이다.
        * 출력 결과는 " 더 큰 숫자는 20입니다." 가 나오는 것 */

    }
}

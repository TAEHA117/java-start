package cond;

public class MoveRateEx {
    public static void main(String[] args) {
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

        double rating = 7.1;

        if (rating <= 9) {
            System.out.println("'어바웃타임'을 추천합니다.");
        }

        if (rating <= 8) {
            System.out.println("'토이스토리'를 추천합니다");
        }

        if (rating <= 7) {
            System.out.println("'고질라...'를 추천합니다");
        }

        // else if를 왜 쓰지 않았는지 생각해야 한다.
        // 무조건 적으로 else if를 사용하는게 옳은게 아니다.
        // 생각하자
    }
}

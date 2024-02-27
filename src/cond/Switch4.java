package cond;

public class Switch4 {
    public static void main(String[] args) {
        // 자바 14 새로운 switch문
        // grade : 1:1000, 2:2000, 3:3000, 나머지 : 500

        int grade = 2;

        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
        System.out.println("발급받은 쿠폰 " + coupon);
        // 기존 switch문과 차이는 다음과 같음.
        // ->를 사용한다.
        // 선택된 데이터를 반환할 수 있다.
        // 더 많은 내용을 담고 있기 때문에 별도로 다뤄보기
    }
}

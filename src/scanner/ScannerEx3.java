package scanner;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        /* 문제 : 음식점 주문
        * 사용자로부터 음식의 이름(foodName), 가격(foodPrice), 그리고 수량(foodQuantity)을 입력받아,
        * 주문한 음식의 총 가격을 계산하고 출력하는 프로그램을 작성하라.
        *
        * 음식의 총 가격을 계산하시오. 총 가격은 각 음식의 가격(foodPrice)과 수량(foodQuantity)을 곱한 값이며,
        * 이를 totalPrice 라는 이름의 변수에 저장하시오
        *
        * 주문 정보와 총 가격을 출력하시오.
        * 출력 형태는 "[음식 이름] [수량]개를 주문하셨습니다. 총 가격은 [총 가격]원입니다." 이어야 합니다.
        *
        * 실행 결과 예시
        * 음식 이름을 입력해주세요 :
        * 음식의 가격을 입력해주세요 :
        * 음식의 수량을 입력해주세요 :
        * 음식 2개를 주문하셨습니다. 총 가격은 40000원입니다.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("음식 이름을 입력해주세요");
        String foodName = sc.nextLine();

        System.out.println("음식의 가격을 입력해주세요");
        int foodPrice = sc.nextInt();

        System.out.println("음식의 수량을 입력해주세요");
        int foodQuantity = sc.nextInt();

        System.out.println("총 몇명인지 입력해주세요");
        int human = sc.nextInt();


        int totalPrice = foodPrice * foodQuantity;

        int DivisionPrice = totalPrice / human;

        System.out.println("음식" + foodQuantity + "를 주문하셨습니다. 총 가격은 " + totalPrice + "입니다. 1명당 내야할 금액은 " + DivisionPrice + "입니다.");
        // 인원수를 추가하여 총 금액에서 각 명당 얼마를 내야하는지 추가해보기 -> DivisionPrice,human



    }
}

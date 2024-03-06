package scanner;

import java.util.Scanner;

public class ScannerWhileEx2 {
    public static void main(String[] args) {
        /* 사용자로부터 상품의 가격(price)과 수량(quantity)을 입력받고,
        * 총 비용을 출력하는 프로그램을 작성하시오
        * 가격과 수량을 입력받은 후에는 이들의 곱을 출력하시오
        * 출력 형태는 "총 비용: [곱한 결과]"이어야 한다.
        *
        * -1을 입력하여 가격 입력을 종료합니다.
        *
        * 예시
        * 상품의 가격을 입력 : (-1을 입력하면 종료) : 1000
        * 구매하려는 수량을 입력 : 3
        *
        * 상품의 가격을 입력 : (-1을 입력하면 종료) : 2000
        * 구매하려는 수량을 입력 : 4
        *
        * 상품의 가격을 입력 : (-1을 입력하면 종료) : -1
        * 프로그램을 종료합니다.*/

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("상품의 가격을 입력하시오 (-1을 입력하면 종료) : ");
            int price = sc.nextInt();

            if(price == -1) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.println("구매하려는 수량을 입력하시오");
            int quantity = sc.nextInt();

            int totalCost = price * quantity;
            System.out.println("총 비용 : " + totalCost);

        }
    }
}

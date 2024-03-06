package scanner;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        /*
        * 문제 - 상품 구매
            사용자로부터 상품 정보(상품명, 가격, 수량)를 입력받고, 이들의 총 가격을 출력하는 프로그램을 작성하세
            요. 사용자는 여러 상품을 추가하고 결제할 수 있으며, 프로그램을 언제든지 종료할 수 있습니다.
            사용자에게 다음 세 가지 옵션을 제공해야 합니다: 1: 상품 입력, 2: 결제, 3: 프로그램 종료. 옵션은 정수로
            입력받으며, 옵션을 저장하는 변수의 이름은 option 이어야 합니다.
            상품 입력 옵션을 선택하면, 사용자에게 상품명과 가격, 수량을 입력받으세요.
            결제 옵션을 선택하면, 총 비용을 출력하고 총 비용을 0 으로 초기화하세요. (사용자가 총 비용을 확인하고,
            결제를 완료했다고 가정합니다. 따라서 다음 사용자를 위해 총 비용을 다시 0 으로 초기화 해야합니다.)
            프로그램 종료 옵션을 선택하면, "프로그램을 종료합니다."라는 메시지를 출력하고 프로그램을 종료하세요.
            위의 세 가지 옵션 외에 다른 값을 입력하면, "올바른 옵션을 선택해주세요."라는 메시지를 출력하세요.
        * */

        /* 예시
        * 1: 상품 입력, 2: 결제, 3: 프로그램 종료
            1
            상품명을 입력하세요: 스프링
            상품의 가격을 입력하세요: 30000
            구매 수량을 입력하세요: 1
            상품명:스프링 가격:30000 수량:1 합계:30000
            1: 상품 입력, 2: 결제, 3: 프로그램 종료
            1
            상품명을 입력하세요: JPA
            상품의 가격을 입력하세요: 40000
            구매 수량을 입력하세요: 2
            상품명:JPA 가격:40000 수량:2 합계:80000
            1: 상품 입력, 2: 결제, 3: 프로그램 종료
            2
            총 비용: 110000
            1: 상품 입력, 2: 결제, 3: 프로그램 종료
            3
            프로그램을 종료합니다. */

        Scanner sc = new Scanner(System.in);

        int totalCost = 0;

        while (true) {
            System.out.println("1: 상품입력, 2: 결제, 3: 프로그램 종료");
            int option = sc.nextInt();

            if (option == 1) {
                sc.nextLine(); // 이전에 입력된 개행문자 제거

                System.out.println("상품명을 입력하세요: ");
                String product = sc.nextLine();

                System.out.println("상품의 가격을 입력하세요: ");
                int price = sc.nextInt();

                System.out.println("구매 수량을 입력하세요: ");
                int quantity = sc.nextInt();

//                totalCost = totalCost + (price * quantity);
                totalCost += price * quantity;


                System.out.println("상품명 : " + product + " 가격 : " + price + " 수량 : " + quantity + " 합계 : " + price * quantity);
            } else if (option == 2) {
                System.out.println("총 비용 : " + totalCost);
                totalCost = 0; // 결제 후 총 비용 초기화
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다. ");
                break;
            } else {
                System.out.println("올바른 옵션을 선택해주세요.");
            }
            /* 1번 컨택 후 다시 1번을 선택했을 때 2개의 상품이 담긴다는 것
            * -> 첫 번째 상품이 totalCost에 누적되며 이 후 상품을 추가했을 때
            * 값이 구해지는 과정을 잘 이해하자
            */
        }
    }
}

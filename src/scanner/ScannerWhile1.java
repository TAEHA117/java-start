package scanner;

import java.util.Scanner;

public class ScannerWhile1 {

    /* Scanner 반복 예제1
        사용자가 입력한 문자열을 그대로 출력하는 예제를 만들어보자.
        exit 라는 문자가 입력되면 프로그램을 종료한다.
        프로그램은 반복해서 실행된다. */
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("문자열을 입력하시오 (exit: 종료):");
            String str = sc.nextLine();
            if(str.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.println("입력한 문자열 :" + str);
        }*/
        
        
        
        
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("문자열을 입력하시오 (exit가 나오면 종료) : ");
            String str = sc.nextLine();
            if(str.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.println("입력한 문자열 : " + str);
        }
    }
}

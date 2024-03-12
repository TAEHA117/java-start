package loop;

public class Test_O {
    public static void main(String[] args) {
        /*문제: 자연수 출력
        처음 10개의 자연수를 출력하는 프로그램을 작성해 보세요. 이때, count 라는 변수를 사용해야 합니다.
        while문, for문 2가지 버전의 정답을 만들어야 합니다.*/

        /*for (int count=1; count <= 10; count++) {
            System.out.println("출력 : " + count);
        }*/

        /*int count = 1;
        while (count <= 10) {
            System.out.println("출력 : " + count);
            count++;*/

        /*문제: 짝수 출력
        반복문을 사용하여 처음 10개의 짝수를 출력하는 프로그램을 작성해 보세요. 이때, num 이라는 변수를 사용하여 수를
        표현해야 합니다.
        while문, for문 2가지 버전의 정답을 만들어야 합니다    */

        /*int num;
        for (num = 2; num <= 20; num++) {
            if (num % 2 == 0) {
                System.out.println("출력 : " + num); // 여기까지가 2~10인데 20까지 출력하려면? -> num <= 20
            }
        }*/

        /*for (int num = 2, count = 1; count <= 10; num +=2, count++) {
            System.out.println(num);
        }*/

        /*int num = 10;
        int count = 0;
        for (int i = 1; count < num; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                count++;
            }*/


        /*for (int num = 2, count = 1; count <= 10; num += 2, count++) {
            System.out.println(num);
        }*/


        /*for (int count=1; count<=10; count++) {
            System.out.println("출력 : " + count);
        }*/

            /*for (int i=1; i<=9; i++) {
                for (int j=1; j<=9; j++) {
                    System.out.println(i + " * " + j + " = " + i * j);
                }*/

        /*int count = 1;
        while (count <=10) {
            System.out.println("출력 : " + count);
            count++;
        }*/

        int rows = 5;
        for (int i=1; i<=rows; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        }

    }


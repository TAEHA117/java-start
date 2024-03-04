package loop;

public class Nested1 {
    public static void main(String[] args) {
        for (int i=0; i < 2; i++) {
            System.out.println("외부 for 시작 i:" + i);
            for(int j=0; j<3; j++) {
                System.out.println("-> 내부 for " + i + "-" + j);
            }
            System.out.println("외부 for 종료 i: " + i);
            System.out.println();

            /* 외부 for는 2번, 내부 for는 3번 실행된다.
            * 그런데 외부 for 1번당 내부 for가 3번 실행되기 때문에
            * 외부(2) * 내부(3)해서 총 6번의 내부 for 코드가 수행된다.*/

        }
    }
}

package loop;

public class For1 {
    public static void main(String[] args) {
        for (int i=1; i<=10; i++) {
            System.out.println(i); // 1~10

/*   1. 초기식이 실행된다. int i = 1
     2. 조건식을 검증한다. i <= 10
     3. 조건식이 참이면 코드를 실행한다. System.out.println(i);
     4. 코드가 종료되면 증감식을 실행한다. i++
     5. 다시 2. 조건식을 검증한다. (무한 반복) 이후 i <= 10 조건이 거짓이 되면 for문을 빠져나간다.
*/
        }
    }
}

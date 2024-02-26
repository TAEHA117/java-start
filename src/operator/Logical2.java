package operator;

public class Logical2 {
    public static void main(String[] args) {
        int a = 15;
        // a는 10보다 크고 20보다 작다.
        boolean result = a > 10 && a < 20; // (a > 10) && (a < 20)

        // 조금 더 읽기 편할 수 있음
        boolean result2 = 10 > a && 20 < a; // (a > 10) && (a < 20)

    }
}

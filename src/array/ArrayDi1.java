package array;

public class ArrayDi1 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3]; // 행2, 열3

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        for (int row = 0; row <2; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.println(arr[row][column] + " "); // 0열 출력
            }
            /*// 0행 출력
            System.out.println(arr[row][0] + " "); // 0열 출력
            System.out.println(arr[row][1] + " "); // 1열 출력
            System.out.println(arr[row][2] + " "); // 2열 출력*/
            System.out.println(); // 한 행이 끝나면 라인을 변경한다.
        }
        /* for문을 2번 중첩해서 사용하는데, 첫번째 for문은 행을 탐색하고, 내부에 있는 두번째 for문은 열을 탐색한다.
        * 내부에 있는 for문은 앞서 작성한 다음 코드와 같다. for문을 사용해서 열을 효과적으로 출력했다.
        * 2중 for 문이 2차원배열과 조합이 좋음 */
    }
}

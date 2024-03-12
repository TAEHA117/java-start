package array;

public class ArrayRef4 {
    public static void main(String[] args) {

        int[] students = {90, 80, 70, 60, 50}; // 극적으로 코드를 줄일 수 있다.
        /* 배열은 {}만 사용해서 생성과 동시에 편리하게 초기화 하는 기능을 제공
        * 단 예제와 같이 배열 변수의 선언을 한 줄에 함께 사용할 때만 가능하다.
        * 물론 이렇게 하더라도 자바가 내부에서 배열 요소의 크기를 보고 new int[5]을 사용해서 배열을 생성한다.
        * 따라서 기존 코드를 조금 더 편리하게 사용할 수 있는 편의 기능이라고 생각하면 된다. */

        // 변수 값 사용
        for (int i=0; i<students.length; i++) {
            System.out.println("학생 " + (i + 1) + "점수 : " + students[i]);
        }
    }
}

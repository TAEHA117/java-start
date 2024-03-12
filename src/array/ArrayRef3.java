package array;

public class ArrayRef3 {
    public static void main(String[] args) {
//        int[] students; // 배열 변수 선언
        int[] students = new int[]{90, 80, 70, 60, 50}; // 배열 생성과 초기화
        // 생성할 때 초기값을 잡아주면 코드가 줄어듬 -> ArrayRef2와 비교

        // 변수 값 사용
        for (int i=0; i<students.length; i++) {
            System.out.println("학생 " + (i + 1) + "점수 : " + students[i]);
        }
    }
}

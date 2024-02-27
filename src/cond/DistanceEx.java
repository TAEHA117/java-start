package cond;

public class DistanceEx {
    public static void main(String[] args) {
        /* 문제 : 거리에 따른 운송 수단 선택하기
        * 주어진 거리에 따라 가장 적합한 운송 수단을 선택하는 프로그램 작성
        * 다음과 같은 기준을 따른다.
        *
        * 거리가 1km 이하이면 : "도보"
        * 거리가 10km 이하이면 : "자전거"
        * 거리가 100km 이하이면 : "자동차"
        * 거리가 1000km 이하이면 : "비행기"
        * 거리는 변수 (int distacne)로 지정하고, 해당 변수를 기반으로 운송 수단을 출력하자
        * 출력 예시
        * distance: 1
        * 출력: 도보를 이용하세요*/

/*        int distance = 100;

        if (distance <= 1) {
            System.out.println("distance: " + distance + "\n 출력 : 도보를 이용하시오.");
        } else if (distance <= 10) {
            System.out.println("distance: " + distance + "\n 출력 : 자전거를 이용하시오.");
        } else if (distance <= 100) {
            System.out.println("distance: " + distance + "\n 출력 : 자동차를 이용하시오.");
        } else if (distance <= 1000) {
            System.out.println("distance: " + distance + "\n 출력 : 비행기를 이용하시오.");
        } else {
            System.out.println("가만히 있으시오.");
        }*/
        
        int distance = 25;
        
        if (distance <= 1) {
            System.out.println("distance: " + distance + "\n 출력 : 도보를 이용하시오.");
        } else if (distance <= 10) {
            System.out.println("distance: " + distance + "\n 출력 : 자전거를 이용하시오.");;
        } else if (distance <= 100) {
            System.out.println("distance: " + distance + "\n 출력 : 자동차를 이용하시오.");
        } else {
            System.out.println("바행기를 이용하시오.");
        }
    }
}

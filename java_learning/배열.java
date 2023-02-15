package java_learning;

public class 배열 {
    public static void main(String[] args) {
        int[] scores ={83,90,87}; // 배열의 생성

        System.out.println("0 index: "+ scores[0]);// 첫번째 인덱스 출력
        System.out.println("1 index: "+ scores[1]);// 첫번째 인덱스 출력
        System.out.println("2 index: "+ scores[2]);// 첫번째 인덱스 출력

        //배열의 총합 구하기
        int sum_array = 0;
        for(int i=0; i<3; i++) {
            sum_array+=scores[i];
        }
        // 총합 출력하기
        System.out.println("총합: "+sum_array);
        // 평균 출력하기
        double avr= (double) sum_array/3; // 정수 나누기 정수 결과가 소수까지 나오길원한다면 강제 타입변환 필요함
        System.out.println("평균"+avr);
    }
}

/*
 * 지금까지는 공부를 하면서 생소한 개념만 실습하고 넘어가도 문제가 없었는데 자바를 익히며 처음으로 배열은 많이 생소했다
 * 따라서 예제를 하나하나 손코딩해보며 제대로 익히고 넘어가려고 한다
 
 * 배열은 같은타입의 데이터만 저장할수있다, 한번 생성된 배열은 길이를 늘리거나 줄일수 없다
 * 만약 늘리고 싶다면 새로운 배열을 생성하고 기존의 배열항목을 새 배열로 복사해야한다
 * 
 * 배열 선언
 * 타입[] 변수 또는 타입 변수[] 나는 전자를 더 많이쓸듯하다
 * 배열 변수가 null 값을 가진 상태에서 인덱싱을 하거나 값을 저장하게되면 눌포인터익셉션 에러가 발생한다(파이썬과 다름)
 * 
 * 배열 생성
 * 타입[] 변수 = {값0, 값1, 값2, 값3}
 * 원래있던 항목을 교체하는방법은 파이썬과 동일하다
 * 주의할점 배열 선언후 "다른실행문"에서 중괄호를 사용한 배열 생성이 허용되지않는다 new를사용(뉴...?)
 *
 */
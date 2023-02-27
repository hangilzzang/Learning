// 구구단 출력하기 중첩 for문 실습
public class for문 {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            System.out.println("*** " + i + "단 ***");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }
}

/*
 * for(초기화식; 조건식; 증감식) 의 구조로 이루어져있다 초기화식에 여러 변수를 사용할수있다 다만 쉼표로 구분해주어야 한다
 * 반복문을 쓸때 주의할점은 초기화식에 부동소수점을 쓰는 float타입을 사용하지 말아야한다고 한다
 * 반복문안에서 선언한 변수들은(초기화식 포함) 반복문 밖에서 쓸수없다
 */
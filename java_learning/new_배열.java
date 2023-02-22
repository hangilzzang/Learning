package java_learning;

public class new_배열 {
    public static void main(String[] args) {
        int[] scores; // 배열 scores 선언
        scores = new int[] {83,90,87}; // 이미 선언한 배열에 값을 넣어주고 싶을때는 new를 사용한다
        int sum1 = 0;
        for(int i=0; i<3; i++) {
            sum1 +=scores[i];
        }
        System.out.println("총합: "+sum1);

        int sum2=add(new int[]  {83, 90, 87});
        System.out.println("총합: "+sum2);
        System.out.println();
    }
        public static int add(int[] scores) {
            int sum2=0;
            for(int i=0; i<3; i++) {
                sum2+=scores[i];
            }
            return sum2;
        }
}

/*
 * 자바의 메소드 정의 형식은 다음과 같다
 * 접근제어자 반환타입 메소드이름 
 * public이나 static new같은 부분은 사실 아직 잘 모르겠다 
 * 일단 기초적인걸 먼저 익히는식으로 공부하면 좋을것같다
 * 
 * 위에서도 언급했다싶이 이미 선언한 배열에 값을 넣어주고 싶을때는 new를 사용한다
 * 뿐만아니라 함수에서 파라미터로 배열을 사용할경우 실사용시 new를 포함해서 배열을 넣어줘야한다
 * 파이썬과 다르게 자바에서는 함수를 먼저 사용하고 뒤에서 정의해줘도된다 
 */
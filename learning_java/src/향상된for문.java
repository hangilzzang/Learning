public class 향상된for문 {
    public static void main(String[] args) {
        int[] scores = { 95, 71, 84, 93, 87 };
        int sum = 0;
        for (int score : scores) {
            sum = sum + score;
        }
        System.out.println("점수총합= " + sum);

        double avg = (double) sum / scores.length;
        System.out.print("점수 평균= " + avg);
    }
}

/*
 * for(인자:배열이름) 구조인것같다 배열의 요소를대상으로한 반복문일을 쓰고싶을때 간단하게 사용해볼수있을것같다
 * 
 */
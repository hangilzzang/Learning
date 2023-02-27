import java.util.Arrays;

public class new_배열 {
    public static void main(String[] args) {
        int[] arr1 = new int[3]; // 타입 변수 = new 타입[길이]
        int[][] arr2 = new int[2][3]; // 2차원 배열 생성(행렬형태)
        int[][] arr3 = new int[2][]; // 2차원 배열 생성(요소의 길이가 다름)
        arr3[0] = new int[1];
        arr3[1] = new int[5];
        System.out.println("리스트 깡통상태: " + Arrays.toString(arr1));
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        System.out.println("리스트 채운상태: " + Arrays.toString(arr1));
        System.out.println("array2 index0: " + Arrays.toString(arr2[0]));
        System.out.println("array2 index1: " + Arrays.toString(arr2[1]));
        System.out.println("array3 index0: " + Arrays.toString(arr3[0]));
        System.out.println("array3 index1: " + Arrays.toString(arr3[1]));
    }
}

/*
 * new를 이용한 배열생성을 배워본다
 * new를 사용하면 먼저 배열을 선언한뒤에 값을 나중에 저장하는것이 가능하다
 * 그냥 깡통 new배열에 들어있는값은 선언된 배열의 타입에 따라 다르다
 * 
 * new 배열 초기값
 * 기본타입(정수): 0
 * 기본타입(실수): 0.0
 * 기본타입(논리): False
 * 
 * new를 사용해 2차원깡통도 만들수있다 2차원이지만 하위 리스트의 길이를 다르게하고싶다면 array3의 방법을 이용하면 된다
 */
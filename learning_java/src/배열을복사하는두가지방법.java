public class 배열을복사하는두가지방법 {
    public static void main(String[] args) {
        // 반복문을 이용한 복사
        int[] oldIntArray = { 1, 2, 3 };
        int[] newIntArray = new int[5]; // 빈 리스트 생성

        for (int i = 0; i < oldIntArray.length; i++) {
            newIntArray[i] = oldIntArray[i];
        }
        for (int i = 0; i < newIntArray.length; i++) {
            System.out.print(newIntArray[i] + " ");
        }

        System.out.println();
        // System.arraycopy()로 배열 복사
        String[] oldStrArray = { "java", "array", "copy" };
        String[] newStrArray = new String[5];

        System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

        for (int i = 0; i < newStrArray.length; i++) {
            System.out.print(newStrArray[i] + " ");
        }

    }
}

/*
 * System.array 파라미터에 관한 설명이 필요할것같다
 * System.arraycopy(src,srcPos,dest,destPos,length)
 * Object src: 복사하고자 하는소스
 * int srcPos: 위의 원본소스에서 어느부분부터 읽어올지 표시, 처음부터 읽어올꺼면 0넣어주기
 * Object dest: 복사할소스
 * int destPos: 위의 복사본에서 어느부분부터 읽어올지 표시, 처음부터 읽어올꺼면 0넣어주기
 * int length: 복사할 데이터 길이
 */
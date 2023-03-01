public class 객체를참고하는배열 {
    public static void main(String[] args) {
        String[] strArray = new String[3];
        strArray[0] = "Java";
        strArray[1] = "Java";
        strArray[2] = new String("Java");

        System.out.println(strArray[0] == strArray[1]); // true
        System.out.println(strArray[0] == strArray[2]); // false
        System.out.println(strArray[0].equals(strArray[2])); // true
    }
}
// ==는 같은 객체를 참조하는지를 묻는것이고
// .equeals는 문자열을 비교하는것이다 이용에 주의

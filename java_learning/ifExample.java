package java_learning; // package에는 그냥 파일 속한 폴더명 적으면 되는듯?
/*
 자바에서 if의 사용은 if (조건식) {} 의 형태이다
 if문 아래에 한줄짜리 실행문만 있다면 중괄호를 생략해도 된다
 다만 중괄호 없이 두줄짜리 실행문을 넣게 된다면 두번째 줄부터는 if문과 관계없는 코드가 된다
 */

 /* 
  * 자바에서는 파이썬의 elif 처럼 else if 문을 사용해서 코드를 더 간결하게 만들수있다
  */
import java.util.Scanner;

public class IfExample { //public class의 이름은 파일제목과 같아야한다
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        int score;

        while(true){

            score=scanner.nextInt();
            if(score==-1) {
                break;
            }

            else{
                if(score>=90) {
                    System.out.println("A등급입니다");
                
                } else if(score>=80) {
                    System.out.println("B등급입니다");
                
                } else {
                    System.out.println("C등급입니다");
                }
            }
        }
        scanner.close(); 
    }
}

/*
 * 정리 
 * while문과 if else 그리고 input(파이썬식으로 말하자면)을 활용하여 코드를 작성해보았다
 * 깨달은점
 * 1. java를 vsocde에서 실행시 coderunner 사용 x
 * 2. 정수 입력받고 싶을때는 scanner.nextInt() 그리고 scanner는 코드가 끝나면 닫아주기
 */
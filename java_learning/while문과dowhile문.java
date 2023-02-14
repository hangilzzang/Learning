package java_learning;

public class while문과dowhile문 {
    public static void main(String[] args) {
        do {
            Outter: for(int i=1; i==1; i++){
            for(char upper='A'; upper<='Z'; upper++) {
                for(char lower='a'; lower<='z'; lower++) {
                    System.out.println(upper + "-" + lower);
                    if(lower=='g') {
                        break Outter;
                    }
                }
            }
        }
        } while(1<-1); // while문의 조건이 비정상적이라도 일단 한번은 실행시킬수있다
    }
}

/* 
 * do-while문은 조건식에 의해 반복 실행한다는 점은 while문과 동일하지만 
 * while은 조건식을 검사한뒤 블록 내부를 실행한다면 do while은 일단 먼저 블록 내부를 실행한뒤 반복할지를 결정한다는점에서 다르다 문법도 약간 다르다
 * 파이썬처럼 반복문을 break를 이용해 강제종료 할수있다 다만 자바에서는 상위루프도 break로 강제종료 시킬수있다 한단계 위 뿐만아니라 그이상도 가능하다!
 */
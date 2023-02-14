package java_learning;

public class 스위치와랜덤 {
    public static void main(String[] args) { // main 치면 단축키로서 바로 작성가능
        int num = (int) (Math.random() * 6+1);
        /*
         * math.random은 0보다 크고 1보자 작은수를 랜덤으로 출력함
         * int로 강제타입변환시 소수점을 잃게됨 따라서 해당코드는 동일한 확률로 1~6중의 수를 뽑는다고 할수있음
         */
        switch(num){
            case 1: // num이 1일경우
                System.out.println("1번이 나왔습니다"); // 단축키 sysout
                break;
            case 2:
                System.out.println("2번이 나왔습니다");
                break;
            case 3:
                System.out.println("3번이 나왔습니다");
                break;
            case 4:
                System.out.println("4번이 나왔습니다"); 
                break;
            case 5:
                System.out.println("5번이 나왔습니다");
                break;
            default:
                System.out.println("6번이 나왔습니다");               
        }
    }
}

/*
 * 중복된 case를 적으면 에러 발생하는것을 확인
 * if else 보다 간결하게 적을수있다
 * default 는 else와 같은 개념이다 사용은 필수가 아니다
 * break가 없다면 계속 한줄씩 내려가며 코드를 실행한다
 */
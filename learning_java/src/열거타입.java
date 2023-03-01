import java.util.Calendar;

public class 열거타입 {
    public static void main(String[] args) {
        Week today = null;

        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.DAY_OF_WEEK);

        switch (week) {
            case 1:
                today = Week.SUNDAY;
                break;
            case 2:
                today = Week.MONDAY;
                break;
            case 3:
                today = Week.TUESDAY;
                break;
            case 4:
                today = Week.WEDNESDAY;
                break;
            case 5:
                today = Week.THURSDAY;
                break;
            case 6:
                today = Week.FRIDAY;
                break;
            case 7:
                today = Week.SATURDAY;
                break;
        }

        System.out.println("오늘 요일 " + today);

        if (today == Week.SUNDAY) {
            System.out.println("일요일에는 축구를 합니다");
        } else {
            System.out.println("열심히 자바 공부합니다");
        }
    }

    public enum Week {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
}

/*
 * 1. 열거타입의 이름은 관례적으로 첫글자를 대문자로하고 나머지는 소문자로 함
 * 2. 열거상수가 여러단어로 구성될경우에는 단어사일을 밑줄로 연결하는것이 관례
 * 3. today가 Week타입이 아닌 String으로도 선언되도 괜찮을까를 확인했는데 에러가 떳다 열거타입의 모든 상수?를 이용할때는 같은
 * 타입에 담겨야 하는것같다
 * 만약 today라는 Week타입이 아닌 String타입에 열거타입상수를 저장하고싶을때는 .name()을붙여 문자열을 받거나 강제타입변환을
 * 하는 방법이 있었다
 * 강제타입이 정확이 뭔지 무엇보다 왜쓰는건지를 아직 잘 모르겠지만 일단 이정도로 하고 넘어가기로 한다
 */
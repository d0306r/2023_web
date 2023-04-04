package sec03.exam01;

import java.util.Calendar;

public class EnumWeekExample {
    public static void main(String[] args) {
        Week today = null;

        Calendar cal = Calendar.getInstance();
        // 1일때 일요일, 2일때 월요일 .... 7일때 토요일
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
            default:
                today = Week.SATURDAY;
                break;
        }
        System.out.println("오늘 요일은 = " + today);

        if (today == Week.SUNDAY) {
            System.out.println("축구를 합니다.");
        } else {
            System.out.println("열심히 공부를 합니다.");
        }

    }
}


package sec02.exam06;

public class BreakOutterExample {
    public static void main(String[] args) {
        outter :
        for (char upper = 'A'; upper <= 'Z'; upper++) {
            for (char lower = 'a'; lower <= 'z'; lower++) {
                System.out.println("upper= " + upper + "\tlower = " + lower);
                if (lower == 'g') {
                    break outter;
                }
            }
        }
        System.out.println("프로그램을 종료합니다.");
    }
}

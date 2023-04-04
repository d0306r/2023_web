package sec03.exam06;

public class StringConcatExample {
    public static void main(String[] args) {
        int value = 10 + 2 + 8;
        System.out.println("숫자의 덧셈연산 = " + value);

        String str1 = 10 + 2 + "8"; // 덧셈 산술 연산은 왼쪽에서 오른쪽으로 수행된다.
        System.out.println("str1 = " + str1);

        String str2 = 10 + "2" + 8;
        System.out.println("str2 = " + str2);

        String str3 = "10" + 2 + 8;
        System.out.println("str3 = " + str3);

        String str4 = "10" + (2 + 8); // 소괄호는 가장 우선순위를 두어 연산한다.
        System.out.println("str4 = " + str4);
    }
}

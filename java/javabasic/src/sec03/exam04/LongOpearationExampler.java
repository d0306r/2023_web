package sec03.exam04;

public class LongOpearationExampler {
    public static void main(String[] args) {
        byte value1 = 10;
        int value2 = 100;
        long value3 = 1000L;
        // int result = value1 + value2 + value3; int로 결과를 받을 수 없다.
        long result = value1 + value2 + value3;
        System.out.println("result = " + result);
    }
}

package sec03.exam02;

public class CastingExample {
    public static void main(String[] args) {
        int intValue = 44032;
        char charValue = (char) intValue;  //자동 형변환되지 않기 때문에 강제로 변환
        System.out.println("charValue = " + charValue);

        long longValue = 500;
        intValue = (int) longValue;
        System.out.println("intValue = " + intValue);

        double doubleValue = 3.14;
        intValue = (int) doubleValue;
        System.out.println("intValue = " + intValue);
    }
}

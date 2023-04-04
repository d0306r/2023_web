package sec03.exam07;

public class PrimitiveAndStringConversionExample {
    public static void main(String[] args) {
        // 문자열을 해당 타입으로 변환시켜준다.
        int value1 = Integer.parseInt("10");
        double value2 = Double.parseDouble("3.14");
        boolean value3 = Boolean.parseBoolean("true");

        System.out.println("value1 = " + value1);
        System.out.println("value2 = " + value2);
        System.out.println("value3 = " + value3);

        // valueof를 이용하면 메서드가 파라미터의 타입에 따라 각각 정의됨
        String str1 = String.valueOf(10);
        String str2 = String.valueOf(3.14);
        String str3 = String.valueOf(true);

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);

    }
}

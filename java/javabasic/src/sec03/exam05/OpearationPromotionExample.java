package sec03.exam05;

public class OpearationPromotionExample {
    public static void main(String[] args) {
     byte byteValue1 = 10;
     byte byteValue2 = 20;
     // byte byteValue3 = byteValue1 + byteValue2; 변수는 byte이지만 값이 int이므로 할당 불가
     int intValue1 = byteValue1 + byteValue2;
     System.out.println("intValue1 = " + intValue1);

     char charValue1 = 'A';
     char charValue2 = 1;
     // char charValue3 = charValue1 + charValue2; 산술 연산의 결과가 int이기때문에 char에 담을 수 없음
     int intValue2 = charValue1 + charValue2;
     System.out.println("유니코드 = " + intValue2);
     System.out.println("출력 문자 = " + (char)intValue2);

     int intValue3 = 10;
     int intValue4 = intValue3 / 4; // 파이썬이었다면 float 형으로 변환되었겠지만 java에서는 원래 형태인 int로 반환
     System.out.println("intValue4 = " + intValue4);

     int intValue5 = 10;
     // int intValue6 = intValue5 / 4.0;   int와 double 연산자를 산술하면 결과는 double이 된다. 범위가 더 큰 것으로 통일
     double doubleValue = intValue5 / 4.0;
     System.out.println("doubleValue = " + doubleValue);
     
     int x = 1;
     int y = 2;
     double result = (double) x / y; // 형 변환을 먼저 해주어야 소수점을 소실하지 않고 값을 받을 수 있다.
     System.out.println("result = " + result);

    }
}

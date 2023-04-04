package sec01.exam01;

public class SignOperatorExample {
    public static void main(String[] args) {
        int x = -100;
        int result1 = +x;
        int result2 = -x;
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        byte b = 100;  //cpu 구조상 연산 결과는 int로 리턴된다.
        // byte result3 = -b; 결과가 int로 도출되기 때문에, byte 타입 변수에 할당이 불가능하다
        int result3 = -b;
        System.out.println("result3 = " + result3);

    }
}

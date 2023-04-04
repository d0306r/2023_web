package sec02.exam03;

public class LongExample {
    public static void main(String[] args) {
        long var1 = 10;
        long var2 = 20L;
        // long var3 = 10000000000; 값이 범위를 벗어났으므로 컴파일 에러 발생
        long var4 = 10000000000L;

        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        System.out.println("var4 = " + var4);

    }
}

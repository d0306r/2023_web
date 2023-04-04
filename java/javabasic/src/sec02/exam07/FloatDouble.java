package sec02.exam07;

public class FloatDouble {
    public static void main(String[] args) {
        // float var1 = 3.14; literal은 기본적으로 double이다.
        float var2 = 3.14f;
        double var3 = 3.14;

        // 고정소수점 표현방식의 정확도 확인
        float var4 = 0.12345678913748173343f;
        double var5 = 0.12345678913748173343;

        System.out.println("var2 = " + var2);
        System.out.println("var3 = " + var3);
        System.out.println("var4 = " + var4);
        System.out.println("var5 = " + var5);

        // 지수표현법
        double var6 = 3e6;
        float var7 = 3e6f;
        double var8 = 2e-3;

        System.out.println("var6 = " + var6);
        System.out.println("var7 = " + var7);
        System.out.println("var8 = " + var8);

    }
}


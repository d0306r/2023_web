package src01.exam08;

public class CompareOperatorExample2 {
    public static void main(String[] args) {
        int v2 = 1;
        double v3 = 1.0;
        // 타입이 달라도 값이 같은지 비교 확인
        System.out.println(v2 == v3);

        double v4 = 0.1;
        float v5 = 0.1f;
        // double과 float는 고정 소수점 차이가 있어 미세한 오차가 발생한다.
        System.out.println(v4 == v5);
        System.out.println((float)v4 == v5);
        System.out.println((int)(v4*10) == (int)(v5*10));
    }
}

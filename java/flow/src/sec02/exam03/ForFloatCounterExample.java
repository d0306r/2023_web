package sec02.exam03;

public class ForFloatCounterExample {
    public static void main(String[] args) {
        for (float i = 0.1f; i < 1.0f; i-= 0.1f) {
            // 더하다 보면 float 형은 오차가 누적이 됨
            System.out.println("i = " + i);
        }
    }
}

package sec02.exam01;

public class ArrayCreateByValueListExample {
    public static void main(String[] args) {
        // 배열 변수에 중괄호를 사용해서 값을 넣으면 초기화할 수 있다.
        int[] scores = {83, 90, 87};
        System.out.println("scores[0] = " + scores[0]);
        System.out.println("scores[1] = " + scores[1]);
        System.out.println("scores[2] = " + scores[2]);

        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += scores[i];
        }
        System.out.println("총합 = " + sum);
        double avg = (double) sum / 3;
        System.out.println("평균= " + avg);
    }
}

package sec02.exam02;

public class ArrayCreateByValueListExample2 {
    public static void main(String[] args) {
        int[] scores;
        // 변수를 별개로 둘 때에는 자료형을 명시해야 한다.
        scores = new int[] {83, 90, 87};

        int sum1 = 0;
        for (int i = 0; i < 3; i++) {
            sum1 += scores[i];
        }
        System.out.println("총합 = " + sum1);

        int sum2 = add(new int[] {83, 90, 87});
        System.out.println("총합2 = " + sum2);
    }

    public static int add(int[] scores) {
        int sum = 0;
        for (int i = 0; i <3 ; i++) {
            sum += scores[i];
        }
        return sum;
    }

}

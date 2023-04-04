package sec02.exam03;

public class ArrayCreateByNewExample {
    public static void main(String[] args) {
        // 값을 넣어두지 않았기 때문에 모든 값이 0으로 설정되어 있다.
        int[] arr1 = new int[3];
        for (int i = 0; i < 3 ; i++) {
            System.out.printf("arr1[%d] = %d\n", i, arr1[i]);
        }
    }
}

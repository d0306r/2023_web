package sec02.exam04;

public class ForMultipleTableExmaple {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.printf("**** %2d ****\n", i);
            for (int j = 1; j < 10; j++) {
                System.out.printf("%2d * %2d = %2d\n", i, j, (i*j));
            }
        }
    }
}

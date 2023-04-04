package Questions;

public class exam2 {
    public static void main(String[] args) {
        int sum = 0;
        int num1 = 0;
        int num2 = 0;

        while (sum != 5) {
            num1 = (int)(Math.random()*6) + 1;
            num2 = (int)(Math.random()*6) + 1;
            sum = 0;
            sum = num1 + num2;

            System.out.printf("눈: (%d, %d)\n", num1, num2);

            if (sum == 5) {
                break;
            }
            else {
                continue;
            }
        } System.out.printf("눈의 합이 %d, %d가 되어 종료", num1, num2);
    }
}

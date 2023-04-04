package Q1;

public class AnonymousExample {
    public static void main(String[] args) {
        Anonymous annoy = new Anonymous();
        annoy.field.start();
        annoy.method1();
        annoy.method2(
                new Worker(){
                    @Override
                    public void start() {
                        System.out.println("테스트를 합니다.");
                    }
                }
        );

    }
}

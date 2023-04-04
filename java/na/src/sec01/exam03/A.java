package sec01.exam03;

public class A {
    int filed1;
    void method1(){}

    static int field2;
    static void method2(){}

    class B {
        void method() {
            filed1 = 10;
            method1();

            field2 = 10;
            method2();
        }
    }

    static class C {
        void method() {
            // 정적이지 않은 필드에는 참조할 수 없다.
//            filed1 = 10;
//            method();
            field2 = 10;
            method2();
        }
    }

}

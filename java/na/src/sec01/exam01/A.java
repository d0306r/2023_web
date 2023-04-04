package sec01.exam01;

class A {
    A() {
        System.out.println("A 객체가 생성됨");
    }

    // 정적 멤버 클래스
    class B {
        B() {
            System.out.println("B 객체가 생성됨");
        }
        int field1;
        void method1() {
        }
    }

    class C {
        C() {
            System.out.println("C 객체가 생성됨");
        }

        int filed1;
        static int field2;

        void method1() {
        }

        static void method2() {
        }
    }

    void method() {
        class D {
            D(){
                System.out.println("D 객체가 생성됨");}
            int field1;
            void method1(){}
        }
        D d = new D();
        d.field1 = 3;
        d.method1();
    }
}

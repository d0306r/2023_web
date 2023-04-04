package sec09.exam04.package1;
import sec09.exam04.package1.A;

public class B {
    public B() {
        A a = new A();
        a.field1 = 1;
        a.field2 = 1;
//        a.field3 = 1; <- private 접근 에러

        a.method1();
        a.method2();
//        a.method3();  <- 접근 불가
    }
}

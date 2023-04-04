package sec09.exam03.package1;

public class A {
    A s1 = new A(true);
    A s2 = new A(1);
    A s3 = new A("문자열");

    public A(boolean b) {}
        A(int b){}
        private A(String s) {}
}

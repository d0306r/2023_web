package sec01.exam07;
import java.io.*;
public class WriteExample {
    public static void main(String[] args) throws Exception{
        Writer writer = new FileWriter("C:/codes/2023_web/java/stream/test7.txt");

        char a = 'A';
        char b = 'B';
        char c = 'C';

        writer.write(a);
        writer.write(b);
        writer.write(c);

        writer.flush();
        writer.close();
    }
}

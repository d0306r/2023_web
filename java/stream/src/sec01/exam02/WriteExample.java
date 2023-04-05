package sec01.exam02;
import java.io.*;
public class WriteExample {
    public static void main(String[] args) throws Exception {
        OutputStream os = new FileOutputStream("C:/codes/2023_web/java/stream/test2.db");

        byte[] array = {10, 20, 30};
        os.write(array);

        os.flush();
        os.close();
    }
}

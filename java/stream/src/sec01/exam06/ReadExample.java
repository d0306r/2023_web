package sec01.exam06;
import java.io.*;
public class ReadExample {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("C:/codes/2023_web/java/stream/test3.db");

        byte[] buffer = new byte[5];

        // 시작 인덱스와 불러올 개수
        int readByteNum = is.read(buffer, 2, 3);
        if (readByteNum != -1) {
            for (int i = 0; i < buffer.length; i++) {
                System.out.println(buffer[i]);
            }
        }
        is.close();
    }
}

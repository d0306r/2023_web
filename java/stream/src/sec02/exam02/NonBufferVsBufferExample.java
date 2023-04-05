package sec02.exam02;
import java.io.*;
import java.util.*;

public class NonBufferVsBufferExample {
    public static void main(String[] args) throws Exception{
        String originalFilePath1 = NonBufferVsBufferExample.class.getResource("OriginalFile1.jpg").getPath();
        String targetFilePath1 = "C:/codes/2023_web/java/stream/originalFile1.jpg";
        FileInputStream fis = new FileInputStream(originalFilePath1);
        FileOutputStream fos = new FileOutputStream(targetFilePath1);

        String originalFilePath2 = NonBufferVsBufferExample.class.getResource("OriginalFile2.jpg").getPath();
        String targetFilePath2 = "C:/codes/2023_web/java/stream/originalFile2.jpg";
        FileInputStream fis2 = new FileInputStream(originalFilePath2);
        FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
        BufferedInputStream bis = new BufferedInputStream(fis2);
        BufferedOutputStream bos = new BufferedOutputStream(fos2);

        long nonBuffertime = copy(fis, fos);
        System.out.println("버퍼를 사용하지 않았을 때 : \t" + nonBuffertime + "ns");
        long buffertime = copy(bis, bos);
        System.out.println("버퍼를 사용하지 않았을 때 : \t" + buffertime + "ns");

        fis.close();
        fos.close();
        bis.close();
        bos.close();
    }

    static int data = -1;
    public static long copy(InputStream is, OutputStream os) throws Exception {
        long start = System.nanoTime();
        while (true) {
            data = is.read();
            if (data==-1) break;
            os.write(data);
        }
        os.flush();
        long end = System.nanoTime();
        return (end - start);
    }
}

package q2;
import java.io.*;
public class AddLineNumberExample {
    public static void main(String[] args) throws Exception {
        String filepath = "C:/codes/2023_web/java/stream/src/q2/AddLineNumberExample.java";
        FileReader fileReader = new FileReader(filepath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        int idx = 1;
        String data;
        while ((data = bufferedReader.readLine()) != null) {
            System.out.println(idx + " : " + data);
            idx += 1;
        }
        bufferedReader.close();
    }
}

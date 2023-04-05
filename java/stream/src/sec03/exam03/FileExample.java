package sec03.exam03;
import java.io.*;
import java.text.*;
import java.util.Date;

public class FileExample {
    public static void main(String[] args) throws Exception{
        File dir = new File("C:/codes/2023_web/java/stream/images");
        File file1 = new File("C:/codes/2023_web/java/stream/file1.txt");
        File file2 = new File("C:/codes/2023_web/java/stream/file2.txt");
        File file3 = new File("C:/codes/2023_web/java/stream/file3.txt");

        if(dir.exists() == false){dir.mkdirs();}
        if(file1.exists() == false){file1.createNewFile();}
        if(file2.exists() == false){file2.createNewFile();}
        if(file3.exists() == false){file3.createNewFile();}

        File temp = new File("C:/codes/2023_web/java/stream");
        File[] contents = temp.listFiles();
        System.out.println("시간\t\t\t형태\t\t크기\t이름");
        System.out.println("----------------------------");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
        for (File file : contents) {
            System.out.println(sdf.format(new Date(file.lastModified())));
            if (file.isDirectory()) {
                System.out.println("\t<DIR>\t\t\t" + file.getName());
            } else {
                System.out.println("\t\t\t" + file.length() + "\t" + file.getName());
            }
            System.out.println();
        }
        }
    }

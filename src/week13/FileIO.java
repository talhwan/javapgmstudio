package week13;

import java.io.*;
import java.util.Scanner;

public class FileIO {
    public void out() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("fileoutputstream.txt");
            String word = "source code";

            byte b[] = word.getBytes();
            fileOutputStream.write(b);
            fileOutputStream.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void in0() {
        try{
            FileInputStream fileInputStream = new FileInputStream("fileoutputstream.txt");
            FileInputStream fileInputStream1 = new FileInputStream("./fileoutputstream.txt");

            int i =0;
            while ((i = fileInputStream.read()) != -1) {
                System.out.print((char) i);
            }
            fileInputStream.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void in1() {
        try{
            FileInputStream fileInputStream = new FileInputStream("C:/workspace/git/javapgmstudio/src/week13/test1.txt");
            FileInputStream fileInputStream1 = new FileInputStream("./src/week13/test1.txt");

            int i =0;
            while ((i = fileInputStream.read()) != -1) {
                System.out.print((char) i);
            }
            fileInputStream.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void in2() {
        try{
            FileInputStream fileInputStream = new FileInputStream("C:/workspace/git/javapgmstudio/src/week13/test1.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

            /*
            BufferedInputStream을 사용
            BufferedInputStream 보조 스트림을 사용
            성능 향상
             */

            int i = 0;
            while ((i = bufferedInputStream.read()) != -1){
                System.out.print((char)i);
            }
            fileInputStream.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void in3() {
        try{
            File file = new File("test.txt");
            FileReader fileReader = new FileReader(file);

            int i = 0;
            while ((i = fileReader.read()) != -1) {
                System.out.print((char) i);
            }
            fileReader.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void in4() {
        try{
            File file = new File("test.txt");

            Scanner scanner = new Scanner(file);
            int order = 0;
            while (scanner.hasNextLine()) {
                System.out.println("data order : " + order++);
                System.out.println(scanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
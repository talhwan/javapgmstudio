package week13;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main pStudio = new Main();
        pStudio.j082();
    }

    void j081(){
        String data = "";
        try{
            FileInputStream fileInputStream = new FileInputStream("./src/week13/testj081.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            int i = 0;
            while ((i = bufferedInputStream.read()) != -1){
                data += (char)i + "";
            }
            fileInputStream.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(data);

        String[] arrayData = data.split(" ");
        int[] arrayDataInt = new int[arrayData.length];
        for(int i = 0; i < arrayData.length; i++){
            arrayDataInt[i] = Integer.parseInt(arrayData[i]);
            /*
            try{
            } catch(Exception e){
                System.out.println(e);
            }
            */
        }

        int max = arrayDataInt[0];
        int min = arrayDataInt[0];
        for(int i = 1; i < arrayDataInt.length; i++){
            if(arrayDataInt[i] > max){
                max = arrayDataInt[i];
            }

            if(arrayDataInt[i] < min){
                min = arrayDataInt[i];
            }
        }

        System.out.println(max);
        System.out.println(min);
    }

    void j082(){
        List<String> dataList = new ArrayList<>();
        try{
            File file = new File("./src/week13/testj082.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String each = scanner.nextLine();
                dataList.add(each);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(dataList);
        for(String each : dataList){
            String[] arrayHW = each.split(" ");
            int height = Integer.parseInt(arrayHW[0]);
            int weight = Integer.parseInt(arrayHW[1]);

            double bmi = weight / (height *0.01* height*0.01);
            System.out.println(bmi);
            if(bmi > 25){
                System.out.println("!!! : " + bmi + "// height : " + height + "// weight : " + weight);
            }
        }
    }
}